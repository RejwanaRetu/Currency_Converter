package retu.currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextInput);
        textView = (TextView) findViewById(R.id.textViewOutput);

    }

    public void Action1(View view) {

        float input;
        float output;
        input = Float.parseFloat(editText.getText().toString());
        output = (float) (input*0.0121483);
        textView.setText(Float.toString(output));


    }

    public void Action2(View view) {
        float input;
        float output;
        input = Float.parseFloat(editText.getText().toString());
        output = (float) (input*82.3160);
        textView.setText(Float.toString(output));

    }


    public void Action3(View view) {
        float input;
        float output;
        input = Float.parseFloat(editText.getText().toString());
        output = (float) (input*0.783974);
        textView.setText(Float.toString(output));

    }


    public void Action4(View view) {
        float input;
        float output;
        input = Float.parseFloat(editText.getText().toString());
        output = (float) (input*1.27555);
        textView.setText(Float.toString(output));

    }


    public void Action5(View view) {
        float input;
        float output;
        input = Float.parseFloat(editText.getText().toString());
        output = (float) (input* 0.00901726);
        textView.setText(Float.toString(output));

    }


    public void Action6(View view) {
        float input;
        float output;
        input = Float.parseFloat(editText.getText().toString());
        output = (float) (input*110.898);
        textView.setText(Float.toString(output));

    }


}
