public class Main {

    public static void main(String[] args) {
        Ru ru1 = new Ru("Ru", 10, new Food("Sandwich with salad", 1000), Bag.BAGPACK, 5, 140);
        //Ru ru1 = new Ru("Tigra", 10, new Food("Sandwich with omega D3", 1500), Bag.PACKET, 10, 140);
        ru1.welcome();
        ru1.walking();

        System.out.println();

        Tigra tigra1 = new Tigra("Tigra", 10, new Food("Sandwich with omega D3", 1500), Bag.PACKET, 10, 140);
        tigra1.welcome();
        tigra1.walking();
        tigra1.comp(ru1);
        tigra1.compareByHash(ru1);

        System.out.println();

        Kenga kenga1 = new Kenga("Kenga", 20, Mood.HOZYASTVENNYE);
        kenga1.welcome();
        kenga1.cleaning();
    }
}
