
public class SecondElement{
    public static void main(String[] args) {

       int[] even = {6,23,34,21,12,80,98,87,69,99};
		
		int n = even.length;
        int smallestValue = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
         {
            if (even[i] < smallestValue)
             {
                secondSmallest = smallestValue;
                smallestValue = even[i];
             } else if (even[i] < secondSmallest && even[i] != smallestValue) 
             {
                secondSmallest = even[i];
             }
        }

        System.out.println(secondSmallest);
    }
}