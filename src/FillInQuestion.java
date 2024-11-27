public class FillInQuestion extends Question {
    private String answer;

    @Override
    public void setText(String questionText) {
        int startIndex = questionText.indexOf('_');
        int endIndex = questionText.lastIndexOf('_');

        if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
            answer = questionText.substring(startIndex + 1, endIndex);
            super.setText(questionText.replace('_' + answer + '_', "_____"));
        } else {
            super.setText(questionText);
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        return answer.equalsIgnoreCase(response.trim());
    }
}

// Test Program
public class FillInQuestionTest {
    public static void main(String[] args) {
        FillInQuestion q = new FillInQuestion();
        q.setText("The inventor of Java was _James Gosling_");
        System.out.println(q.getText()); // The inventor of Java was _____
        System.out.println(q.checkAnswer("James Gosling")); // true
        System.out.println(q.checkAnswer("james gosling")); // true
    }
}
