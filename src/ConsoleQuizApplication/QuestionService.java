package ConsoleQuizApplication;

import java.util.Scanner;

public class QuestionService {
    // Hard coding to 5 questions
    Question[] questions = new Question[5];
    // Storing the user selected options
    String[] userOptions = new String[questions.length];
    // Constructor to initialize the questions
    public QuestionService() {
        questions[0] = new Question(
                1,
                "Which method in Java is used to compare two strings for equality?",
                "== operator",
                "compareTo()",
                "equalsIgnoreCase()",
                "equals()",
                "equals()"
        );

        questions[1] = new Question(
                2,
                "What will be the output of System.out.println(\"Hello\" + 5 + 3)?",
                "Hello53",
                "Hello8",
                "Compilation Error",
                "Hello 8",
                "Hello53"
        );

        questions[2] = new Question(
                3,
                "Which method returns the length of a Java string?",
                "size()",
                "length()",
                "getLength()",
                "count()",
                "length()"
        );

        questions[3] = new Question(
                4,
                "What does charAt(0) return for the string \"Java\"?",
                "J",
                "Compilation Error",
                "a",
                "v",
                "J"
        );

        questions[4] = new Question(
                5,
                "Which method is used to convert a string to uppercase in Java?",
                "toUpperCase()",
                "makeUpper()",
                "upperCase()",
                "toUpper()",
                "toUpperCase()"
        );
    }
//    Start Game -_-
    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        int i = 0, score = 0;
        for(Question q: questions) {
            System.out.println("Question-" + q.getId() + ": " + q.getQuestion());
            System.out.println("option1: " + q.getOpt1());
            System.out.println("option2: " + q.getOpt2());
            System.out.println("option3: " + q.getOpt3());
            System.out.println("option4: " + q.getOpt4());
            System.out.print("Enter your option: ");
            userOptions[i++] = sc.nextLine();
        }
        System.out.println();
        // counting score and printing user selected options.
        System.out.println("The user selected options:");
        for (int j = 0; j < questions.length; j++) {
//            calculating the score.
            if(userOptions[j].equals(questions[j].getAnswer())) score++;
            System.out.println(userOptions[j]);
        }
        System.out.println("The user score is: " + score + " out of " + questions.length);
    }
}
