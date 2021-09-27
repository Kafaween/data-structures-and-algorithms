# Insert to Middle of an Array

## we want to take array and shift all the element in by one and split is gonna be the half of the length of the array if the length is even other wise the split is gonna be half +1 and

## Whiteboard Process

![wightboard](https://github.com/Kafaween/data-structures-and-algorithms/blob/main/java/array-insert-shift/code%202.PNG)

## code

```
public class Main
{
 public static void main(String[] args) {
  System.out.println("Hello World");
  int[] array = {42,8,15,23,42};
  int[] ans=insertShiftArray(array,16);
  for(int el:ans){
       System.out.println(el+" ");
  }

 }
  public static int[] insertShiftArray(int[] arr,int n){
         int len=arr.length;
         int[] newarr =new int[len+1];
         int half=0;
         int a=0;
         if(len%2==0){
             half =len/2;

         }
         else {half =len/2+1;}

     for (int i =0;i<=len;i++){
         if(i==half){
             a=1;
             newarr[i]=n;
         }
         else {
             newarr[i]=arr[i-a];
         }
     }

     return newarr;
 }
```

## Approach & Efficiency

#### I want to create new array with length +1 to the original and copy all element tell I retch the half

#### the add the new element to the half index of the last if even and if odd half +1

#### then and the the remaining items to the new array

## Big-O

### time o(n)

### space o(n)
