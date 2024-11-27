public class Question {
    private String text;
    private String answer;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return answer.trim().equalsIgnoreCase(response.trim());
    }
}

// Test Program
public class QuestionTest {
    public static void main(String[] args) {
        Question q = new Question();
        q.setText("Who is the inventor of Java?");
        q.setAnswer("James Gosling");
        System.out.println(q.checkAnswer("JAMES gosling")); // true
        System.out.println(q.checkAnswer("   james gosling   ")); // true
    }
}
