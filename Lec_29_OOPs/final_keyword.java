package Lec_29_OOPs;

class example{
    int b;
}

final class finalClass{ // this class can't be inherited
    int x;
}

class parent{
    final void method(){
        System.out.println("Parent class");
    }
}
class child extends parent{
    void method(){
        System.out.println("child class");
    }
}

final class Immutable{
    final int a;
    final int b;

    public Immutable() {
        this.a = 0;
        this.b = 0;
    }
}

public class final_keyword {
    public static void main(String[] args){

        final int a;
        // a = 20;

        final example obj = new example();
        obj.b = 10; // object is changed not ref var

        obj = new example();

        finalClass obj2 = new finalClass();
        
        final int abc;
        abc = 10;
    }
}
