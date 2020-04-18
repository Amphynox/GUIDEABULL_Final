package com.example.guideabull

import android.content.Intent
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.location.LocationRequest

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_maps.*
import java.net.CacheRequest
import java.util.jar.Manifest

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mGoogleMap: GoogleMap
    var mapFragment: SupportMapFragment? = null
    lateinit var mLocationRequest: LocationRequest
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn10: Button
    var mLastLocation: Location? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        btn1 = findViewById(R.id.usfLibrary)
        btn2 = findViewById(R.id.usfMsc)
        btn3 = findViewById(R.id.collegeOfEgn)
        btn4 = findViewById(R.id.mumaCollegeBsn)
        btn5 = findViewById(R.id.collegEdu)
        btn6 = findViewById(R.id.CllgofPublicHealth)
        btn7 = findViewById(R.id.schlOfMusic)
        btn8 = findViewById(R.id.hollyApt)
        btn9 = findViewById(R.id.CllgOfMedicine)
        btn10 = findViewById(R.id.Yuengling)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mGoogleMap = googleMap

        //markers for different locations on USF Campus
        val usfLibrary = LatLng(28.05952570, -82.4121888)
        val marshallStudentCenter = LatLng(28.0629412, -82.4152009)
        val collegeOfEngineering = LatLng(28.0594784, -82.4180697)
        val mumaCollegeBuisness = LatLng(28.059024, -82.4144326)
        val collegeEducation = LatLng(28.059024, -82.4144326)
        val hollyApartments = LatLng(28.0656086, -82.4143801)
        val usfSchoolOfMusic = LatLng(28.0654251, -82.4196271)
        val morsaniCollegeofMedicine = LatLng(28.0650093, -82.4239755)
        val publicHealthCollege = LatLng(28.0668049, -82.4239434)
        mGoogleMap.addMarker(MarkerOptions().position(usfLibrary).title("USF LIBRARY"))
        mGoogleMap.addMarker(MarkerOptions().position(marshallStudentCenter).title("MARSHALL STUDENT CENTER"))
        mGoogleMap.addMarker(MarkerOptions().position(collegeOfEngineering).title("ENGINEERING BUILDING II"))
        mGoogleMap.addMarker(MarkerOptions().position(mumaCollegeBuisness).title("MUMA COLLEGE OF BUSINESS"))
        mGoogleMap.addMarker(MarkerOptions().position(collegeEducation).title("COLLEGE OF EDUCATION"))
        mGoogleMap.addMarker(MarkerOptions().position(hollyApartments).title("HOLLY APARTMENTS"))
        mGoogleMap.addMarker(MarkerOptions().position(usfSchoolOfMusic).title("SCHOOL OF MUSIC"))
        mGoogleMap.addMarker(MarkerOptions().position(morsaniCollegeofMedicine).title("MORSANI COLLEGE OF MEDICINE"))
        mGoogleMap.addMarker(MarkerOptions().position(publicHealthCollege).title("COLLEGE OF PUBLIC HEALTH"))
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(usfLibrary))
        mGoogleMap.setMinZoomPreference(16.0f)
        /**Button Functionality */
        btn10.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}

        btn1.setOnClickListener{mGoogleMap.animateCamera(CameraUpdateFactory.newLatLng(usfLibrary))}
        btn2.setOnClickListener{mGoogleMap.animateCamera(CameraUpdateFactory.newLatLng(marshallStudentCenter))}
        btn3.setOnClickListener{mGoogleMap.animateCamera(CameraUpdateFactory.newLatLng(collegeOfEngineering))}
        btn4.setOnClickListener{mGoogleMap.animateCamera(CameraUpdateFactory.newLatLng(mumaCollegeBuisness))}
        btn5.setOnClickListener{mGoogleMap.animateCamera(CameraUpdateFactory.newLatLng(collegeEducation))}
        btn6.setOnClickListener{mGoogleMap.animateCamera(CameraUpdateFactory.newLatLng(publicHealthCollege))}
        btn7.setOnClickListener{mGoogleMap.animateCamera(CameraUpdateFactory.newLatLng(usfSchoolOfMusic))}
        btn8.setOnClickListener{mGoogleMap.animateCamera(CameraUpdateFactory.newLatLng(hollyApartments))}
        btn9.setOnClickListener{mGoogleMap.animateCamera((CameraUpdateFactory.newLatLng(morsaniCollegeofMedicine)))}
    }
}



