public class DBRecursion {
    //  print number  from 5 to 1
//    public static void printNum(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        printNum(n-1);
//    }
//    public static void main(String[] args) {
//       int n = 5;
//       printNum(n);
//    }


    //print number from 1 to 5
//   public static void printNum(int n){
//        if(n==6){
//            return;
//        }
//        System.out.println(n);
//        printNum(n+1);
//    }
//    public static void main(String[] args) {
//        int n = 1;
//        printNum(n);
//    }


    // print sum of n natural number
//    public static void sumOfNumber(int i ,int n , int sum){
//        if (i==n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        sumOfNumber(i+1 , n , sum);
//    }
//
//    public static void main(String[] args) {
//        sumOfNumber(1,8,0);


    //print factorial of n
//    public static int printFact(int n){
//        if (n==1 || n==0){
//            return 1;
//        }
//     int factnm1 = printFact(n-1);
//     int Factn = n*factnm1;
//     return Factn;
//    }
//
//    public static void main(String[] args) {
//       int n = 6;
//       int ans =  printFact(n);
//        System.out.println(ans);
//    }


    // x^n = x*x^(n-1)
    // print x^n(stack height = n)
//    public static int printPower (int x, int n){
//        if (x == 0) {
//            return 0;
//        }
//        if (n==0){
//            return 1;
//        }
//        int powernm1 = printPower(x,n-1);
//        int powern = x*powernm1;
//        return powern;
//    }
//
//    public static void main(String[] args) {
//        int x=3;
//        int n =3;
//        int power = printPower(x,n);
//        System.out.println(power);
//    }


    //print fabonacci series
    public static void printFab(int a, int b,int n){
        
    }

    public static void main(String[] args) {

    }

}