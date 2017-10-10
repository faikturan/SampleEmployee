package com.faikturan.employee;

public class PayrollSystemTest {

	public static void main(String[] args) {
		SalariedEmployee salariedEmployee =
				new SalariedEmployee("Engin", "Artut", "111-1111-111", 8000.0);
		HourlyEmployee hourlyEmployee =
				new HourlyEmployee("Muhammet Can", "Zengin", "222-2222-222", 
						1000.0, 40);
		CommissionEmployee commissionEmployee =
				new CommissionEmployee("Semiha", "Bekþen", "333-3333-333", 10000, .06);
		BasePlusCommisionEmployee basePlusCommisionEmployee =
				new BasePlusCommisionEmployee("Þevval Tuðçe", "Badik", "444-4444-444", 
						7000, .04, 500);
		
		System.out.println("Employees processed individually:\n");
		System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, 
				"earned", salariedEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, 
				"earned", hourlyEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, 
				"earned", commissionEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommisionEmployee, 
				"earned", basePlusCommisionEmployee.earnings());
		
		Employee employees[] = new Employee[4];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommisionEmployee;
		
		System.out.println("Employees processed polymorphically:\n");
		
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommisionEmployee) {
				BasePlusCommisionEmployee employee = 
						(BasePlusCommisionEmployee) currentEmployee;
				double oldBaseSalary = employee.getBaseSalary();
				employee.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf("new base salary with 10%% increase is: $%,.2f/n",
						employee.getBaseSalary());
				System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
			}
			for (int i = 0; i < employees.length; i++) {
				System.out.printf("Employee %d is a %s\n", i,
				employees[i].getClass().getName());
			}
		}
		
		

	}

}
