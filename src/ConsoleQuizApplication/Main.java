package ConsoleQuizApplication;

public class Main {
    static void main(String[] args) {
        QuestionService service = new QuestionService();
        // Start playing
        service.playQuiz();
    }
}
