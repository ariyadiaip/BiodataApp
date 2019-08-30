package id.sch.bdg.smkn4.pwpb.biodataapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import id.sch.bdg.smkn4.pwpb.biodataapp.aip.ContactActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.aip.PrimaryActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.aip.ProjectActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.aip.ResumeActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.aip.SkillActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.audi.ProfileAudiActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.salman.ProfileSalmanActivity;

public class MainActivity extends AppCompatActivity {

    //List Menu
    List<People> peopleList;

    //listView
    ListView lvPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi objek
        peopleList = new ArrayList<>();
        lvPeople = (ListView) findViewById(R.id.lvPeople);

        //tambah isi list
        peopleList.add(new People(R.drawable.photo_aip, "Aip Ariyadi"));
        peopleList.add(new People(R.drawable.audi, "Audi Syahzehan"));
        peopleList.add(new People(R.drawable.salman, "Salman Fauzan F. A."));

        //tambah adapter
        PeopleAdapter adapter = new PeopleAdapter(this, R.layout.custom_lv_main, peopleList);

        //Hubungkan adapter dan listview
        lvPeople.setAdapter(adapter);
        lvPeople.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(MainActivity.this, PrimaryActivity.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(MainActivity.this, ProfileAudiActivity.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(MainActivity.this, ProfileSalmanActivity.class);
                    startActivity(i);
                } else {
                    //null
                }
            }
        });
    }
}
