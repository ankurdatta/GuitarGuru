package in.davinciapps.guitarguru;

import in.davinciapps.guitarguru.R;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class GeneratePracticeSessionDisplay extends ActionBarActivity implements
		OnClickListener {

	final Handler myHandler = new Handler();

	// final Handler pauseHandler = new Handler();
	int i = 0, sequence = 0;
	String s;
	int del = 0;
	Timer myTimer = new Timer();

	TextView textView;
	Button pause;
	boolean randomize = false;
	ArrayList<String> chords = new ArrayList<String>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_generatepracticesessiondisplay);

		// Receive all intents and assign
		Intent intent = getIntent();
		String chordlist[] = new String[6];
		String delay;
		chordlist = intent
				.getStringArrayExtra(PracticeSessionsChordTransitions.EXTRA_CHORDS_ARRAY);
		delay = intent
				.getStringExtra(PracticeSessionsChordTransitions.EXTRA_DELAY);
		randomize = intent.getBooleanExtra(
				PracticeSessionsChordTransitions.EXTRA_RANDOMIZE, randomize);
		del = Integer.parseInt(delay);

		for (int j = 0; j < 6; j++) {
			if (chordlist[j].length() > 0) {
				chords.add(chordlist[j]);
			}
		}

		textView = (TextView) findViewById(R.id.textview_1);

		// textView.setText(Integer.toString(k));
		// textView.setText("k");
		// Timer myTimer = new Timer();
		// Keep screen on
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		myTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				UpdateGUI();
			}
		}, 0, del * 1000);
		pause = (Button) findViewById(R.id.button_pause_resume);

		// OnClickListener myhandler1 = null;
		pause.setOnClickListener(this);

	}

	public void onClick(View v) {
		String t = (String) pause.getText();
		if (t.equals("Pause")) {
			pause.setText("Resume");
			myTimer.cancel();
		} else {
			Intent intent = getIntent();
			finish();
			startActivity(intent);
		}
	}

	private void UpdateGUI() {
		// tv.setText(String.valueOf(i));
		myHandler.post(myRunnable);
	}

	final Runnable myRunnable = new Runnable() {
		public void run() {
			if (randomize == true) {
				Random r = new Random();
				String a;
				int rand = r.nextInt(chords.size());
				a = chords.get(rand);
				// textView.setWidth(50);
				// textView.setHeight(70);
				textView.setText(a);
			} else {
				if (sequence == chords.size()) {
					sequence = 0;
				}
				String b;
				b = chords.get(sequence);
				sequence++;
				// textView.setWidth(50);
				// textView.setHeight(70);
				textView.setText(b);

			}
		}
	};

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