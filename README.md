# Игра "Угадай число" 🎮

Привет! Это простая, но увлекательная игра, где компьютер загадывает число, а ты пытаешься его угадать.

## Что это такое? 🤔

Это Java-приложение с графическим интерфейсом, где:
- Компьютер загадывает число от 1 до 100
- Ты вводишь свои догадки
- Компьютер подсказывает, больше или меньше загаданное число
- Считаются твои попытки

## Как запустить? 🚀

### Установка
1. Убедись, что у тебя установлены:
   - Java (версия 22 или выше)
   - Git
   - Maven

2. Клонируй репозиторий:
   ```bash
   git clone https://github.com/snofine/number-guessing-game.git
   cd number-guessing-game
   ```
3. 1. Перейдите в раздел [Releases](https://github.com/ваш-username/Guess-the-number/releases)
   2. Скачайте последнюю версию игры (файл .jar)
   3. Убедитесь, что у вас установлена Java 22 или выше
   4. Скачайте и установите [JavaFX SDK](https://gluonhq.com/products/javafx/)
   5. Запустите игру командой:
      ```bash
      java --module-path "путь/к/javafx-sdk-22/lib" --add-modules javafx.controls,javafx.fxml -jar number-guessing-game-1.0-SNAPSHOT.jar
      ```

### Запуск
1. Открой терминал в папке с проектом
2. Выполни команду:
   ```
   mvn clean javafx:run
   ```

## Как играть? 🎯

1. Запусти игру
2. Введи число от 1 до 100 в текстовое поле
3. Нажми кнопку "Угадать" или Enter
4. Смотри подсказки и пробуй снова
5. Когда угадаешь - получишь поздравление!

## Что дальше? 📝

В будущем планируем добавить:
- Сохранение рекордов
- Отображение лучшего результата
- Возможно, разные уровни сложности

## Технические детали 🔧

- Написано на Java с использованием JavaFX
- Собирается с помощью Maven
- Работает на Windows, Linux и MacOS

## Нужна помощь? 💬

Если что-то не работает или есть идеи по улучшению - создай issue в репозитории! 

## Лицензия

MIT licence
