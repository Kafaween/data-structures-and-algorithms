public class Merge {
  public void MergeSort(int[] arr){
    int length=arr.length;
    if(length<2){
      return ;
    }
    int mid = length/2;
    int[] left = new int[mid];
    int[] right=new int [length-mid];
    for(int i=0;i<mid;i++){
      left[i]=arr[i];
    }
    for(int j=mid;j<length;j++){
      right[j-mid]=arr[j];
    }
    MergeSort(left);
    MergeSort(right);
    Merge(left,right,arr);
  }
  private void Merge(int[] left,int[] right,int[] arr){
    int i=0;
    int j=0;
    int k=0;
    while (i<left.length&& j<right.length){
      if (left[i]<=right[j]){
        arr[k++]=left[i++];
      }
      else {
        arr[k++]=right[j++];
      }
    }
    while (i<left.length){
      arr[k++]=left[i++];
    }
    while (j<right.length){
      arr[k++]=right[j++];
    }
  }
}
