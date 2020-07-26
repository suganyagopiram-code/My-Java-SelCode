package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Size of the Destop in child class : 42 inches");

	}

	public static void main(String[] args) {
		Desktop Childobj = new Desktop();
		Childobj.computerModel();
		Childobj.desktopSize();

	}

}
