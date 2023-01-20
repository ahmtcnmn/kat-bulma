import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a,b=1,c=1;
        out.print("Lütfen sayıyı giriniz. : ");
        a=input.nextInt();
        out.print("4'ün katları : ");
        for (int i=1;i<a;i*=4) {
            out.print(i+",");
        }
        out.println();
        out.print("5'ün katları : ");
        for (int i=1;i<a;i*=5){
            out.print(i+",");
        }
    }
}
