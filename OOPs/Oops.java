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

        //copy const obj
        Student s4 = new Student(s1);
        Fish shark = new Fish();
        shark.eat();
        horse h = new horse();
        h.eat();
        h.walk();
        chicken c = new chicken();
        c.eat();
        c.walk();
        

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

    //copy const.
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }

    //parameterized 
    Student(String name){
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }
}



//Inheritance

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("kha rhe hai");
    }
    void breathe(){
        System.out.println("saans le rhe hai");
    }
}

//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim kr rhi hai");
    }
}

//abstraction

abstract class Animal1 {
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}

class horse extends Animal1{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends Animal1{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}