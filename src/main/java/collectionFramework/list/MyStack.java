package collectionFramework.list;

import java.util.Stack;


public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(10);
        s.push(20);
        System.out.println(s.size());
        s.push(30);
        s.pop();

        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
}
