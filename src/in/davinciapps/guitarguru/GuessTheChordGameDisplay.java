package in.davinciapps.guitarguru;

import in.davinciapps.guitarguru.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GuessTheChordGameDisplay extends ActionBarActivity {
	HashMap<String, Integer> chordsMap = new HashMap<String, Integer>();
	ArrayList<String> chordsName = new ArrayList<String>();
	ArrayList<Integer> chordOptions = new ArrayList<Integer>();

	int randPlayChord = 0;
	int totalChords = 25;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guessthechordgamedisplay);
		addChordsName();
		addChordsMap();
		Random r = new Random();
		randPlayChord = r.nextInt(totalChords);
		playChord(randPlayChord);
		createChordOptions(randPlayChord);
		pressGuessOptions(randPlayChord);
		pressNextButton();

	}

	public void addChordsName() {
		chordsName.add("C Chord");
		chordsName.add("D Chord");
		chordsName.add("D Minor Chord");
		chordsName.add("E Chord");
		chordsName.add("G7 Dom Chord");
		chordsName.add("F Barre Chord");
		chordsName.add("Esus4 Chord");
		chordsName.add("E Min Chord");
		chordsName.add("E7 Dom Chord");
		chordsName.add("Dsus4 Chord");
		chordsName.add("Dsus2 Chord");
		chordsName.add("D/F# Chord");
		chordsName.add("D7 Dom Chord");
		chordsName.add("C/G Chord");
		chordsName.add("C5 Power Chord");
		chordsName.add("C7 Dom Chord");
		chordsName.add("B7 Dom Chord");
		chordsName.add("Asus4 Chord");
		chordsName.add("Asus2 Chord");
		chordsName.add("A Min Chord");
		chordsName.add("A Chord");
		chordsName.add("A7 Dom Chord");
		chordsName.add("G5 Power Chord");
		chordsName.add("G/B Chord");
		chordsName.add("G Chord");

	}

	public void addChordsMap() {
		chordsMap.put(chordsName.get(0), R.raw.cchord);
		chordsMap.put(chordsName.get(1), R.raw.dchord);
		chordsMap.put(chordsName.get(2), R.raw.dminchord);
		chordsMap.put(chordsName.get(3), R.raw.echord);
		chordsMap.put(chordsName.get(4), R.raw.g7chord);
		chordsMap.put(chordsName.get(5), R.raw.fbarrechord);
		chordsMap.put(chordsName.get(6), R.raw.esus4chord);
		chordsMap.put(chordsName.get(7), R.raw.eminchord);
		chordsMap.put(chordsName.get(8), R.raw.e7chord);
		chordsMap.put(chordsName.get(9), R.raw.dsus4chord);
		chordsMap.put(chordsName.get(10), R.raw.dsus2chord);
		chordsMap.put(chordsName.get(11), R.raw.dslashfsharpchord);
		chordsMap.put(chordsName.get(12), R.raw.d7chord);
		chordsMap.put(chordsName.get(13), R.raw.cslashgchord);
		chordsMap.put(chordsName.get(14), R.raw.cpowerchord);
		chordsMap.put(chordsName.get(15), R.raw.c7chord);
		chordsMap.put(chordsName.get(16), R.raw.b7chord);
		chordsMap.put(chordsName.get(17), R.raw.asus4chord);
		chordsMap.put(chordsName.get(18), R.raw.asus2chord);
		chordsMap.put(chordsName.get(19), R.raw.aminchord);
		chordsMap.put(chordsName.get(20), R.raw.achord);
		chordsMap.put(chordsName.get(21), R.raw.a7chord);
		chordsMap.put(chordsName.get(22), R.raw.gpowerchord);
		chordsMap.put(chordsName.get(23), R.raw.gslashbchord);
		chordsMap.put(chordsName.get(24), R.raw.gchord);

	}

	public void playChord(final int randPlayChordLocal) {
		// System.out.println(chordsName.get(randPlayChordLocal));
		Button playButton;
		playButton = (Button) findViewById(R.id.chordPlayButton);
		playButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				MediaPlayer mp = MediaPlayer.create(
						GuessTheChordGameDisplay.this,
						chordsMap.get(chordsName.get(randPlayChordLocal)));
				mp.start();
			}
		});
	}

	public void createChordOptions(int randPlayChordLocal2) {
		Random r1 = new Random();
		int index = 0;
		index = r1.nextInt(3);
		// System.out.println(index);
		chordOptions.add(0);
		chordOptions.add(0);
		chordOptions.add(0);
		// System.out.println(chordOptions);
		chordOptions.set(index, randPlayChordLocal2);
		// System.out.println("Random Chord" + chordOptions.get(index));

		while (true) {

			if (index == 0) {
				chordOptions.set(1, r1.nextInt(totalChords));
				chordOptions.set(2, r1.nextInt(totalChords));
				if ((chordOptions.get(0) != chordOptions.get(1))
						&& (chordOptions.get(1) != chordOptions.get(2))
						&& (chordOptions.get(0) != chordOptions.get(2))) {
					break;
				}
			} else {
				if (index == 1) {
					chordOptions.set(0, r1.nextInt(totalChords));
					chordOptions.set(2, r1.nextInt(totalChords));
					if ((chordOptions.get(0) != chordOptions.get(1))
							&& (chordOptions.get(1) != chordOptions.get(2))
							&& (chordOptions.get(0) != chordOptions.get(2))) {
						break;
					}
				} else if (index == 2) {
					chordOptions.set(0, r1.nextInt(totalChords));
					chordOptions.set(1, r1.nextInt(totalChords));
					if ((chordOptions.get(0) != chordOptions.get(1))
							&& (chordOptions.get(1) != chordOptions.get(2))
							&& (chordOptions.get(0) != chordOptions.get(2))) {
						break;
					}
				}
			}
		}

		Button optionsChordButton1, optionsChordButton2, optionsChordButton3;
		String option1, option2, option3;

		optionsChordButton1 = (Button) findViewById(R.id.chordGuessButton1);
		optionsChordButton2 = (Button) findViewById(R.id.chordGuessButton2);
		optionsChordButton3 = (Button) findViewById(R.id.chordGuessButton3);
		option1 = chordsName.get(chordOptions.get(0));
		option2 = chordsName.get(chordOptions.get(1));
		option3 = chordsName.get(chordOptions.get(2));
		optionsChordButton1.setText(option1);
		optionsChordButton2.setText(option2);
		optionsChordButton3.setText(option3);

		// System.out.println(chordOptions);

	}

	public void pressGuessOptions(int randPlayChordLocal3) {
		Button optionButton1, optionButton2, optionButton3;
		final int red = -65536;
		final int green = -16711936;
		final TextView textFeedbackMessage;
		final String optionText1;
		final String optionText2;
		final String optionText3;
		final String correctOption;
		final String success = "That's Correct! Press NEXT";
		final String failure = "Wrong! Try again";
		optionButton1 = (Button) findViewById(R.id.chordGuessButton1);
		optionButton2 = (Button) findViewById(R.id.chordGuessButton2);
		optionButton3 = (Button) findViewById(R.id.chordGuessButton3);
		optionText1 = optionButton1.getText().toString();
		optionText2 = optionButton2.getText().toString();
		optionText3 = optionButton3.getText().toString();
		correctOption = chordsName.get(randPlayChordLocal3);
		textFeedbackMessage = (TextView) findViewById(R.id.textFeedbackMessage);

		// Option Button #1 listener
		optionButton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (optionText1.equals(correctOption)) {
					textFeedbackMessage.setText(success);
				} else {
					textFeedbackMessage.setTextColor(red);
					textFeedbackMessage.setText(failure);
				}
			}
		});

		// Option Button #2 listener
		optionButton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (optionText2.equals(correctOption)) {
					textFeedbackMessage.setTextColor(green);
					textFeedbackMessage.setText(success);
				} else {
					textFeedbackMessage.setTextColor(red);
					textFeedbackMessage.setText(failure);
				}
			}
		});

		// Option Button #3 listener
		optionButton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (optionText3.equals(correctOption)) {
					textFeedbackMessage.setTextColor(green);
					textFeedbackMessage.setText(success);
				} else {
					textFeedbackMessage.setTextColor(red);
					textFeedbackMessage.setText(failure);
				}
			}
		});
	}

	public void pressNextButton() {
		Button nextButton;
		nextButton = (Button) findViewById(R.id.nextButton);
		nextButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(getIntent());
				finish();
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

	public void openAboutPage() {
		Intent intent = new Intent(this, SettingsPageGuitarGuru.class);
		startActivity(intent);
	}
}
