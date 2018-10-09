package codefundopp.project.ishan.com.myapplication;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;


public class Constants {

    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 12 * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 100;

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();
    static {
        // San Francisco International Airport.
        LANDMARKS.put("Rajendra Bhawan", new LatLng(29.870279,77.894210));

        // Googleplex.
        LANDMARKS.put("Lecture Hall Complex", new LatLng(29.864807,77.893908));

        // Test
        LANDMARKS.put("Main Building Lawn", new LatLng(29.865519,77.896610));
    }
}
