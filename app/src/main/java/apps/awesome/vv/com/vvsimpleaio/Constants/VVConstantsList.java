package apps.awesome.vv.com.vvsimpleaio.Constants;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Gravity;
import android.widget.Toast;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import apps.awesome.vv.com.vvsimpleaio.R;
import apps.awesome.vv.com.vvsimpleaio.adapters.ListItemPojo;

/**
 * Created by venkat on 19-06-2017.
 */

public class VVConstantsList {
    private Gson gson = new Gson();
    private int[] babyKidsImages;
    private int[] socialImages;
    private int[] couponImages;
    private int[] furnitureImages;
    private int[] groceryImages;
    private int[] shoppingImages;
    private int[] travelImages;
    private int[] womenImages;
    public HashMap<String, int[]> allImages;

    public VVConstantsList() {
        this.babyKidsImages = new int[]{R.drawable.vv_first_cry, R.drawable.vv_babyoye, R.drawable.vv_hopscotch};
        this.socialImages = new int[]{R.drawable.vv_fb, R.drawable.vv_twitter, R.drawable.vv_instagram};
        this.couponImages = new int[]{R.drawable.vv_coupon_dunia, R.drawable.vv_coupon_raja, R.drawable.vv_mydala, R.drawable.vv_cashkaro, R.drawable.vv_gopaisa};
        this.furnitureImages = new int[]{R.drawable.vv_pepper_fry, R.drawable.vv_fab_furnish, R.drawable.vv_urban_ladder};
        this.groceryImages = new int[]{R.drawable.vv_bigbasket, R.drawable.vv_dmart,R.drawable.vv_nature_basket, R.drawable.vv_patanjaliayurved, R.drawable.vv_justdial,  R.drawable.vv_aaram_shop};
        this.shoppingImages = new int[]{ R.drawable.vv_flipkart, R.drawable.vv_snapdeal, R.drawable.vv_shopclues, R.drawable.vv_amazon,   R.drawable.vv_paytm, R.drawable.vv_myntra, R.drawable.vv_jabong, R.drawable.vv_voonik, R.drawable.vv_ask_me, R.drawable.vv_yepme, R.drawable.vv_naaptol, R.drawable.vv_ebay, R.drawable.vv_homeshop18, R.drawable.vv_rediff, R.drawable.vv_zovi, R.drawable.vv_fashion_and_you, R.drawable.vv_india_times, R.drawable.vv_shop_bazar, R.drawable.vv_ajio, R.drawable.vv_tatacliq, R.drawable.vv_infibeam, R.drawable.vv_shoppersstop, R.drawable.vv_adof, R.drawable.vv_nnnow, R.drawable.vv_gofynd, R.drawable.vv_mrvoonik};
        this.travelImages = new int[]{R.drawable.vv_make_my_trip, R.drawable.vv_oyo, R.drawable.vv_yatra, R.drawable.vv_cleartrip, R.drawable.vv_go_ibibo, R.drawable.vv_expedia, R.drawable.vv_thomas_cook, R.drawable.vv_red_bus, R.drawable.vv_agoda, R.drawable.vv_trivago, R.drawable.vv_via, R.drawable.vv_ixigo, R.drawable.vv_irctc, R.drawable.vv_paytm, R.drawable.vv_makemytriphotels, R.drawable.vv_treebohotels, R.drawable.vv_zoomcar, R.drawable.vv_goair, R.drawable.vv_airasia, R.drawable.vv_mybustickets, R.drawable.vv_ticketgoose};
        this.womenImages = new int[]{R.drawable.vv_voonik, R.drawable.vv_purplle,  R.drawable.vv_biba,  R.drawable.vv_prettysecrets,  R.drawable.vv_voylla};
//        this.womenImages = new int[]{R.drawable.vv_voonik, R.drawable.vv_zivame, R.drawable.vv_limeroad, R.drawable.vv_nykaa, R.drawable.vv_purplle, R.drawable.vv_biba, R.drawable.vv_craftsvilla, R.drawable.vv_stalkbuylove, R.drawable.vv_faballey, R.drawable.vv_clovia, R.drawable.vv_chumbak, R.drawable.vv_prettysecrets, R.drawable.vv_wforwomen, R.drawable.vv_bluestone, R.drawable.vv_voylla};
        allImages=new HashMap<>();
        allImages.put("Shopping",this.shoppingImages);
        allImages.put("Social Networks",this.socialImages);
        allImages.put("Travel",this.travelImages);
        allImages.put("Grocery",this.groceryImages);
        allImages.put("Furniture",this.furnitureImages);
        allImages.put("Women",this.womenImages);
        allImages.put("Kids",this.babyKidsImages);
        allImages.put("Coupons",this.couponImages);

    }


