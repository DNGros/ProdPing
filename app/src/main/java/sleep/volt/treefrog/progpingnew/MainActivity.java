package sleep.volt.treefrog.progpingnew;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    QuestionPicker thePicker;
    Question currentQuestion;
    TextView promptDisplay;
    Button optionBut1;
    Button optionBut2;
    Button optionBut3;
    Button optionBut4;
    Button optionBut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        thePicker  = new QuestionPicker();
        currentQuestion = thePicker.getNewQuestion();

        TextView promptDisplay = (TextView)findViewById(R.id.promptDisplay);
        promptDisplay.setText(currentQuestion.getPrompt().getText());




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
}
