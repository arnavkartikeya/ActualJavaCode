class BinarySearch{
  public static void main(String[] args){
    int[] arr = {2,4,6,69,65,2,132,1,543,56,8};
    sort(arr);
    for(int i : arr){
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println(binarySearch(arr, 69));
  }
  public static int binarySearch(int[] a, int key){
    int low = 0;
    int high = a.length - 1;
    while(low < high){
      int mid = (low + high)/2;
      if(a[mid] < key){
        low = mid + 1;
      }
      else if(a[mid] == key){
        return mid;
      }
      else{
        high = mid - 1;
      }
    }
    return -1-low;
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
