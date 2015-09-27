package sleep.volt.treefrog.progpingnew;

import javax.xml.datatype.Duration;

/**
 * Created by dgros_000 on 9/26/2015.
 */
public class FollowUp {
    public int when;
    public String questionString;
    public FollowUp(String questionName, int secsFromNow){
        when = secsFromNow;
        questionString = questionName;
    }

}
