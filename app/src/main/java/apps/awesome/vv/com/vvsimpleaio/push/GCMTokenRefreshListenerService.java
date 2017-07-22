package apps.awesome.vv.com.vvsimpleaio.push;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by venkat on 30-12-2016.
 */

public class GCMTokenRefreshListenerService extends FirebaseInstanceIdService {

    //If the token is changed registering the device again
     @Override
    public void onTokenRefresh() {
         // Get updated InstanceID token.
    FirebaseInstanceId.getInstance().getToken();
    // If you want to send messages to this application instance or
    // manage this apps subscriptions on the server side, send the
    // Instance ID token to your app server.
//    sendRegistrationToServer(refreshedToken);
    }
}
