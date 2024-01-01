package com.example.softwareengineering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AP_Chairs extends AppCompatActivity {
    Double seatPrice = 900.00;
    Double totatCost=0.0;
    int totalSeats = 0;
    TextView totalBookedSeats;
    TextView totalPrice;
    GridLayout mainGrid;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ap_chairs);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        totalBookedSeats = (TextView) findViewById(R.id.total_seats);
        totalPrice=(TextView)findViewById(R.id.total_cost);
        confirm=findViewById(R.id.btnBook);

        setToggleEvent(mainGrid);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(AP_Chairs.this,cart_activitiy.class));
            }
        });




    }
    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid

        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finali = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#00FF00"));
                        totatCost += seatPrice;
                        ++totalSeats;
                        /*Toast.makeText(AP_Chairs.this, "You Selected Seat Number :" + (finali + 1), Toast.LENGTH_SHORT).show();*/

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        totatCost -= seatPrice;
                        --totalSeats;
                        /*Toast.makeText(AP_Chairs.this, "You Unselected Seat Number :" + (finali + 1), Toast.LENGTH_SHORT).show();*/
                    }
                    System.out.println(totatCost);

                    totalPrice.setText("" + totatCost+"0");
                    totalBookedSeats.setText("" + totalSeats);
            }
            });
}
    }}