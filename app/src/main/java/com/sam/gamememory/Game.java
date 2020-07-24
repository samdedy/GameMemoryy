package com.sam.gamememory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class Game extends AppCompatActivity {

    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8;
    public Integer[] arrayGame1 = {11,12,13,14,21,22,23,24};
    public Integer[] arrayGame2 = new Integer[8];
    int def,img0,img1,img2,img3,img4,img5,img6,img7;
    int cardNumber=1;
    int firstCard,secondCard;
    int clickFirst,clickSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        iv7 = findViewById(R.id.iv7);
        iv8 = findViewById(R.id.iv8);

//        int x=10;
//        for (int i=0; i<arrayGame1.length; i++){
//            arrayGame1[i]=x;
//            x++;
//        }

        iv1.setTag("0");
        iv2.setTag("1");
        iv3.setTag("2");
        iv4.setTag("3");
        iv5.setTag("4");
        iv6.setTag("5");
        iv7.setTag("6");
        iv8.setTag("7");

        cardResource();

        Collections.shuffle(Arrays.asList(arrayGame1));

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(iv1,card);
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(iv2,card);
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(iv3,card);
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(iv4,card);
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(iv5,card);
            }
        });

        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(iv6,card);
            }
        });

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(iv7,card);
            }
        });

        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(iv8,card);
            }
        });
    }

    public void doStuff(ImageView vi, int card){
        if (arrayGame1[card]==11){
            vi.setImageResource(img0);
        } else if (arrayGame1[card]==12){
            vi.setImageResource(img1);
        } else if (arrayGame1[card]==13){
            vi.setImageResource(img2);
        } else if (arrayGame1[card]==14){
            vi.setImageResource(img3);
        } else if (arrayGame1[card]==21){
            vi.setImageResource(img4);
        } else if (arrayGame1[card]==22){
            vi.setImageResource(img5);
        } else if (arrayGame1[card]==23){
            vi.setImageResource(img6);
        } else if (arrayGame1[card]==24){
            vi.setImageResource(img7);
        }

        if (cardNumber == 1){
            firstCard = arrayGame1[card];
            if (firstCard>20){
                firstCard = firstCard - 10;
            }
            cardNumber = 2;
            clickFirst= card;
            vi.setEnabled(false);
        } else if(cardNumber == 2){
            secondCard = arrayGame1[card];
            if (secondCard>20){
                secondCard = secondCard - 10;
            }
            cardNumber = 1;
            clickSecond = card;
            iv1.setEnabled(false);
            iv2.setEnabled(false);
            iv3.setEnabled(false);
            iv4.setEnabled(false);
            iv5.setEnabled(false);
            iv6.setEnabled(false);
            iv7.setEnabled(false);
            iv8.setEnabled(false);

            Handler handler= new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected image are equal
                    calculate();
                }
            },500);
        }


    }

    private void calculate(){
        //if image are equal remove tegm and add point
        if(firstCard==secondCard){
            if(clickFirst==0){
                iv1.setVisibility(View.INVISIBLE);
            }else if(clickFirst==1){
                iv2.setVisibility(View.INVISIBLE);
            }else if(clickFirst==2){
                iv3.setVisibility(View.INVISIBLE);
            }else if(clickFirst==3){
                iv4.setVisibility(View.INVISIBLE);
            }else if(clickFirst==4){
                iv5.setVisibility(View.INVISIBLE);
            }else if(clickFirst==5){
                iv6.setVisibility(View.INVISIBLE);
            }else if(clickFirst==6){
                iv7.setVisibility(View.INVISIBLE);
            }else if(clickFirst==7){
                iv8.setVisibility(View.INVISIBLE);
            }

            if(clickSecond==0){
                iv1.setVisibility(View.INVISIBLE);
            }else if(clickSecond==1){
                iv2.setVisibility(View.INVISIBLE);
            }else if(clickSecond==2){
                iv3.setVisibility(View.INVISIBLE);
            }else if(clickSecond==3){
                iv4.setVisibility(View.INVISIBLE);
            }else if(clickSecond==4){
                iv5.setVisibility(View.INVISIBLE);
            }else if(clickSecond==5){
                iv6.setVisibility(View.INVISIBLE);
            }else if(clickSecond==6){
                iv7.setVisibility(View.INVISIBLE);
            }else if(clickSecond==7){
                iv8.setVisibility(View.INVISIBLE);
            }
        }else{
            iv1.setImageResource(def);
            iv2.setImageResource(def);
            iv3.setImageResource(def);
            iv4.setImageResource(def);
            iv5.setImageResource(def);
            iv6.setImageResource(def);
            iv7.setImageResource(def);
            iv8.setImageResource(def);

        }
        iv1.setEnabled(true);
        iv2.setEnabled(true);
        iv3.setEnabled(true);
        iv4.setEnabled(true);
        iv5.setEnabled(true);
        iv6.setEnabled(true);
        iv7.setEnabled(true);
        iv8.setEnabled(true);

        cek();
    }

    private void cek() {
        if (iv1.getVisibility() == View.INVISIBLE &&
                iv2.getVisibility() == View.INVISIBLE &&
                iv3.getVisibility() == View.INVISIBLE &&
                iv4.getVisibility() == View.INVISIBLE &&
                iv5.getVisibility() == View.INVISIBLE &&
                iv6.getVisibility() == View.INVISIBLE &&
                iv7.getVisibility() == View.INVISIBLE &&
                iv8.getVisibility() == View.INVISIBLE) {
            AlertDialog.Builder alert = new AlertDialog.Builder(Game.this);
            alert.setTitle("Berhasil").setIcon(R.drawable.ic_question).setMessage("Jika Kamu Ingin Bermain Lagi Klik New Game")
                    .setCancelable(false).setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(getApplicationContext(), Game.class);
                    startActivity(intent);
                    finish();
                }
            })
                    .setNegativeButton("Keluar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        }
    }

    public void cardResource(){
        img0 = R.drawable.ic_automobile;
        img1 = R.drawable.ic_motorcycle;
        img2 = R.drawable.ic_green_house;
        img3 = R.drawable.ic_trees;
        img4 = R.drawable.ic_automobile;
        img5 = R.drawable.ic_motorcycle;
        img6 = R.drawable.ic_green_house;
        img7 = R.drawable.ic_trees;
        def = R.drawable.ic_question;
    }
}