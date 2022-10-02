
public class Employee {
//98
	private String name;
	private double salary;
	private double workHours;
	private int hireYear;

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	// -----------------------------------------------------------------------------------------
	public void employee(Employee emp, String nameEmployee, double salaryEmployee, double workHoursEmployee,
			int hireYearEmployee) {

		emp.setName(nameEmployee);
		emp.setSalary(salaryEmployee);
		emp.setWorkHours(workHoursEmployee);
		emp.setHireYear(hireYearEmployee);
	}

	public double tax(Employee x) {
		double taxOfSalary = 0;

		if (x.getSalary() < 1000)
			taxOfSalary = 0;
		else
			taxOfSalary = 0.03 * x.getSalary();
		return taxOfSalary;

	}

	public double bonus(Employee y) {
		double bonusOfSalary = 0;

		if (y.getWorkHours() > 40)
			bonusOfSalary = (getWorkHours() - 40) * 30;
		return bonusOfSalary;

	}

	public double raiseSalary(Employee z) {
		double raiseOfSalary = 0;

		if (2021 - (z.getHireYear()) < 10)
			raiseOfSalary = 0.05 * z.getSalary();
		else if (2021 - (z.getHireYear()) > 9 && 2021 - (z.getHireYear()) < 20)
			raiseOfSalary = 0.1 * z.getSalary();
		else if (2021 - (z.getHireYear()) > 19)
			raiseOfSalary = 0.15 * z.getSalary();

		return raiseOfSalary;

	}

	public void toString(Employee e, double tx, double bonus, double raise) {

		System.out.println("name surname: " + e.getName());
		System.out.println("salary: " + e.getSalary());
		System.out.println("work hours: " + e.getWorkHours());
		System.out.println("hire year: " + e.getHireYear());
		System.out.println("-");
		System.out.println("tax of " + e.getName() + " is=  " + tx);
		System.out.println("bonus of " + e.getName() + " is=  " + bonus);
		System.out.println("raise in salary of " + e.getName() + " is=  " + raise);
		System.out.println("-");
		System.out.println("salary with tax and bonuses of " + e.getName() + " is=  " + (e.getSalary() - tx + bonus));
		System.out.println("total salary of " + e.getName() + " is=  " + (e.getSalary() - tx + bonus + raise));
		System.out.println("---------------------------");

	}
}
