import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // генерит число от 1 до 100
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        boolean hasWon = false;
        
        System.out.println("Добро пожаловать в игру 'Угадай число'!");
        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать!");
        
        while (!hasWon) {
            System.out.print("Введите ваше предположение: ");
            guess = scanner.nextInt();
            
            if (guess < secretNumber) {
                System.out.println("Загаданное число больше!");
            } else if (guess > secretNumber) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Поздравляем! Вы угадали число!");
                hasWon = true;
            }
        }
        
        scanner.close();
    }
} 