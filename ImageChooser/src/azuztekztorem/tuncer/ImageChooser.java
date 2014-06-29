package azuztekztorem.tuncer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ImageChooser extends Activity {
	
protected static final int BILD_WAEHLEN = 1;       // BILD_WAEHLEN (GERMAN) is mean CHOOSE_IMAGE. i like to set from 0 - 1
private Button buttonChooserImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imete);
	
	buttonChooserImage = (Button)findViewById(R.id.buttonChooserImage);
	buttonChooserImage.setOnClickListener(
			new OnClickListener() {
				@Override
				public void onClick(View v) {
					waehleEinBild();		
				}
				private void waehleEinBild() {
			    Intent intent = new Intent(Intent.ACTION_GET_CONTENT);   // HIER SIND VIELE INTENTS MOEGLICH,..
				intent.setType("image/*");
				startActivityForResult(intent, BILD_WAEHLEN);   // BILD_WAEHLEN (GERMAN) is mean CHOOSE_IMAGE. 
				}
			}
			);
	}
}

//This is only the Image Chooser 
