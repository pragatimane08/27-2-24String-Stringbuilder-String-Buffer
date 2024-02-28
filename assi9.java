package Lab.lab4;

import java.util.Scanner;

//9.Accept integer values from user & display it's equivalent Binary,Hexadecimal.Octal values.
public class assi9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer value: ");
        int num = sc.nextInt();

        System.out.println("Binary equivalent: "+Integer.toBinaryString(num));
        System.out.println("hexadecimal equivalent: "+Integer.toHexString(num));
        System.out.println("Octal values: "+Integer.toOctalString(num));
    }
}
