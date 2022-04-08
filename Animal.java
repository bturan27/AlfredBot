public class Animal {
    //FIELDS  (VARIABLE MEMBERS)
    private String name;
    private String favoriteToy;
    private int age;    


    /* CONSTRUCTORS, special method with SAME NAME AS THE CLASS is called the constructor 
        (the instructions for how to make a new instance of the class) */
    public Animal(){
        System.out.println("making an animal");

        this.name = "bob";
        this.favoriteToy = "cactus";
        this.age = 100;

        System.out.println("finished making the animal");
    }

    
    // METHODS (FUNCTION MEMBERS)
    public Animal(String name, String favoriteToy, int age){
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String play(){
        return String.format("%s played with the toy: %s", this.name, this.favoriteToy, this.age);
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int newage) {
        this.age =  newage ;
    }
}
