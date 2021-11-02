import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
public class Main {
  @Test
  @DisplayName("Can sort right")
  void test1() {
    int[] arr = {20, 18, 12, 8, 5, -2};
      for (int i = 1; i < arr.length; i++) {
        int j = i - 1;
        int temp = arr[i];
        while (j >= 0 && arr[j] > temp) {
          arr[j + 1] = arr[j];
          j = j - 1;
        }
        arr[j + 1] = temp;
      }

    assertEquals(Arrays.toString(arr),"[-2, 5, 8, 12, 18, 20]");
    }
  @Test
  @DisplayName("Can sort right")
  void test2() {
    int[] arr1={8,4,23,42,16,15};
    Merge merge=new Merge();
    merge.MergeSort(arr1);
    assertEquals("[4, 8, 15, 16, 23, 42]",Arrays.toString(arr1) );
  }
  @Test
  @DisplayName("Can sort right")
  void test3() {
    int[] arr1={8,4,23,42,16,15};
    Quick quick= new Quick();
    quick.quickSort(arr1, 0, arr1.length-1);
    assertEquals("[4, 8, 15, 16, 23, 42]",Arrays.toString(arr1) );
  }
  }

