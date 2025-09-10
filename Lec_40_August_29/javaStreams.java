package Lec_40_August_29;

import java.util.Arrays;
import java.util.List;

public class javaStreams {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("abc", "abcd", "abcdh", "abc", "abc");

        names.stream().filter(str->str.length()%2==1).distinct().forEach(str->System.out.println(str));
        names.stream().map(str->str.length()).distinct().count();
    }
}
