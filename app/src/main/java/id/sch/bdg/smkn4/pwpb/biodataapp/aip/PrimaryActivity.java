package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.sch.bdg.smkn4.pwpb.biodataapp.MainActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.R;

public class PrimaryActivity extends AppCompatActivity {

    //List Menu
    List<Menu> menuList;

    //listView
    ListView lvMenu;

    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);

        //inisialisasi objek
        menuList = new ArrayList<>();
        lvMenu = (ListView) findViewById(R.id.lvMenu);
        btnBack = (ImageButton) findViewById(R.id.btnBack);

        //tambah isi list
        menuList.add(new Menu(R.drawable.ic_summary, "Summary Profile"));
        menuList.add(new Menu(R.drawable.ic_skill, "Programming Skill"));
        menuList.add(new Menu(R.drawable.ic_project, "Project"));
        menuList.add(new Menu(R.drawable.ic_contact, "Contact Information"));

        //tambah adapter
        MenuAdapter adapter = new MenuAdapter(this, R.layout.custum_lvmenu_aip, menuList);



        //Hubungkan adapter dan listview
        lvMenu.setAdapter(adapter);
        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(PrimaryActivity.this, ResumeActivity.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(PrimaryActivity.this, SkillActivity.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(PrimaryActivity.this, ProjectActivity.class);
                    startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(PrimaryActivity.this, ContactActivity.class);
                    startActivity(i);
                } else {
                    //null
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrimaryActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
