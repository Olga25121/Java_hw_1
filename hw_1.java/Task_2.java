import java.util.ArrayList;
import java.util.List;

// 2. Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static void main(String[] args) {
        int num = 1000;
        boolean primeNum = true;
        List <Integer> primes = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    primeNum = false;
                }
            }
            if (primeNum) {
                primes.add(i);
            }
            else primeNum = true;
        }
        System.out.println("Простые числа от 1 до 1000:\n " + primes);
    }

        
}
    

