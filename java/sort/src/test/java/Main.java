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
  }

