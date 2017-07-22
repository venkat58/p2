package apps.awesome.vv.com.vvsimpleaio.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import apps.awesome.vv.com.vvsimpleaio.Constants.VVConstantsList;

/**
 * Created by Infore on 17-06-2017.
 */

public class VVFragmentPageAdpters extends FragmentPagerAdapter {
    final int PAGE_COUNT = 8;
    private String tabTitles[] = new String[] { "Shopping", "Social Networks","Grocery","Women", "Travel" ,
            "Kids", "Furniture", "Coupons" };
    private VVConstantsList elements=new VVConstantsList();

    public VVFragmentPageAdpters(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragments.newInstance(
                elements.getElements().get(position) , elements.allImages.get(tabTitles[position]));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}