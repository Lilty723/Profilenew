package com.example.profilenew.ui.theme;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

        EditText editTextName, editTextAge, editTextEmail;
        Button buttonSubmit;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editTextName = findViewById(R.id.editTextName);
            editTextAge = findViewById(R.id.editTextAge);
            editTextEmail = findViewById(R.id.editTextEmail);
            buttonSubmit = findViewById(R.id.buttonSubmit);

            buttonSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = editTextName.getText().toString();
                    String age = editTextAge.getText().toString();
                    String email = editTextEmail.getText().toString();

                    // You can add validation here to ensure all fields are filled

                    // Store profile information (You can use SharedPreferences, SQLite, or any other storage method)
                    // For simplicity, I'll just show a toast message with the entered information
                    String message = "Name: " + name + "\nAge: " + age + "\nEmail: " + email;
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                    // Clear EditText fields after submission
                    editTextName.setText("");
                    editTextAge.setText("");
                    editTextEmail.setText("");
                }
            });
        }
    }

}
