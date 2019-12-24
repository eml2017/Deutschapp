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

public class OtherMapActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mGoogleMap;

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(OtherMapActivity.this, MainActivity.class);
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
        MarkerOptions publicRestroom1Opts = new MarkerOptions();
        publicRestroom1Opts.position(new LatLng(47.333392, -118.689127));
        publicRestroom1Opts.title("Public Restroom");
        publicRestroom1Opts.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        mGoogleMap.addMarker(publicRestroom1Opts);

        MarkerOptions publicRestroom2Opts = new MarkerOptions();
        publicRestroom2Opts.position(new LatLng(47.332685, -118.690810));
        publicRestroom2Opts.title("Public Restroom");
        publicRestroom2Opts.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        mGoogleMap.addMarker(publicRestroom2Opts);

        MarkerOptions schoolRestroomOpts = new MarkerOptions();
        schoolRestroomOpts.position(new LatLng(47.330667, -118.689211));
        schoolRestroomOpts.title("School Restroom");
        schoolRestroomOpts.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        mGoogleMap.addMarker(schoolRestroomOpts);

        MarkerOptions parkRestroomOpts = new MarkerOptions();
        parkRestroomOpts.position(new LatLng(47.334767, -118.687871));
        parkRestroomOpts.title("Park Restroom");
        parkRestroomOpts.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        mGoogleMap.addMarker(parkRestroomOpts);

        MarkerOptions miniParkOpts = new MarkerOptions();
        miniParkOpts.position(new LatLng(47.333527, -118.687451));
        miniParkOpts.title("Odessa Mini Park");
        miniParkOpts.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        mGoogleMap.addMarker(miniParkOpts);

        MarkerOptions laCollageInnOpts = new MarkerOptions();
        laCollageInnOpts.position(new LatLng(47.333218, -118.678951));
        laCollageInnOpts.title("La Collage Inn");
        laCollageInnOpts.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        mGoogleMap.addMarker(laCollageInnOpts);

        MarkerOptions baseballFieldOpts = new MarkerOptions();
        baseballFieldOpts.position(new LatLng(47.330207, -118.696844));
        baseballFieldOpts.title("OHS Baseball Field");
        baseballFieldOpts.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        mGoogleMap.addMarker(baseballFieldOpts);

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