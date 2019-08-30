package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.sch.bdg.smkn4.pwpb.biodataapp.R;

public class ContactActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Contact> contactList;
    private ContactAdapter contactAdapter;
    
    String[][] info = {{"ariyadiaip@gmail.com","R.drawable.gmail"},
            {"08989775748","R.drawable.phone"},
            {"aiparies","R.drawable.line"},
            {"https://www.linkedin.com/in/aip-ariyadi-488540190","R.drawable.linked"},
            {"aip_ariyadi","R.drawable.instagram"}};

    int[] logoInfo = {
            R.drawable.gmail,
            R.drawable.phone,
            R.drawable.line,
            R.drawable.linked,
            R.drawable.instagram
    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Information");

        mRecyclerView = (RecyclerView)findViewById(R.id.main_contentContact);

        //seeting untuk improve performance
        //content tidak dapat mengubah size layout recyclerview
        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }

        //using a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //initializing an arraylist called songlist
        contactList = new ArrayList<>();

        //add project list
        for (int i = 0; i < info.length; i++) {
            Contact contact = new Contact(info[i][0], logoInfo[i]);
            contactList.add(contact);
        }

        //initializing adapter
        contactAdapter = new ContactAdapter(contactList);

        //specifying an adapter to access data, create views and replace the content
        mRecyclerView.setAdapter(contactAdapter);
        contactAdapter.notifyDataSetChanged();
        
    }
}
