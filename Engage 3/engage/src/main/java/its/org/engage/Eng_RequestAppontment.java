package its.org.engage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import its.org.engage.custom_controls.SegmentedRadioGroup;

/**
 * Created by dinakaran on 20/03/2014.
 */
public class Eng_RequestAppontment extends Activity implements OnCheckedChangeListener {
    public SegmentedRadioGroup segmentText_choice1;
    public SegmentedRadioGroup segmentText_choice2;
   // private Toast mToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_request_appointment);

        TextView txt = (TextView)findViewById(R.id.txtmarque);
        txt.setSelected(true);

        segmentText_choice1 = (SegmentedRadioGroup) findViewById(R.id.segment_choice1);
        segmentText_choice1.setOnCheckedChangeListener(this);

        segmentText_choice2 = (SegmentedRadioGroup) findViewById(R.id.segment_choice2);
        segmentText_choice2.setOnCheckedChangeListener(this);
      //  mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);

    }
    public void gotomenu(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_menu.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }


    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (group == segmentText_choice1) {
            if (checkedId == R.id.btn_choice1_AM) {
               // mToast.setText("One");
               // mToast.show();
            } else if (checkedId == R.id.btn_choice1_MidDay) {
                //mToast.setText("Two");
                //mToast.show();
            } else if (checkedId == R.id.btn_choice2_Afternoon) {
                //mToast.setText("Three");
               // mToast.show();
            }
        }

        else if(group==segmentText_choice2)
        {
            if (checkedId == R.id.btn_choice2_AM) {
                // mToast.setText("One");
                // mToast.show();
            } else if (checkedId == R.id.btn_choice2_MidDay) {
                //mToast.setText("Two");
                //mToast.show();
            } else if (checkedId == R.id.btn_choice2_Afternoon) {
                //mToast.setText("Three");
                // mToast.show();
            }

        }

    }


}