package sleep.volt.treefrog.progpingnew;

import java.util.ArrayList;

/**
 * Created by dgros_000 on 9/26/2015.
 * Picker
 */
public class QuestionPicker {
    public Question getNewQuestion(){
        QuestionPrompt newPrompt = new QuestionPrompt("Status", "What are you doing right now?", 1);


        ArrayList<QuestionOption> newOptions = new ArrayList<>();
        newOptions.add(new QuestionOption("working", "Working"));
        newOptions.add(new QuestionOption("social_media", "Social Media"));
        newOptions.add(new QuestionOption("playing", "Playing"));
        newOptions.add(new QuestionOption("eating", "Eating"));
        newOptions.add(new QuestionOption("other", "Other"));

        Question returnQ = new Question(newPrompt, newOptions);

        return returnQ;
    }
}
