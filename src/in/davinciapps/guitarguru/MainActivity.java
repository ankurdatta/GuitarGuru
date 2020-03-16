package in.davinciapps.guitarguru;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import in.davinciapps.guitarguru.R;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu_guessthechordgamedisplay, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_about:
	            openAboutPage();
	            return true;
	        
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	public void openAboutPage(){
		Intent intent=new Intent(this, SettingsPageGuitarGuru.class);
		startActivity(intent);
	}
	
	public void practiceSessionsGuessTheChord(View view){
		// Create Intent
		Intent intent=new Intent(this, GuessTheChordGameDisplay.class);
		startActivity(intent);
	}
	public void practiceSessionsChordTransitions(View view){
		// Create Intent
		Intent intent=new Intent(this, PracticeSessionsChordTransitions.class);
		startActivity(intent);
	}
	public void allChordsList(View view){
		// Create Intent
		Intent intent=new Intent(this, AllChordsList.class);
		startActivity(intent);
	}
	public void basicEightOpenChords(View view){
		// Create Intent
		Intent intent=new Intent(this, BasicEightOpenChordsList.class);
		startActivity(intent);
	}
	public void dominantSeventhOpenChords(View view){
		// Create Intent
		Intent intent=new Intent(this, DominantSeventhOpenChordsList.class);
		startActivity(intent);
	}
	public void fChordForBeginners(View view){
		// Create Intent
		Intent intent=new Intent(this, fChordForBeginnersList.class);
		startActivity(intent);
	}
	public void suspendedOpenChords(View view){
		// Create Intent
		Intent intent=new Intent(this, SuspendedOpenChordsList.class);
		startActivity(intent);
	}
	public void commonOpenSlashChords(View view){
		// Create Intent
		Intent intent=new Intent(this, CommonOpenSlashChordsList.class);
		startActivity(intent);
	}
	public void powerChords(View view){
		// Create Intent
		Intent intent=new Intent(this, powerChordsList.class);
		startActivity(intent);
	}
}
