import java.sql.SQLOutput;
import java.util.Objects;

public abstract class Character {
    String name;
    int age;
    Food food;
    Bag bag;
    int height;

    @Override
    public int hashCode() {
        return Objects.hash(age, height);
    }

    boolean compareByHash(Character c) {
        if (this.hashCode() == c.hashCode()) {
            System.out.println("\n" + "Персонажи выше равны друг другу по росту и возрасту при проверке через HashCode");
        } else System.out.println("\n" + "Персонажи выше не равны друг другу по росту и возрасту при проверке через HashCode");
        return this.hashCode() == c.hashCode();
    }

    public boolean equals(Character c) {
        if (c == null) return false;
        return age == c.age && height == c.height;
    }

    void compare(Character c) {
        if (this.equals(c)) {
            System.out.println("\n" + "Персонажи выше равны друг другу по росту и возрасту");
        } else System.out.println("\n" + "Персонажи выше не равны друг другу по росту и возрасту");
    }

        public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Character(String name, int age, Food food, Bag bag, int height) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.bag = bag;
        this.height = height;
    }

    public void welcome() {
        System.out.println("Характеристика персонажа: " + "\n" +
                "Имя: " + name + "\n" +
                "Восзраст: " + age + "\n" +
                "Еда: " + food.getFoodName() + "\n" +
                "Сумка: " + bag.name() + "\n" +
                "Рост, см: " + height);
    }

    public void comparison() {
        System.out.println("Сравнение еды" + "\n");
    }



}
