class ShuffleArr{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7};
    for(int i = 0; i < arr.length; i++){
      int random = (int) (Math.random() * arr.length);
      //random element in the array
      int temp = arr[i];
      //swapping elements in the array
      arr[i] = arr[random];
      arr[random] = temp;
    }
    for(int x : arr){
      System.out.println(x);
    }
  }
}
