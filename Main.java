/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner; 
public class Main {

    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Please input a number");
        n = myScanner.nextInt();
        for(int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
