package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alamat(View view) {
        Uri uri = Uri.parse("geo:-6.979156505554034, 110.40970129908524?q=Kos Sadewa 3 No.17");
        Intent it = new Intent (Intent.ACTION_VIEW, uri);
        it.setPackage("com.google.android.apps.maps");
        startActivity(it);
    }

    public void telponsaya (View view) {
        Uri uri = Uri.parse("tel:082226418035");
        Intent it = new  Intent (Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email (View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"111202113512@mhs.dinus.ac.id"} );

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        }catch (android.content.ActivityNotFoundException ex) {

        }

    }
}