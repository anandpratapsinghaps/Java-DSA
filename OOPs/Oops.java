package OOPs;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();  //created an object p1 Pen() -> constructor
        p1.setColor("Red");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}
class Pen{

    //properties

    String color;
    int tip;

    //function

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{

    //properties

    String name;
    int age;
    int percentage;

    //function

    void calcPercentage (int m1, int m2, int m3){
        percentage = (m1 + m1 + m3) / 3;
    }
}