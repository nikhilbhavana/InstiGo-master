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


public class CouncilGenSecy extends AppCompatActivity
        {

    private androidx.appcompat.app.ActionBar genSecyActionBar;
    private PagerAdapter adapter;
    private UltraViewPager.Orientation gravity_indicator;
    private ArrayList<CouncilUserClass> genSecyList;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
        genSecyList =new ArrayList<>();
        CouncilUserClass genAcSecy=new CouncilUserClass("Anusha A Vernekar","Academic General Secretary",""," anusha@iitdh.ac.in",R.drawable.anu);
        CouncilUserClass genCulSecy=new CouncilUserClass("Bhavana Y Desai","Cultural General Secretary",""," bhavana@iitdh.ac.in",R.drawable.bhavana);
        CouncilUserClass genTechSecy=new CouncilUserClass("Swati S Hegde","Technical General Secretary",""," swati@iitdh.ac.in",R.drawable.swati);
        CouncilUserClass genSportSecy=new CouncilUserClass("Devaraj","Sports General Secretary",""," Dev@iitdh.ac.in",R.drawable.mihir);
        genSecyList.add(genAcSecy);
        genSecyList.add(genCulSecy);
        genSecyList.add(genSportSecy);
        genSecyList.add(genTechSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        adapter = new UltraPagerAdapter(true,this, genSecyList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
        gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        genSecyActionBar = getSupportActionBar();
        assert genSecyActionBar != null;
        genSecyActionBar.setHomeButtonEnabled(true);
        genSecyActionBar.setDisplayHomeAsUpEnabled(true);
        genSecyActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        genSecyActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
