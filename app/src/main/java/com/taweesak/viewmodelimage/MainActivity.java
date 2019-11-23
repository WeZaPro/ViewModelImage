package com.taweesak.viewmodelimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mText;
    ImageView mImageView;
    Button mButton;

    MyViewModel mViewModel;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = findViewById(R.id.my_text);
        mImageView = findViewById(R.id.my_image);
        mButton = findViewById(R.id.my_button);

        mViewModel = ViewModelProviders.of(this).get(MyViewModel.class);


        if (mViewModel.getText() != null) {
            mText.setText(mViewModel.getText());
        }

        if (mViewModel.getImage() != null) {
            mImageView.setImageDrawable(mViewModel.getImage());
        }
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setText("Happy Coding...");
                mImageView.setImageDrawable(getResources().getDrawable(R.drawable.my_image2));
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        mViewModel.setText(mText.getText().toString());
        mViewModel.setImage(mImageView.getDrawable());

    }
}
