package com.example.portfolioapp_kotlintask3

import android.annotation.TargetApi
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    }

    fun openGmail(view: View) {
        // sending mail intent to be handled by app or browser
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:balogunzzt@gmail.com") // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, " Hello From A New Friend!")
        intent.putExtra(Intent.EXTRA_TEXT, "Hello Azeezat!")
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    fun openGithub(view: View) {
       // val number = "+2348107471203"
        val username = "https://github.com/Azeeza2"
        // val url = "send?username=" + username
        val i = Intent(Intent.ACTION_VIEW)
        i.setData(Uri.parse(username))
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }
    }

    // Open Twitter Intent
    fun openTwitter(view: View) {

        val twitterID = "https://twitter.com/CodeHijabi"
        val i =  Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(twitterID)
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }
    }

    // Call Intent
    fun openCall(view: View) {
        val callIntent = Intent(Intent.ACTION_DIAL)
        callIntent.data = Uri.parse("tel: 08107471203")
        if (callIntent.resolveActivity(packageManager) != null) {
            startActivity(callIntent)
        }
    }


    fun openWhatsapp(view: View) {
        val number = "+2348107471203"
        val url = "https://api.whatsapp.com/send?phone=" + number
        val i = Intent(Intent.ACTION_VIEW)
        i.setData(Uri.parse(url))
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }
    }

    fun openFacebook(view: View) {
        // fb://profile/1439424696230461"
        // balogun.azeezat.56
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse("https://www.facebook.com/balogun.azeezat.56")
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }
        /*try {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1439424696230461"))
            startActivity(intent)
        } catch (e: java.lang.Exception) {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://www.facebook.com/balogun.azeezat.56")
                )
            )
        }*/
    }
    @TargetApi(Build.VERSION_CODES.DONUT)
    fun openInstagram(view: View) {
        val uri = Uri.parse("http://instagram.com/her_meekness")
        val likeIng = Intent(Intent.ACTION_VIEW, uri)

        likeIng.setPackage("com.instagram.android")

        try {
            startActivity(likeIng)
        } catch (e: ActivityNotFoundException) {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/her_meekness")
                )
            )
        }
    }
    fun openLinkedIn(view: View) {

        val linkedId = "https://www.linkedin.com/in/azeezat-balogun-40737416b/"

        val intent =  Intent(Intent.ACTION_VIEW, Uri.parse(linkedId))
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    @TargetApi(Build.VERSION_CODES.DONUT)
    fun openTelegram(view: View) {

        val i =  Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse("https://telegram.me/AzeezatB")
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }

    }
    fun openSlack(view: View) {
        // slack://user?team={TEAM_ID}&id={USER_ID}
        // https://app.slack.com/client/TUV68SBHU/UUQHJMK2N
         val slackID = "https://app.slack.com/client/TUV68SBHU/UUQHJMK2N"
        val i =  Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(slackID)
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }
    }

    fun openMessaging(view: View) {
        val to = "08107471203"
        val message = "Hello Azeezat!"
        val smsUri = Uri.parse("tel:08107471203")
        val mssgIntent = Intent(Intent.ACTION_VIEW, smsUri)
        mssgIntent.putExtra("address", to)
        mssgIntent.putExtra("sms_body", message)
        mssgIntent.setType("vnd.android-dir/mms-sms")
        if (mssgIntent.resolveActivity(packageManager) != null) {
            startActivity(mssgIntent)
        }
    }
    fun openYoutube(view: View) {
        val youtubeID = "https://youtu.be/ia7SW4_uIhk"
        val i =  Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(youtubeID)
        if (i.resolveActivity(packageManager) != null) {
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.v("MainActivity", "Application status : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("MainActivity", "Application status : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("MainActivity", "Application status : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("MainActivity", "Application status : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("MainActivity", "Application status : onDestroy")
    }
}
