package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class OtherActivity extends AppCompatActivity {
	private final SimpleDateFormat mDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);

	private TextView mOutputTextView;
	private Button mWorkButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);

		mOutputTextView = (TextView) findViewById(R.id.view_output);
		mWorkButton = (Button) findViewById(R.id.view_work);

		mWorkButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(final View v) {
				mOutputTextView.setText(mDateFormat.format(Calendar.getInstance().getTime()));
			}
		});
	}
}
