package apps.awesome.vv.com.vvsimpleaio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.iid.FirebaseInstanceId;

import apps.awesome.vv.com.vvsimpleaio.adapters.VVFragmentPageAdpters;

public class VVAIOMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

//    private RecyclerView list;
//    private VVAIOListAdapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//    private VVConstantsList elements=new VVConstantsList();
//    private AdView mAdView;
private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vvaiomain);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new VVFragmentPageAdpters(getSupportFragmentManager()));
        // Give the PagerSlidingTabStrip the ViewPager
        PagerSlidingTabStrip tabsStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        // Attach the view pager to the tab strip
        tabsStrip.setViewPager(viewPager);

       /* list=(RecyclerView)findViewById(R.id.list);
        mLayoutManager = new LinearLayoutManager(VVAIOMainActivity.this);
        list.setLayoutManager(mLayoutManager);

        mAdapter = new VVAIOListAdapter(VVAIOMainActivity.this, elements.getElements(), elements.allImages);
        list.setAdapter(mAdapter);*/



       /* mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
*/



       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
            // Create channel to show notifications.
            String channelId  = getString(R.string.default_notification_channel_id);
            String channelName = getString(R.string.default_notification_channel_name);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel
                    (new NotificationChannel(channelId,channelName, NotificationManager.IMPORTANCE_LOW));
        }*/

    }

    private void loadAds()
    {
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_id));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onResume() {
        FirebaseInstanceId.getInstance().getToken();
        MobileAds.initialize(this, getString(R.string.ads_id));
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the vv_menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.vvaiomain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.tv9m) {
            loadNewChannels("https://www.youtube.com/watch?v=pYFSTuL835U");
        } else if (id == R.id.tv9t) {
            loadNewChannels("https://www.youtube.com/watch?v=HoWJeHL3AEk");
        } else if (id == R.id.cnn) {
            loadNewChannels("https://www.youtube.com/watch?v=LsM5rzKV1m8");
        } else if (id == R.id.sky) {
            loadNewChannels("https://www.youtube.com/watch?v=y60wDzZt8yg");
        } else if (id == R.id.indiaToday) {
            loadNewChannels("https://www.youtube.com/watch?v=aOSihYubSGQ");
        } else if (id == R.id.n18) {
            loadNewChannels("https://www.youtube.com/watch?v=gFMaxP6cHh8");
        }else if (id == R.id.toi) {
            loadNewChannels("http://timesofindia.indiatimes.com/");
        } else if (id == R.id.indianExpress) {
            loadNewChannels("http://www.newindianexpress.com/");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void loadNewChannels(String url)
    {
        Intent i = new Intent(VVAIOMainActivity.this,VVNewViewWebActivity.class);
        i.putExtra("url",url);
        startActivity(i);

        loadAds();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
