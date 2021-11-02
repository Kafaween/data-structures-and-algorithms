import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
  int[] arr={20,18,12,8,5,-2,111,123,4,6,300};
  Insertion insertion= new Insertion();
    System.out.println(Arrays.toString(arr));
    insertion.InsertionSort(arr);
    System.out.println(Arrays.toString(arr));
    int[] arr1={20,18,12,8,5,-2,111,123,4,6,300};
  Merge merge=new Merge();
    System.out.println(Arrays.toString(arr1));
    merge.MergeSort(arr1);
    System.out.println(Arrays.toString(arr1));
    System.out.println("----------------------------------");
    int[] arr2={8,4,23,42,16,15};
    System.out.println(Arrays.toString((arr2)));
    Quick quick= new Quick();
    quick.quickSort(arr2, 0, arr2.length-1);
    System.out.println(Arrays.toString((arr2)));
  }

}
