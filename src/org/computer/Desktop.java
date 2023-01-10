package org.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("My Desktop Size is 8GB ROM");
	}
	public static void main (String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
		d.compterModel();
	}

}
