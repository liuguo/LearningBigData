package com.lg.pac1;

public class Car extends Auto {
	private String AirConditioner;
	private String CD;
	
	public String getAirConditioner() {
		return AirConditioner;
	}
	public void setAirConditioner(String airConditioner) {
		AirConditioner = airConditioner;
	}
	public String getCD() {
		return CD;
	}
	public void setCD(String cD) {
		CD = cD;
	}
	@Override
	public void AddSpeed() {
		// TODO Auto-generated method stub
		super.AddSpeed();
	}
	@Override
	public void MinusSpeed() {
		// TODO Auto-generated method stub
		super.MinusSpeed();
	}
	@Override
	public String toString() {
		return "Car [TyreNum=" + this.getTyreNum() + ", Colors=" + this.getColors() + ", Weight="
				+ this.getWeight() + ", Speed=" + this.getSpeed() +", AirConditioner=" + AirConditioner + ", CD=" + CD + "]";
	}
	
}
