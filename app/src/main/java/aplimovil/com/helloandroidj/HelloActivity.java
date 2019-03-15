/**
 *
 * Applications development for mobile devices
 * -------------------------------------------
 *
 * This HelloWorld example implements an application that
 * simply displays a button that updates the current date and time
 * when pushed without using XML Layouts.
 *
 * @author Francisco Martinez
 *
 *
 */


package aplimovil.com.helloandroidj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class HelloActivity extends AppCompatActivity implements View.OnClickListener {

    //Set up a Button variable; it will cover the full screen
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Make a Button instance
        button = new Button(this);
        //Set the listener for listening button events (onClick in this case)
        button.setOnClickListener(this);
        //call this method to update the date and time on the button text
        updateTime();
        //Sets the interface for the activity; for this case, a button will fill the whole screen
        setContentView(button);
    }

    /**
     * Method to update the button text with current date and time
     */
    private void updateTime() {
        button.setText(new Date().toString());
    }

    /**
     * Method that listens the button click event. When user clicks the button, it updates the button text
     *
     * @param view the view that generates the event (the button)
     */
    @Override
    public void onClick(View view) {
        updateTime();
    }
}
