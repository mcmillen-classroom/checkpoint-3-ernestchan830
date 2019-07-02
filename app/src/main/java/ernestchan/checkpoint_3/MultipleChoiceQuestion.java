package ernestchan.checkpoint_3;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {

    private String[] mOptions;
    private int mAnswer;

    public MultipleChoiceQuestion(String text, String[] options, int ans) {
        super(text);
        mAnswer = ans;
        mOptions = options;
    }
    public String[] getmOptions() {
        return mOptions;
    }


    @Override
    public boolean checkAnswer(int ans) {
        return(mAnswer == ans);
    }



}
