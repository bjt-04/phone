package com.ben.phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercent, String carrier, String ringTone) {
		super(versionNumber, batteryPercent, carrier, ringTone);
	}

	@Override
	public void displayInfo() {
		String versionNumber = getVersionNumber();
		String carrier = getCarrier();
		System.out.println("Galaxy" + versionNumber + "from" + carrier);
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
