import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (b >= a) {
            System.out.print("Wrong order!");
        }
        else if ((a - b) % 2 != 0) {
            System.out.print("Wrong difference!");
        }
        else{
            char star = '*', space = ' ';
            int dif = (a - b) / 2;
            for(int i = 0; i < a; i++){
                for(int j = 0; j < a; j++){
                    if(i >= dif && (i + dif) < a && j >= dif && (j + dif) < a){
                        System.out.print(space);
                    }
                    else{
                        System.out.print(star);
                    }
                    if(j + 1 < a){
                        System.out.print(' ');
                    }
                }
                if(i + 1 < a){
                    System.out.print('\n');
                }
            }
        }
    }
}