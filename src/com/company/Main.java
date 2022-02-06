package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] questions = new String[]{
                "Основные принципы объектно-ориентированного программирования? Обведите один вариант.",
                "Что такое первичный ключ (primary key)? Обведите один вариант.",
                "Современные веб-страницы включают в себя код на языке JavaScript. Где происходит исполнение этого кода? Обведите один вариант.",
        };
        String[][] questionsAnswers = new String[][]{
                {"Интерфейс, класс, объект, свойства, методы", "Абстракция, инкапсуляция, наследование, полиморфизм", "Private, protected, public", "Абстракция, Виртуализация, Перегрузка методов, Наследование"},
                {"Порядковый номер записи", "Связь двух таблиц в запросе", "Однозначно идентифицирует каждую запись в таблице", "Контроль доступа к таблице"},
                {"На веб-сервере", "На сервере приложений", "В веб-браузере", "В Java Virtual Machine в операционной системе пользователя"},
        };
        char[] questionKeys = {'2', '3', '3'};

        int correctAnswers = 0;
        final int COUNT_OF_QUESTIONS = questions.length;

        int questionNumber = 0;
        for (String question : questions) {
            System.out.println(question);
            printAnswers(questionsAnswers[questionNumber]);

            String key = inputKey();

            if (Objects.equals(key, Character.toString(questionKeys[questionNumber]))) {
                System.out.println("Ответ: Правильный \n");
                correctAnswers++;
            } else {
                System.out.println("Ответ: Неправильный \n");
            }

            questionNumber++;
        }

        printTestResult(COUNT_OF_QUESTIONS, correctAnswers);
    }

    private static void printAnswers(String[] answers) {
        int counter = 1;
        for (String answer: answers) {
            System.out.println(counter + ") " + answer);
            counter++;
        }
    }

    public static String inputKey() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант ответа: ");
        return in.nextLine();
    }

    public static void printTestResult(int countOfQuestions, int correctAnswers) {
        System.out.println("Всего вопросов: " + countOfQuestions);
        System.out.println("Правильных ответов: " + correctAnswers);
        System.out.println("Неправильных ответов: " + (countOfQuestions - correctAnswers));
    }
}
