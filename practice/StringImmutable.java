import java.util.*;
public class StringImmutable {
    public static void main(String[] args) {
        String s="kaushik";
        System.out.println(s.hashCode());
        s="kaushikalex";
        System.out.println(s.hashCode());
        String a="kaushik";
        System.out.println(a.hashCode());
    }
}
