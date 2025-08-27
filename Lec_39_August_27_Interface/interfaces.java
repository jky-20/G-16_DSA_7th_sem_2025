package Lec_39_August_27_Interface;

interface example{
    int a = 10;
    void print();
    // example(){
    //     System.out.println("cannot make constructors of interface");
    // }
    default void display(){
        System.out.println("Default method");
    }
}
abstract class absClass{
    int a;
    abstract void print();
    public absClass() {
        a = 10;
    }
}

class normalClass implements example{
    @Override
    public void print(){
        System.out.println("print something");
    }
}

public class interfaces {
    public static void main(String[] args) {
        
        // anonymous class -> class having no name
        example obj = new example(){
            public void print(){
                System.out.println("print function");
            }
        };
        obj.print();

        // lambda expression
        example lambdaObj = () -> System.out.println("Lambda expression");
    }
}
