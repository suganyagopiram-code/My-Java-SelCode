package week3.day1;

public class Students {
	
	
	public void getStudentInfo(int sId,String sName) {
		
		System.out.println("Student Details for ID: " +sId );
		System.out.println("Student Details for Name: " +sName );

	}
	
	public void getStudentInfo(int sId) {
		
		System.out.println("Student Details for ID: " +sId );
	}

	public void getStudentInfo(String sEmail,long sPhoneNumber) {
	
		System.out.println("Student Details for Email: "  +sEmail);
		System.out.println("Student Details for PhoneNumber: " +sPhoneNumber );

	}


	public static void main(String[] args) {
		
		Students sd = new Students();
		
		sd.getStudentInfo(110029345,"Sujatha");
		sd.getStudentInfo(110029345);
		sd.getStudentInfo("abc.12@gmail.com", 9867504346l);

	}

}
