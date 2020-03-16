package in.davinciapps.guitarguru;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import in.davinciapps.guitarguru.R;

public class PracticeSessionsChordTransitions extends ActionBarActivity {
	public final static String EXTRA_CHORDS_ARRAY = "com.example.GuitarGuru.EXTRA_CHORDS_ARRAY";
	public final static String EXTRA_DELAY = "com.example.GuitarGuru.EXTRA_DELAY";
	public final static String EXTRA_RANDOMIZE = "com.example.GuitarGuru.EXTRA_RANDOMIZE";
	public final static String EXTRA_CHORDS_ARRAYLIST = "com.example.GuitarGuru.EXTRA_CHORDS_ARRAYLIST";
	EditText chord1, chord2, chord3, chord4, chord5, chord6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_practicesessionschordtransitions);

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

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub
		super.onWindowFocusChanged(hasFocus);
		View t = (View) findViewById(R.id.relativeLayout_PracticeSessionsForm);
		int editTextWidth = (t.getWidth() - 30) / 2;

		// System.out.println(editTextWidth+" WIDTH");
		chord1 = (EditText) findViewById(R.id.chordTransition_text1);
		chord1.setWidth(editTextWidth);

		chord2 = (EditText) findViewById(R.id.chordTransition_text2);
		chord2.setWidth(editTextWidth);

		chord3 = (EditText) findViewById(R.id.chordTransition_text3);
		chord3.setWidth(editTextWidth);

		chord4 = (EditText) findViewById(R.id.chordTransition_text4);
		chord4.setWidth(editTextWidth);

		chord5 = (EditText) findViewById(R.id.chordTransition_text5);
		chord5.setWidth(editTextWidth);

		chord6 = (EditText) findViewById(R.id.chordTransition_text6);
		chord6.setWidth(editTextWidth);
	}

	// @SuppressWarnings("-access")
	public void startPracticeSession(View view) {
		// create an Intent
		Intent intent = new Intent(this, GeneratePracticeSessionDisplay.class);
		String chordString[] = new String[6];

		chordString[0] = chord1.getText().toString();

		chordString[1] = chord2.getText().toString();

		chordString[2] = chord3.getText().toString();

		chordString[3] = chord4.getText().toString();

		chordString[4] = chord5.getText().toString();

		chordString[5] = chord6.getText().toString();

		EditText delaySecs = (EditText) findViewById(R.id.chordTransition_text7);
		String delaySecsString = delaySecs.getText().toString();
		int delay = 0;
		if (delaySecsString.matches("")) {

		} else {
			delay = Integer.parseInt(delaySecsString.toString());
		}
		// System.out.println(delay);
		int count = 0;
		CheckBox checkRandomize = (CheckBox) findViewById(R.id.chordRamdomizerCheck);
		boolean isRandomize = false;

		if (checkRandomize.isChecked()) {
			isRandomize = true;
		}
		// Put the chord Array in the Intent

		intent.putExtra(EXTRA_CHORDS_ARRAY, chordString);
		intent.putExtra(EXTRA_DELAY, delaySecsString);
		intent.putExtra(EXTRA_RANDOMIZE, isRandomize);

		for (int j = 0; j < 6; j++) {
			if (chordString[j].length() > 0) {
				count++;

			}
		}
		if (count <= 1) {
			Toast toast1 = Toast.makeText(this, "Enter atleast two Chords !",
					Toast.LENGTH_SHORT);
			toast1.show();
		} else {
			if (delay > 10) {
				Toast toast = Toast.makeText(this,
						"Delay cannot be above 10 secs !", Toast.LENGTH_SHORT);
				toast.show();

			} else {
				if (delaySecsString.matches("")) {
					Toast toast7 = Toast.makeText(this,
							"Transition Delay can't be empty !",
							Toast.LENGTH_SHORT);
					toast7.show();
				} else {
					startActivity(intent);
				}
			}
		}

	}

}
