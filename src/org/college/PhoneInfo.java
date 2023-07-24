package org.college;

public class PhoneInfo {

	private void phoneName() {
		System.out.println("SamsungGalaxyA20");
	}
	private void phoneMieiNum() {
		System.out.println("1234567890");
	}
	
	private void Camera() {
		System.out.println("HighSaturation");
	}
	
	private void storage() {
		System.out.println("32GBRAM");
	}
	
	private void osName() {
		System.out.println("Mac");
	}
	
	public static void main(String[]args) {
		PhoneInfo p= new PhoneInfo();
		p.phoneName();
		p.phoneMieiNum();  
		p.Camera();
		p.storage();
		p.osName();
	}
	
}
