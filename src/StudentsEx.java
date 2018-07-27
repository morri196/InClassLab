
public class StudentsEx {

	public static void main(String[] args) {
		
		Student student1 = new Student("Kari " + "Detroit" + 34);
		
		Student student2 = new Student("Jasmine" + "Miami");
		student2.favNum = 7;
		
		System.out.println(student1.studentName + "'s hometown is " + student1.homeTown + "and favorite number is " + student1.favNum );
	}

}
