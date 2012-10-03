package fi.emicode.simpleloginscreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onClick(View v){
    	
    	switch(v.getId()) {
        case R.id.buttonOk:
        
        	Button ok = (Button) findViewById(R.id.buttonOk);
        	ok.setVisibility(View.GONE);
        	
        	Button cancel = (Button) findViewById(R.id.buttonCancel);
        	cancel.setVisibility(View.GONE);
        	
        	ProgressBar	progressBar = (ProgressBar) findViewById(R.id.progressBar);
        	progressBar.setVisibility(View.VISIBLE);
        	 
        break;
        case R.id.buttonCancel:
        
        	this.finish();
        	
        break;
    	}
    	
    }
    
}
