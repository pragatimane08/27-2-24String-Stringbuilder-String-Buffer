package Lab.lab4;

public class strBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //append string
        sb.append("hello");
        sb.append(" ");
        sb.append("world !!");

        //printing the STringBuilder content
        System.out.println("StringBuilder content: "+sb);

        //insert string 
        sb.insert(5, " java");
        System.out.println(sb);

        //printing modified sring
        System.out.println("Modified String is: "+sb);

        //replace character in the stringBuilder
        sb.replace(3, 5, "universe");
        System.out.println(sb);

        //delete character
        sb.delete(3, 9);
        System.out.println(sb);

        //reverse content
        sb.reverse();
        System.out.println(sb);

    }
}
