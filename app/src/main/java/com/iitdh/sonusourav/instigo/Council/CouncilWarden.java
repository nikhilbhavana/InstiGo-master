package com.iitdh.sonusourav.instigo.Council;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import com.iitdh.sonusourav.instigo.R;
import com.tmall.ultraviewpager.UltraViewPager;
import com.tmall.ultraviewpager.transformer.UltraDepthScaleTransformer;

import java.util.ArrayList;


public class CouncilWarden extends AppCompatActivity
        {

    private androidx.appcompat.app.ActionBar wardenActionBar;
    private PagerAdapter adapter;
    private UltraViewPager.Orientation gravity_indicator;
    private ArrayList<CouncilUserClass> wardenList;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
        wardenList=new ArrayList<>();

        CouncilUserClass Girls=new CouncilUserClass("yagna.","Girls Hostel Chief Warden","7892191177","warden_yagna@iitdh.ac.in",R.drawable.yagna);
        CouncilUserClass Bhairavi= new CouncilUserClass("Bharathi.", "Girls Hostel A block Warden", "9611878320", "warden_bharathi@iitdh.ac.in", R.drawable.bharathi);
        CouncilUserClass Abheri=new CouncilUserClass("Sridevi.","Girls Hostel B Block Warden","7338502393","warden_sridevi@iitdh.ac.in",R.drawable.sri);
        CouncilUserClass Behag=new CouncilUserClass("Thippesh.","Boys Hostel Chief Warden","9901617923","warden_Thippesh@iitdh.ac.in",R.drawable.thippu);
        CouncilUserClass Chhayanat=new CouncilUserClass("Thippesh.","Boys Hostel A Block Warden","9901617923","warden_thippesh@iitdh.ac.in",R.drawable.thippu);
        CouncilUserClass Hamsadhwani=new CouncilUserClass("Aradhya.","Boys Hostel B Block  Warden","7411076972","warden_hamsadhwani@iitdh.ac.in",R.drawable.aradhya);


        wardenList.add(Girls);
        wardenList.add(Bhairavi);
        wardenList.add(Abheri);
        wardenList.add(Behag);
        wardenList.add(Chhayanat);
        wardenList.add(Hamsadhwani);



        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        adapter = new UltraPagerAdapter(true,this,wardenList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1.0f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
        gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        wardenActionBar = getSupportActionBar();
        assert wardenActionBar != null;
        wardenActionBar.setHomeButtonEnabled(true);
        wardenActionBar.setDisplayHomeAsUpEnabled(true);
        wardenActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        wardenActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return true;

    }


}
