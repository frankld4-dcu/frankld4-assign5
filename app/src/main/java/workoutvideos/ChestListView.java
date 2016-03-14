package workoutvideos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.example.v_dafran.projectapp.R;

/**
 * Created by v-dafran on 08/03/2016.
 */

public class ChestListView extends AppCompatActivity implements View.OnClickListener {

    private static final String APP_NAME = "ProjectApp";
    private static final boolean DEBUG_FLAG = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if ( DEBUG_FLAG ) Log.v(APP_NAME, "MainMenu :: onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        (findViewById(R.id.chest_button1)).setOnClickListener(this);
        (findViewById(R.id.chest_button2)).setOnClickListener(this);
        (findViewById(R.id.chest_button3)).setOnClickListener(this);
        (findViewById(R.id.chest_button4)).setOnClickListener(this);
        (findViewById(R.id.chest_button5)).setOnClickListener(this);
        (findViewById(R.id.chest_button6)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.chest_button1:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=rT7DgCr-3pg"));
                startActivity(i);
                break;

            case R.id.chest_button2:
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=VmB1G1K7v94"));
                startActivity(a);
                break;

            case R.id.chest_button3:
                Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1X5jcVyvkgk"));
                startActivity(b);
                break;

            case R.id.chest_button4:
                Intent c = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zF0jbubK_jU"));
                startActivity(c);
                break;

            case R.id.chest_button5:
                Intent d = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KEdWEMJhgN0"));
                startActivity(d);
                break;

            case R.id.chest_button6:
                Intent e = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HmZcKSDlIYc"));
                startActivity(e);
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



