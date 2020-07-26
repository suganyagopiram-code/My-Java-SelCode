package week3.day1;

public class AxisBank {
	
	public void deposit(int money) {
		System.out.println("Deposit value of Child is : " +money);
		
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		
		ab.deposit(3000000);

	}

}
