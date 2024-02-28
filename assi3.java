package Lab.lab4;

import Java_class.book;
import Java_class.Buffered_redaer.st;

//3. Use the String Class Methods like length, hashCode,equals, replace, trim,
//subString, concatinate , compare , charAt, subString etc.. for a given String(s)
public class assi3 {
    public static void main(String[] args) {
        String str = "hello , world !!";

        //length
        System.out.println("length of string is: "+str.length());
        
        //hashcode - returns hashcode value for object
        int hashCode = str.hashCode();
        System.out.println("hash code of String is : "+hashCode);
        
        //equals() - compare 2 strings
        String str2 = "Hello , world!!";
        boolean isequal = str.equals(str2);
        System.out.println("Are equal: "+isequal);
        
        //replace() - replace occurances of a specified substring with new substring
        String replaString = str.replace("hello", "java");
        System.out.println("String replace is: "+replaString);
       
        //trim() - returns copy of string,with leading & trailing whitespace ommited
        String trimstr = " hello , world ".trim();
        System.out.println("Trim of the string is: "+trimstr);
       
        //substring() - returns a new String that is substring
        String substring1 = str.substring(7);
        System.out.println(substring1);
        
        //concat() - concatination of string 
        String concats = str.concat(substring1);
        System.out.println(concats);
        
        //compareto() - comapre string
        String s1 = "apple";
        String s2 = "banana";
        int comapre = s1.compareTo(s2);
        System.out.println("comapre 2 string: "+comapre);
        
        //charAt() - return character at specific position
        char charAtindex = str.charAt(2);
        System.out.println("charAt used : "+charAtindex);
       
        //substring - return substring starting from the 1st to end
        String subStringstr = str.substring(2);
        System.out.println("substring is :"+subStringstr);
        
    }
}
