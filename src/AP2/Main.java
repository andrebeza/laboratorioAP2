//JOÃO ANDRÉ BEZA PIRES E WILLIAM DEWES BERNST
package AP2;

import java.io.DataInput;

public class Main {
    public static void main(String[] args) {
        GetData sc = new GetData();

        sc.getStrings();
        sc.getStringsParams("William Dewes");
        System.out.println("===== end of string methods =====");

        sc.getFloats();
        sc.getFloatParams(1123.12313F);
        System.out.println("===== end of float methods =====");

        sc.getDouble();
        sc.getDoubleParams(2.22);
        System.out.println("===== end of double methods =====");

        sc.getInt();
        sc.getIntParams(2);
        System.out.println("===== end of Integer methods =====");

        sc.getChar();
        sc.getCharParams("AA");
        sc.getCharParams("A");

        System.out.println("===== end of Char methods =====");

        sc.getEmail();

        sc.getDate();

        sc.getInvertedDate();

        sc.isItNumber();
    }
}
