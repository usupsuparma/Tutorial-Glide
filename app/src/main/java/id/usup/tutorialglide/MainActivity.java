package id.usup.tutorialglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String url = "https://cdns.klimg.com/bola.net/library/upload/21/2019/04/lionel-messi_f17c60a.jpg";
		ImageView imageView = findViewById(R.id.imageView);
		
		Glide.with(this).load(url).into(imageView);
	}
}
