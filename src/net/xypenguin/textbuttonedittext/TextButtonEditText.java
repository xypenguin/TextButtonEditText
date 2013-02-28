package net.xypenguin.textbuttonedittext;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextButtonEditText extends Activity implements OnClickListener {
	private EditText editText;
	private Button button;
	private TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_button_edit_text);
		
		// コンポーネントの関連付け
		editText = (EditText)this.findViewById(R.id.editText1);
		button = (Button)this.findViewById(R.id.button1);
		textView = (TextView)this.findViewById(R.id.textView1);
		
		// リスナーのセット
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO 自動生成されたメソッド・スタブ
		textView.setText(editText.getText());
		editText.getEditableText().clear();		// editTextのTextを削除
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_text_button_edit_text, menu);
		return true;
	}

}
