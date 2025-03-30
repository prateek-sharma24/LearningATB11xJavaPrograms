package ex_10_Arrays;

public class Lab025_secmax {
    public static void main(String[] args) {
        int[] arr={45,85,63,59,52,56};
        int max=0;
        int sec_max=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max) {
                sec_max=max;
                max=arr[i];
            } else if (arr[i]>sec_max && arr[i]!=max) {
                sec_max=arr[i];
            }
        }
        System.out.println("second largest number is: "+sec_max);
    }
}
