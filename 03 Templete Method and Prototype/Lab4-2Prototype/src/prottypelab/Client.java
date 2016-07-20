package prottypelab;

public class Client {
	public static void main(String[] args) {
		Employee developer1 = new Employee(1, "Raj", "kumar", "1000 N 4th Street", "Fairfield", "IA", "52557",
				null, null);
		Employee developer2 = new Employee(2, "Nisha", "Bashnet", "1000 N 4th Street", "Fairfield", "IA", "52557", null,
				null);
		Employee developer[] = new Employee[] { developer1, developer2 };
		Employee supervisor = new Employee(3, "Lokesh", "Bhattrai", "1100 S 3rd Street", "Fairfield", "IA", "52557", null,
				developer);
		developer1.setSupervisor(supervisor);
		developer2.setSupervisor(supervisor);
		
		Employee supervisorStaffs[] = new Employee[] { supervisor };
		
		Employee departmentHead = new Employee(4, "Lu", "Hanhong", "1100 N 4th Street", "Chicago", "IL", "61211", null, supervisorStaffs);
		supervisor.setSupervisor(departmentHead);

		
		System.out.println("=================After Clonning=================");
		Employee developer11 = (Employee)developer1.clone();
		
		developer11.setFirstname("Developer1 Name Changed");
		developer11.getSupervisor().setFirstname("Raku");
		developer11.getSupervisor().getSupervisor().setFirstname("Department Head Name");
		System.out.println(developer11);
		
		
		System.out.println("==========Real Object============================");
		System.out.println(developer1);
	}
}
