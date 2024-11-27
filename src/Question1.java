// Question class
public class Question1 {
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String additionalText) {
        this.text += additionalText;
    }

    public String getText() {
        return text;
    }
}

// ChoiceQuestion class
public class ChoiceQuestion extends Question {
    private int choiceCount = 0;

    public void addChoice(String choice, boolean correct) {
        choiceCount++;
        addText("\n" + choiceCount + ": " + choice);
        if (correct) {
            setAnswer(Integer.toString(choiceCount));
        }
    }
}

// Test Program
public class ChoiceQuestionTest {
    public static void main(String[] args) {
        ChoiceQuestion q = new ChoiceQuestion();
        q.setText("What is the capital of France?");
        q.addChoice("Berlin", false);
        q.addChoice("Paris", true);
        q.addChoice("Madrid", false);
        System.out.println(q.getText());
    }
}
