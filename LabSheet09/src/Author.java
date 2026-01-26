public class Author {
    private String name;
    private String nationality;
    private int birthyear;

    Author(String name,String nationality,int birthyear){
        this.name = name;
        this.nationality = nationality;
        this.birthyear = birthyear;
    }
    Author(String name,String nationality){
        this(name,nationality,0);
    }
    Author(String name){
        this(name,"",0);
    }
    Author(){
        this("","",0);
    }
    String getName(){
        return this.name;
    }
    String showAuthorInfo(){
        if(this.nationality.equals("")) return this.name; //this.nationality.isEmpty()
        if(this.birthyear == 0) return this.name + " (" + this.nationality + ")";
        return this.name + " (" + nationality + ", born " + this.birthyear + ")";
    }
}
