public class Kenga extends Character implements Cleaning{

    private Mood mood;

    public Kenga(String name, int age, Mood mood) {
        super(name, age);
        this.mood = mood;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    @Override
    public void welcome() {
        System.out.println("Характеристика персонажа: " + "\n" +
                "Имя: " + name + "\n" +
                "Возраст: " + age + "\n" +
                "Настроение: " + mood.getText());
    }

    @Override
    public void cleaning() {
        System.out.println("\n" + "Поведение:");
        System.out.println("Наводит порядки, пересчитывает белье, остатки мыла и т.д.");
    }
}
