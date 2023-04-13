package homeWork3;

public class CatConstructor {
    private String name;
    private int age;
    private String breed;
    private float weight;

    public CatConstructor(String name, int age, String breed, float weight) {
        this();
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    public CatConstructor() {
        System.out.println("Введите данные");
    }

    public CatConstructor(String name) {
        System.out.println("Имя вашего питомца " + name);
        this.name = name;
    }

    public CatConstructor(String name, float weight) {
        System.out.println("Вашего питомца зовут " + name + ", он весит " + weight + " кг");
        this.name = name;
        this.weight = weight;
    }
}


