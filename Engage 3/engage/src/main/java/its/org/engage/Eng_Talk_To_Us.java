package its.org.engage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dinakaran on 20/03/2014.
 */
public class Eng_Talk_To_Us extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_talk_to_us);

        TextView txt = (TextView)findViewById(R.id.txtmarque);
        txt.setSelected(true);

    }
    public void gotomenu(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_menu.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }
}