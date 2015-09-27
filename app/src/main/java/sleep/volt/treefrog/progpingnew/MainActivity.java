package sleep.volt.treefrog.progpingnew;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    QuestionPicker thePicker;
    Question currentQuestion;
    ArrayList<QuestionOption> curOptions;
    TextView promptDisplay;
    ArrayList<OpButton> buttonsL;
    OpButton optionBut5;
    static MainActivity curInstance;
    boolean hasResponded = false;
    KeenPoster myPoster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        thePicker  = new QuestionPicker();
        currentQuestion = thePicker.getNewQuestion();
        curInstance = this;
        // Get objects out of xml
        promptDisplay = (TextView)findViewById(R.id.promptDisplay);

        buttonsL = new ArrayList<>();
        buttonsL.add(new OpButton((Button)findViewById(R.id.option1)));
        buttonsL.add(new OpButton((Button)findViewById(R.id.option2)));
        buttonsL.add(new OpButton((Button)findViewById(R.id.option3)));
        buttonsL.add(new OpButton((Button)findViewById(R.id.option4)));
        buttonsL.add(new OpButton((Button)findViewById(R.id.option5)));

        // Populate prompt text
        promptDisplay.setText(currentQuestion.getPromptName());

        // Loop through and populate buttons
       curOptions = currentQuestion.getOptions();
        for(int i = 0; i < buttonsL.size() && i < curOptions.size(); i++){
            buttonsL.get(i).setOption(curOptions.get(i));
        }

        // People
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_question, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean respondToQuestion(QuestionOption answer){
        if(true) {
            Log.v("got", answer.getName() + " responded " + this.currentQuestion.getName());
            myPoster = new KeenPoster("useruser", this);
            myPoster.postQuestion(currentQuestion, answer);
            hasResponded = true;
            return true;
        }
        return false;
    }
    
}
