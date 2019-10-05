package id.ac.poliban.mi.ktm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edNama = findViewById(R.id.edNama);
        EditText edNim = findViewById(R.id.edNim);
        EditText edProdi = findViewById(R.id.edProdi);
        EditText edAlamat = findViewById(R.id.edAlamat);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

btClear.setOnClickListener(view -> {
    edNama.setText("");
    edNim.setText("");
    edProdi.setText("");
    edAlamat.setText("");
    edNama.requestFocus();
    Toast.makeText(this, "MAMPUS LO DATA LO HABIS ", Toast.LENGTH_SHORT).show();
});
btLogin.setOnClickListener( view -> {
    edNama.setText("");
    edNim.setText("");
    edProdi.setText("");
    edAlamat.setText("");
    edNama.requestFocus();
    Toast.makeText(this, "SELAMAT ANDA BERHASSSSSSSSSIL ", Toast.LENGTH_SHORT).show();
});

    }
}
