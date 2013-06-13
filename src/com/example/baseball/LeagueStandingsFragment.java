package com.example.baseball;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.Inflater;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class LeagueStandingsFragment extends ListFragment implements OnItemClickListener{

	ListView list;
	LazyAdapter adapter;
	LayoutInflater ifl;
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Log.i("test","click man");
		MainActivity a = (MainActivity)getActivity();
		//a.test();
	}
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		ListView lv = getListView();
	 
		ArrayList<League> lgs = new ArrayList<League>();
		lgs.add(new League("Club a 12"));
		lgs.add(new League("Club b 212"));
		lgs.add(new League("Club c 212"));
		lgs.add(new League("Club d 132"));
		lgs.add(new League("Club e 1322"));
		lgs.add(new League("Club f 152"));
		lgs.add(new League("Club g 712"));
		lgs.add(new League("Club h 112"));
		lgs.add(new League("Club i 312"));
		lgs.add(new League("Club j 212"));
		lgs.add(new League("Club k 612"));
		lgs.add(new League("Club l 412"));
		lgs.add(new League("Club m 712"));
		adapter = new LazyAdapter(getActivity(), lgs);
		
	    lv.setAdapter(adapter);
	    lv.setOnItemClickListener(this);
	    
	    
		ArrayList<League> lgs2 = new ArrayList<League>();
		lgs.add(new League("ITALIË: Lega A - Play Offs"));
		lgs.add(new League("ISRAËL: Super Competitie - Play Offs"));
		lgs.add(new League("WERELD: Vriendschappelijk Internationaal"));
		lgs.add(new League("WERELD: Netherlands"));
		adapter = new LazyAdapter(getActivity(), lgs2);
	    ListView lv2 = (ListView)getActivity().findViewById(R.id.list2);
	    lv2.setAdapter(adapter);
	};

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		ifl = inflater;
		return inflater.inflate(R.layout.fragment_league_listview, container,false);
	}
	
	 private HashMap<String, String> map = new HashMap<String, String>();
	 
	 
	 
	 
	 //leagues.
	 
	 
	 
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
