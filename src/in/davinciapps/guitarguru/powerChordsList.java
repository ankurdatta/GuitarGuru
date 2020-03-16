package in.davinciapps.guitarguru;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import in.davinciapps.guitarguru.R;

public class powerChordsList extends ActionBarActivity {
	public final static String EXTRA_CHORD_NAME_SELECTED = "com.example.GuitarGuru.EXTRA_CHORD_NAME_SELECTED";
	String chordNameSelected;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_powerchordslist);
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

	public void openAboutPage() {
		Intent intent = new Intent(this, SettingsPageGuitarGuru.class);
		startActivity(intent);
	}

	public void loadPowerGChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.power_Button1);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}

	public void loadPowerCChordDetailPage(View view) {
		// Create Intent
		TextView textView;
		textView = (TextView) findViewById(R.id.power_Button2);
		chordNameSelected = textView.getText().toString();
		Intent intent = new Intent(this, ChordDetailPage.class);
		intent.putExtra(EXTRA_CHORD_NAME_SELECTED, chordNameSelected);
		startActivity(intent);
	}
}
