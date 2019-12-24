package com.example.wehrdscience;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.io.IOException;
import java.util.List;

public class FoodMapActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mGoogleMap;

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(FoodMapActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (googleServicesAvailable()) {
            setContentView(R.layout.activity_map);
            initMap();

        } else {
            //No google maps layout
        }
    }

    private void initMap() {
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapFragment);
        mapFragment.getMapAsync(this);
    }

    public boolean googleServicesAvailable() {
        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        int isAvailable = api.isGooglePlayServicesAvailable(this);
        if (isAvailable == ConnectionResult.SUCCESS) {
            return true;

        } else if (api.isUserResolvableError(isAvailable)) {
            Dialog dialog = api.getErrorDialog(this, isAvailable, 0);
            dialog.show();

        } else {
            Toast.makeText(this, "Cannot connect to Google Play services", Toast.LENGTH_LONG).show();
        }
        return false;
    }

    public void buildMap() {
        MarkerOptions chiefsOpts = new MarkerOptions();
        chiefsOpts.position(new LatLng(  47.333358, -118.689933));
        chiefsOpts.title("Chiefs Bar & Grill");
        chiefsOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(chiefsOpts);

        MarkerOptions bakeSaleOpts = new MarkerOptions();
        bakeSaleOpts.position(new LatLng(47.333515, -118.692506));
        bakeSaleOpts.title("Old Town Hall German Bake Sale");
        bakeSaleOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(bakeSaleOpts);

        MarkerOptions jonathinsOpts = new MarkerOptions();
        jonathinsOpts.position(new LatLng(47.333014, -118.690667));
        jonathinsOpts.title("Jonathins");
        jonathinsOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(jonathinsOpts);

        MarkerOptions reubenOpts = new MarkerOptions();
        reubenOpts.position(new LatLng(47.333072, -118.690781));
        reubenOpts.title("Reuben Booth");
        reubenOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(reubenOpts);

        MarkerOptions cornBoothOpts = new MarkerOptions();
        cornBoothOpts.position(new LatLng(47.333074, -118.690702));
        cornBoothOpts.title("Corn Booth");
        cornBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(cornBoothOpts);

        MarkerOptions bratwustBoothOpts = new MarkerOptions();
        bratwustBoothOpts.position(new LatLng(47.333608, -118.690461));
        bratwustBoothOpts.title("Bratwurst/Fry Booth");
        bratwustBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(bratwustBoothOpts);

        MarkerOptions cabbageRollBoothOpts = new MarkerOptions();
        cabbageRollBoothOpts.position(new LatLng(47.333410, -118.690523));
        cabbageRollBoothOpts.title("Cabbage Roll Booth");
        cabbageRollBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(cabbageRollBoothOpts);

        MarkerOptions appleStrudelBoothOpts = new MarkerOptions();
        appleStrudelBoothOpts.position(new LatLng(47.333655, -118.690482));
        appleStrudelBoothOpts.title("Apple Strudel Booth");
        appleStrudelBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(appleStrudelBoothOpts);

        MarkerOptions shavedIceBoothOpts = new MarkerOptions();
        shavedIceBoothOpts.position(new LatLng(47.333094, -118.690794));
        shavedIceBoothOpts.title("Shaved Ice Booth");
        shavedIceBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(shavedIceBoothOpts);

        MarkerOptions dasKrautHouseOpts = new MarkerOptions();
        dasKrautHouseOpts.position(new LatLng(47.333190, -118.691646));
        dasKrautHouseOpts.title("Das Kraut House");
        dasKrautHouseOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(dasKrautHouseOpts);

        MarkerOptions grannyBarBarOpts = new MarkerOptions();
        grannyBarBarOpts.position(new LatLng(47.333141, -118.689822));
        grannyBarBarOpts.title("Granny Bar Bar");
        grannyBarBarOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(grannyBarBarOpts);

        MarkerOptions hamburgerBoothOpts = new MarkerOptions();
        hamburgerBoothOpts.position(new LatLng(47.333534, -118.690400));
        hamburgerBoothOpts.title("Hamburger Booth");
        hamburgerBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(hamburgerBoothOpts);

        MarkerOptions anyOccasionOpts = new MarkerOptions();
        anyOccasionOpts.position(new LatLng(47.333177, -118.691142));
        anyOccasionOpts.title("Any Occasion Banquet Hall Ice Cream");
        anyOccasionOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(anyOccasionOpts);

        MarkerOptions popBoothOpts = new MarkerOptions();
        popBoothOpts.position(new LatLng(47.333373,  -118.690700));
        popBoothOpts.title("Pop Booth");
        popBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(popBoothOpts);

        MarkerOptions iceCreamBoothOpts = new MarkerOptions();
        iceCreamBoothOpts.position(new LatLng( 47.333353, -118.689972));
        iceCreamBoothOpts.title("Ice Cream Booth");
        iceCreamBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(iceCreamBoothOpts);

        MarkerOptions voiseSausageOpts = new MarkerOptions();
        voiseSausageOpts.position(new LatLng( 47.333851, -118.689038));
        voiseSausageOpts.title("Voise Sausage");
        voiseSausageOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(voiseSausageOpts);

        MarkerOptions odessaFoodsOpts = new MarkerOptions();
        odessaFoodsOpts.position(new LatLng( 47.333851, -118.689038));
        odessaFoodsOpts.title("Odessa Foods");
        odessaFoodsOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(odessaFoodsOpts);

        // https://www.youtube.com/watch?v=xIKUnadxxBc
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        gotoLocationZoom(47.333380, -118.690408, 15);
        mGoogleMap.setMapType(mGoogleMap.MAP_TYPE_HYBRID);

        buildMap();
    }

    private void gotoLocationZoom(double lat, double lng, float zoom) {
        LatLng ll = new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, zoom);
        mGoogleMap.moveCamera(update);
    }

    public void geoLocate(View view) throws IOException {
        EditText et = (EditText) findViewById(R.id.editText2);
        String location = et.getText().toString();

        Geocoder gc = new Geocoder(this);
        List<Address> list = gc.getFromLocationName(location, 1);
        android.location.Address address = list.get(0);
        String locality = address.getLocality();

        Toast.makeText(this, locality, Toast.LENGTH_LONG).show();
    }
}