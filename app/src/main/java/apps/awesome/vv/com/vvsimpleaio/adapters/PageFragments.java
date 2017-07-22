package apps.awesome.vv.com.vvsimpleaio.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import apps.awesome.vv.com.vvsimpleaio.Constants.VVConstantsList;
import apps.awesome.vv.com.vvsimpleaio.R;
import apps.awesome.vv.com.vvsimpleaio.VVMainWebViewActivity;

/**
 * Created by venkat on 17-06-2017.
 */

public class PageFragments extends Fragment {

    private ListItemPojo mPageList;
    private int[] imagesList;
    private MainListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public static PageFragments newInstance( ListItemPojo elements, int[] images) {
        Bundle args = new Bundle();
        args.putSerializable("elements", elements );
        args.putIntArray("images",images);
        PageFragments fragment = new PageFragments();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageList =(ListItemPojo) getArguments().getSerializable("elements");
        imagesList= getArguments().getIntArray("images");

    }

    // Inflate the fragment layout we defined above for this fragment
    // Set the associated text for the title
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vv_fragment_page, container, false);
        RecyclerView list = (RecyclerView) view.findViewById(R.id.list);
        mLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        list.setLayoutManager(mLayoutManager);

        list.setLayoutManager(new GridLayoutManager(getActivity().getBaseContext(), 2));
        mAdapter = new MainListAdapter(getActivity().getBaseContext(), mPageList.getResult() , imagesList);
        mAdapter.setClickListener(new MainListAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                SubListPojo pojo= (SubListPojo) view.getTag();
                if(VVConstantsList.isNetworkConnected(getActivity().getBaseContext())){
                    Intent i= new Intent(getActivity().getBaseContext(), VVMainWebViewActivity.class);
                    i.putExtra("url",pojo.getWebLink());
                    getActivity().startActivity(i);
                } else {
                    VVConstantsList.show(getActivity(),
                            getActivity().getString(R.string.no_network_avl));
                }
            }
        });
        list.setAdapter(mAdapter);

        return view;
    }


}
