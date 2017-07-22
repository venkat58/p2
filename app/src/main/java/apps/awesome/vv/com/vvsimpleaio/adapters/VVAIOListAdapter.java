package apps.awesome.vv.com.vvsimpleaio.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import apps.awesome.vv.com.vvsimpleaio.Constants.VVConstantsList;
import apps.awesome.vv.com.vvsimpleaio.R;
import apps.awesome.vv.com.vvsimpleaio.VVMainWebViewActivity;

/**
 * Created by venkat on 20-06-2017.
 */

public class VVAIOListAdapter extends RecyclerView.Adapter<VVAIOListAdapter.ViewHolder> {
    private Activity act;
    private ArrayList<ListItemPojo> list;
    private HashMap<String,int[]> imagesList;

    public VVAIOListAdapter(Activity act, ArrayList<ListItemPojo> list,HashMap<String,int[]> images)
    {
        this.list=list;
        this.act=act;
        this.imagesList=images;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.custom_departments_list_rv, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final ListItemPojo selectedProduct=list.get(position);
        holder.title.setText(selectedProduct.getTitle());
        holder.hls.setAdapter(new SubListAdapter(act, selectedProduct.getResult(),imagesList.get(selectedProduct.getTitle())));
        holder.hls.setTag(selectedProduct);
        holder.hls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                ListItemPojo records = (ListItemPojo)parent.getTag();
                if(VVConstantsList.isNetworkConnected(act.getApplicationContext())){
                    Intent i= new Intent(act.getApplicationContext(), VVMainWebViewActivity.class);
                    i.putExtra("url",records.getResult().get(position).getWebLink());
                    act.startActivity(i);
                } else {
                    VVConstantsList.show(act,
                            act.getString(R.string.no_network_avl));
                }
            }
        });
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        HorizontalListView hls;
        TextView title;
        public ViewHolder(View v)
        {
            super(v);
            hls=(HorizontalListView)v.findViewById(R.id.departmentCategories);
            title=(TextView)v.findViewById(R.id.departmentTitle);
        }

    }

}
