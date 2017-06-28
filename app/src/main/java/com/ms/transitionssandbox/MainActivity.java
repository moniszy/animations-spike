package com.ms.transitionssandbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final View searchBar = findViewById(R.id.super_search_bar_container);

		searchBar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SearchActivityA.class);
				ActivityOptionsCompat options = ActivityOptionsCompat.
					makeSceneTransitionAnimation(MainActivity.this,
						searchBar,
						ViewCompat.getTransitionName(searchBar));
				startActivity(intent, options.toBundle());
			}
		});
	}
}
