public class ColleageRunner
{
	public static void main(String[] args)
	 {

		HeadOfDepartment hod1 = new HeadOfDepartment("lekha", 59, 68000.00f, "BE");
		HeadOfDepartment hod2 = new HeadOfDepartment("thashwini", 50, 55000.00f, "MBA");

		HeadOfDepartment[] hod = {hod1, hod2};

		Principal princi1 = new Principal("sahana", 76, 1200000.00f, 7);

		Professors professor1 = new Professors("sameeksha", 27, 40000.00f, "JAVA");
		Professors professor2 = new Professors("preksha", 32, 45000.00f, "Python");
		Professors professor3 = new Professors("teju", 36, 42000.00f, "C++");
		Professors professor4 = new Professors("monisha", 40, 35000.00f, "JavaScript");

		Professors[] professor = {professor1, professor2, professor3, professor4};


		Students student1 = new Students("sanketh", 24, "MCA");
		Students student2 = new Students("prajwal", 25, "BE");
		Students student3 = new Students("bharath", 23, "MCA");
		Students student4 = new Students("vaibhav", 24, "MBA");
		Students student5 = new Students("adi", 23, "BE");
		Students[] student = {student1,student2, student3, student4, student5};

		CanaraCollege canara = new CanaraCollege(hod, princi1, student, professor,4,12);
		canara.printDetails();

		HeadOfDepartment hod3 = new HeadOfDepartment("pooja", 55, 65000.00f, "MBA");
		HeadOfDepartment hod4 = new HeadOfDepartment("manavi", 45, 65000.00f, "BE");

		HeadOfDepartment[] d_hod = {hod3, hod4};

		Principal princi2 = new Principal("sukshma", 60, 1000000.00f, 2);

		Professors professor5 = new Professors("rachana", 28, 40000.00f, "JAVA");
		Professors professor6 = new Professors("amitha", 30, 45000.00f, "Python");
		Professors professor7 = new Professors("vyashnavi", 35, 42000.00f, "C++");
		Professors professor8 = new Professors("aradhaya", 40, 35000.00f, "JavaScript");

		Professors[] d_professor = {professor5, professor6, professor7, professor8};


		
		Students student6 = new Students("deepali", 25, "BE");
		Students student7 = new Students("raksha", 23, "BE");
		Students student8 = new Students("deepti", 24, "MBA");
		Students student9 = new Students("deeksha", 23, "MCA");
		Students[] d_student = {student6, student7, student8, student9};



		JosephCollege joseph = new JosephCollege(d_hod, princi2, d_student, d_professor,15);
		joseph.printDetails();

	}
}
