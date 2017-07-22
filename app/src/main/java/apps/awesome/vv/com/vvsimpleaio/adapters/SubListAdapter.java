package apps.awesome.vv.com.vvsimpleaio.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import apps.awesome.vv.com.vvsimpleaio.R;

/**
 * Created by venkat on 19-06-2017.
 */

public class SubListAdapter  extends BaseAdapter {
    private List<SubListPojo> list;
    private Context contxt;
    private int[] images;

    // Constructor to initialize values
    public SubListAdapter(Context context,List<SubListPojo> list2 , int[] images) {
        super();
        this.list = list2;
        this.contxt = context;
        this.images=images;

    }

    @Override
    public int getCount() {
        // Number of times getView method call depends upon
        // gridValues.length
        return list.size();
    }

    @Override
    public String getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // Number of times getView method call depends upon gridValues.length
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        LayoutInflater inflater = (LayoutInflater) contxt
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        final SubListPojo records = list.get(position);

        if (convertView == null) {
            gridView = inflater.inflate(R.layout.custom_horizontal_categories_list, null);
            gridView.setTag(records);
        } else {
            gridView = convertView;
        }

        TextView label=(TextView) gridView.findViewById(R.id.hl_p_name);
        if(records.getWebLink() != null)
            label.setText(records.getName());
        else
            label.setText("");

        ImageView img_View = (ImageView) gridView
                .findViewById(R.id.hl_p_image);
        img_View.setImageDrawable(ContextCompat.getDrawable(contxt, images[position]));

        return gridView;
    }

}