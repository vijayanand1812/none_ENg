package its.org.engage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

/**
 * Created by dinakaran on 14/03/2014.
 */
public class End_Downloading extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_downloading);
        overridePendingTransition(R.anim.slide_to_left1, R.anim.slide_to_left2);
        //overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        final ProgressBar p=(ProgressBar) findViewById(R.id.downloading);

        p.setVisibility(0);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent myIntent = new Intent(getApplicationContext(), Eng_menu.class);
                startActivityForResult(myIntent, 0);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        }, 5000);


    }

    }
