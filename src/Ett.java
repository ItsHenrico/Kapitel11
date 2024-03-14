import java.util.Objects;
import java.util.Scanner;

public class Ett {
    public static void main(String[] args){
        int lenght = 0;
        int check = 0;
        String out = "";
        Scanner input = new Scanner(System.in);
        int[] array = new int[1000];
        for (int i = 0; i <= 1000; i++){
            if(input.hasNextInt()){
                array[i] = input.nextInt();
                lenght++;
            }
        }
        for(int count = 0; count < lenght; count++) {
            for (int i = 0; i < count; i++) {
                if (array[count] == array[i]) {
                    check++;
                }
            }
            if (check == 0) {
                out = out + " " + array[count];
            }
            check = 0;
        }
        System.out.println(out.substring(1));
    }
}