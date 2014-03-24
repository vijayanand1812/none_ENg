package its.org.engage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class Eng_NewsandEvents extends Activity {

    GridView gridView;
    String pageData[];	//Stores the text to swipe.
    LayoutInflater inflater;		//Used to create individual pages
    ViewPager vp;
    private ListView listview;
    private TextView title;
    private ArrayList<String> data;
    ArrayAdapter<String> sd;
    public int TOTAL_LIST_ITEMS = 18;
    public int NUM_ITEMS_PAGE   = 6;
    private int noOfBtns;
    private Button[] btns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_news_and_events);

        TextView txt = (TextView)findViewById(R.id.txtmarque);
        txt.setSelected(true);


        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Reference ViewPager defined in activity
        vp=(ViewPager)findViewById(R.id.viewPager);
        //set the adapter that will create the individual pages

        int imageArra[] = { R.drawable.stickynote, R.drawable.stickynote, R.drawable.stickynote,
                R.drawable.stickynote, R.drawable.stickynote,R.drawable.stickynote,R.drawable.stickynote,R.drawable.stickynote,R.drawable.stickynote,R.drawable.stickynote};
        vp.setAdapter(new MyPagesAdapter(this, imageArra));


    }

//Implement PagerAdapter Class to handle individual page creation
class MyPagesAdapter extends PagerAdapter {

    Activity activity;
    int imageArray[];
    public MyPagesAdapter(Activity act, int[] imgArra) {
        imageArray = imgArra;
        activity = act;
    }



    @Override
    public int getCount() {
        //Return total pages, here one for each data item



        return imageArray.length;
    }
    //Create the given page (indicated by position)
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View page = inflater.inflate(R.layout.eng_news_events_pager, null);
        //((TextView)page.findViewById(R.id.textMessage)).setText(pageData[position]);
        //Add the page to the front of the queue

        ImageView img1=(ImageView) page.findViewById(R.id.imageView1);
        //img1.setImageResource(imageArray[position]);

        ImageView img2=(ImageView) page.findViewById(R.id.imageView2);
        //img2.setImageResource(imageArray[position]);

        ImageView img3=(ImageView) page.findViewById(R.id.imageView3);
        //img3.setImageResource(imageArray[position]);

        ImageView img4=(ImageView) page.findViewById(R.id.imageView4);
       // img4.setImageResource(imageArray[position]);

        ImageView img5=(ImageView) page.findViewById(R.id.imageView5);
        //img5.setImageResource(imageArray[position]);

        ImageView img6=(ImageView) page.findViewById(R.id.imageView6);
        //img6.setImageResource(imageArray[position]);



        // ((GridView)page.findViewById(R.id.)).setText(pageData[position]);



        ((ViewPager) container).addView(page, 0);

        return page;
    }
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        //See if object from instantiateItem is related to the given view
        //required by API
        return arg0==(View)arg1;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
        object=null;
    }
}

    public void gotomenu(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_menu.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);



    }

    public void upcoming_events(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_NewsandEvents_Upcoming_Events.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);



    }
    public void readmore(View e){
        //process event
        startActivity(new Intent(getApplicationContext(), Eng_NewsEvents_ReadMore.class));
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }
}