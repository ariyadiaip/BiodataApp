package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.sch.bdg.smkn4.pwpb.biodataapp.R;

public class ResumeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Summary Profile");
    }
}
