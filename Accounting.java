class Accounting extends Employee{
    
    public String skill = "Money Manage";
    public Accounting(String name, Double salary){
        super(name, salary);
        System.out.println("I'm Accounting.");
    }
    
}