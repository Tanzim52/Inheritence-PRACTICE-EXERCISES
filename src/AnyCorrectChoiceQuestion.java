import java.util.HashSet;
import java.util.Set;

public class AnyCorrectChoiceQuestion extends Question {
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
        return correctChoices.contains(response.trim().toLowerCase());
    }
}

// Test Program
public class AnyCorrectChoiceQuestionTest {
    public static void main(String[] args) {
        AnyCorrectChoiceQuestion q = new AnyCorrectChoiceQuestion();
        q.setText("Name a programming language invented by James Gosling.");
        q.setAnswer("Java Oak");
        System.out.println(q.checkAnswer("java")); // true
        System.out.println(q.checkAnswer("oak")); // true
        System.out.println(q.checkAnswer("C++")); // false
    }
}
