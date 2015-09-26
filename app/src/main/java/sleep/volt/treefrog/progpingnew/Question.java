package sleep.volt.treefrog.progpingnew;

import java.util.ArrayList;

/**
 * Created by dgros_000 on 9/26/2015.
 * Represents a question to the user
 */
public class Question {
    ArrayList<QuestionOption> myOptions;
    QuestionPrompt prompt;

    /**
     *
     * @param newPrompt
     * @param newQuestionOption
     */
    public Question(QuestionPrompt newPrompt, ArrayList<QuestionOption> newQuestionOption){
        myOptions = newQuestionOption;
        prompt = newPrompt;
    }

    /**
     *
     * @param newOption new option to add
     * @return if add was successful
     */
    public boolean addOption(QuestionOption newOption){
        myOptions.add(newOption);
        return true;
    }
}
