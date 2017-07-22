package apps.awesome.vv.com.vvsimpleaio.Constants;

import android.app.Application;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

/**
 * Created by Infore on 25-06-2017.
 */

@ReportsCrashes( mailTo = "info.vvsoftsolutions@gmail.com")
public class VVAplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
		ACRA.init(this);
    }
}
