package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Resul;
    EditText edtPepperoni, edtMussarela, edtCatupiry, edtPortuguesa;
    double Pizza1, Pizza2, Pizza3, Pizza4, soma;
    Button btnPedido;
    CheckBox cbPepperoni, cbMussarela, cbCatupiry, cbPortuguesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPepperoni = findViewById(R.id.edtPepperoni);
        edtMussarela = findViewById(R.id.edtMussarela);
        edtCatupiry = findViewById(R.id.edtCatupiry);
        edtPortuguesa = findViewById(R.id.edtPortuguesa);

        cbPepperoni = findViewById(R.id.cbPepperoni);
        cbMussarela = findViewById(R.id.cbMussarela);
        cbCatupiry = findViewById(R.id.cbCatupiry);
        cbPortuguesa = findViewById(R.id.cbPortuguesa);

        btnPedido = findViewById(R.id.btnPedido);

        Resul = findViewById(R.id.Resul);

        Pizza1 = 40.00;
        Pizza2 = 35.00;
        Pizza3 = 50.00;
        Pizza4 = 45.00;
        soma = 0.0;

        cbPepperoni.setText(cbPepperoni.getText().toString() + "\n(R$ 40,00)");
        cbMussarela.setText(cbMussarela.getText().toString() + "\n(R$ 35,00)");
        cbCatupiry.setText(cbCatupiry.getText().toString() + "\n(R$ 50,00)");
        cbPortuguesa.setText(cbPortuguesa.getText().toString() + "\n(R$ 45,00)");

    }
    public void soma (View view)
    {
      soma = 0.0;
      if (cbPepperoni.isChecked())
      {
       soma += Pizza1 * Double.parseDouble(edtPepperoni.getText().toString());
      }
        if (cbMussarela.isChecked())
        {
            soma += Pizza2 * Double.parseDouble(edtMussarela.getText().toString());
        }
        if (cbCatupiry.isChecked())
        {
            soma += Pizza3 * Double.parseDouble(edtCatupiry.getText().toString());
        }
        if (cbPortuguesa.isChecked())
        {
            soma += Pizza4 * Double.parseDouble(edtPortuguesa.getText().toString());
        }
        Resul.setText("Valor total: R$" + soma);
    }
}
