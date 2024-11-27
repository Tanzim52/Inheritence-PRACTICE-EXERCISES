import java.util.HashSet;
import java.util.Set;

public class MultiChoiceQuestion extends Question {
    private Set<String> correctChoices = new HashSet<>();

    @Override
    public void setAnswer(String answer) {
        String[] choices = answer.split("\\s+");
        for (String choice : choices) {
            correctChoices.add(choice.toLowerCase());
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        String[] responses = response.split("\\s+");
        Set<String> responseSet = new HashSet<>();
        for (String res : responses) {
            responseSet.add(res.toLowerCase());
        }
        return responseSet.equals(correctChoices);
    }
}

// Test Program
public class MultiChoiceQuestionTest {
    public static void main(String[] args) {
        MultiChoiceQuestion q = new MultiChoiceQuestion();
        q.setText("Select all primary colors. Provide answers separated by spaces.");
        q.setAnswer("Red Blue Yellow");
        System.out.println(q.checkAnswer("Red Blue Yellow")); // true
        System.out.println(q.checkAnswer("Blue Red Yellow")); // true
        System.out.println(q.checkAnswer("Red Blue")); // false
    }
}
