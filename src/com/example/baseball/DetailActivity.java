











package com.example.baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ViewFlipper;

public class DetailActivity extends Activity implements OnClickListener, OnItemClickListener {
	
	ListView list;
	LazyAdapter adapter;
	ViewFlipper flipper;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        
        Log.i("test","starting appppppp2");
    }
    
	private void onClick(MainActivity mainActivity) {
		// TODO Auto-generated method stub
		Log.i("test", "click2");
	}

	@Override
	public void onClick(View arg0) {
		Log.i("test", "click");
		// TODO Auto-generated method stub
		//flipper.showNext();
	}

    
 
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public String readScoresFeed() {
        StringBuilder builder = new StringBuilder();
        HttpClient client = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://twitter.com/statuses/user_timeline/vogella.json");
        try {
          HttpResponse response = client.execute(httpGet);
          StatusLine statusLine = response.getStatusLine();
          int statusCode = statusLine.getStatusCode();
          if (statusCode == 200) {
            HttpEntity entity = response.getEntity();
            InputStream content = entity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(content));
            String line;
            while ((line = reader.readLine()) != null) {
              builder.append(line);
            }
          } else {
          //  Log.e(ParseJSON.class.toString(), "Failed to download file");
          }
        } catch (ClientProtocolException e) {
          e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
        return builder.toString();
      }
    
    
    private String[] mStrings={
            "http://a3.twimg.com/profile_images/670625317/aam-logo-v3-twitter.png",
            "http://a3.twimg.com/profile_images/740897825/AndroidCast-350_normal.png",
            "http://a3.twimg.com/profile_images/121630227/Droid_normal.jpg",
            "http://a1.twimg.com/profile_images/957149154/twitterhalf_normal.jpg",
            "http://a1.twimg.com/profile_images/97470808/icon_normal.png",
            "http://a3.twimg.com/profile_images/511790713/AG.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png",
            "http://a3.twimg.com/profile_images/72774055/AndroidHomme-LOGO_normal.jpg",
            "http://a1.twimg.com/profile_images/349012784/android_logo_small_normal.jpg",
            "http://a1.twimg.com/profile_images/841338368/ea-twitter-icon.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png",
            "http://a1.twimg.com/profile_images/850960042/elandroidelibre-logo_300x300_normal.jpg",
            "http://a1.twimg.com/profile_images/655119538/andbook.png",
            "http://a3.twimg.com/profile_images/768060227/ap4u_normal.jpg",
            "http://a1.twimg.com/profile_images/74724754/android_logo_normal.png",
            "http://a3.twimg.com/profile_images/681537837/SmallAvatarx150_normal.png",
            "http://a1.twimg.com/profile_images/63737974/2008-11-06_1637_normal.png",
            "http://a3.twimg.com/profile_images/548410609/icon_8_73.png",
            "http://a1.twimg.com/profile_images/612232882/nexusoneavatar_normal.jpg",
            "http://a1.twimg.com/profile_images/213722080/Bugdroid-phone_normal.png",
            "http://a1.twimg.com/profile_images/645523828/OT_icon_090918_android_normal.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet.png",
            "http://a1.twimg.com/profile_images/850960042/elandroidelibre-logo_300x300_normal.jpg",
            "http://a1.twimg.com/profile_images/655119538/andbook_normal.png",
            "http://a3.twimg.com/profile_images/511790713/AG_normal.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png",
            "http://a3.twimg.com/profile_images/72774055/AndroidHomme-LOGO_normal.jpg",
            "http://a1.twimg.com/profile_images/349012784/android_logo_small_normal.jpg",
            "http://a1.twimg.com/profile_images/841338368/ea-twitter-icon_normal.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png",
            "http://a1.twimg.com/profile_images/850960042/elandroidelibre-logo_300x300.jpg",
            "http://a1.twimg.com/profile_images/655119538/andbook_normal.png",
            "http://a3.twimg.com/profile_images/511790713/AG_normal.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png",
            "http://a3.twimg.com/profile_images/121630227/Droid.jpg",
            "http://a1.twimg.com/profile_images/957149154/twitterhalf_normal.jpg",
            "http://a1.twimg.com/profile_images/97470808/icon_normal.png",
            "http://a3.twimg.com/profile_images/511790713/AG_normal.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man.png",
            "http://a3.twimg.com/profile_images/72774055/AndroidHomme-LOGO_normal.jpg",
            "http://a1.twimg.com/profile_images/349012784/android_logo_small_normal.jpg",
            "http://a1.twimg.com/profile_images/841338368/ea-twitter-icon_normal.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet.png",
            "http://a3.twimg.com/profile_images/670625317/aam-logo-v3-twitter_normal.png",
            "http://a3.twimg.com/profile_images/740897825/AndroidCast-350_normal.png",
            "http://a3.twimg.com/profile_images/121630227/Droid_normal.jpg",
            "http://a1.twimg.com/profile_images/957149154/twitterhalf_normal.jpg",
            "http://a1.twimg.com/profile_images/97470808/icon.png",
            "http://a3.twimg.com/profile_images/511790713/AG_normal.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png",
            "http://a3.twimg.com/profile_images/72774055/AndroidHomme-LOGO_normal.jpg",
            "http://a1.twimg.com/profile_images/349012784/android_logo_small_normal.jpg",
            "http://a1.twimg.com/profile_images/841338368/ea-twitter-icon.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png",
            "http://a1.twimg.com/profile_images/850960042/elandroidelibre-logo_300x300_normal.jpg",
            "http://a1.twimg.com/profile_images/655119538/andbook_normal.png",
            "http://a3.twimg.com/profile_images/768060227/ap4u_normal.jpg",
            "http://a1.twimg.com/profile_images/74724754/android_logo.png",
            "http://a3.twimg.com/profile_images/681537837/SmallAvatarx150_normal.png",
            "http://a1.twimg.com/profile_images/63737974/2008-11-06_1637_normal.png",
            "http://a3.twimg.com/profile_images/548410609/icon_8_73_normal.png",
            "http://a1.twimg.com/profile_images/612232882/nexusoneavatar_normal.jpg",
            "http://a1.twimg.com/profile_images/213722080/Bugdroid-phone_normal.png",
            "http://a1.twimg.com/profile_images/645523828/OT_icon_090918_android.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png",
            "http://a1.twimg.com/profile_images/850960042/elandroidelibre-logo_300x300_normal.jpg",
            "http://a1.twimg.com/profile_images/655119538/andbook.png",
            "http://a3.twimg.com/profile_images/511790713/AG_normal.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png",
            "http://a3.twimg.com/profile_images/72774055/AndroidHomme-LOGO_normal.jpg",
            "http://a1.twimg.com/profile_images/349012784/android_logo_small_normal.jpg",
            "http://a1.twimg.com/profile_images/841338368/ea-twitter-icon.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png",
            "http://a1.twimg.com/profile_images/850960042/elandroidelibre-logo_300x300_normal.jpg",
            "http://a1.twimg.com/profile_images/655119538/andbook_normal.png",
            "http://a3.twimg.com/profile_images/511790713/AG_normal.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png",
            "http://a3.twimg.com/profile_images/121630227/Droid_normal.jpg",
            "http://a1.twimg.com/profile_images/957149154/twitterhalf.jpg",
            "http://a1.twimg.com/profile_images/97470808/icon_normal.png",
            "http://a3.twimg.com/profile_images/511790713/AG_normal.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png",
            "http://a3.twimg.com/profile_images/72774055/AndroidHomme-LOGO_normal.jpg",
            "http://a1.twimg.com/profile_images/349012784/android_logo_small.jpg",
            "http://a1.twimg.com/profile_images/841338368/ea-twitter-icon_normal.png",
            "http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png"
    };

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Log.i("test","clicker de click");
		flipper.showNext();
	}

    
}
