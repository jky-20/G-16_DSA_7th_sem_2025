package Lec_10_July_11_SegmentTree;

import java.util.Scanner;

public class segmentTree{

    void create(int node, int l, int r, int[] stree, int[] arr){
        if(l == r){
            stree[node] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        create(2*node, l, mid, stree, arr);
        create(2*node + 1, mid+1, r, stree, arr);

        stree[node] = stree[2*node] + stree[node];
    }

    void update(int node, int l, int r, int ti, int val, int[] stree, int[] arr){
        if(l == r){
            arr[ti] += val;
            stree[node] += val;
            return;
        }
        int mid = (l + r) / 2;

        if(ti >= l && ti <= mid){
            update(2*node, l, mid, ti, val, stree, arr);
        }
        else{
            update(2*node + 1, mid+1, r, ti, val, stree, arr);
        }
        stree[node] = stree[2*node] + stree[2*node+1];
    }

    int queryResult(int node, int ql, int qr, int sl, int sr, int[] stree, int[] arr){
        if(sl > qr || sr < ql){
            return 0;   // segment is not in range of query
        }
        if(sl >= ql && sr <= qr){
            return stree[node]; // segment lies completely within the query range
        }
        int mid = (sl + sr) / 2;
        int leftans = queryResult(2*node, ql, qr, sl, mid, stree, arr);
        int rightans = queryResult(2*node + 1, ql, qr, mid+1, sr, stree, arr);
        return leftans + rightans;
    }
    
    public static void main(String[] args) {
        
        int n;
        int[] sTree;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        sTree = new int[4*n];
    }
}