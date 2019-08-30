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

public class SkillAdapter extends RecyclerView.Adapter<SkillAdapter.ViewHolder> {

    private List<Skill> skillList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //each data item is just a string in this case
        public TextView tvSkill;

        public ViewHolder(View v) {
            super(v);
            tvSkill = (TextView)v.findViewById(R.id.skill);
        }
    }

    //provide a suitable constructor
    public SkillAdapter(List<Skill> SkillList) {
        this.skillList = SkillList;
    }

    //Create new views (invoked by the layout manager)

    @NonNull
    @Override
    public SkillAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_rvskill,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(SkillAdapter.ViewHolder holder, int position) {
        Skill skill = skillList.get(position);
        holder.tvSkill.setText(skill.getLprogram());
    }

    @Override
    public int getItemCount() {
        return skillList.size();
    }
}
