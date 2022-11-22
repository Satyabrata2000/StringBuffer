package StringBuffer;

//StringBuffer Delete method

public class StringBufferExample4 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("This is beginning of week");
        System.out.println(sb);
        sb.delete(18, 20);
        System.out.println(sb);
    }
}
