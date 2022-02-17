public class Ru extends Character implements Walking{

    private int clearPerednics;

    public Ru(String name, int age, Food food, Bag bag, int clearPerednics, int height) {
        super(name, age, food, bag, height);
        this.clearPerednics = clearPerednics;
    }

    public int getClearPerednics() {
        return clearPerednics;
    }

    public void setClearPerednics(int clearPerednics) {
        this.clearPerednics = clearPerednics;
    }

    @Override
    public void walking() {
        System.out.println("\n" + "Поведение:");
        System.out.println("Идет славно проводить время в лесу");
    }


}
