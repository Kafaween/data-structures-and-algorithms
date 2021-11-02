public class Quick {
  public  void swap(int[] array, int x, int y) {
    int currentArr = array[x];
    array[x] = array[y];
    array[y] = currentArr;
  }
  public  int partition(int[] array, int x, int y) {
    int pivot = array[y];
    int i = (x - 1);

    for(int j = x; j < y ; j++) {
      if (array[j] < pivot){
        i++;
        swap(array, i, j);
      }
    }
    swap(array, i + 1, y);
    return (i + 1);
  }
   public   void quickSort(int[] array, int x, int y) {
    if (x < y){
      int index= partition(array, x, y);
      quickSort(array, x, index - 1);
      quickSort(array, index + 1, y);
    }
  }
}
