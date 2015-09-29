package ctec.pmstupidprojectsecondcoming;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.View;
import android.graphics.Color;

public class PMSecondComing extends AppCompatActivity
{

    private Button colorChangeButton;
    private RelativeLayout background;
    private TextView sillyWords;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmsecond_coming);

        colorChangeButton = (Button) findViewById(R.id.colorButton);
        background = (RelativeLayout) findViewById(R.id.appBackground);
        sillyWords = (TextView) findViewById(R.id.sillyWords);

        setupListeners();
    }



    private void changeVisibility()
    {
        if(sillyWords.getVisibility() == View.GONE)
        {
            sillyWords.setVisibility(View.VISIBLE);
        }
        else
        {
            sillyWords.setVisibility(View.GONE);
        }
    }


    private void changeColors()
    {
        int redColor;
        int blueColor;
        int greenColor;

        redColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        redColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);

        colorChangeButton.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

    }

    private void setupListeners()
    {
        colorChangeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                //This is where you put code that happens when you click a button
                changeColors();
                changeVisibility();
            }
        });
    }
}

