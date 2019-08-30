package id.sch.bdg.smkn4.pwpb.biodataapp.salman;

import id.sch.bdg.smkn4.pwpb.biodataapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class ProfileSalmanActivity extends AppCompatActivity implements CardView.OnClickListener{
    CardView profile, skills, msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_salman);

        profile = (CardView) findViewById(R.id.profile);
        skills = (CardView) findViewById(R.id.skills);
        msg = (CardView) findViewById(R.id.msg);

        profile.setOnClickListener(this);
        skills.setOnClickListener(this);
        msg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.msg:
                Intent pindah = new Intent(ProfileSalmanActivity.this, ContactSalmanActivity.class);
                startActivity(pindah);
                break;
            case R.id.skills:
                Intent pindah2 = new Intent(ProfileSalmanActivity.this, SkillSalmanActivity.class);
                startActivity(pindah2);
                break;
        }
    }
}