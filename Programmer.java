class Programmer extends Employee{

    // Constuctor
    public String skill = "java, c# ,c++, python";
    // public Programmer(String name, Double salary){
    //     super(name,salary);
    //     System.out.println("I'm Programmer have a Skill coding.");
    // }

    // Overloading Method
    public void skill(){
        System.out.println("No Skill");
    }

    
    public void skill(String...languages){
        for (int i = 0; i < languages.length; i ++){
            System.out.println("Skill: "+ languages[i]);
        }
    }

    // Overiding Method
    public void bonus(){
        System.out.println("Bonus = 20%");
    }
}