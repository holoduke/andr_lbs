package com.example.baseball;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class LeagueDetailFragment extends ListFragment implements OnItemClickListener {

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		ListView lv = getListView();
	 
		ArrayList<League> lgs = new ArrayList<League>();
		lgs.add(new League("Standings"));
		lgs.add(new League("Live scores"));
		lgs.add(new League("Schedule"));
		LazyAdapter adapter = new LazyAdapter(getActivity(), lgs);
		
	    lv.setAdapter(adapter);
	    lv.setOnItemClickListener(this);
	    
	};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.fragment_league_detail, container,false);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		MainActivity a = (MainActivity)getActivity();
		a.showLeagueStandings();
		
	}
}
