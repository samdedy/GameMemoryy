package com.sam.gamememory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Game extends AppCompatActivity {

    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8;
    public Integer[] arrayGame1 = new Integer[8];
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

        int x=10;
        for (int i=0; i<arrayGame1.length; i++){
            arrayGame1[i]=x;
            x++;
        }


        cardResource();
    }

    public void iv1(View view){
        int card = 0;
        doStuff(iv1,card);
    }

    public void iv2(View view){
        int card = 1;
        doStuff(iv2,card);
    }

    public void iv3(View view){
        int card = 2;
        doStuff(iv3,card);
    }

    public void iv4(View view){
        int card = 3;
        doStuff(iv4,card);
    }

    public void iv5(View view){
        int card = 4;
        doStuff(iv5,card);
    }

    public void iv6(View view){
        int card = 5;
        doStuff(iv6,card);
    }

    public void iv7(View view){
        int card = 6;
        doStuff(iv7,card);
    }

    public void iv8(View view){
        int card = 7;
        doStuff(iv8,card);
    }

    public void doStuff(ImageView vi, int card){
        if (arrayGame1[card]==10){
            vi.setImageResource(img0);
        } else if (arrayGame1[card]==11){
            vi.setImageResource(img1);
        } else if (arrayGame1[card]==12){
            vi.setImageResource(img2);
        } else if (arrayGame1[card]==13){
            vi.setImageResource(img3);
        } else if (arrayGame1[card]==14){
            vi.setImageResource(img4);
        } else if (arrayGame1[card]==15){
            vi.setImageResource(img5);
        } else if (arrayGame1[card]==16){
            vi.setImageResource(img6);
        } else if (arrayGame1[card]==17){
            vi.setImageResource(img7);
        }

        if (cardNumber == 1){
            firstCard = arrayGame1[card];
            if (firstCard>13){
                firstCard = firstCard - 3;
            }
            cardNumber = 2;
            clickFirst= card;
            vi.setEnabled(false);
        } else if(cardNumber == 2){
            secondCard = arrayGame1[card];
            if (secondCard>13){
                secondCard = secondCard - 3;
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
            },100);
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