package com.example.android.lesson3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/*
* This app displays an order from a coffee
* */
public class JAVA_OOP extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__oop);
    }

    /*
    * This method is called when the order button is clicked*/

    public void submitOrder(View view) {
        displayMessage(createOrderSummary(5));
    }

    /*This method is called when the plus button is clicked*/
    public void increment(View view){
        quantity= quantity + 1;
        displayQuantity(quantity);
    }

    /*This method is called when the minus button is clicked*/
    public void decrement(View view){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /*
    * This method displays the given quantity value on the screen
    * */
    private void displayQuantity(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /*
    * This method displays the given text on the screen*/
    private void displayMessage (String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /*
    * This method calculates the price */
    private int calculatePrice(int number, int price){
        int thePrice = quantity * price;
        return thePrice;
    }
    /*
    * This method displays the order summary*/
    private String createOrderSummary(int price){
        String priceMessage = "Name: Kaptain Kunal";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + calculatePrice(quantity, price);
        priceMessage += "\nThank you";
        return priceMessage;
    }
}