package com.example.wehrdscience;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

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
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mGoogleMap;

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(MapActivity.this, MainActivity.class);
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

    public void buildMap(GoogleMap googleMap) {
        MarkerOptions opts = new MarkerOptions();
        opts.position(new LatLng(47.333014, -118.690667));
        opts.title("Jonathins");
        opts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts);

        MarkerOptions opts2 = new MarkerOptions();
        opts2.position(new LatLng(47.333072, -118.690781));
        opts2.title("Reuben Booth");
        opts2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts2);

        MarkerOptions opts3 = new MarkerOptions();
        opts3.position(new LatLng(47.333074, -118.690702));
        opts3.title("Corn Booth");
        opts3.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts3);

        /*MarkerOptions opts4 = new MarkerOptions();
        opts4.position(new LatLng(47.333072, -118.690781));
        opts4.title("Reuben Booth");
        opts4.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts4);*/

        MarkerOptions opts5 = new MarkerOptions();
        opts5.position(new LatLng(47.333608, -118.690461));
        opts5.title("Bratwurst/Fry Booth");
        opts5.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts5);

        MarkerOptions opts6 = new MarkerOptions();
        opts6.position(new LatLng(47.333410, -118.690523));
        opts6.title("Cabbage Roll Booth");
        opts6.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts6);

        MarkerOptions opts7 = new MarkerOptions();
        opts7.position(new LatLng(47.333655, -118.690482));
        opts7.title("Apple Strudel Booth");
        opts7.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts7);

        MarkerOptions opts8 = new MarkerOptions();
        opts8.position(new LatLng(47.333094, -118.690794));
        opts8.title("Shaved Ice Booth");
        opts8.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts8);

        MarkerOptions opts9 = new MarkerOptions();
        opts9.position(new LatLng(47.333190, -118.691646));
        opts9.title("Das Kraut House");
        opts9.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts9);

        MarkerOptions opts10 = new MarkerOptions();
        opts10.position(new LatLng(47.333141, -118.689822));
        opts10.title("Granny Bar Bar");
        opts10.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(opts10);

        MarkerOptions opts11 = new MarkerOptions();
        opts11.position(new LatLng(47.333580, -118.690289));
        opts11.title("Outdoor Stage");
        opts11.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(opts11);

        MarkerOptions opts12 = new MarkerOptions();
        opts12.position(new LatLng(47.334053, -118.687609));
        opts12.title("Fun Run Starting Line");
        opts12.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(opts12);

        MarkerOptions opts13 = new MarkerOptions();
        opts13.position(new LatLng(47.331222, -118.698067));
        opts13.title("Museum");
        opts13.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(opts13);

        MarkerOptions opts14 = new MarkerOptions();
        opts14.position(new LatLng(47.328536, -118.695173));
        opts14.title("Horseshoe Tournament");
        opts14.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(opts14);

        MarkerOptions opts16 = new MarkerOptions();
        opts16.position(new LatLng(47.333200, -118.690730));
        opts16.title("Information Booth");
        opts16.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(opts16);

        MarkerOptions opts17 = new MarkerOptions();
        opts17.position(new LatLng(47.331323, -118.689551));
        opts17.title("Heritage Church");
        opts17.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(opts17);

        MarkerOptions opts18 = new MarkerOptions();
        opts18.position(new LatLng(47.330132, -118.698375));
        opts18.title("OHS Softball Field");
        opts18.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        //opts18.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        mGoogleMap.addMarker(opts18);

        MarkerOptions johnathons = new MarkerOptions();
        johnathons.position(new LatLng(47.333014, -118.690667));
        johnathons.title("Johnathan's Booth");
        johnathons.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(johnathons);

        MarkerOptions hamburger = new MarkerOptions();
        hamburger.position(new LatLng(47.333534, -118.690400));
        hamburger.title("Hamburger Booth");
        hamburger.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(hamburger);

        MarkerOptions lions_club = new MarkerOptions();
        lions_club.position(new LatLng(47.333500, -118.689367));
        lions_club.title("Lions Club Breakfast");
        lions_club.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(lions_club);

        MarkerOptions any_ocassion = new MarkerOptions();
        any_ocassion.position(new LatLng(47.333177, -118.691142));
        any_ocassion.title("Any Occasion Banquet Hall Ice Cream");
        any_ocassion.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(any_ocassion);

        MarkerOptions chalkDrawingOpts = new MarkerOptions();
        chalkDrawingOpts.position(new LatLng(47.333058, -118.689480));
        chalkDrawingOpts.title("Chalk Drawing");
        chalkDrawingOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(chalkDrawingOpts);

        MarkerOptions helicopter = new MarkerOptions();
        helicopter.position(new LatLng(47.330168, -118.696025));
        helicopter.title("Helicopter Rides");
        helicopter.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(helicopter);

        MarkerOptions bake_sale = new MarkerOptions();
        bake_sale.position(new LatLng(47.333515, -118.692506));
        bake_sale.title("Old Town Hall German Bake Sale");
        bake_sale.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(bake_sale);

        MarkerOptions bed_race_parade = new MarkerOptions();
        bed_race_parade.position(new LatLng(47.333287, -118.691819));
        bed_race_parade.title("Bed Race and Parade");
        bed_race_parade.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(bed_race_parade);

        MarkerOptions book = new MarkerOptions();
        book.position(new LatLng(47.333411, -118.691878));
        book.title("Book Sale");
        book.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        book.snippet("book sale");
        mGoogleMap.addMarker(book);

        MarkerOptions laser = new MarkerOptions();
        laser.position(new LatLng(47.334645, -118.688420));
        laser.title("Laser Tag");
        laser.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        laser.snippet("laser tag");
        mGoogleMap.addMarker(laser);

        MarkerOptions public_potty1 = new MarkerOptions();
        public_potty1.position(new LatLng(47.333392, -118.689127));
        public_potty1.title("Public Restroom");
        public_potty1.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        public_potty1.snippet("public_potty1");
        mGoogleMap.addMarker(public_potty1);

        MarkerOptions public_potty2 = new MarkerOptions();
        public_potty2.position(new LatLng(47.332685, -118.690810));
        public_potty2.title("Public Restroom");
        public_potty2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        public_potty2.snippet("public_potty2");
        mGoogleMap.addMarker(public_potty2);

        MarkerOptions school_bathroom = new MarkerOptions();
        school_bathroom.position(new LatLng(47.330667, -118.689211));
        school_bathroom.title("School Restroom");
        school_bathroom.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        school_bathroom.snippet("Open to the public");
        mGoogleMap.addMarker(school_bathroom);

        MarkerOptions park_bathroom = new MarkerOptions();
        park_bathroom.position(new LatLng(47.334767, -118.687871));
        park_bathroom.title("Park Restroom");
        park_bathroom.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        park_bathroom.snippet("Open to the public");
        mGoogleMap.addMarker(park_bathroom);

        MarkerOptions zion = new MarkerOptions();
        zion.position(new LatLng(47.325219, -118.689959));
        zion.title("Zion Emmanuel Lutheran Church");
        zion.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        zion.snippet("zion");
        mGoogleMap.addMarker(zion);

        MarkerOptions st_joseph = new MarkerOptions();
        st_joseph.position(new LatLng(47.336784, -118.691744));
        st_joseph.title("St Joseph's Catholic Church");
        st_joseph.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        st_joseph.snippet("St Joseph's Catholic Church");
        mGoogleMap.addMarker(st_joseph);

        MarkerOptions christ_lutheran = new MarkerOptions();
        christ_lutheran.position(new LatLng(47.331386, -118.680456));
        christ_lutheran.title("Christ Lutheran Church");
        christ_lutheran.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        christ_lutheran.snippet("christ lutheran");
        mGoogleMap.addMarker(christ_lutheran);

        MarkerOptions four_square = new MarkerOptions();
        four_square.position(new LatLng(47.333347, -118.687918));
        four_square.title("Four Square Church");
        four_square.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        four_square.snippet("four_square");
        mGoogleMap.addMarker(four_square);

        MarkerOptions mini_park = new MarkerOptions();
        mini_park.position(new LatLng(47.333527, -118.687451));
        mini_park.title("Odessa Mini Park");
        mini_park.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        //mini_park.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        mini_park.snippet("mini_park");
        mGoogleMap.addMarker(mini_park);

        MarkerOptions la_collage = new MarkerOptions();
        la_collage.position(new LatLng(47.333218, -118.678951));
        la_collage.title("La Collage Inn");
        la_collage.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        //la_collage.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        la_collage.snippet("la_collage");
        mGoogleMap.addMarker(la_collage);

        MarkerOptions optss = new MarkerOptions();
        optss.position(new LatLng(47.333373,  -118.690700));
        optss.title("Pop Booth");
        optss.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(optss);

        MarkerOptions optss2 = new MarkerOptions();
        optss2.position(new LatLng( 47.333353, -118.689972));
        optss2.title("Ice Cream Booth");
        optss2.snippet("Hello world!");
        optss2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(optss2);

        MarkerOptions optss3 = new MarkerOptions();
        optss3.position(new LatLng( 47.333530, -118.694222));
        optss3.title("Odessa Drive Inn");
        optss3.snippet("Hello world!");
        optss3.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(optss3);

        MarkerOptions optss4 = new MarkerOptions();
        optss4.position(new LatLng(  47.333358, -118.689933));
        optss4.title("Chiefs Bar and Grill");
        optss4.snippet("Hello world!");
        optss4.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(optss4);

        MarkerOptions optss5 = new MarkerOptions();
        optss5.position(new LatLng( 47.333851, -118.689038));
        optss5.title("Voise Sausage");
        optss5.snippet("Hello world!");
        optss5.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(optss5);

        MarkerOptions optss6 = new MarkerOptions();
        optss6.position(new LatLng( 47.333851, -118.689038));
        optss6.title("Das Coffee House");
        optss6.snippet("Hello world!");
        optss6.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(optss6);

        MarkerOptions optss7 = new MarkerOptions();
        optss7.position(new LatLng( 47.333851, -118.689038));
        optss7.title("Odessa Foods");
        optss7.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(optss7);

        MarkerOptions optss8 = new MarkerOptions();
        optss8.position(new LatLng(47.333433, -118.689548));
        optss8.title("BierGarten");
        optss8.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(optss8);

        MarkerOptions optss9 = new MarkerOptions();
        optss9.position(new LatLng(47.333740, -118.69070));
        optss9.title("Flea Market");
        optss9.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(optss9);

        MarkerOptions optss10 = new MarkerOptions();
        optss10.position(new LatLng(47.331378, -118.701463));
        optss10.title("Golf Course");
        optss10.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(optss10);

        MarkerOptions optss11 = new MarkerOptions();
        optss11.position(new LatLng(47.331228, -118.688868));
        optss11.title("School Playground");
        optss11.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(optss11);

        MarkerOptions optss12 = new MarkerOptions();
        optss12.position(new LatLng(47.334603, -118.687843));
        optss12.title("City Park Playground");
        optss12.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(optss12);

        MarkerOptions optss13 = new MarkerOptions();
        optss13.position(new LatLng(47.333659, -118.692845));
        optss13.title("ATM");
        optss13.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(optss13);

        MarkerOptions optss14 = new MarkerOptions();
        optss14.position(new LatLng(47.333076, -118.692605));
        optss14.title("ATM");
        optss14.snippet("Hello world!");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(optss14);

        MarkerOptions optss19 = new MarkerOptions();
        optss19.position(new LatLng(47.335962, -118.689212));
        optss19.title("Rocky Coulee Brewery");
        optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(optss19);

        MarkerOptions optss15 = new MarkerOptions();
        optss15.position(new LatLng(47.330207, -118.696844));
        optss15.title("OHS Baseball Field");
        optss15.snippet("Hello world!");
        optss15.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        //optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        mGoogleMap.addMarker(optss15);

        MarkerOptions optss16 = new MarkerOptions();
        optss16.position(new LatLng(47.334411, -118.687028));
        optss16.title("Odessa City Park");
        optss16.snippet("Hello world!");
        optss16.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        // optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        mGoogleMap.addMarker(optss16);

        MarkerOptions optss17 = new MarkerOptions();
        optss17.position(new LatLng(47.331190, -118.700086));
        optss17.title("Odessa Golf Course");
        optss17.snippet("Hello world!");
        optss17.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        //optss.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        mGoogleMap.addMarker(optss17);

        // https://www.youtube.com/watch?v=xIKUnadxxBc
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        gotoLocationZoom(47.333380, -118.690408, 15);
        mGoogleMap.setMapType(mGoogleMap.MAP_TYPE_HYBRID);

        buildMap(googleMap);

        Intent intent = getIntent();
        if (intent != null) {
            String prevActivity = intent.getStringExtra("prevActivity");
            String event = intent.getStringExtra("event");
            if (prevActivity.equals("weekday")){
                if (event.equals("Chalk Drawing")) {
                    gotoLocation(47.333058, -118.689480, event);
                } else if (event.equals("Tricycle Race")) {
                    gotoLocation(47.333287, -118.691819, event);
                } else if (event.equals("Bed Races")) {
                    gotoLocation(47.333287, -118.691819, event);
                } else if (event.equals("Biergarten Opens")) {
                    gotoLocation(47.333433, -118.689548, event);
                }
            }
        }
    }

    private void gotoLocation(double lat, double lng, String event) {
        LatLng ll = new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, 20);
        mGoogleMap.moveCamera(update);
        mGoogleMap.addMarker(new MarkerOptions()
                  .position(new LatLng(lat, lng))
                  .title(event)).showInfoWindow();
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