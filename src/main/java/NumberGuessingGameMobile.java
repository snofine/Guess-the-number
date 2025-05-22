import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class NumberGuessingGameMobile extends Application {
    private int secretNumber;
    private int attempts;
    private Label messageLabel;
    private Label attemptsLabel;
    private TextField guessField;
    private Button guessButton;
    private Button newGameButton;

    @Override
    public void start(Stage primaryStage) {
        // Инициализация игры
        startNewGame();

        // Создание элементов интерфейса
        messageLabel = new Label("Угадайте число от 1 до 100");
        attemptsLabel = new Label("Попытки: 0");
        guessField = new TextField();
        guessField.setPromptText("Введите число");
        guessButton = new Button("Угадать");
        newGameButton = new Button("Новая игра");

        // Настройка обработчиков событий
        guessButton.setOnAction(e -> makeGuess());
        newGameButton.setOnAction(e -> startNewGame());
        guessField.setOnAction(e -> makeGuess());

        // Создание и настройка контейнера
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
            messageLabel,
            attemptsLabel,
            guessField,
            guessButton,
            newGameButton
        );

        // Настройка сцены
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("Угадай число");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startNewGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        attempts = 0;
        updateAttemptsLabel();
        messageLabel.setText("Угадайте число от 1 до 100");
        guessField.clear();
        guessField.setDisable(false);
        guessButton.setDisable(false);
    }

    private void makeGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            attempts++;
            updateAttemptsLabel();

            if (guess < 1 || guess > 100) {
                messageLabel.setText("Число должно быть от 1 до 100!");
            } else if (guess < secretNumber) {
                messageLabel.setText("Загаданное число больше!");
            } else if (guess > secretNumber) {
                messageLabel.setText("Загаданное число меньше!");
            } else {
                messageLabel.setText("Поздравляем! Вы угадали число!");
                guessField.setDisable(true);
                guessButton.setDisable(true);
            }
            guessField.clear();
        } catch (NumberFormatException e) {
            messageLabel.setText("Пожалуйста, введите число!");
        }
    }

    private void updateAttemptsLabel() {
        attemptsLabel.setText("Попытки: " + attempts);
    }

    public static void main(String[] args) {
        launch(args);
    }
} 