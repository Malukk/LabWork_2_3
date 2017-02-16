package labWork_2_3c;

/**
 Create class “MyWindow” with fields (width (of double type), height (of double type), numberOfGlass(of int type),
 color(of  String type), isOpen(boolean)).
 Create five instances of class MyWindow,  with different  fields values.

 */
public class MyWindow {
    private double width= 0.75, height = 1.21;
    private int numberOfGlass = 3;
    private String color= "Red";
    private boolean isOpen= true;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.isOpen = isOpen;
        this.color = color;
        this.numberOfGlass = numberOfGlass;
        this.height = height;
        this.width = width;
    }
    public void print(){
        System.out.println(width + "\t" + height + "\t" + numberOfGlass + "\t"+ color +"\t" + isOpen);
    }

    public MyWindow(double width, double height, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.isOpen = isOpen;
    }

    public MyWindow() {
//        this.width = 1.5;
//        this.height = 2.0;
//        this.color = "White";
//        this.numberOfGlass = 2;
//        this.isOpen = true;


    }

    public MyWindow(double width, double height) {
//        this.width = width;
//        this.height = height;
        this(width, height, 2, "White", true);
    }

    public MyWindow(double width, double height, int numberOfGlass) {
//        this.width = width;
//        this.height = height;
//        this.numberOfGlass = numberOfGlass;
        this(width, height, numberOfGlass, "White", true);
    }
}
