package Lab.lab4;
//Aggregation in Java is a relationship between two classes that is best described as 
//a "has-a" and "whole/part" relationship. It is a more specialized version of the association relationship.
// The aggregate class contains a reference to another class and is said to have ownership of that class.
class opearation{
    int square(int n){
        return n*n;
    }
}
public class Circle {
    opearation op;
    //aggregation
    double pi = 3.14;

    double area(int radious){
        op = new opearation();
        int rsquare = op.square(radious);
        //code reusability(i.e delegates the method call)
        return pi*rsquare;
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
