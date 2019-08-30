package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import id.sch.bdg.smkn4.pwpb.biodataapp.R;

//Kita memerlukan untuk meng-extends class CustomAdapter kita dari ArrayAdapter
public class MenuAdapter extends ArrayAdapter<Menu> {

    //List Menu
    List<Menu> menuList;

    //Activity Context
    Context context;

    //layout untuk listitem
    int resource;

    //inisialisasi constructor
    public MenuAdapter(Context context, int resource, List<Menu> menuList) {
        super(context, resource, menuList);
        this.context = context;
        this.resource = resource;
        this.menuList = menuList;
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
        ImageView imgMenu = view.findViewById(R.id.imgMenu);
        TextView tvNameMenu = view.findViewById(R.id.tvMenu);
        ImageView imgGo = view.findViewById(R.id.imgGo);

        Menu menu = menuList.get(position);

        //Mengisi list Item
        imgMenu.setImageDrawable(context.getResources().getDrawable(menu.getImgMenu()));
        tvNameMenu.setText(menu.getNameMenu());
        imgGo.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_next));

        //mengembalikan view
        return view;
    }

}

