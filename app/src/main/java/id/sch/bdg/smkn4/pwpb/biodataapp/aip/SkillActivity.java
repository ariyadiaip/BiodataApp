package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import id.sch.bdg.smkn4.pwpb.biodataapp.R;

public class SkillActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Skill> skillList;
    private SkillAdapter skillAdapter;

    String[] skillContent = {"C++", "HTML", "CSS", "PHP", "Java", "Kotlin", "MySql", "SqlLite"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Programming Language");

        mRecyclerView = (RecyclerView)findViewById(R.id.main_contentSkill);

        //seeting untuk improve performance
        //content tidak dapat mengubah size layout recyclerview
        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }

        //using a linear layout manager
        mLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //initializing an arraylist called songlist
        skillList = new ArrayList<>();

        //add project list
        for (int i = 0; i < skillContent.length; i++) {
            Skill skill = new Skill(skillContent[i]);
            skillList.add(skill);
        }

        //initializing adapter
        skillAdapter = new SkillAdapter(skillList);

        //specifying an adapter to access data, create views and replace the content
        mRecyclerView.setAdapter(skillAdapter);
        skillAdapter.notifyDataSetChanged();
    }
}
