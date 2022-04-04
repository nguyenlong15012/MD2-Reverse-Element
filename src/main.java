import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        System.out.println("Đảo ngược phần tử trong mảng sử dụng Stack");
        String str = "mWord";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi: ");
//        String str = sc.nextLine();
        String newStr = "";
        Stack wStack = new Stack<>();

        for (int i = 0; i<str.length(); i++){
            wStack.push(str.charAt(i));
        }

        for (int i = 0; i<str.length(); i++){
            newStr +=wStack.pop();
        }

        newStr = newStr+"----mWord";
        System.out.println("result = " + newStr);

        System.out.println("--Đảo ngược phần tử số nguyên sử dụng Stack--");
        int[] array = {1,3,8,2,-5,6,1,9};
        Stack<Integer> arr = new Stack<>();
        for (int i = 0; i<array.length; i++){
            arr.push(array[i]);
        }
        System.out.println("truoc pop --- " + arr);
        for (int i = 0; i<array.length; i++){
            array[i] = arr.pop();
        }

        for (int element : array){
            System.out.printf(" "+ element);
        }
    }
}
