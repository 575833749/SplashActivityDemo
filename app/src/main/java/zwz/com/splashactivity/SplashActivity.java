package zwz.com.splashactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by 朱伟志 on 2016/11/10 0010 17:28.
 */
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent starter = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(starter);
                finish();
                overridePendingTransition(R.anim.in,R.anim.out);
            }
        },2500);
    }
}
