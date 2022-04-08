public class TestAnimal {
    public static void main(String[] args) {
        Animal mister = new Animal("begum", "flower", 10);
        // yukarda ben bir instance yapiyorum, buyuk Animal data type sonra
        // sonra new instance olustuyorum. animal benim methodum ayni data type
        // olmak zorunda
        System.out.println(mister.getAge());
        System.out.println(mister.play());

        Animal plainAnimal = new Animal();
        Animal myAnimal = new Animal("mister", "bed", 5);
        System.out.println(plainAnimal.getAge());
        System.out.println(myAnimal.getAge());
    }
}
