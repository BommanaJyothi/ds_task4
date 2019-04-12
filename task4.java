import java.io.*;
import java.util.*;

public class Solution {

    private Stack<Integer> s1 = new Stack<Integer>();  
    private Stack<Integer> s2 = new Stack<Integer>(); 


    public void enqueue(int data)  
    {  
        s1.push(data);
    }   
  
    public Integer dequeue() {
        if (size() == 0) {
            return null;
        }
        if (s2.isEmpty()) {
            shiftStacks();
        }
        return s2.pop();
    }
        
    public Integer display() {
        if (size() == 0) {
            return null;
        }
        if (s2.isEmpty()) {
            shiftStacks();
        }
        return s2.peek();
    }
        
    private void shiftStacks() {
        if (s2.isEmpty()) { 
            while ( ! s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
        
    public int size() {
        return s1.size() + s2.size();
    }



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int q,c,data,i=0;
        q=sc.nextInt();
        while(i<q){
            c=sc.nextInt();
            if(c==1){
                data=sc.nextInt();
                s.enqueue(data);
            }else if (c==2){
                s.dequeue();
            }else if (c==3){
                System.out.println(s.display());
            }
            i=i+1;
        }

    }
}
