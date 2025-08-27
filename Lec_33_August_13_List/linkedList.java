package Lec_33_August_13_List;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>();
        list.push(10);
        list.push(20);
        list.push(30);

        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
