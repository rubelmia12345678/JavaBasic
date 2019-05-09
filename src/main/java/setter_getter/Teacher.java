package setter_getter;

	public class Teacher extends Person{
	
	private String qualification;
	
	public String getQualification() {
		return qualification;
		
	}
	
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	void displayInfo() {
		
		System.out.println(getNmae());
		System.out.println(getAge());
		System.out.println(getQualification());
		System.out.println();
	}
	
	

}
