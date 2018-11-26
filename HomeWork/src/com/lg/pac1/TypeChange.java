package com.lg.pac1;

public class TypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=1.2f;
		double d=f;//自动转换数据类型
		int i=(int)f;//强制转换数据类型，可能丢失精度
		System.out.println("f="+f);
		System.out.println("d="+d);
		System.out.println("i="+i);
	}

}
