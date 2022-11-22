package StringBuffer;

//StringBuffer insert method

public class StringBufferExample2 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("This Java Example");
        System.out.println(sb);
        sb.insert(5, "is a ");
        System.out.println(sb);
    }
}
