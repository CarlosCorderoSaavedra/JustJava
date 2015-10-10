package com.example.android.justjava;

import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */


public class MainActivity extends ActionBarActivity {

    int quantity = 2 ;
    int coffeePrice = 5 ;
    int price = quantity * coffeePrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String thankYou = "Thanks you!!!";
        //mine result: Creating a new method to add a new content to the new textView
        //String priceMessage = "Total = $" + price;
        // Curse expected result
        String priceMessage = "Total = $" + price +"\nThank You!!";
        displayMessage(priceMessage);
        //displaySecondMessage(thankYou);
    }

    /**
     * This method is called when increment button is clicked.
     */
    public void increment(View view){

        quantity = quantity + 1 ;
        display(quantity) ;
    }

    /**
     * This method is called when decrement button is clicked.
     */
    public void decrement(View view){

        quantity = quantity-1 ;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_number);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);

    }
    private void displaySecondMessage(String message) {
        TextView thanks_you = (TextView) findViewById(R.id.thanks_you);
        thanks_you.setText(message);
    }
}