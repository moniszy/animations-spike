package com.ms.transitionssandbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;

public class SearchActivityB extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_b);
		setupAnimations();
	}

	private void setupAnimations() {
		Transition enterTransition = TransitionInflater.from(this)
			.inflateTransition(R.transition.search_b_enter_transition);
		getWindow().setEnterTransition(enterTransition);
	}
}
