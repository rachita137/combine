package tatastrive.application.combine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Interst extends AppCompatActivity {
    Button bl;
    TextView tt;
    EditText t, t1,t2;
    String s,ss,sss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_interst );

        t = findViewById( R.id.editText);
        t1 = findViewById( R.id.editText1);
        t2 = findViewById( R.id.editText2 );
        bl=findViewById( R.id.button2 );
        tt = findViewById( R.id.textView4 );

        bl.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = t.getText().toString().trim();
                ss = t1.getText().toString().trim();
                sss = t2.getText().toString().trim();

                int a = Integer.parseInt( s );
                int b= Integer.parseInt( ss );
                int c=Integer.parseInt( sss );


                int j =a*b*c/100;
                //System.out.println("Output"+j);
                tt.setText(String.valueOf(j));
              //  Toast.makeText( Interst.this, "Simple Interst:"+j, Toast.LENGTH_SHORT ).show();


            }

        } );

    }
}
