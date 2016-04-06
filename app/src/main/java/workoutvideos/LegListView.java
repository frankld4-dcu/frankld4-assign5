package workoutvideos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.example.v_dafran.projectapp.R;

/**
 * Created by v-dafran on 08/03/2016.
 */

public class LegListView extends Activity implements View.OnClickListener {

    private static final String APP_NAME = "ProjectApp";
    private static final boolean DEBUG_FLAG = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if ( DEBUG_FLAG ) Log.v(APP_NAME, "MainMenu :: onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        (findViewById(R.id.leg_button1)).setOnClickListener(this);
        (findViewById(R.id.leg_button2)).setOnClickListener(this);
        (findViewById(R.id.leg_button3)).setOnClickListener(this);
        (findViewById(R.id.leg_button4)).setOnClickListener(this);
        (findViewById(R.id.leg_button5)).setOnClickListener(this);
        (findViewById(R.id.leg_button6)).setOnClickListener(this);
        (findViewById(R.id.leg_button7)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.leg_button1:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SW_C1A-rejs"));
                startActivity(i);
                break;

            case R.id.leg_button2:
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZK-O_aS3GdY"));
                startActivity(a);
                break;

            case R.id.leg_button3:
                Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=VGq8YzBsrjw"));
                startActivity(b);
                break;

            case R.id.leg_button4:
                Intent c = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=p3g4wAsu0R4"));
                startActivity(c);
                break;

            case R.id.leg_button5:
                Intent d = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=AsGsCPehlmc"));
                startActivity(d);
                break;

            case R.id.leg_button6:
                Intent e = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sBCbU02uZy0"));
                startActivity(e);
                break;

            case R.id.leg_button7:
                Intent f = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=B3pfaQ2sDPA"));
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