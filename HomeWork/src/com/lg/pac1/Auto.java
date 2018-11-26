package com.lg.pac1;

public class Auto {
	
	private  int TyreNum=4;
	private String Colors;
	private float Weight;
	private double Speed;
	
	public Auto()
	{		
	}

	public Auto(int tyreNum, String colors, float weight, double speed) {
		TyreNum = tyreNum;
		Colors = colors;
		Weight = weight;
		Speed = speed;
	}

	public Auto( String colors, float weight, double speed) {
		Colors = colors;
		Weight = weight;
		Speed = speed;
	}

	public int getTyreNum() {
		return TyreNum;
	}

	public void setTyreNum(int tyreNum) {
		TyreNum = tyreNum;
	}

	public String getColors() {
		return Colors;
	}
	public void setColors(String colors) {
		Colors = colors;
	}
	public float getWeight() {
		return Weight;
	}
	public void setWeight(float weight) {
		Weight = weight;
	}
	public double getSpeed() {
		return Speed;
	}
	public void setSpeed(double speed) {
		Speed = speed;
	}
	public void AddSpeed()
	{
		Speed+=10;
	}
	public void MinusSpeed()
	{
		if(Speed>10)
			Speed-=10;
		else 
			Speed=0;
	}

	@Override
	public String toString() {
		return "Auto [TyreNum=" + TyreNum + ", Colors=" + Colors + ", Weight="
				+ Weight + ", Speed=" + Speed + "]";
	}
	
}
