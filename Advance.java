package Recursion;

// print all permutation of given string

import java.util.ArrayList;


public class Advance{
    public static void PrintPermutation(String st,String permutation){
        if(st.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i<st.length();i++){// loop to pick the single characters
            char ch = st.charAt(i);
            String newString = st.substring(0, i)+st.substring(i+1);// this new string contain string except picked character
            PrintPermutation(newString,permutation+ch);

        }

    }

    public static int CountTotalPath(int i, int j,int n,int m){
        if(i == n || j == m) {
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;

        }
        int down  = CountTotalPath(i+1,j,n,m);
        int right = CountTotalPath(i,j+1,n,m);
        return down+right;
    }
    public static int PlaceTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical = PlaceTiles(n-m,m);
        int horizontal = PlaceTiles(n-1,m);
        return vertical+horizontal;
    }

    public static int CallGuest(int n){
        if(n<=1)
            return 1;
        int single = CallGuest(n-1);// if guest come each differently
        int pair = (n-1) * CallGuest(n-2);// if guest come with pair
        return single+pair;
    }
    public static void printSubset(ArrayList<Integer> sub){
        for (Integer integer : sub) {
            System.out.print(integer);

        }
        System.out.println();
    }
    public static void countSubset(int n,ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }

        // to add subset to the list
        subset.add(n);
        countSubset(n-1, subset);
        // to remove the same subsets
        subset.remove(subset.size()-1);
        countSubset(n-1, subset);
    }



}

class MainA{
    public static void main(String[] args) {
        //Advance.PrintPermutation("abc","");
        //System.out.println(Advance.PlaceTiles(4,2));
        int n =3;
        //System.out.println(Advance.CallGuest(n));
        ArrayList<Integer> subset = new ArrayList<>();
        Advance.countSubset(n,subset);

    }
}
