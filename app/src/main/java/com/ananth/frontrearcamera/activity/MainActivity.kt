package com.ananth.frontrearcamera.activity

/**
 * Created by ananthrajsingh on May 8, 2020
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ananth.frontrearcamera.R
import com.ananth.frontrearcamera.fragment.CameraFragment

/**
 * TODO 1 Explore the Kotlin code to setup camera2 API
 * TODO 2 Create the custom view which will show the Preview of camera
 * TODO 3 Add one of this view to the layout file
 * TODO 4 Show Rear camera preview in this view
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedInstanceState ?: supportFragmentManager.beginTransaction()
            .replace(R.id.container, CameraFragment.newInstance())
            .commit()
    }
}
