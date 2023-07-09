public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    public String makeNoise() {
        return "Лай, Вой, Рычание, Кайн-кайн-кайн, Сильный лай, Скуление, нытье, Завыванье, Сопение.";
    }

    @Override
    public String eat() {
        return "Можно давать собаке сырое или вареное нежирное мясо: говядину, индейку, курицу, субпродукты, рыбу.";
    }

    @Override
    public String getDescription() {
        return "Соба́ка (лат. Canis familiaris, или Canis lupus familiaris) — домашнее животное, одно из " +
                "наиболее популярных (наряду с кошкой) животных-компаньонов.";
    }
}
