
public class Main {

	public static void main(String[] args) {

		System.out.println("Kaç çalışan var?");
		int numberOfEmployees = 3;
		System.out.println("---------------------------");
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		Employee[] employees = { employee1, employee2, employee3 };

		// for(int i=0;i<numberOfEmployees;i++) {
		employees[0].employee(employees[0], "Ali Öztürk", 8399.5, 45, 2015);
		// }
		employees[1].employee(employees[1], "Merve Yıldız", 9900.79, 50, 2010);
		employees[2].employee(employees[2], "Ahmet Turan", 11258.40, 41, 2006);

		// System.out.println("------");

		double[] taxes = new double[3];
		taxes[0] = employees[0].tax(employee1);
		taxes[1] = employees[1].tax(employee2);
		taxes[2] = employees[2].tax(employee3);
		/*
		 * for(int i=0;i<taxes.length;i++) {
		 * System.out.println("tax of "+employees[i].getName()+" is=  "+taxes[i]); }
		 */

		// System.out.println("------");

		double[] bonuses = new double[3];
		bonuses[0] = employees[0].bonus(employee1);
		bonuses[1] = employees[1].bonus(employee2);
		bonuses[2] = employees[2].bonus(employee3);
		/*
		 * for(int j=0;j<bonuses.length;j++) { System.out.println(bonuses[j]); }
		 */

		// System.out.println("------");

		double[] raisesInSalaries = new double[3];
		raisesInSalaries[0] = employees[0].raiseSalary(employee1);
		raisesInSalaries[1] = employees[1].raiseSalary(employee2);
		raisesInSalaries[2] = employees[2].raiseSalary(employee3);
		/*
		 * for(int k=0;k<raisesInSalaries.length;k++) {
		 * System.out.println(raisesInSalaries[k]); }
		 */

		/*
		 * for(int i=0;i<employees.length;i++) {
		 * System.out.println("name surname: "+employees[i].getName());
		 * System.out.println("salary: "+employees[i].getSalary());
		 * System.out.println("work hours: "+employees[i].getWorkHours());
		 * System.out.println("hire year: "+employees[i].getHireYear());
		 * System.out.println("-");
		 * System.out.println("tax of "+employees[i].getName()+" is=  "+taxes[i]);
		 * System.out.println("bonus of "+employees[i].getName()+" is=  "+bonuses[i]);
		 * System.out.println("raise in salary of "+employees[i].getName()+" is=  "
		 * +raisesInSalaries[i]); System.out.println("--");
		 * System.out.println("salary with tax and bonuses of "+employees[i].getName()
		 * +" is=  "+(employees[i].getSalary()-taxes[i]+bonuses[i]));
		 * System.out.println("total salary of "+employees[i].getName()+" is=  "+(
		 * employees[i].getSalary()-taxes[i]+bonuses[i]+raisesInSalaries[i]));
		 * System.out.println("---------------------------"); }
		 */
		for (int i = 0; i < numberOfEmployees; i++) {
			employees[i].toString(employees[i], taxes[i], bonuses[i], raisesInSalaries[i]);
		}

	}

}
