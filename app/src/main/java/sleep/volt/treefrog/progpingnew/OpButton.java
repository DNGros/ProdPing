package sleep.volt.treefrog.progpingnew;

import android.content.Context;
import android.widget.Button;

/**
 * Created by dgros_000 on 9/26/2015.
 * Wrapper for button or whatever we are going to use to display options
 */
public class OpButton{
    Button myBut;
    public OpButton(Button but) {
        myBut = but;
    }

    public void setCaption(String newCaption){
        myBut.setText(newCaption);
    }
}
