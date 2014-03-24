package its.org.engage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dinakaran on 19/03/2014.
 */
public class Eng_NewsEvents_ReadMore extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_news_events_readmore);

        TextView txt = (TextView)findViewById(R.id.txtmarque);
        txt.setSelected(true);

    }

    //-----header btn actions--------------
    public void gotomenu(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_menu.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }
    public void close_readmore(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_NewsandEvents.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }

}