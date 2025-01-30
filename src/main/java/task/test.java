
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        List<Character> list= new LinkedList<>();
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = myObj.nextLine();

        String arr[]=userInput.split(" ");
        int x=0;
        for(var i: arr) {
            System.out.println(x++ +"-"+i);
        }
        System.out.print("Choose index of token: ");
        int index = Integer.parseInt(myObj.nextLine());
        if(index > arr.length-1) {
            System.out.println("Invalid index");
            return;
        }

        String temp=arr[index];
        for(int j=0; j<temp.length(); j++) {
            list.add(temp.charAt(j));
        }

        System.out.println(list);
    }
}
