import java.util.*;
public class questionTwo {
    public static void main(String[] args) {
        int[] arr = {100,180,260,310,40,535,695};
        int buyAtPrice = arr[0];
        int maxProfit = 0;
        int currentIndex = 0;
        for(int i = 1; i < arr.length ;i++){
            if(buyAtPrice > arr[i]){
                buyAtPrice = arr[i];
            }
            maxProfit = Math.max(maxProfit, arr[i] - buyAtPrice);
            currentIndex = arr[i];

        }   
        System.out.println("Max Profit is : ");
        System.out.println(maxProfit);

        System.out.println("We should buy the stock on ");
        System.out.println(currentIndex);


        
    }
}
