package sleep.volt.treefrog.progpingnew;

/**
 * Created by dgros_000 on 9/26/2015.
 * Represents what we are asking
 */
public class QuestionPrompt {
    private String name;
    private String text;
    private int id;
    public QuestionPrompt(String questionName, String questionText, int id){
        name = questionName;
        text = questionText;
        this.id = id;
    }

    public String getText() {
        return text;
    }
}
