package leetCode;

public class P344 {
    public static void main(String[] args) {
        char[] C1 = {'h','e','l','l','o'};
        char[] C2 = {'H','a','n','n','a','h'};
        reverseString(C1);
        reverseString(C2);
    }
    public static void reverseString(char[] s) {
        int size = s.length;
        char[] b = new char[size];
        int index = size-1;
        for(char c : s){
            b[index] = c;
            index--;
        }
        index = 0;
        for(char c : b){
            s[index] = c;
            index++;
        }
    }
}
