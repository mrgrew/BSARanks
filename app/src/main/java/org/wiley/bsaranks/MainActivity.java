package org.wiley.bsaranks;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar bsaranksToolbar = (Toolbar) findViewById(R.id.bsaranks_toolbar);
        setSupportActionBar(bsaranksToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        displayDefault(item.getActionView());
        return super.onOptionsItemSelected(item);
    }

    public void displayDefault(View view) {
        displayTitleDesc(R.string.app_name, R.string.default_desc);
    }

    public void displayScout(View view) {
        displayTitleDesc(R.string.scout, R.string.scout_desc);
    }

    public void displayTenderfoot(View view) {
        displayTitleDesc(R.string.tenderfoot, R.string.tenderfoot_desc);
    }

    public void displaySecondClass(View view) {
        displayTitleDesc(R.string.secondclass, R.string.secondclass_desc);
    }

    public void displayFirstClass(View view) {
        displayTitleDesc(R.string.firstclass, R.string.firstclass_desc);
    }

    public void displayStarScout(View view) {
        displayTitleDesc(R.string.starscout, R.string.star_desc);
    }

    public void displayLifeScout(View view) {
        displayTitleDesc(R.string.lifescout, R.string.life_desc);
    }

    public void displayEagleScout(View view) {
        displayTitleDesc(R.string.eaglescout, R.string.eagle_desc);
    }

    private void displayTitleDesc(int title_id, int desc_id) {
        TextView title = (TextView) findViewById(R.id.rank_title);
        title.setText(getResources().getText(title_id));

        TextView desc = (TextView) findViewById(R.id.rank_description);
        desc.setText(getResources().getText(desc_id));
    }
}
