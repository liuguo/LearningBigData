package com.lg.hdfs;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HdfsClient01 {
	
	private static FileSystem fs = null;
	
	public HdfsClient01() {
		fs = this.getFileSystem("hdfs://192.168.32.129:9000/", "root");
	}

	/*
	 * 获取hdfs文件流实例
	 */
	public  FileSystem getFileSystem(String hdfsPath, String userName)
	{
		// 1.客户端加载配置文件
		Configuration conf = new Configuration();
		// 2.设置2个副本数
		// conf.set("dfs.replication", "2");
		// 3.指定块大小
		// conf.set("dfs.blocksize", "64m");
		// 4.获取操作hdfs文件流的实例
		FileSystem fs = null;
		try {
			fs = FileSystem.get(new URI(hdfsPath), conf, userName);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return fs;
	}

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		HdfsClient01 client=new HdfsClient01();
		client.mkdir("/test");
		//client.upLoadLocalFileToHdfs("C:\\test", "/liuguo");
		//client.downLoadFileToLocal("/a.txt", "D:\\360YS");
	}
	
	/*
	 * 创建文件夹
	 */
	public void mkdir(String hdfsPath) throws IllegalArgumentException, IOException {
		fs.mkdirs(new Path(hdfsPath));
		fs.close();
	}
	
	/*
	 * 上传文件到hdfs
	 */
	public void upLoadLocalFileToHdfs(String localPath,String targetPath) throws IllegalArgumentException, IOException {
		// 1.上传文件到hdfs
		 fs.copyFromLocalFile(new Path(localPath), new Path(targetPath));
		// 2.关闭流
		 fs.close();
	}
	
	/*
	 * 下载文件到本地
	 */
	public void downLoadFileToLocal(String hdfsPath,String LocalPath) throws IllegalArgumentException, IOException {
		fs.copyToLocalFile(new Path(hdfsPath), new Path(LocalPath));
		fs.close();
	}
}
