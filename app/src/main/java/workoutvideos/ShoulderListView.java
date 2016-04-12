package workoutvideos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import club.enhancedliving.enhancedliving.R;

/**
 * Created by v-dafran on 08/03/2016.
 */

public class ShoulderListView extends Activity implements View.OnClickListener {

    private static final String APP_NAME = "ProjectApp";
    private static final boolean DEBUG_FLAG = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if ( DEBUG_FLAG ) Log.v(APP_NAME, "MainMenu :: onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders);

        (findViewById(R.id.shoulder_button1)).setOnClickListener(this);
        (findViewById(R.id.shoulder_button2)).setOnClickListener(this);
        (findViewById(R.id.shoulder_button3)).setOnClickListener(this);
        (findViewById(R.id.shoulder_button4)).setOnClickListener(this);
        (findViewById(R.id.shoulder_button5)).setOnClickListener(this);
        (findViewById(R.id.shoulder_button6)).setOnClickListener(this);
        (findViewById(R.id.shoulder_button7)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shoulder_button1:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yTphpkybKuA"));
                startActivity(i);
                break;

            case R.id.shoulder_button2:
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qEwKCR5JCog"));
                startActivity(a);
                break;

            case R.id.shoulder_button3:
                Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=GJJU_hhczDI"));
                startActivity(b);
                break;

            case R.id.shoulder_button4:
                Intent c = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=T1U3yZne1jw"));
                startActivity(c);
                break;

            case R.id.shoulder_button5:
                Intent d = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HmZcKSDlIYc"));
                startActivity(d);
                break;

            case R.id.shoulder_button6:
                Intent e = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=47rNQtnuQMg"));
                startActivity(e);
                break;

            case R.id.shoulder_button7:
                Intent f = new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.youtube.com/watch?v=pSHjTRCQxIw"));
                startActivity(f);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if ( DEBUG_FLAG ) Log.v(APP_NAME, "MainMenu :: onCreateOptionsMenu()");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}