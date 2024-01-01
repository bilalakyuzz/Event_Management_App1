package com.example.softwareengineering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class NFChairs extends AppCompatActivity {
    Double seatPrice = 900.00;
    Double totatCost=0.0;
    int totalSeats = 0;
    TextView totalBookedSeats;
    TextView totalPrice;
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfchairs);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        totalBookedSeats = (TextView) findViewById(R.id.total_seats);
        totalPrice=(TextView)findViewById(R.id.total_cost);

        setToggleEvent(mainGrid);



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

