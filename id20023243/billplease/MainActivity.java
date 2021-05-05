package sg.edu.rp.c346.id20023243.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    TextView tvAmount;
    EditText etAmount;
    TextView tvPax;
    EditText etPax;
    ToggleButton tgSvs;
    ToggleButton tgGst;
    TextView tvDiscount;
    EditText etDiscount;
    RadioButton rbCash;
    RadioButton rbPaynow;
    RadioGroup rgPaymentMode;
    Button btnSplit;
    Button btnReset;
    TextView tvTotalBill;
    TextView tvEachPay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAmount = findViewById(R.id.textViewAmount);
        etAmount = findViewById(R.id.editTextNumberAmount);
        tvPax = findViewById(R.id.textViewNumberOfPax);
        etPax = findViewById(R.id.editTextNumberOfPax);
        tgSvs = findViewById(R.id.toggleButtonSvs);
        tgGst = findViewById(R.id.toggleButtonGst);
        tvDiscount = findViewById(R.id.textViewDiscount);
        etDiscount = findViewById(R.id.editTextNumberDiscount);
        rbCash = findViewById(R.id.radioButtonCash);
        rbPaynow = findViewById(R.id.radioButtonPaynow);
        rgPaymentMode = findViewById(R.id.radioGroupPaymentMode);
        btnSplit = findViewById(R.id.buttonSplit);
        btnReset = findViewById(R.id.buttonReset);
        tvTotalBill = findViewById(R.id.textViewDisplayTotalBill);
        tvEachPay = findViewById(R.id.textViewDisplayEachPays);
        Double newAmount = Double.parseDouble(tvAmount.getText().toString());

        // integer = parse integer(    .getText().toString())
        // for reset use setText to set fields to ""
        //digits = "1234567890" to let number keyboard appear


        // create new variable newAmount and assign tvAmount value to it

        tgSvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tgSvs.isChecked()) {
                     newAmount = newAmount * 1.1;

                }
            }
        });

        tgGst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tgGst.isChecked()) {
                    newAmount = newAmount *1.07;
                }

            }
        });





    }
}