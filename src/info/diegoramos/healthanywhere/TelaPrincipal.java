package info.diegoramos.healthanywhere;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TelaPrincipal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_principal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_principal, menu);
		return true;
	}

}
