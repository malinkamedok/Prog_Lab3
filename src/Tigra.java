public class Tigra extends Character implements Walking {

    private int clearNapkins;

    public Tigra(String name, int age, Food food, Bag bag, int clearNapkins, int height) {
        super(name, age, food, bag, height);
        this.clearNapkins = clearNapkins;
    }

    public int getClearNapkins() {
        return clearNapkins;
    }

    public void setClearNapkins(int clearNapkins) {
        this.clearNapkins = clearNapkins;
    }

    @Override
    public void walking() {
        System.out.println("\n" + "Поведение:");
        System.out.println("Идет славно проводить время в лесу");
    }
}
