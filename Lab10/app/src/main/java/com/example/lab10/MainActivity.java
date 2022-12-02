package com.example.lab10;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
        else
            initMap();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                          @NonNull int[] grantResults){
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        if(requestCode == 1){
            for(int result:grantResults){
                if(result != PackageManager.PERMISSION_GRANTED)
                    finish();
                else
                    initMap();
            }
        }
    }

    private void initMap(){
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.googleMap);
        if(mapFragment != null){
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        if(ActivityCompat.checkSelfPermission(MainActivity.this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this,Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
            return;

        googleMap.setMyLocationEnabled(true);

        MarkerOptions markerOptions =new MarkerOptions();
        markerOptions.position(new LatLng(25.033611,121.565000));
        markerOptions.title("台北101");
        markerOptions.draggable(true);
        googleMap.addMarker(markerOptions);
        markerOptions.position(new LatLng(25.047924,121.517081));
        markerOptions.title("台北車站");
        markerOptions.draggable(true);
        googleMap.addMarker(markerOptions);


        PolylineOptions PolylineOpt =new PolylineOptions();
        PolylineOpt.add(new LatLng(25.033611,121.565000));
        PolylineOpt.add(new LatLng(25.032728,121.565137));
        PolylineOpt.add(new LatLng(25.047924,121.517081));
        PolylineOpt.color(Color.BLUE);
        Polyline polyline =googleMap.addPolyline(PolylineOpt);
        polyline.setWidth(10);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.034,121.545),13));
    }
}