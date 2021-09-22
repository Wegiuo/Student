import java.util.Scanner;

public class rec11 {
    public static int recursion(int amount){
        Scanner scanner = new Scanner(System.in);
        String y = scanner.next();
        if (y.contains("00")){
            return amount;
        }
        if (y.contains("1")){
            amount = amount+1;
            return recursion(amount);
        }
        return recursion(amount);
    }

    public static void main(String[] args) {
        System.out.println(recursion(0));
    }
}
