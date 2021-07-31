abstract class student{
    private String id;
    private String name;

    public abstract void Register();
    public abstract void PreTest();
    public abstract void PostTest();
    
    public void setID(String ids){
        this.id = ids;
    }

}
