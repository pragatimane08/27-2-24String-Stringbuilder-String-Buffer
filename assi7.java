package Lab.lab4;
//7. Write a Java program to return the sum of the digits present in the given string. If
//there is no digits the sum return is 0.
//a. String s=”14abc9kj”;
//b. O/p: 1+4+9=14
public class assi7 {

    public static int sumOfDigits(String s){
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                sum+=Character.getNumericValue(ch);
            }
        }
        
        return sum ;
    }
    public static void main(String[] args) {
        String s = "14abc9kj";
        int sum = sumOfDigits(s);
        System.out.println("sum of digits: "+sum);
    }
}
