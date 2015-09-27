package sleep.volt.treefrog.progpingnew;

import java.util.ArrayList;

/**
 * Created by dgros_000 on 9/26/2015.
 * Represents a question to the user
 */
public class Question {
    private ArrayList<QuestionOption> myOptions;
    private QuestionPrompt prompt;
    private String name;
    /**
     * @param newPrompt
     * @param newQuestionOption
     */
    public Question(QuestionPrompt newPrompt, ArrayList<QuestionOption> newQuestionOption){
        myOptions = newQuestionOption;
        prompt = newPrompt;
    }

    /**
     * @param newOption new option to add
     * @return if add was successful
     */
    public boolean addOption(QuestionOption newOption){
        myOptions.add(newOption);
        return true;
    }

    public QuestionPrompt getPrompt(){
        return prompt;
    }
    public String getName(){return name;}
    public ArrayList<QuestionOption> getOptions(){
        return myOptions;
    }

}
