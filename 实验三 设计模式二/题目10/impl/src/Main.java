import filter.MonoChromaticFilter;

public class Main {

    public static void main(String[] args) {
        Photograph photograph = new Photograph(new MonoChromaticFilter());
        photograph.display();
    }
}
