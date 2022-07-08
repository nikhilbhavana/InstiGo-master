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


public class CouncilSportsSecy extends AppCompatActivity
        {

            @Override

            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> sportsList = new ArrayList<>();
        CouncilUserClass footballSecy=new CouncilUserClass("Srushti ","Institute Football Secretary",""," srushti@iitdh.ac.in",R.drawable.srushti);
        CouncilUserClass cricketSecy=new CouncilUserClass("Neha Gowda","Institute Cricket Secretary",""," neha@iitdh.ac.in",R.drawable.anu);
        CouncilUserClass volleyballSecy=new CouncilUserClass("Sharadhi","Institute Volleyball Secretary",""," sharadhi@iitdh.ac.in",R.drawable.sharadhi);
        CouncilUserClass hockeySecy=new CouncilUserClass("bhoomika D L","Institute Hockey Secretary",""," bhoomika@iitdh.ac.in",R.drawable.bhoomi);
        CouncilUserClass badmintonSecy=new CouncilUserClass("Amulya Bennur","Institute Badminton Secretary","","amulya@iitdh.ac.in",R.drawable.amu);
        CouncilUserClass athleticsSecy=new CouncilUserClass("Vaishali Pawar","Institute Athletics Secretary",""," vaishu@iitdh.ac.in",R.drawable.vaishu);
        CouncilUserClass basketballSecy=new CouncilUserClass("sheethal ","Institute Basketball Secretary","","ashwitha@iitdh.ac.in",R.drawable.sheethal);
        CouncilUserClass ttSecy=new CouncilUserClass("Dhamini","Institute Table Tennis Secretary","","dhamini@iitdh.ac.in",R.drawable.dami);
        CouncilUserClass boardGamesSecy=new CouncilUserClass("Chandana K J","Institute Board Games Secretary",""," chandu@iitdh.ac.in ",R.drawable.chandu);

        sportsList.add(footballSecy);
        sportsList.add(cricketSecy);
        sportsList.add(volleyballSecy);
        sportsList.add(hockeySecy);
        sportsList.add(badmintonSecy);
        sportsList.add(athleticsSecy);
        sportsList.add(basketballSecy);
        sportsList.add(ttSecy);
        sportsList.add(boardGamesSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, sportsList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
                UltraViewPager.Orientation gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        androidx.appcompat.app.ActionBar sportsActionBar = getSupportActionBar();
        assert sportsActionBar != null;
        sportsActionBar.setHomeButtonEnabled(true);
        sportsActionBar.setDisplayHomeAsUpEnabled(true);
        sportsActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        sportsActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
