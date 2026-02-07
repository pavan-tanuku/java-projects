package ConsoleQuizApplication;

public class QuestionService {

    // Hard coding to 5 questions
    Question[] questions = new Question[5];
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

    public void playQuiz() {
//        System.out.println(questions[0]);
        for(Question q: questions) {
            System.out.println(q.toString());
        }
    }


}
