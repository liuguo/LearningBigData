package Test;

import java.io.*;

public class Main {
    /**
     * 日志文件预处理
     *
     * @param inPath  日志文件输入地址
     * @param outPath 输出地址
     * @throws IOException
     */
    public void accessLogId(String inPath, String outPath) throws IOException {
        String line = "";
        long index = 0;
        BufferedReader bufferReader = null;
        FileWriter fileWriter = null;
        try {
            bufferReader = new BufferedReader(new FileReader(inPath));
            File outFile = new File(outPath);
            if (outFile.exists()) {
                outFile.delete();
            }
            outFile.createNewFile();

            fileWriter = new FileWriter(outFile);
            while ((line = bufferReader.readLine()) != null) {
                index++;
                String newLine = String.valueOf(index) + " " + line + "\r\n";
                fileWriter.write(newLine);
            }
        } finally {
            if (bufferReader != null) {
                bufferReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }

    public static void main(String[] args) {
        try {
            Main logParser = new Main();
            //日志文件预处理 传入输入和输出地址
            logParser.accessLogId("E:\\GoogleDownload\\data\\access.log", "E:\\GoogleDownload\\data\\log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}