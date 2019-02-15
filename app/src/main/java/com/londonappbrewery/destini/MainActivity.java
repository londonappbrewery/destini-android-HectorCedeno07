package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    int mStoryIndex = 1;
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        mStoryTextView.setText(R.string.T1_Story);
        mButtonTop.setText(R.string.T1_Ans1);
        mButtonBottom.setText(R.string.T1_Ans2);

    }

    // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

    public void  mTopButton(View v) {
       if (mStoryIndex == 1) {
           mStoryIndex = 3;
           mStoryTextView.setText(R.string.T3_Story);
           mButtonTop.setText(R.string.T3_Ans1);
           mButtonBottom.setText(R.string.T3_Ans2);
       } else if (mStoryIndex == 3) {
            mStoryIndex = 6;
            mStoryTextView.setText(R.string.T6_End);
       } else if (mStoryIndex == 2) {
           mStoryIndex = 3;
           mStoryTextView.setText(R.string.T3_Story);
           mButtonTop.setText(R.string.T3_Ans1);
           mButtonBottom.setText(R.string.T3_Ans2);
       }

        Toast myToast = Toast.makeText(this,"Storie # " + mStoryIndex, Toast.LENGTH_LONG);
        myToast.show();
    }
    // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
    public void  mButtonBottom(View v) {
        if (mStoryIndex == 1) {
            mStoryIndex = 2;
            mStoryTextView.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
        } else if (mStoryIndex == 3) {
            mStoryIndex = 5;
            mStoryTextView.setText(R.string.T5_End);
        } else if (mStoryIndex == 2) {
            mStoryIndex = 4;
            mStoryTextView.setText(R.string.T4_End);
        }

        Toast myToast = Toast.makeText(this,"Storie # " + mStoryIndex, Toast.LENGTH_LONG);
        myToast.show();
    }

}
