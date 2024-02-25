package com.example.rexburgrestaurants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.rexburgrestaurants.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.Marker

class MapsActivity : AppCompatActivity(), OnMapReadyCallback
{

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap


        val blisters = LatLng(43.826290, -111.818300)
        mMap.addMarker(MarkerOptions().position(blisters).title("Blister's BBQ"))
        val taqueria = LatLng(43.817950,-111.792930)
        mMap.addMarker(MarkerOptions().position(taqueria).title("Taqueria el Rancho"))
        val fresco = LatLng(43.801630,-111.810010)
        mMap.addMarker(MarkerOptions().position(fresco).title("Fresco Kitchen And Grill"))
        val kainoa = LatLng(43.823340,-111.789030)
        mMap.addMarker(MarkerOptions().position(kainoa).title("Kainoa's Hawaiian Grill"))
        val righteous = LatLng(43.821736392771726, -111.78934172076757)
        mMap.addMarker(MarkerOptions().position(righteous).title("Righteous Slice"))
        val jud = LatLng(43.71701393000836, -111.78557187961279)
        mMap.addMarker(MarkerOptions().position(jud).title("Big Jud's"))
        val crossroads = LatLng(43.81867546081673, -111.78204935575194)
        mMap.addMarker(MarkerOptions().position(crossroads).title("BYUI Crossroads Food Court"))
        val redrabbit = LatLng(43.825263524934236, -111.7884538447555)
        mMap.addMarker(MarkerOptions().position(redrabbit).title("Red Rabbit Grill"))
        val gringo = LatLng(43.82522866733404, -111.78364504676844)
        mMap.addMarker(MarkerOptions().position(gringo).title("Gringo's Mexican Restaurant"))
        val thai = LatLng(43.82603366107016, -111.78355921607995)
        mMap.addMarker(MarkerOptions().position(thai).title("Original Thai"))
        val millhollow = LatLng(43.82488808980921, -111.78145636421229)
        mMap.addMarker(MarkerOptions().position(millhollow).title("Millhollow Restaurant"))
        val jb = LatLng(43.826575477621034, -111.78810824256925)
        mMap.addMarker(MarkerOptions().position(jb).title("JB's"))
        val fong = LatLng(43.81887367081511, -111.7900005491961)
        mMap.addMarker(MarkerOptions().position(fong).title("New Fong's"))
        val pineapple = LatLng(43.818279447137066, -111.78877560710539)
        mMap.addMarker(MarkerOptions().position(pineapple).title("Da Pineapple Grill"))
        val sodavine = LatLng(43.82608882943077, -111.79022729687709) //15
        mMap.addMarker(MarkerOptions().position(sodavine).title("SodaVine"))
        val applebees = LatLng(43.805466565478355, -111.81247865833892)
        mMap.addMarker(MarkerOptions().position(applebees).title("Applebee's Grill + Bar"))
        val hickory = LatLng(43.83641368800152, -111.77874938467339)
        mMap.addMarker(MarkerOptions().position(hickory).title("The Hickory"))
        val curry = LatLng(43.836809423681636, -111.77836662042806)
        mMap.addMarker(MarkerOptions().position(curry).title("Curry Pizza"))
        val ochoa = LatLng(43.81824827225573, -111.78861592612908)
        mMap.addMarker(MarkerOptions().position(ochoa).title("Casa De Ochoa"))
        val fiveguys = LatLng(43.82165534947998, -111.78917535075932)
        mMap.addMarker(MarkerOptions().position(fiveguys).title("Five Guys"))



        mMap.moveCamera(CameraUpdateFactory.newLatLng(blisters))

        mMap!!.setOnMarkerClickListener(object : GoogleMap.OnMarkerClickListener {
            override fun onMarkerClick(marker: Marker): Boolean {
                val bottomsheetFragment = bottomsheet_fragment(marker.getTitle())
                bottomsheetFragment.show(supportFragmentManager, "BottomSheetDialog")

                return false
            }
        })

    }
}