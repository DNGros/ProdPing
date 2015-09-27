package sleep.volt.treefrog.progpingnew;

/**
 * Created by dgros_000 on 9/26/2015.
 * One option for the
 */
public class QuestionOption {
    private String caption;
    private int id;
    public QuestionOption(String myCaption, int ID){
        caption = myCaption;
        id = ID;
    }

    public String getCaption() {
        return caption;
    }
}
