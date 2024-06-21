import java.util.Scanner;

public class MinMax {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int n = input.nextInt();
        int k=1;

        int num;
        int min;
        int max;

        System.out.println("Lütfen 9 basamaktan fazla basamaklı sayı girmeyiniz.");


        System.out.print(k + ". sayıyı giriniz:");
        num = input.nextInt();
        min=num;
        max=num;

        for (k=2;k<=n;k++){
            System.out.print(k + ". sayıyı giriniz:");
            num = input.nextInt();
            if (num<min){
                min=num;

            }
            if (num>max){
                max=num;
            }
        }
        System.out.println("En küçük değer: " + min);
        System.out.println("En büyük değer: " + max);




    }

}


