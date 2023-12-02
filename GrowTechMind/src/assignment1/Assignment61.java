package assignment1;

/*
WAP for Encapsulation*/
class Assignment61 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	private int rollNo;

	public void myInfo() {
		System.out.println(getRollNo());
		System.out.println(getName());
	}

	public static void main(String[] args) {
		Assignment61 ref = new Assignment61();
		ref.setName("mahesh");
		ref.setRollNo(101646);
		ref.myInfo();
	}
}
