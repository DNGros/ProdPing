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
        newOptions.add(new QuestionOption("Working", 1));
        newOptions.add(new QuestionOption("Media", 2));
        newOptions.add(new QuestionOption("Playing", 3));
        newOptions.add(new QuestionOption("Eating", 4));
        newOptions.add(new QuestionOption("Other", 5));

        Question returnQ = new Question(newPrompt, newOptions);

        return returnQ;
    }
}
