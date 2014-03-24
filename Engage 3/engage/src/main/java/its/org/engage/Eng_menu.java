package its.org.engage;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Eng_menu extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_menu);

        TextView txt = (TextView)findViewById(R.id.txtmarque);
        txt.setSelected(true);

    }

    public void gotomenu(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_menu.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }


    public void News_Events_Button(View e){
        //process event
        Intent i = new Intent(Eng_menu.this, Eng_NewsandEvents.class);
        startActivity(i);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }
    public void Myfoms_Button(View e){
        //process event

//        Intent i = new Intent(Eng_menu.this, Eng_login.class);
//        startActivity(i);
    }
    public void Request_Apponment_button(View e){

        Intent i = new Intent(getApplicationContext(), Eng_RequestAppontment.class);
        startActivity(i);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
    public void Talk_ToUs_Button(View e){
        Intent i = new Intent(getApplicationContext(), Eng_Talk_To_Us.class);
        startActivity(i);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
    public void Tella_Friend_Button(View e){
        Intent i = new Intent(getApplicationContext(), Eng_Tell_a_Friend.class);
        startActivity(i);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
    public void Patient_Survey_Button(View e){
        //process event

//        Intent i = new Intent(Eng_menu.this, Eng_login.class);
//        startActivity(i);
    }
    public void Our_Videos_button(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_Ourvideos.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
    public void Trivia_Game_Button(View e){
        //process event

//        Intent i = new Intent(Eng_menu.this, Eng_login.class);
//        startActivity(i);
    }



}
