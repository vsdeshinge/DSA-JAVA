package Recursion;

// tower of hanoi
// Reverse string
// find occurrence
// strictly increasing
// move all similar ele end of the string
// Remove duplicates
// Print all sequences(all subset of string
// print keyboard combination


import java.util.*;

public class intermediate {

    public static void TowerOfHanoi(int n,String source, String helper, String destination){// it is the classinc
        // game  have two rules
        // smaller should be on larger  disk
        // at a time one disk should be transfer
        if(n==1){
            System.out.println("Trasfer disk "+n+"from "+source+" to "+destination);
            return;
        }
        TowerOfHanoi(n-1,source,destination,helper);
        System.out.println("Trasfer disk "+n+"from "+source+" to "+destination);
        TowerOfHanoi(n-1,helper,source,destination);
    }


    public static void ReverseString(String st,int n){
        if(n == st.length()) {

            return;
        }

        ReverseString(st,n+1);// first it calls the function until the base case then it prints
        System.out.print(st.charAt(n));

    }






    public static int first = -1;
    public static int last = -1;
    public static void firstOccurance(String sc, int idx, char element){
        // printing the index of element  which occurs first and last in given string

        if(idx == sc.length()){
            System.out.println(first);//returns the first occurrence of the ele
            System.out.println(last);//returns the last occurrence of the ele
            return;
        }
        char currentele = sc.charAt(idx);//fetch the  char with idx
        if(currentele == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }

        }
        firstOccurance(sc,idx+1,element);


    }

    public static boolean IsSorted(int[] a,int idx){
        // check array is strictly increasing
        if(idx == a.length-1){
            return true;
        }
        if(a[idx]<a[idx+1]){
            IsSorted(a,idx+1);

        }

        return false;
    }

    public static int count = 0;
    public static String s="";

    public static void MoveAllEle(String x,int n,char ele){
        // Move all element to last
        if(n==x.length()){
            for(int i=0;i<count;i++){
                s +=ele;

            }
            System.out.println(s);
            return;
        }
        char currentele = x.charAt(n);
        if(currentele == ele){
            count++;
        }
        else{
            s+=currentele;
        }
        MoveAllEle(x,n+1,ele);
    }


    public static boolean[] map = new boolean[26];
    public static void RemoveDuplicates(String x,int n,String st){
        // Remove the duplicates and print the array by skipping
        if(n==x.length()){
            System.out.println(st);
            return;
        }
        char currentele = x.charAt(n);
        if(map[currentele-'a']){
            RemoveDuplicates(x,n+1,st);
        }
        else{
            st+=currentele;
            map[currentele-'a'] = true;
            RemoveDuplicates(x,n+1,st);
        }
    }



    // print all substring of given string

    public static void SubSequence(String st,int idx,String s, HashSet<String> set){
        if(idx == st.length()){
            if(set.contains(s)){
                return;
            }
            else{
                System.out.println(s);
                set.add(s);
                return;
            }
        }
        char currentele = st.charAt(idx);
        SubSequence(st,idx+1,s+currentele, set);
        SubSequence(st,idx+1,s, set);

    }
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void PriCombiOfKeypad(String st,int idx,String combination){
        if(idx == st.length()){
            System.out.println(combination);
            return;
        }

        char ch = st.charAt(idx);
        String mapping = keypad[ch -'0'];
        for(int i=0;i<mapping.length();i++){
            PriCombiOfKeypad(st,idx+1,combination+mapping.charAt(i));


        }



    }
}
class Main{
    public static void main(String[] args) {
        int n=3;
        String sc = "krupa";
        //intermediate.TowerOfHanoi(n,"S","H","D");
        intermediate.ReverseString(sc,0);
        //intermediate.firstOccurance("vivekanand",0,'a');
        int[] b = {1,2,3,4,5,6};

        //System.out.println(intermediate.isSorted(b,0));
        //intermediate.moveAllele("axbxxcd",0,'x');
        //intermediate.Removeduplicates("axbxxcd",0,'x');
        //intermediate.Removeduplicates("abcdabcd",0,"");
        //HashSet<String> set = new HashSet<>();

        //intermediate.SubSequence("aaa",0,"",set);
        //intermediate.PriCombiOfKeypad("23",0,"");



    }

}