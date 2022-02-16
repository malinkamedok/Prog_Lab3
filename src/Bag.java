public enum Bag {
    PACKET("PACKET"),
    BAGPACK("BAGPACK")
    ;

    private final String text;

    Bag(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "text='" + text + '\'' +
                '}';
    }
}
