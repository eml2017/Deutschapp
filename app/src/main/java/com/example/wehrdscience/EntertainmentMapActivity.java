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

public class EntertainmentMapActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mGoogleMap;

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(EntertainmentMapActivity.this, MainActivity.class);
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
        MarkerOptions chalkDrawingOpts = new MarkerOptions();
        chalkDrawingOpts.position(new LatLng(47.333058, -118.689480));
        chalkDrawingOpts.title("Chalk Drawing");
        chalkDrawingOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(chalkDrawingOpts);

        MarkerOptions tricycleRaceBedRacesParadeOpts = new MarkerOptions();
        tricycleRaceBedRacesParadeOpts.position(new LatLng(47.333287, -118.691819));
        tricycleRaceBedRacesParadeOpts.title("Tricycle Race, Bed Races, and Parade");
        tricycleRaceBedRacesParadeOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(tricycleRaceBedRacesParadeOpts);

        MarkerOptions biergartenOpts = new MarkerOptions();
        biergartenOpts.position(new LatLng(47.333433, -118.689548));
        biergartenOpts.title("Biergarten");
        biergartenOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(biergartenOpts);

        MarkerOptions bookSaleOpts = new MarkerOptions();
        bookSaleOpts.position(new LatLng(47.333411, -118.691878));
        bookSaleOpts.title("Book Sale");
        bookSaleOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(bookSaleOpts);

        MarkerOptions stMatthewsChurchOpts = new MarkerOptions();
        stMatthewsChurchOpts.position(new LatLng(47.330832, -118.692159));
        stMatthewsChurchOpts.title("St. Matthew's Church");
        stMatthewsChurchOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(stMatthewsChurchOpts);

        MarkerOptions vendorFairOpts = new MarkerOptions();
        vendorFairOpts.position(new LatLng(47.333655, -118.690482));
        vendorFairOpts.title("Odessa High School FBLA Vendor Street Fair");
        vendorFairOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(vendorFairOpts);

        MarkerOptions rockyCouleeBreweryOpts = new MarkerOptions();
        rockyCouleeBreweryOpts.position(new LatLng(47.335962, -118.689212));
        rockyCouleeBreweryOpts.title("Rocky Coulee Brewery");
        rockyCouleeBreweryOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(rockyCouleeBreweryOpts);

        MarkerOptions historicalMuseumOpts = new MarkerOptions();
        historicalMuseumOpts.position(new LatLng(47.331222, -118.698067));
        historicalMuseumOpts.title("Historical Museum");
        historicalMuseumOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(historicalMuseumOpts);

        MarkerOptions finneyFieldOpts = new MarkerOptions();
        finneyFieldOpts.position(new LatLng(47.330168, -118.696025));
        finneyFieldOpts.title("Finney Field");
        finneyFieldOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(finneyFieldOpts);

        MarkerOptions golfCourseOpts = new MarkerOptions();
        golfCourseOpts.position(new LatLng(47.331378, -118.701463));
        golfCourseOpts.title("Odessa Golf & RV");
        golfCourseOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(golfCourseOpts);

        MarkerOptions cityParkOpts = new MarkerOptions();
        cityParkOpts.position(new LatLng(47.334411, -118.687028));
        cityParkOpts.title("Odessa City Park");
        cityParkOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(cityParkOpts);

        MarkerOptions rollingThunderOpts = new MarkerOptions();
        rollingThunderOpts.position(new LatLng(47.333199, -118.691528));
        rollingThunderOpts.title("Rolling Thunder");
        rollingThunderOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(rollingThunderOpts);

        MarkerOptions stJosephsOpts = new MarkerOptions();
        stJosephsOpts.position(new LatLng(47.336784, -118.691744));
        stJosephsOpts.title("St Joseph's Catholic Church");
        stJosephsOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(stJosephsOpts);

        MarkerOptions outdoorStageOpts = new MarkerOptions();
        outdoorStageOpts.position(new LatLng(47.333580, -118.690289));
        outdoorStageOpts.title("Outdoor Stage");
        outdoorStageOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(outdoorStageOpts);

        MarkerOptions zionOpts = new MarkerOptions();
        zionOpts.position(new LatLng(47.325219, -118.689959));
        zionOpts.title("Zion Emmanuel Lutheran Church");
        zionOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(zionOpts);

        MarkerOptions infoBoothOpts = new MarkerOptions();
        infoBoothOpts.position(new LatLng(47.333200, -118.690730));
        infoBoothOpts.title("Information Booth");
        infoBoothOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(infoBoothOpts);

        MarkerOptions heritageChurchOpts = new MarkerOptions();
        heritageChurchOpts.position(new LatLng(47.331323, -118.689551));
        heritageChurchOpts.title("Heritage Church");
        heritageChurchOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(heritageChurchOpts);

        MarkerOptions christLutheranChurchOpts = new MarkerOptions();
        christLutheranChurchOpts.position(new LatLng(47.331386, -118.680456));
        christLutheranChurchOpts.title("Christ Lutheran Church");
        christLutheranChurchOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(christLutheranChurchOpts);

        MarkerOptions fourSquareChurchOpts = new MarkerOptions();
        fourSquareChurchOpts.position(new LatLng(47.333347, -118.687918));
        fourSquareChurchOpts.title("Four Square Church");
        fourSquareChurchOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(fourSquareChurchOpts);

        MarkerOptions fleaMarketOpts = new MarkerOptions();
        fleaMarketOpts.position(new LatLng(47.333740, -118.69070));
        fleaMarketOpts.title("Flea Market");
        fleaMarketOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(fleaMarketOpts);

        MarkerOptions schoolPlaygroundOpts = new MarkerOptions();
        schoolPlaygroundOpts.position(new LatLng(47.331228, -118.688868));
        schoolPlaygroundOpts.title("School Playground");
        schoolPlaygroundOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(schoolPlaygroundOpts);

        MarkerOptions cityParkPlaygroundOpts = new MarkerOptions();
        cityParkPlaygroundOpts.position(new LatLng(47.334603, -118.687843));
        cityParkPlaygroundOpts.title("City Park Playground");
        cityParkPlaygroundOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(cityParkPlaygroundOpts);

        MarkerOptions atm1Opts = new MarkerOptions();
        atm1Opts.position(new LatLng(47.333659, -118.692845));
        atm1Opts.title("ATM");
        atm1Opts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(atm1Opts);

        MarkerOptions atm2Opts = new MarkerOptions();
        atm2Opts.position(new LatLng(47.333076, -118.692605));
        atm2Opts.title("ATM");
        atm2Opts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(atm2Opts);

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