package com.ben.phone;

public class Iphone extends Phone implements Ringable {

	public Iphone(String versionNumber, int batteryPercent, String carrier, String ringTone) {
		super(versionNumber, batteryPercent, carrier, ringTone);

	}

	@Override
	public void displayInfo() {
		String versionNumber = getVersionNumber();
		String carrier = getCarrier();
		System.out.println("Iphone" + versionNumber + "from" + carrier);
	}
	
	@Override
	public String ring() {
		String ring = getRingTone();
		return ring;
	}
	
	@Override
	public String unlock() {
		String unlock = "Unlock with fingerID";
		return unlock;
	}

}
