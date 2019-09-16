package com.android.tab.easytab;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
	
		try{
		TabHost th = (TabHost)findViewById(R.id.host);
		th.setup();
		
		TabHost.TabSpec spec = th.newTabSpec("Tab 1");
		spec.setContent(R.id.tab1);
		spec.setIndicator("Gallery", getResources().getDrawable(R.drawable.ic_launcher));
		Toast.makeText(this,"Tab Gallery Di klik",Toast.LENGTH_SHORT).show();
		th.addTab(spec);
		
		spec = th.newTabSpec("Tab 2");
		spec.setContent(R.id.tab2);
		spec.setIndicator("Music");
		th.addTab(spec);
		
		spec = th.newTabSpec("Tab 3");
		spec.setContent(R.id.tab3);
		spec.setIndicator("Movie");
		th.addTab(spec);
		
		}catch(Exception e)
		{
			
		}
    }
}
