import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {
    public static void main(String[] args) {
        boolean num = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(num){
            System.out.print("Введите дробное число: ");
            try{
                float fNumb = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число = %f\n", fNumb);
                num = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Ошибка ввода. Необходимо ввести дробное число (через точку). Попробуйте еще раз.");
            }

        }
    }
}
