package OOPs;

public class Oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen();  //created an object p1 Pen() -> constructor
        // p1.setColor("Red");
        // p1.setTip(5);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());
        Student s1 = new Student();
        Student s2 = new Student("Anand");
        Student s3 = new Student(143);

    }
}
class Pen{

    //properties

    private String color;
    private int tip;

    //function

    String getColor(){     //getter
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){   //setter
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

    // void calcPercentage (int m1, int m2, int m3){
    //     percentage = (m1 + m1 + m3) / 3;
    // }

    //constructors

    Student(){            //non parameterized
        System.out.println("Hello");
    }


    //parameterized 
    Student(String name){
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }
}
