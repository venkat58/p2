package apps.awesome.vv.com.vvsimpleaio.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import apps.awesome.vv.com.vvsimpleaio.R;

/**
 * Created by Infore on 19-07-2017.
 */

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder> {

    private List<SubListPojo> list;
    private Context contxt;
    private int[] images;
    private ItemClickListener mClickListener;


    // data is passed into the constructor
    public MainListAdapter(Context context,List<SubListPojo> list2 , int[] images) {
        this.list = list2;
        this.contxt = context;
        this.images=images;
    }

    // inflates the cell layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) contxt
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_horizontal_categories_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    // binds the data to the textview in each cell
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SubListPojo records = list.get(position);
        Log.d("venkat",records.getName());
        if(records.getWebLink() != null)
            holder.label.setText(records.getName());
        else
            holder.label.setText("");

        holder.img_View.setImageDrawable(ContextCompat.getDrawable(contxt, images[position]));
        holder.itemView.setTag(records);
    }

    // total number of cells
    @Override
    public int getItemCount() {
        return list.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView label;
        ImageView img_View;

        public ViewHolder(View itemView) {
            super(itemView);
             label =(TextView) itemView.findViewById(R.id.hl_p_name);
             img_View= (ImageView) itemView
                    .findViewById(R.id.hl_p_image);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    public String getItem(int id) {
        return list.get(id).getWebLink();
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}