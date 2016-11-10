package com.example.listactivity;

import java.util.ArrayList;

import com.example.listactivity.adapter.CustomAdapter;
import com.example.listactivity.dao.PeopleDao;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	ArrayList<PeopleDao> arr = new ArrayList<PeopleDao>();
	ListView listview;
	CustomAdapter mCustomadapter;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
		arr = getData();
		
		listview = (ListView) findViewById(R.id.listview);
		mCustomadapter = new CustomAdapter(MainActivity.this,arr);
		
		
	}

	
	private ArrayList<PeopleDao> getData(){
		
		ArrayList<PeopleDao> itemarr = new ArrayList<PeopleDao>();
		
		for(int i =0; i <20;i++){
			PeopleDao item = new PeopleDao();
			item.setAddr("andong");
			item.setAge(20);
			item.setName("hong gil dong");
			item.setOffice("ANU");
			item.setPhone_number("010-1111-1111");
			item.setPic(getResources().getDrawable(R.drawable.ic_launcher));
			
			itemarr.add(item);
		
		}
		
		return arr;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
