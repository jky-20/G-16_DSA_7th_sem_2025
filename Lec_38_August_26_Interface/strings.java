package Lec_38_August_26_Interface;

class example{
    int a;
    boolean equals(example obj){
        return super.equals(obj);
    }
    public boolean equals(Object obj){

        if(obj instanceof String){
            // conpare content

            return true;
        }
        return false;
    }
}

public class strings {
    public static void main(String[] args) {
        
        String s1 = new String("abc");
        String s2 = new String("abc");
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        StringBuffer sbf1 = new StringBuffer("abc");
        StringBuffer sbf2 = new StringBuffer("abc");

        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);       // false
        
        System.out.println(sb1.equals(sb2));    // false
        System.out.println(s1.equals(sb2));     // false
    }
}