    private final String res="[ { \"title\":\"Shopping\", \"result\":" +
            "[{\"webLink\":\"https:\\/\\/www.flipkart.com\\/offers\\/deals-of-the-day?pk=dotd&otracker=nmenu_offer-zone\",\"name\":\"Flipkart\",\"apkPath\":\"https://play.google.com/store/apps/details?id=com.flipkart.android\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/QwRJv8\",\"name\":\" SnapDeal \",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.snapdeal.main\"}," +
            "{\"webLink\":\"https:\\/\\/www.shopclues.com\",\"name\":\"ShopClues\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.shopclues\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/tKePJ5\",\"name\":\"Amazon\",\"apkPath\":\"https:\\/\\/goo.gl\\/7KBaQF\"}," +
            "{\"webLink\":\"https:\\/\\/www.paytm.com\",\"name\":\"Paytm\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.alibaba.aliexpresshd\"}]}," +
            "{\"title\":\"Social Networks\", \"result\":" +
            "[{\"webLink\":\"https:\\/\\/www.fb.com\",\"name\":\"Facebook\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.voonik.android\"}," +
            "{\"webLink\":\"https:\\/\\/www.twitter.com\\/\",\"name\":\"Twitter\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.manash.purplle\"}," +
            "{\"webLink\":\"https:\\/\\/www.instagram.com\\/\",\"name\":\"Instagram\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.voylla.voylla\"}]},"+
            "{ \"title\":\"Grocery\", \"result\":" +
            "[{\"webLink\":\"https:\\/\\/goo.gl\\/Svgrm2\",\"name\":\"BigBasket\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.bigbasket.mobileapp\"}," +
            "{\"webLink\":\"http:\\/\\/www.dmartindia.com\",\"name\":\"D-Mart\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=in.dmart\"}," +
            "{\"webLink\":\"http:\\/\\/www.naturesbasket.co.in\\/\",\"name\":\"NaturesBasket\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.godrej.naturesbasketltd\"}," +
            "{\"webLink\":\"http:\\/\\/goo.gl/KMx5Mo\",\"name\":\"Patanjali\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.patanjali.beta\"}," +
            "{\"webLink\":\"http:\\/\\/www.justdial.com\\/\",\"name\":\"JustDail\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.justdial.search\"}]}," +
            "{\"title\":\"Women\", \"result\":" +
            "[{\"webLink\":\"https:\\/\\/goo.gl\\/vNan2t\",\"name\":\"Voonik\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.voonik.android\"}," +
            "{\"webLink\":\"https:\\/\\/www.purplle.com\\/\",\"name\":\"Purplle\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.manash.purplle\"}," +
            "{\"webLink\":\"https:\\/\\/biba.in\",\"name\":\"Biba\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.biba.android.biba\"}," +
            "{\"webLink\":\"https:\\/\\/prettysecrets.com\",\"name\":\"PrettySecrets\",\"apkPath\":\"https:\\/\\/prettysecrets.com\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/Fk93Pd\",\"name\":\"Voylla\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.voylla.voylla\"}]},"+
            "{  \"title\":\"Travel\", \"result\":" +
            "[{\"webLink\":\"https:\\/\\/goo.gl///5FP9PD\",\"name\":\"MakeMyTrip\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.makemytrip\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/qIRvXp\",\"name\":\"Oyo.com\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.oyo.consumer\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/PeswdK\",\"name\":\"Yatra.com\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.yatra.base\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/6wREyM\",\"name\":\"ClearTrip\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.cleartrip.android\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/HbhVyU\",\"name\":\"Goibibo\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.goibibo\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/QTceQc\",\"name\":\"Expedia\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.expedia.bookings\"}," +
            "{\"webLink\":\"http:\\/\\/goo.gl\\/u74VwJ\",\"name\":\"ThomasCook\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.mobicule.thomascook.holidayapp\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/ECqTXL\",\"name\":\"RedBus\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=in.redbus.android\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/ktJzhz\",\"name\":\"Agoda\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.agoda.mobile.consumer\"}," +
            "{\"webLink\":\"http:\\/\\/goo.gl/9inQUr\",\"name\":\"Travago\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.trivago\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/DA3gkK\",\"name\":\"Via.com\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=app.via\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/gph4gU\",\"name\":\"Ixigo.com\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.ixigo\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/zUHwPC\",\"name\":\"Irctc\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.irctc.main\"}," +
            "{\"webLink\":\"https:\\/\\/goo.gl\\/tvzxzT\",\"name\":\"Paytm\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=net.one97.paytm\"}]}," +
            "{\"title\":\"Kids\", \"result\":" +
            "[{\"webLink\":\"https:\\/\\/www.firstcry.com\\/\",\"name\":\"FirstCry\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=fc.admin.fcexpressadmin\"}," +
            "{\"webLink\":\"http:\\/\\/www.babyoye.com\\/\",\"name\":\"Babyoye\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=babyoye.com\"}," +
            "{\"webLink\":\"https:\\/\\/www.hopscotch.in\\/\",\"name\":\"hopscotch\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=in.hopscotch.android\"}]},"+
            "{ \"title\":\"Furniture\", \"result\":" +
            "[{\"webLink\":\"https:\\/\\/goo.gl\\/qcxh1h\",\"name\":\"PepperFry\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.app.pepperfry\"}," +
            "{\"webLink\":\"https:\\/\\/www.fabfurnish.com\\/\",\"name\":\"FabFurnish\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.fabfurnish.android\"}," +
            "{\"webLink\":\"https:\\/\\/www.urbanladder.com\\/\",\"name\":\"UrbanLadder\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.urbanladder.catalog\"}]}," +
            "{\"title\":\"Coupons\", \"result\":" +
            "[{\"webLink\":\"https:\\/\\/www.coupondunia.in\\/\",\"name\":\"CouponDunia\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=in.coupondunia.androidapp\"}," +
            "{\"webLink\":\"http:\\/\\/www.couponraja.in\\/\",\"name\":\"couponraja\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.ls.couponraja\"}," +
            "{\"webLink\":\"http:\\/\\/www.mydala.com\\/\",\"name\":\"MyDala\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.mydala\"}," +
            "{\"webLink\":\"http:\\/\\/cashkaro.com\\/\",\"name\":\"Cashkaro\",\"apkPath\":\"http:\\/\\/cashkaro.com\\/\"}," +
            "{\"webLink\":\"https:\\/\\/www.gopaisa.com\\/\",\"name\":\"GoPaisa\",\"apkPath\":\"https:\\/\\/play.google.com\\/store\\/apps\\/details?id=com.gopaisa\"}]}"
            +"]";

    public ArrayList<ListItemPojo> elements;

    public ArrayList<ListItemPojo> getElements() {
        setShoppingList(res);
        return elements;
    }

    public void setShoppingList(String shoppingList) {
        Type collectionType = new com.google.gson.reflect.TypeToken<List<ListItemPojo>>() {
        }.getType();
        this.elements  =gson.fromJson(shoppingList, collectionType);
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni == null) {
            // There are no active networks.
            return false;
        } else
            return true;
    }

    public static void show(Context ctx, String massage) {
        Toast toast = Toast.makeText(ctx, massage,
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


}
