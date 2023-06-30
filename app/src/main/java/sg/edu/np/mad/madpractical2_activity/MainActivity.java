package sg.edu.np.mad.madpractical2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title,description;
    Button follow,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.Title);
        description = findViewById(R.id.Description);
        follow = findViewById(R.id.Follow);
        message = findViewById(R.id.Message);

        User user = new User("Koay Yeow Teik","This is my description",0,false);

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.followed == false){
                    follow.setText("Followed");
                    user.followed = true;
                }
                else{
                    follow.setText("Follow");
                    user.followed = false;
                }
            }
        });
    }
}