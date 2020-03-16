package in.davinciapps.guitarguru;

import in.davinciapps.guitarguru.R;
import java.util.HashMap;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChordDetailPage extends ActionBarActivity {
	
	HashMap<String, Integer> chordImageMap = new HashMap<String, Integer>();
	HashMap<String, Integer> chordSoundMap = new HashMap<String, Integer>();
	HashMap<String, Integer> chordClassMap = new HashMap<String, Integer>();
	String selectedChord;

	ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chorddetailpage);
		createChordImageMap();
		createChordSoundMap();
		Intent intent = getIntent();
		Bundle bundle=intent.getExtras();
		selectedChord = bundle.getString("com.example.GuitarGuru.EXTRA_CHORD_NAME_SELECTED");
		imageView = (ImageView)findViewById(R.id.chordImageView1);
		imageView.setImageResource(chordImageMap.get(selectedChord));
		Button playButton;
		playButton = (Button) findViewById(R.id.chordDetailPage_playButton);
		playButton.setOnClickListener(new View.OnClickListener() {
			 @Override
			 public void onClick(View v) {
			  MediaPlayer mp = MediaPlayer.create(ChordDetailPage.this, chordSoundMap.get(selectedChord));
			  mp.start();
			 }
			});
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

	
	public void createChordImageMap(){
		chordImageMap.put("D Chord", R.drawable.d);
		chordImageMap.put("A Chord", R.drawable.a);
		chordImageMap.put("E Chord", R.drawable.e);
		chordImageMap.put("C Chord", R.drawable.c);
		chordImageMap.put("G Chord", R.drawable.g);
		chordImageMap.put("A Min Chord", R.drawable.amin);
		chordImageMap.put("G7 Dom Chord", R.drawable.g7);
		chordImageMap.put("A7 Dom Chord", R.drawable.a7);
		chordImageMap.put("Asus2 Chord", R.drawable.asus2);
		chordImageMap.put("Asus4 Chord", R.drawable.asus4);
		chordImageMap.put("B7 Dom Chord", R.drawable.b7);
		chordImageMap.put("C7 Dom Chord", R.drawable.c7);
		chordImageMap.put("C5 Power Chord", R.drawable.cpower);
		chordImageMap.put("C/G Chord", R.drawable.cslashg);
		chordImageMap.put("D7 Dom Chord", R.drawable.d7);
		chordImageMap.put("D/F# Chord", R.drawable.dslashfsharp);
		chordImageMap.put("Dsus2 Chord", R.drawable.dsus2);
		chordImageMap.put("Dsus4 Chord", R.drawable.dsus4);
		chordImageMap.put("E7 Dom Chord", R.drawable.e7);
		chordImageMap.put("Esus4 Chord", R.drawable.esus4);
		chordImageMap.put("F Barre Chord", R.drawable.f);
		chordImageMap.put("G5 Power Chord", R.drawable.gpower);
		chordImageMap.put("G/B Chord", R.drawable.gslashb);
		chordImageMap.put("D Min Chord", R.drawable.dmin);
		chordImageMap.put("E Min Chord", R.drawable.emin);
		
	}
	
	public void createChordSoundMap(){
		chordSoundMap.put("D Chord", R.raw.dchord);
		chordSoundMap.put("C Chord", R.raw.cchord);
		chordSoundMap.put("E Chord", R.raw.echord);
		chordSoundMap.put("D Min Chord", R.raw.dminchord);
		chordSoundMap.put("A Chord", R.raw.achord);
		chordSoundMap.put("G Chord", R.raw.gchord);
		chordSoundMap.put("A Min Chord", R.raw.aminchord);
		chordSoundMap.put("E Min Chord", R.raw.eminchord);
		chordSoundMap.put("G7 Dom Chord", R.raw.g7chord);
		chordSoundMap.put("A7 Dom Chord", R.raw.a7chord);
		chordSoundMap.put("Asus2 Chord", R.raw.asus2chord);
		chordSoundMap.put("Asus4 Chord", R.raw.asus2chord);
		chordSoundMap.put("B7 Dom Chord", R.raw.b7chord);
		chordSoundMap.put("C7 Dom Chord", R.raw.c7chord);
		chordSoundMap.put("C5 Power Chord", R.raw.cpowerchord);
		chordSoundMap.put("C/G Chord", R.raw.cslashgchord);
		chordSoundMap.put("D7 Dom Chord", R.raw.d7chord);
		chordSoundMap.put("D/F# Chord", R.raw.dslashfsharpchord);
		chordSoundMap.put("Dsus2 Chord", R.raw.dsus2chord);
		chordSoundMap.put("Dsus4 Chord", R.raw.dsus4chord);
		chordSoundMap.put("E7 Dom Chord", R.raw.e7chord);
		chordSoundMap.put("Esus4 Chord", R.raw.esus4chord);
		chordSoundMap.put("F Barre Chord", R.raw.fbarrechord);
		chordSoundMap.put("G5 Power Chord", R.raw.gpowerchord);
		chordSoundMap.put("G/B Chord", R.raw.gslashbchord);
		
		
	}
	
}
