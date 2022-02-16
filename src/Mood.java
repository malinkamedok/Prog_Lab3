public enum Mood {

    HAPPY("HAPPY"),
    HOZYASTVENNYE("Хозяйственное"),
    ANGRY("ANGRY"),
    HOROSH("HOROSHEE")
    ;

    private final String text;

    Mood(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Mood{" +
                "text='" + text + '\'' +
                '}';
    }
}
