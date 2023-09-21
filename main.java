import java.util.Scanner;
class Main {
  static Scanner sc;
  public static void inputArray(int[] a, int i){
    if (i>=a.length) 
      return;
    a[i] = sc.nextInt();
    inputArray(a, i+1);
  }
  public static int parb(int[] a, int i){
    if (i<0) {
      return 0;
    }else if(a[i]==0){ 
      return i+1;
    }else{
      return parb(a,i-1);
    }
  }
  
  public static void main(String[] args) {
  
    System.out.println("it's me, Mario ");
		sc = new Scanner(System.in);
    
		System.out.print("count:" );
		int count = sc.nextInt();
    
		System.out.println("numbers:");
		int[] a = new int[count];
    inputArray(a,0);
    
	  System.out.print("result: ");
    int i = parb(a, a.length-1);
		System.out.println(i);
    sc.close();
  }
}
