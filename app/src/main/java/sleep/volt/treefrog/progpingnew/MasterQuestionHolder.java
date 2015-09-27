package sleep.volt.treefrog.progpingnew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by dgros_000 on 9/26/2015.
 */
public class MasterQuestionHolder {
    final static HashMap<String, Object> quesNameToQuest;
    static {
        ArrayList<QuestionOption> conOptions;
        Question constructingQuestion;

        quesNameToQuest = new HashMap<String, Object>();
        // status_standard
        String key = "status_standard";
        conOptions = new ArrayList<>();
        conOptions.add(new QuestionOption("working", "Working"));
        conOptions.add(new QuestionOption("media", "Media"));
        conOptions.add(new QuestionOption("playing", "Playing"));
        conOptions.add(new QuestionOption("eating", "Eating"));
        conOptions.add(new QuestionOption("other", "Other"));
        constructingQuestion = new Question(key, "What are you doing right now?", conOptions);
        quesNameToQuest.put(key, constructingQuestion);

        // status_playing
        key = "status_studying";
        conOptions = new ArrayList<>();
        conOptions.add(new QuestionOption("writring", "Working"));
        conOptions.add(new QuestionOption("reading", "Reading"));
        conOptions.add(new QuestionOption("playing", "Playing"));
        conOptions.add(new QuestionOption("eating", "Eating"));
        conOptions.add(new QuestionOption("other", "Other"));
        constructingQuestion = new Question(key, "What are you doing right now?", conOptions);
        quesNameToQuest.put(key, constructingQuestion);

        // after_test
        key = "after_test";
        conOptions = new ArrayList<>();
        conOptions.add(new QuestionOption("test_terrible", "terrible"));
        conOptions.add(new QuestionOption("test_fair", "fair"));
        conOptions.add(new QuestionOption("test_good", "good"));
        conOptions.add(new QuestionOption("test_great", "Great"));
        conOptions.add(new QuestionOption("no_test", "No Test"));
        constructingQuestion = new Question(key, "How was your test?", conOptions);
        quesNameToQuest.put(key, constructingQuestion);

        // start_of_day
        key = "start_day";
        conOptions = new ArrayList<>();
        conOptions.add(new QuestionOption("test_good", "Studying"));
        conOptions.add(new QuestionOption("future_test", "Test"));
        conOptions.add(new QuestionOption("future_social", "Social Event"));
        conOptions.add(new QuestionOption("future_competition", "Competing in an Event"));
        conOptions.add(new QuestionOption("no_future", "Something Else"));
        constructingQuestion = new Question(key, "What is the most important thing today", conOptions);
        quesNameToQuest.put(key, constructingQuestion);
    }

}
