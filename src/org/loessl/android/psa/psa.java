package org.loessl.android.psa;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Psa extends Activity implements OnClickListener {
	
	private int mAvg = 0;
	private int mCounter = 0;
	
	private EditText mETAvg;
	private Button mBtn1, mBtn2, mBtn3, mBtn4, mBtn5, mBtn6, mBtn7, mBtn8, mBtn9, mBtn10;
	private Button mBtnCA;
	private Button mBtnCL;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mETAvg = (EditText) findViewById(R.id.avgResult);
        mBtnCA = (Button) findViewById(R.id.btnCa);
        mBtnCL = (Button) findViewById(R.id.btnCl);
        
        mBtnCA.setOnClickListener(this);
        mBtnCL.setOnClickListener(this);
        
        mBtn1 = (Button) findViewById(R.id.button1);
        mBtn2 = (Button) findViewById(R.id.button2);
        mBtn3 = (Button) findViewById(R.id.button3);
        mBtn4 = (Button) findViewById(R.id.button4);
        mBtn5 = (Button) findViewById(R.id.button5);
        mBtn6 = (Button) findViewById(R.id.button6);
        mBtn7 = (Button) findViewById(R.id.button7);
        mBtn8 = (Button) findViewById(R.id.button8);
        mBtn9 = (Button) findViewById(R.id.button9);
        mBtn10 = (Button) findViewById(R.id.button10);
        
        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
        mBtn6.setOnClickListener(this);
        mBtn7.setOnClickListener(this);
        mBtn8.setOnClickListener(this);
        mBtn9.setOnClickListener(this);
        mBtn10.setOnClickListener(this);
    }

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.button1:
			mAvg += 1;
			break;
		case R.id.button2:
			mAvg += 2;
			break;
		case R.id.button3:
			mAvg += 3;
			break;
		case R.id.button4:
			mAvg += 4;
			break;
		case R.id.button5:
			mAvg += 5;
			break;
		case R.id.button6:
			mAvg += 6;
			break;
		case R.id.button7:
			mAvg += 7;
			break;
		case R.id.button8:
			mAvg += 8;
			break;
		case R.id.button9:
			mAvg += 9;
			break;
		case R.id.button10:
			mAvg += 10;
			break;
		case R.id.btnCa:
			mCounter = 0;
			mAvg = 0;
			mETAvg.setText("none yet");
			break;
		default:
			Log.i("Not implemented", "This Button has to be implemented");
			break;
		}
		if ( mAvg == 0) {
			return;
		}
		mCounter += 1;
		mETAvg.setText(Integer.toString(Math.round( mAvg / mCounter)));
	}
}