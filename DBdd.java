
import java.util.*;
public class DBdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("not an adult");
        }

    }
}
