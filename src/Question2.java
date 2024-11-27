// Question class with toString
public class Question2 {
    private String text = "";
    private String answer = "";

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question: " + text;
    }
}

// ChoiceQuestion class with toString
public class ChoiceQuestion extends Question {
    @Override
    public String toString() {
        return super.toString() + " (Multiple choices)";
    }
}

// Test Program
public class ToStringTest {
    public static void main(String[] args) {
        ChoiceQuestion q = new ChoiceQuestion();
        q.setText("What is 2 + 2?");
        q.setAnswer("4");
        System.out.println(q.toString());
    }
}
