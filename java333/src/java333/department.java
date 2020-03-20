package java333;

public class department {

	String DepartmentName;

	College DepartmentCollege;
	public department(String string, College college1) {
		// TODO Auto-generated constructor stub
	}

	void Department(String DepartmentName, College departmentCollege, College DepartmentCollege){
 this.DepartmentName=DepartmentName;
 this.DepartmentCollege=DepartmentCollege;

	}

	public static void main(String args[]) {
	College college1 = new College("Computer Science and Information System College");

		department obj1 = new department("CS", college1);
		department obj2 = new department("IS", college1);

		System.out.println(college1.name);
		System.out.println("Name of the department is"+obj1.DepartmentName);
		System.out.println("Name of the department is"+obj2.DepartmentName);

	}

}



		

	


