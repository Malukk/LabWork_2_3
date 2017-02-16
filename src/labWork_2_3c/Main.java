package labWork_2_3c;

/**
 * Created by Bulik on 16.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        /// lab 2_3_1
        MyWindow myWindow_1 = new MyWindow(1.5, 1.1, 2, "White", false);
        MyWindow myWindow_2 = new MyWindow(1.5, 1.5, 3, "Grey", true);
        MyWindow myWindow_3 = new MyWindow(1.5, 1.4, 2, "Braun", false);
        MyWindow myWindow_4 = new MyWindow(1.5, 1.3, 3, "White", true);
        MyWindow myWindow_5 = new MyWindow(2.0, 1.6, 2, "White", true);

        myWindow_1.print();
        myWindow_2.print();
        myWindow_3.print();
        myWindow_4.print();
        myWindow_5.print();

        System.out.println("----------------------------");

        MyWindow myWindow_6 = new MyWindow(1.3, 1.1 , true);
        myWindow_6.print();

        System.out.println("\nLab2_3_2\n----------------");
        MyWindow mm = new MyWindow();
        mm.print();

        // lab 2_3_3
        System.out.println("\nLab2_3_3\n----------------");
        MyWindow myWindow_7 = new MyWindow(1.1, 1.6);
        MyWindow myWindow_8 = new MyWindow(0.95, 1.33, 3);
        myWindow_7.print();
        myWindow_8.print();

        // lab_2_3_4
        System.out.println("\nLab2_3_4\n----------------");
        MyWindow obj_1 = new MyWindow(5.0, 2.1);
        MyWindow obj_2 = new MyWindow(3.3, 2.2);
        MyWindow obj_3 = new MyWindow(1.7, 1.8, 3);
        obj_1.print();
        obj_2.print();
        obj_3.print();

        // lab 2_3_5
        System.out.println("\nLab2_3_5\n----------------");
        MyWindow[] arrayWindows = new MyWindow[5];
        arrayWindows[0]=myWindow_1;
        arrayWindows[1]=myWindow_2;
        arrayWindows[2]=myWindow_6;
        arrayWindows[3]=myWindow_8;
        arrayWindows[4]=obj_2;

        for (MyWindow elem : arrayWindows){
            elem.print();
        }

    }

}
