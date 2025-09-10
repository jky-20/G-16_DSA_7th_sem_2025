package Lec_43_September_10_Graphs;

import java.util.ArrayList;

class Tree{

    int val;
    ArrayList<Tree> children;

    Tree(int val){
        this.val = val;
        this.children = new ArrayList<>();
    }
}



public class dfs {
    static void depthFirstSearch(Tree root){

        if(root == null){
            return;
        }
        System.out.println(root.val);
        
        // recursion on children
        for(int i=0 ; i<root.children.size() ; i++){
            depthFirstSearch(root.children.get(i));
        }
    }
    public static void main(String[] args) {
        
    }
}
