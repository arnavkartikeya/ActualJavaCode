class SelectionSort{
  public static void main(String[] args){
    int[] a = {3,21,4,5,-5};
    sort(a);
    for(int i: a){
      System.out.print(i + " ");
    }
    System.out.println();
  }
  public static int[] sort(int[] arr){
    for(int i = 0; i < arr.length-1; i++){
      int currentMin = arr[i];
      int minIndex = i;
      for(int j = i+1; j < arr.length; j++){
        if(currentMin > arr[j]){
          currentMin = arr[j];
          minIndex = j;
        }
      }
      if(minIndex != i){
        arr[minIndex] = arr[i];
        arr[i] = currentMin;
      }
    }
    return arr;
  }

}
