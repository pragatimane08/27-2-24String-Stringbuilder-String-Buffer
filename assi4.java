package Lab.lab4;
//4. practice StringBuffer methods such as length(),
//capacity(),append(),insert(),delete() etc
/*String Buffer -  1.represent mutable sequence of character
 *  2.allow modifi content without creating object
 *  3.useful at perform a lot string manipulation operation
*/
public class assi4 {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("hello");
        //created object of stringbuffer

        //1.length
        int l = sb.length();
        System.out.println("length of StringBuffer is : "+l);

        //2.capacity - return currnt capacity of buffer
        int capacity = sb.capacity();
        System.out.println("current capacity of buffer : "+capacity);
    
       //3.append() -add string at end
       sb.append(" world!!");
       System.out.println("append string at end: "+sb);

       //4.insert() -insert string at specific position 
       sb.insert(5," java");
       System.out.println("insert at specific position String : "+sb);

       //5.delete() - delete character from string
       sb.delete(3, 11);
       System.out.println("delete char from from start to end : "+sb);

    }
}
