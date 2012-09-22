package com.example.projectstyle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        Button btnCamera = (Button) findViewById(R.id.buttonCamera);
        btnCamera.setOnClickListener(this);
               
    }

    
    public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonCamera:
			Intent cameraIntent = new Intent(MainActivity.this, CameraActivity.class);
			startActivity(cameraIntent);
			break;
		default:
			break;
		}

	}
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
   
}

