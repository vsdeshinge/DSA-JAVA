package Recursion;





import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RECURSIONPRINTING {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printNtimes(n));
    }

    public static List<String> printNtimes(int n) {
        List<String> resultList = null;

        if (n == 0) {
            return resultList;
        }

        List<String> a = printNtimes(--n);

        a.add("coding ninja");
        resultList.addAll(a);

        return resultList;
    }
}

