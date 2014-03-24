package its.org.engage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Eng_login extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_login);

    }
    public void dologin(View e)
    {

        startActivity(new Intent(getApplicationContext(), End_Downloading.class));
        overridePendingTransition(R.anim.slide_to_left1, R.anim.slide_to_left2);
    }



}

