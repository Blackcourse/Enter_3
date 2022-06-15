import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Отгадайте загадку.Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner inputAnswer = new Scanner(System.in);
        String answer = null;
        String advice1;
        Boolean answer1;
        Boolean answer2;
        Boolean answer3;
        String advice = "Подсказка: Заразная упакованная гадость";
        for (int i = 1; i <= 3; i++) {
            answer = inputAnswer.nextLine();
            answer1 = answer.equalsIgnoreCase("Zip virus");
            answer2 = answer.equalsIgnoreCase("Advice");
            if (answer1 == true) {
                System.out.println("Правильно!");
                break;
            }
            if (answer2 == true) {
                System.out.println(advice);
                i=2;
                continue;
            }
            if (i>=2&answer2 == true) {
               advice="Подсказка уже недоступна";
                System.out.println(advice);
            }

            if (answer1==false &i<3) {
                System.out.println("Подумай еще");
            }
            if (i>=3) {
                System.out.println("Обидно, приходи в другой раз и завершить работу");
            }

        }


    }
}





