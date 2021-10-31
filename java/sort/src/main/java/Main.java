import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
  int[] arr={20,18,12,8,5,-2};
    System.out.println(Arrays.toString(arr));
    InsertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void InsertionSort(int[] arr){
    for (int i=1 ;i<arr.length;i++){
      int j=  i-1;
      int temp=arr[i];
      while (j >= 0 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }
  }
}
