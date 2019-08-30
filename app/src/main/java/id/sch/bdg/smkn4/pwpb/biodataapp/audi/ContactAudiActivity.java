package id.sch.bdg.smkn4.pwpb.biodataapp.audi;

import id.sch.bdg.smkn4.pwpb.biodataapp.R;
import id.sch.bdg.smkn4.pwpb.biodataapp.salman.ContactSalmanActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.salman.ProfileSalmanActivity;
import id.sch.bdg.smkn4.pwpb.biodataapp.salman.SkillSalmanActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class ContactAudiActivity extends AppCompatActivity implements CardView.OnClickListener{
    CardView profile, skills, msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_audi);

        profile = (CardView) findViewById(R.id.profile);
        msg = (CardView) findViewById(R.id.msg);

        profile.setOnClickListener(this);
        skills.setOnClickListener(this);
        msg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.profile:
                Intent pindah2 = new Intent(ContactAudiActivity.this, ProfileAudiActivity.class);
                startActivity(pindah2);
                break;
        }
    }
}
