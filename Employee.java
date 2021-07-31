class Employee{

    // Attribute
    private String id;
    private String name;
    private Double salary;

    // Static Attribue
    static  int minSalary = 12000;
    // Defualt Constructor
    public Employee(){
        // no object
        System.out.println("This is Employee.");
        
    }

    public Employee( String name, Double salary){
        this.name = name;
        this.salary = salary;
        disPlayEmployee();
    }

    // Setter Method
    public void setId(String ids){
        this.id = ids;
    }

    public void setName(String names){
        this.name = names;
    }

    public void setSalary(Double salarys){
        this.salary = salarys;
    }

    // Show detail
    public void disPlayEmployee(){
        System.out.println("ID = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }

    // getter Method
    public String getName(){
        return this.name;
    }

    public Double getSalary(){
        return this.salary;
    }

    // Overiding Method
    public void bonus(){
        System.out.println("Bonus = 10%");
    }

    // Abstarct 
    
}