package com.ms.transitionssandbox;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;

public class SearchActivityA extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_a);
		setupAnimations();

		final View guestCard = findViewById(R.id.guests_card);

		guestCard.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SearchActivityA.this, SearchActivityB.class);
				startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(SearchActivityA.this).toBundle());
			}
		});
	}

	private void setupAnimations() {
		Transition enterTransition = TransitionInflater.from(this)
			.inflateTransition(R.transition.search_a_enter_transition);
		getWindow().setEnterTransition(enterTransition);

		ChangeBounds changeBoundsTransition = new ChangeBounds();
		changeBoundsTransition.setDuration(getResources().getInteger(R.integer.anim_duration_medium));
		getWindow().setSharedElementEnterTransition(changeBoundsTransition);
	}
}
