import java.util.*;

public class Chapter01 {

    public static void main(String[] args) {
        System.out.println("== Chapter 01 ==");
    }

    public boolean Q1IsUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }

    public boolean Q2CheckPermutation(String a, String b) {
        return true;
    }
}
