package sleep.volt.treefrog.progpingnew;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.io.Console;

/**
 * Created by dgros_000 on 9/26/2015.
 * Wrapper for button or whatever we are going to use to display options
 */
public class OpButton{
    Button myBut;
    QuestionOption myOp;
    public OpButton(Button but) {
        myBut = but;
        myBut.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                Log.v("Press", "You touched the but");

                MainActivity.curInstance.respondToQuestion(myOp);
                return false;
            }
        });
    }

    public void setOption(QuestionOption Option){
        myOp = Option;
        myBut.setText(myOp.getCaption());
    }

}
