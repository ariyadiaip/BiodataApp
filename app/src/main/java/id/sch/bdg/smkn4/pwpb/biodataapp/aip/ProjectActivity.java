package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.sch.bdg.smkn4.pwpb.biodataapp.MainActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.R;

public class ProjectActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Project> projectList;
    private ProjectAdapter projectAdapter;

    String[][] projectContent = {{"Saung","Mobile | Team Project", "Sarana Lapor Bandung", "In Progress","R.drawable.saung"},
            {"Rope","Mobile | Team Project", "Rules Of Point System", "Suspended","R.drawable.rope"},
            {"Simple Note","Mobile | Personal Project", "SMKCODING final project", "2019","R.drawable.simple_note"},
            {"Inventaristic","Desktop | Team Project", "Item Data Management Application", "2019","R.drawable.inventaristic"},
            {"HayuCaww","Web | Team Project", "Airplane and Train Ticket Application", "2019","R.drawable.hayucaww"},
            {"CreSub","Desktop | Personal Project", "Subtitle Maker Application", "2019","R.drawable.cresub"},
            {"TokTak Game","Desktop | Team Project", "The Game is Made with Greenfoot", "2018","R.drawable.toktak"}};

    int[] logoProject = {
            R.drawable.saung,
            R.drawable.rope,
            R.drawable.simple_note,
            R.drawable.inventaristic,
            R.drawable.hayucaww,
            R.drawable.cresub,
            R.drawable.toktak
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Project");

        mRecyclerView = (RecyclerView)findViewById(R.id.main_contentProject);

        //seeting untuk improve performance
        //content tidak dapat mengubah size layout recyclerview
        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }

        //using a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //initializing an arraylist called projectlist
        projectList = new ArrayList<>();

        //add project list
        for (int i = 0; i < projectContent.length; i++) {
            //int pic = Integer.parseInt(projectContent[i][4]);
            Project project = new Project(projectContent[i][0], projectContent[i][1], projectContent[i][2],
                    projectContent[i][3], logoProject[i]);
            projectList.add(project);
        }

        //initializing adapter
        projectAdapter= new ProjectAdapter(projectList);

        //specifying an adapter to access data, create views and replace the content
        mRecyclerView.setAdapter(projectAdapter);
        projectAdapter.notifyDataSetChanged();
    }
}
