package its.org.engage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dinakaran on 19/03/2014.
 */
public class Eng_NewsandEvents_Upcoming_Events extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_news_and_events_upcomingevents);

        TextView txt = (TextView)findViewById(R.id.txtmarque);
        txt.setSelected(true);

    }

    //-----header btn actions--------------
    public void gotomenu(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_menu.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }



}
