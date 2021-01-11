import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsesStack {
    private int[] array;

    public ReverseArrayUsesStack() {

    }
    public int[] doRev(int[] array){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        int j = 0;
        while(!stack.isEmpty()){
            array[j] = stack.pop();
            j++;
        }
        return array;
    }

    public void getDataInArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập độ dài mảng");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        ReverseArrayUsesStack reverseArrayUsesStack = new ReverseArrayUsesStack();
        reverseArrayUsesStack.doRev(array);
        reverseArrayUsesStack.getDataInArray(array);
    }
}
