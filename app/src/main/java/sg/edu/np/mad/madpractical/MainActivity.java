package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String title = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(title,"create");
        User user = new User();
        Button followButton =findViewById(R.id.button);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.followed == false){
                    user.followed = true;
                    followButton.setText("Follwed");
                }
                else{
                    user.followed = false;
                    followButton.setText("Follow");
                }
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(title, "Start");
    }
    protected void onPause(){
        super.onPause();
        Log.v(title,"Pause");
    }
    protected void onResume(){
        super.onResume();
        Log.v(title,"Resume");
    }
}