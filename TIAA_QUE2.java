import javafx.print.PrintColor;

class TIAA_QUE2{
    public static void main(String[] args) {
        int[] array1 = {1, 5, 3, 2, 4};
        int[] array2 = {7, 6, 9, 8, 10};
        int k = 5;
        int count1 = 0;
        int count2 = 0;
        for(int num : array1)
        {
            if(num < k)
            count1++;
        }
        for(int num1 : array2)
        {
            if(num1 > k)
            count2++;
        }
        int res = Math.max(count1, count2);
        System.out.println("Max: "+res);

    }
}
