package activityspy.mattw95.washington.edu.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Main Activity", "onCreate event fired")
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        super.onStart()
        Log.i("Main Activity", "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Main Activity", "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Main Activity", "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Main Activity", "onStop event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Main Activity", "onRestart event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Main Activity", "onDestroy event fired")
        Log.e("Main Activity", "We're going down captain!")
    }

}
