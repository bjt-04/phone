package com.ben.phone;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercent;
	private String carrier;
	private String ringTone;
	public Phone(String versionNumber, int batteryPercent, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercent = batteryPercent;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	public abstract void displayInfo();

	public String getVersionNumber() {
		return versionNumber;
	}
	
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	
	public int getBatteryPercent() {
		return batteryPercent;
	}
	
	public void setBatteryPercent(int batteryPercent) {
		this.batteryPercent = batteryPercent;
	}
	
	public String getCarrier() {
		return carrier;
	}
	
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public String getRingTone() {
		return ringTone;
	}
	
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
}
