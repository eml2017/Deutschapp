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

        MarkerOptions chiefsOpts = new MarkerOptions();
        chiefsOpts.position(new LatLng(  47.333358, -118.689933));
        chiefsOpts.title("Chiefs Bar & Grill");
        chiefsOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(chiefsOpts);

        MarkerOptions bookSaleOpts = new MarkerOptions();
        bookSaleOpts.position(new LatLng(47.333411, -118.691878));
        bookSaleOpts.title("Book Sale");
        bookSaleOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        mGoogleMap.addMarker(bookSaleOpts);

        MarkerOptions bakeSaleOpts = new MarkerOptions();
        bakeSaleOpts.position(new LatLng(47.333515, -118.692506));
        bakeSaleOpts.title("Old Town Hall German Bake Sale");
        bakeSaleOpts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mGoogleMap.addMarker(bakeSaleOpts);

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

        MarkerOptions softballFieldOpts = new MarkerOptions();
        softballFieldOpts.position(new LatLng(47.330132, -118.698375));
        softballFieldOpts.title("OHS Softball Field");
        softballFieldOpts.icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack));
        mGoogleMap.addMarker(softballFieldOpts);

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

        Intent intent = getIntent();
        if (intent != null) {
            String prevActivity = intent.getStringExtra("prevActivity");
            String event = intent.getStringExtra("event");
            if (prevActivity.equals("weekday") || prevActivity.equals("stage")){
                if (event.equals("Chalk Drawing")) {
                    gotoLocation(47.333058, -118.689480, event, "entertainment");
                } else if (event.equals("Tricycle Race")) {
                    gotoLocation(47.333287, -118.691819, event, "entertainment");
                } else if (event.equals("Bed Races")) {
                    gotoLocation(47.333287, -118.691819, event, "entertainment");
                } else if (event.equals("Biergarten Opens")) {
                    gotoLocation(47.333433, -118.689548, event, "entertainment");
                } else if (event.equals("Odessa FFA Pancake Breakfast")) {
                    gotoLocation(47.333433, -118.689548, event, "food");
                } else if (event.equals("Breakfast Buffet")) {
                    gotoLocation(47.333358, -118.689933, event, "food");
                } else if (event.equals("Friends of the Library Used Book Sale")) {
                    gotoLocation(47.333411, -118.691878, event, "entertainment");
                } else if (event.equals("Old Fashioned German Bake Sale")) {
                    gotoLocation(47.333515, -118.692506, event, "food");
                } else if (event.equals("Vintage Textile Display")) {
                    gotoLocation(47.330832, -118.692159, event, "entertainment");
                } else if (event.equals("Odessa High School FBLA Vendor Street Fair")) {
                    gotoLocation(47.333655, -118.690482, event, "entertainment");
                } else if (event.equals("German Food Court")) {
                    gotoLocation(47.333655, -118.690482, event, "food");
                } else if (event.equals("Rocky Coulee Brewing Opens")) {
                    gotoLocation(47.335962, -118.689212, event, "entertainment");
                } else if (event.equals("Historical Museum Opens")) {
                    gotoLocation(47.331222, -118.698067, event, "entertainment");
                } else if (event.equals("Odessa High School Football Game (The Sausage Bowl)")) {
                    gotoLocation(47.330168, -118.696025, event, "entertainment");
                } else if (event.equals("Lions Club Farmer's Breakfast")) {
                    gotoLocation(47.333433, -118.689548, event, "entertainment");
                } else if (event.equals("Breakfast Served")) {
                    gotoLocation(47.331378, -118.701463, event, "food");
                } else if (event.equals("Odessa High School ASB Fun Run")) {
                    gotoLocation(47.334411, -118.687028, event, "entertainment");
                } else if (event.equals("Kiddie and General Parade")) {
                    gotoLocation(47.333287, -118.691819, event, "entertainment");
                } else if (event.equals("Kid Zone")) {
                    gotoLocation(47.334411, -118.687028, event, "entertainment");
                } else if (event.equals("Ag Machinery Display")) {
                    gotoLocation(47.331222, -118.698067, event, "entertainment");
                } else if (event.equals("Poker Run Tournament 2-Person Scramble")) {
                    gotoLocation(47.331378, -118.701463, event, "entertainment");
                } else if (event.equals("Old Town Hall Rejuvenation Project Cash Bingo")) {
                    gotoLocation(47.333515, -118.692506, event, "entertainment");
                } else if (event.equals("German Minute to Win It")) {
                    gotoLocation(47.335962, -118.689212, event, "entertainment");
                } else if (event.equals("Guitar Workshop")) {
                    gotoLocation(47.333199, -118.691528, event, "entertainment");
                } else if (event.equals("Rocky Coulee Brewing Happy Hour Specials")) {
                    gotoLocation(47.335962, -118.689212, event, "food");
                } else if (event.equals("Rocky Coulee Brewing Fest Games")) {
                    gotoLocation(47.335962, -118.689212, event, "entertainment");
                } else if (event.equals("Rocky Coulee Brewing Beer Stein Holding Contest")) {
                    gotoLocation(47.335962, -118.689212, event, "entertainment");
                } else if (event.equals("Odessa FBLA Pancake Feed & More")) {
                    gotoLocation(47.333433, -118.689548, event, "food");
                } else if (event.equals("Mass")) {
                    gotoLocation(47.336784, -118.691744, event, "entertainment");
                } else if (event.equals("Outdoor Church Service by Odessa Ministerial Association")) {
                    gotoLocation(47.333580, -118.690289, event, "entertainment");
                } else if (event.equals("Zion Emmanuel Lutheran Church Service")) {
                    gotoLocation(47.325219, -118.689959, event, "entertainment");
                } else if (event.equals("Bike Show")) {
                    gotoLocation(47.333199, -118.691528, event, "entertainment");
                } else if (event.equals("Biergarten")) {
                    gotoLocation(47.333433, -118.689548, event, "entertainment");
                } else if (event.equals("Outdoor Stage")) {
                    gotoLocation(47.333580, -118.690289, event, "entertainment");
                }  else if (event.equals("Rocky Coulee Brewing")) {
                    gotoLocation(47.335962, -118.689212, event, "entertainment");
                } else {
                    Toast.makeText(this, "not done", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

    private void gotoLocation(double lat, double lng, String event, String eventType) {
        LatLng ll = new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, 20);
        mGoogleMap.moveCamera(update);
        if (eventType.equals("food")) {
            mGoogleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(lat, lng))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
                    .title(event)).showInfoWindow();
        } else if (eventType.equals("entertainment")) {
            mGoogleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(lat, lng))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
                    .title(event)).showInfoWindow();
        } else if (eventType.equals("other")) {
            mGoogleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(lat, lng))
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.googleblack))
                    .title(event)).showInfoWindow();
        }
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