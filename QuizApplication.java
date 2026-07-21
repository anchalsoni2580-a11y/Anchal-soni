import java.util.ArrayList;
import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "1. What is the capital of India?",
                "Delhi",
                "Mumbai",
                "Kolkata",
                "Chennai",
                1));

        questions.add(new Question(
                "2. Which language is used for Android Development?",
                "Python",
                "Java",
                "C",
                "HTML",
                2));

        questions.add(new Question(
                "3. Which keyword is used to create an object?",
                "new",
                "class",
                "object",
                "this",
                1));

        questions.add(new Question(
                "4. Which company developed Java?",
                "Google",
                "Microsoft",
                "Sun Microsystems",
                "Apple",
                3));

        questions.add(new Question(
                "5. Which loop runs at least once?",
                "for",
                "while",
                "do-while",
                "foreach",
                3));

        int score = 0;

        System.out.println(" ");
        System.out.println("QUIZ APPLICATION");
        System.out.println(" ");

        for (Question q : questions) {

            q.displayQuestion();

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (q.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

            System.out.println("----------------------------");
        }

        System.out.println("Quiz Completed!");

        System.out.println("Your Score: " + score + "/" + questions.size());

        double percentage = (score * 100.0) / questions.size();

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80)
            System.out.println("Grade : A");

        else if (percentage >= 60)
            System.out.println("Grade : B");

        else if (percentage >= 40)
            System.out.println("Grade : C");

        else
            System.out.println("Grade : Fail");

        sc.close();
    }
}