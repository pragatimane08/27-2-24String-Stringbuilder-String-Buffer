package Lab.lab4;
//5. Write a java program to split string by “blank space” and “-” patterns
public class assi5 {
    public static void main(String[] args) {
        String ipString = "hello-world java program";
        String[] parts = ipString.split("[\\s-]+");

        //[\\s-]+ specifies that the string should be split by one or more occurrences of either a blank space (\\s) or a hyphen (-).
       
        //print split parts of string
        System.out.println("splitted by blank space: ");
        for(String part : parts){
            System.out.println(part);
        }

    }
}
