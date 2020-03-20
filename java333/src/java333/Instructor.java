package java333;

public class Instructor {
	String instructorName;
	College instructorCollege;
	Instructor(String instructorName, College instructorCollege){
		this.instructorName=instructorName;
		this.instructorCollege=instructorCollege;
		
	}
	public static void main(String args[]) {
		College college1 = new College("computer science and information system college");
		Instructor obj1 = new Instructor("mohammed", college1);
     	Instructor obj2 = new Instructor("hussien", college1);

		System.out.println(college1.name);
		System.out.println("Name of the instructor is "+obj1.instructorName+" in CS");
		System.out.println("Name of the instructor is "+obj2.instructorName+" in IS");

	}
	
	

}
