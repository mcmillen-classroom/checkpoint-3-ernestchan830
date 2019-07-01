package ernestchan.checkpoint_3;

public class Question

{
    private String mText;
    private String[] mFillAnswers;
    // 0 = read in boolean, 1 = read in string, 2 = read in number
    private int mAnswerType;

    public Question(String text)
    {
        mText = text;
    }


    public Question(String text, String... ans)
    {
        mText = text;
        mFillAnswers = ans;
        mAnswerType = 1;
    }

    // stub method - intentionally does nothing
    public boolean checkAnswer(boolean boolResponse)
    {
        return false;
    }

    // fill the blank question check
    public boolean checkAnswer(String userAnswer)
    {
        for (String ans : getFillAnswers())
        {
            if (ans.equalsIgnoreCase(userAnswer))
            {
                return true;
            }
        }

        return false;
    }

    public int getAnswerType()
    {
        return mAnswerType;
    }

    public String[] getFillAnswers()
    {
        return mFillAnswers;
    }

    public String getText()
    {
        return mText;
    }

    public void setText(String text)
    {
        mText = text;
    }


}