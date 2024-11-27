public class NumericQuestion extends Question {
    private double correctAnswer;

    public void setAnswer(double answer) {
        this.correctAnswer = answer;
    }

    @Override
    public boolean checkAnswer(String response) {
        try {
            double responseValue = Double.parseDouble(response);
            return Math.abs(responseValue - correctAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

// Test Program
public class NumericQuestionTest {
    public static void main(String[] args) {
        NumericQuestion q = new NumericQuestion();
        q.setText("What is 10 / 3?");
        q.setAnswer(3.3333);
        System.out.println(q.checkAnswer("3.33")); // true
        System.out.println(q.checkAnswer("3.32")); // false
    }
}
