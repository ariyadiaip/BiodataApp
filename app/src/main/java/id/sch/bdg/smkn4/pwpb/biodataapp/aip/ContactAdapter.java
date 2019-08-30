package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import id.sch.bdg.smkn4.pwpb.biodataapp.R;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private List<Contact> contactList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //each data item is just a string in this case
        public TextView tvIsi;
        public ImageView ivLogoApp;

        public ViewHolder(View v) {
            super(v);
            tvIsi= (TextView)v.findViewById(R.id.isi);
            ivLogoApp = (ImageView) v.findViewById(R.id.imageInfo);
        }
    }

    //provide a suitable constructor
    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    //Create new views (invoked by the layout manager)

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_lvinfo,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ContactAdapter.ViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.tvIsi.setText(contact.getIsi());
        holder.ivLogoApp.setImageResource(contact.getPic());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
