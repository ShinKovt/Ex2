public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Виктор ");
        Dog dog = new Dog("Шарик ");
        Bear bear = new Bear("Таран ");
        vet vet = new vet();
        Animal[] animals = {cat, dog, bear};
        for(Animal i : animals) {
            vet.treatAnimal(i);
        }
        for(Animal i : animals) {
            System.out.println(i.makeNoise());
            System.out.println(i.eat());
        }
    }
}