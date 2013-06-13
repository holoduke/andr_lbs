package com.example.baseball;

import java.util.zip.Inflater;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Fragment01 extends ListFragment implements OnItemClickListener{

	ListView list;
	LazyAdapter adapter;
	LayoutInflater ifl;
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Log.i("test","click man");
		MainActivity a = (MainActivity)getActivity();
		a.test();
	}
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		ListView lv = getListView();
	 
		adapter = new LazyAdapter(getActivity(), mStrings);
		
	    lv.setAdapter(adapter);
	    lv.setOnItemClickListener(this);
	};

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		ifl = inflater;
		return inflater.inflate(R.layout.fragment_listview, container,false);
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

}