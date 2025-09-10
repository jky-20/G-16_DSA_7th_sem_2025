package Lec_40_August_29;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class exceptionHandling {

    static void canThrowException() throws IOException{

        FileReader fr = new FileReader("example.txt");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {

            System.out.println(a / b);
            canThrowException();

        } 
        catch(IOException ioe){

        }
        catch (Exception e) {
            System.out.println("b can't be zero");
        }
        finally{
            System.out.println("finally Block");
        }

        System.out.println("End Line");
    }
}
