import java.util.Scanner;

public class Getiint {
    public static void main(String[] args) {

        System.out.print("Doua numere : ");
        GetInt();
        GetInt2();
        System.out.print("Introduceti caracterul : ");
        getOperation();
        System.out.println("Rezultatul : " +rez );
        int rez = GetInt()+getOperation()+GetInt2();
    }
    public static void GetInt(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

    }
    public static void getOperation (){
        Scanner scan = new Scanner(System.in);
        String car = scan.nextLine();

    }
    public static void GetInt2 (){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
    }
}


