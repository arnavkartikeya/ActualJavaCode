import java.util.Scanner;
class StudentSort{
  public static void main(String[] args){
    Scanner UI = new Scanner(System.in);
    System.out.println("Enter the number of students");
    int numOfStudents = UI.nextInt();
    String[] students = new String[numOfStudents];
    int[] grades = new int[numOfStudents];
    for(int i = 0; i < students.length; i++){
      System.out.println("Enter students name");
      students[i] = UI.next();
    }
    for(int i = 0; i < students.length; i++){
      System.out.println("Enter students grades");
      grades[i] = UI.nextInt();
    }
    sort(students, grades);
    for(String i : students){
      System.out.print(i + " ");
    }
    System.out.println();
  }
  public static String[] sort(String[] st, int[] grd){
    for(int i = 0; i < grd.length-1; i++){
      int currentMin = grd[i];
      int minIndex = i;
      for(int j = i +1; j < grd.length; j++){
        if(currentMin > grd[j]){
          currentMin = grd[j];
          minIndex = j;
        }
      }
      if(currentMin != i){
        String temp = st[i];
        st[i] = st[minIndex];
        st[minIndex] = temp;

        grd[minIndex] = grd[i];
        grd[i] = currentMin;
      }
    }
    return st;
  }
}
