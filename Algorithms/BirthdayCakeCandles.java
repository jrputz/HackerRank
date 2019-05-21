import java.util.Scanner;

public class BirthdayCakeCandles {

    static int findHeightAndCount(int arr[]) {
        int highNumber = arr[0];
        int count = 1;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > highNumber) {
                highNumber = arr[i];
                count = 1;
            } else if(arr[i] == highNumber) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //Get age from user
        Scanner in = new Scanner(System.in);
        int age = Integer.parseInt(in.nextLine());
        
        
        //Allocate memory for array
        int candles[] = new int[age];
        String str[] = in.nextLine().split(" ");
        for(int i = 0; i < age; i++) {
            candles[i] = Integer.parseInt(str[i]);
        }
        in.close();

        int n = findHeightAndCount(candles);
        System.out.println(n);
        
        
    }
}