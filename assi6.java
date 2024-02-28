package Lab.lab4;
//6. Create string by using below ways and compare using “==” and equals() method:
//a. String s1=”abc”;//literal way
//b. String s2=”abc”;
//c. String s3=new String(“abc”); //using new keyword
//d. String s4=new String(“abc”);
public class assi6 {
    public static void main(String[] args) {
        String s1= "abc";
        String s2 ="abc";
        System.out.println("by using == ");
        //check data equal
        if(s1==s2){
            System.out.println("both equal");
        }else{
            System.out.println("not equal");
        }

        System.out.println("by using quals()");
        //check memory equal
        if(s1.equals(s2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("by using == ");
        if(s3==s4){
            System.out.println("both equal");
        }else{
            System.out.println("not equal");
        }

        System.out.println("by using quals()");
        if(s3.equals(s4)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
