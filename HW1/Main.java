package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an instance of the Pyramid class and call the Output method (see Pyramid.java for more info)\
        Pyramid pyr = new Pyramid();
        pyr.Output();
        // Create an instance of the Adlibs class and call the story method (see Adlibs.java for more info)\
        Adlibs ad = new Adlibs();
        System.out.println(ad.story("Bartholomew", 100000, "Mulberry"));
        // Create an instance of the Replace class and call the charReplace method (see Replace.java for more info)
        Replace rep = new Replace();
        System.out.println(rep.charReplace("Hello World!", 0, 'B'));
    }
}