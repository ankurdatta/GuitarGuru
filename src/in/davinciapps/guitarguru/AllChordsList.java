package in.davinciapps.guitarguru;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AllChordsList extends ActionBarActivity{
	public final static String EXTRA_CHORD_NAME_SELECTED = "com.example.GuitarGuru.EXTRA_CHORD_NAME_SELECTED";
	String chordNameSelected;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_allchordslist);
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

	
	public void loadDChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button1);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadAChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button2);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadEChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button3);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadGChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button4);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadCChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button5);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadAminChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button6);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadEminChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button7);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadDminChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button8);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	public void loadA7ChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button9);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadB7ChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button10);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadC7ChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button11);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadD7ChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button12);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadE7ChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button13);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadG7ChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button14);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	public void loadFBarreChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.allChords_Button15);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	public void loadAsus2ChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.allChords_Button16);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}

	public void loadAsus4ChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.allChords_Button17);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}

	public void loadDsus2ChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.allChords_Button18);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}

	public void loadDsus4ChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.allChords_Button19);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}

	public void loadEsus4ChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.allChords_Button20);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	public void loadDSlashFChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button21);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadGSlashBChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button22);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	
	public void loadCSlashGChordDetailPage(View view){
		// Create Intent
		TextView textView;
		textView = (TextView)findViewById(R.id.allChords_Button23);
		chordNameSelected = textView.getText().toString();
		Intent intent=new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
	public void loadPowerGChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.allChords_Button24);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}

	public void loadPowerCChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.allChords_Button25);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
}
