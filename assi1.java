package Lab.lab4;
//1. Write an Employee class with id, name and dob(Contained Object..
//Containment)with Default and parameterised constructor & toString()..
public class assi1 {
    int id;
    String name;
    String date;
    assi1(){
        System.out.println("Default constructor ..");
    }
    assi1(int id,String name,String date){
          this.id = id;
          this.name = name;
          this.date = date;
    }
    String toString(int id,String name,String date){
           return id+" "+name+" "+date;
    }

    public static void main(String[] args) {
        assi1 a = new assi1();
        System.out.println(a.toString(2, "Arjun", "2-2-24"));
    }
}
