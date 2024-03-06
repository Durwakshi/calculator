import java.util.Scanner;

public class DBdef {
   // public static void printNumber( String name ){
    //   System.out.println(name);
    //  return;
    // }

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name = sc.next();
        printNumber(name);
    }*/
    public static int addNumber(int a,int b){
     int sum = a+b ;
        System.out.println(sum);
     return sum;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      addNumber(a,b);
    }
}
