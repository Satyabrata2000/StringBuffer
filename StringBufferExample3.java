package StringBuffer;

//String Buffer replace method

public class StringBufferExample3 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("It is a wonderful day");
        System.out.println(sb);
        sb.replace(18, 18, "sunny ");
        System.out.println(sb);
    }
}
