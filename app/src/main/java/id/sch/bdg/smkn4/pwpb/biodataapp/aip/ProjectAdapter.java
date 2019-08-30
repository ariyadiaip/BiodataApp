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


public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ViewHolder> {

    private List<Project> projectList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //each data item is just a string in this case
        public TextView tvTitle, tvSubtitle, tvDetail, tvYear;
        public ImageView ivLogo;

        public ViewHolder(View v) {
            super(v);
            tvTitle = (TextView)v.findViewById(R.id.titleProject);
            tvSubtitle = (TextView)v.findViewById(R.id.subtitleProject);
            tvDetail = (TextView)v.findViewById(R.id.detailProject);
            tvYear = (TextView)v.findViewById(R.id.yearProject);
            ivLogo = (ImageView) v.findViewById(R.id.logoProject);
        }
    }

    //provide a suitable constructor
    public ProjectAdapter(List<Project> projectList) {
        this.projectList = projectList;
    }

    //Create new views (invoked by the layout manager)

    @NonNull
    @Override
    public ProjectAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_rvproject,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ProjectAdapter.ViewHolder holder, int position) {
        Project project = projectList.get(position);
        holder.tvTitle.setText(project.getTitle());
        holder.tvSubtitle.setText(project.getSubtitle());
        holder.tvDetail.setText(project.getDetail());
        holder.tvYear.setText(project.getYear());
        holder.ivLogo.setImageResource(project.getLogo());
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }
}

