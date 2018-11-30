package com.example.narendra.testwebinar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    Button activity_button,internal_button,external_button,linear_layout,relative_layout,table_layout,absolute_layout,frame_layout,list_view, grid_view, imageswitcher,constraint_layout;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_button= (Button) findViewById(R.id.activity);
        internal_button=(Button)findViewById(R.id.internalintent);
        external_button=(Button)findViewById(R.id.externalintent);
        activity_button.setOnClickListener(this);
        internal_button.setOnClickListener(this);
        external_button.setOnClickListener(this);

        textView=(TextView)findViewById(R.id.textView);

        linear_layout= (Button) findViewById(R.id.linear_layout);
        relative_layout= (Button) findViewById(R.id.relative_layout);
        table_layout= (Button) findViewById(R.id.table_layout);
        absolute_layout= (Button) findViewById(R.id.absolute_layout);
        frame_layout= (Button) findViewById( R.id.frame_layout);
        list_view= (Button) findViewById(R.id.list_view);
        grid_view= (Button) findViewById(R.id.grid_view);
        constraint_layout= (Button) findViewById(R.id.constraint_layout);

        imageswitcher= (Button) findViewById(R.id.imageswitcher);
        imageswitcher.setOnClickListener(this);

        linear_layout.setOnClickListener(this);
        relative_layout.setOnClickListener(this);
        table_layout.setOnClickListener(this);
        absolute_layout.setOnClickListener(this);
        frame_layout.setOnClickListener(this);
        list_view.setOnClickListener(this);
        grid_view.setOnClickListener(this);
        constraint_layout.setOnClickListener(this);


        setFontType(R.id.textView,R.id.activity,R.id.internalintent,R.id.webinar2,R.id.linear_layout,R.id.relative_layout,R.id.table_layout,
                R.id.absolute_layout, R.id.frame_layout, R.id.list_view, R.id.grid_view, R.id.constraint_layout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId() /*to get clicked view id**/) {
            case R.id.activity:
                Intent intent = new Intent(this, ActivityFlow.class);
                startActivity(intent);
                break;
            case R.id.internalintent:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.inurture.co.in/"));
                        //"http://google.com"));
                startActivity(intent1);
                break;

            case R.id.externalintent:
                Intent intent2=new Intent(MainActivity.this, IntentTest.class);
                startActivity(intent2);
                break;

            case R.id.imageswitcher:
                Intent intent3=new Intent(MainActivity.this, ImageSwitcherActivity.class);
                startActivity(intent3);
                break;

        }
    }
}
