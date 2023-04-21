import java.util.Scanner;
public class Main {
    static int power (int a,int b){

        if (b==0){
            return 1;
        }else{
            return a*power(a,b-1);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs sayısını giriniz : ");
        int up = input.nextInt();

        System.out.println("Sonuç : " +power(base,up));

    }
}