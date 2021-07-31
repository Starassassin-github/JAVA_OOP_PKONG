public class main{

    public static void main(String [] args){

        Employee e1 = new Employee("1", "WatDhaFlukz", 300000.0); // Create Object
        e1.disPlayEmployee();

        System.out.println(e1.getSalary());
        
        

        Employee e2 = new Employee(); // Create Object
        e2.setId("2");
        e2.setName("WatDhaMookiiz");
        e2.setSalary(321000.0);
        System.out.println(e2.getName());
        e2.disPlayEmployee();

        Employee e3 = new Employee("3", "Name 3");
        e3.disPlayEmployee();

        // Create Object
        int result = Employee.minSalary;
        System.out.println(result);
        System.out.println(Employee.minSalary);
        System.out.println(Company.name);
        Company.service();
    }
}