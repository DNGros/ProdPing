package sleep.volt.treefrog.progpingnew;

import java.util.ArrayList;

/**
 * Created by dgros_000 on 9/26/2015.
 * Represents a question to the user
 */
public class Question {
    private ArrayList<QuestionOption> myOptions;
    private String prompt;
    private String name; // Unique name of question
    /**
     * @param newPrompt
     * @param newQuestionOption
     */
    public Question(String name, String newPrompt, ArrayList<QuestionOption> newQuestionOption){
        myOptions = newQuestionOption;
        prompt = newPrompt;
        this.name = name;
    }

    /**
     * @param newOption new option to add
     * @return if add was successful
     */
    public boolean addOption(QuestionOption newOption){
        myOptions.add(newOption);
        return true;
    }

    public String getPromptName(){
        return prompt;
    }
    public String getName(){return name;}
    public ArrayList<QuestionOption> getOptions(){
        return myOptions;
    }

}
