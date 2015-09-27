package sleep.volt.treefrog.progpingnew;

/**
 * Created by dgros_000 on 9/26/2015.
 * One option for the
 */
public class QuestionOption {
    private String caption;
    private String name;
    String followQuestionUpName;

    /**
     *
     * @param name unique name
     * @param myCaption what is displayed to user
     */
    public QuestionOption(String name, String myCaption){
        caption = myCaption;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getCaption() {
        return caption;
    }
}
