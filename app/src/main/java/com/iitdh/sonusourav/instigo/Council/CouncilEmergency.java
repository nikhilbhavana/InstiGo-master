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


public class CouncilEmergency extends AppCompatActivity
        {

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> emergencyList = new ArrayList<>();
        CouncilUserClass plumber=new CouncilUserClass("Shivaji","Plumbing Maintenance","9620480607","",R.drawable.plumber);
        CouncilUserClass electrician=new CouncilUserClass("Gowtham","Electrical Maintenance","9591200610","",R.drawable.electr);
        CouncilUserClass housekeeping1=new CouncilUserClass("Ravi","HouseKeeping","9483925586","",R.drawable.house1);
        CouncilUserClass housekeeping2=new CouncilUserClass("Gayathri","HouseKeeping","7353606449","",R.drawable.house2);
        CouncilUserClass securitySupervisor1=new CouncilUserClass("Arjun U","Security Supervisor","8494859041","",R.drawable.arjun);
        CouncilUserClass securitySup=new CouncilUserClass("Arvind Malik","Security Superintendent","8762188288","",R.drawable.arvind);
        CouncilUserClass medicalEmergency=new CouncilUserClass("Taranatha","Medical emergency and Transportation","8102405107","",R.drawable.taranatha);
        CouncilUserClass lib=new CouncilUserClass("Chandrashekar K L","Librarian","8762723729","",R.drawable.chandru);
        CouncilUserClass consDept1=new CouncilUserClass("Hiremath M N","Construction department","9481335660","",R.drawable.hod);
        CouncilUserClass consDept2=new CouncilUserClass("Nandan N Shenoy","Construction department","7019132504","",R.drawable.sunil);
        CouncilUserClass mainGate=new CouncilUserClass("Ravi Kumar Main Gate","Security","7349798062","",R.drawable.watch1);
        CouncilUserClass backGate=new CouncilUserClass("Manjunatha First Gate","Security ","7349798063","",R.drawable.watch2);
        CouncilUserClass sportsInst1=new CouncilUserClass("Sendhil","Sports Instructor","9482373555","",R.drawable.sendhil);

        emergencyList.add(plumber);
        emergencyList.add(electrician);
        emergencyList.add(housekeeping1);
        emergencyList.add(housekeeping2);
        emergencyList.add(securitySupervisor1);
        emergencyList.add(securitySup);
        emergencyList.add(medicalEmergency);
        emergencyList.add(lib);
        emergencyList.add(consDept1);
        emergencyList.add(consDept2);
        emergencyList.add(mainGate);
        emergencyList.add(backGate);
        emergencyList.add(sportsInst1);


        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, emergencyList);
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

        androidx.appcompat.app.ActionBar emergencyActionBar = getSupportActionBar();
        assert emergencyActionBar != null;
        emergencyActionBar.setHomeButtonEnabled(true);
        emergencyActionBar.setDisplayHomeAsUpEnabled(true);
        emergencyActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        emergencyActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
