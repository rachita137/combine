package tatastrive.application.combine;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b=findViewById( R.id.button);
        b2=findViewById( R.id.button2);

       b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rachu1=new Intent(MainActivity.this,Interst.class);
               startActivity( rachu1 );
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rachu=new Intent(MainActivity.this,Factorial.class);
                startActivity( rachu);
            }
        } );
    }
}
