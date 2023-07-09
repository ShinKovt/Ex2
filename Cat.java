public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Мяуканье, Мурлыканье, Шипение, Рычание.";
    }

    @Override
    public String eat() {
        return "Мясо, Печень, Каши, Овощи, Куриные яйца, Молочные продукты.";
    }

    @Override
    public String getDescription() {
        return "Ко́шка (лат. Felis catus) — домашнее животное, одно из наиболее популярных (наряду с собакой)" +
                " «животных-компаньонов».";
    }
}
