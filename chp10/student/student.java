package student;

public class student {
    private String name;

    public student(String name){
        this.name = name;
    }
    public student(){
        this("Chris");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
}
