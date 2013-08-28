package org.briansimulator.briandroidtemplate;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button runButton = (Button) findViewById(R.id.runButton);
        runButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSimulation();
            }
        });

    }

    protected void startSimulation() {
        CodegenTemplate rstest = new CodegenTemplate();
        rstest.setAppContext(getApplicationContext());
        TextView status = (TextView)findViewById(R.id.statusTextView);
        status.setText("Setting up simulation ...");
        //status.refreshDrawableState();
        rstest.setup();
        status.append(" DONE!\n");
        status.append("Running simulation ...");
        //status.invalidate();
        rstest.run();
        status.append("SIMULATION FINISHED!\n");
        //status.invalidate();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
