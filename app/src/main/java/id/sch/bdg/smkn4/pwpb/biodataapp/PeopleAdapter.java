package id.sch.bdg.smkn4.pwpb.biodataapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PeopleAdapter extends ArrayAdapter<People> {

    //List Menu
    List<People> peopleList;

    //Activity Context
    Context context;

    //layout untuk listitem
    int resource;

    //inisialisasi constructor
    public PeopleAdapter(Context context, int resource, List<People> peopleList) {
        super(context, resource, peopleList);
        this.context = context;
        this.resource = resource;
        this.peopleList = peopleList;
    }

    //mengembalikan Listview item menjadi view
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //get View
        View view = layoutInflater.inflate(resource, null, false);

        //get elements from view
        ImageView imgPeople = view.findViewById(R.id.imgPeople);
        TextView tvNamePeople = view.findViewById(R.id.tvPeople);

        People people = peopleList.get(position);

        //Mengisi list Item
        imgPeople.setImageDrawable(context.getResources().getDrawable(people.getPhoto()));
        tvNamePeople.setText(people.getNamePeople());

        //mengembalikan view
        return view;
    }

}