package Lec_27_August_5_JCF;

class G16{

    String name;
    int roll;
    static int total_students;

    G16(){
        total_students++;
    }
}

public class basics {
    int a;
    public static void main(String[] args) {
        
        System.out.println(G16.total_students);

        G16 s1 = new G16();
        System.out.println(s1.total_students);

        String str = "Jai";
        String str2 = "Jai";

        if(str == str2){
            System.out.println("Same address");
        }

        String a = new String("Jai");
        String b = new String("Jai");

        if(a == b){
            System.out.println("Same address");
        }
        else{
            System.out.println("New address is allocated");
        }

        System.out.println(a.equals(b));

        a = "abc";
        a = a.concat("def");
        System.out.println(a);
    }
}
