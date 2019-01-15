package link.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class PlayGameActivity extends AppCompatActivity {


    Button[] buttons = new Button[9];
    ArrayList<Button> availableBtns = new ArrayList<>();
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.xo_48x48);


        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);


        buttons[0] = btn1;
        buttons[1] = btn2;
        buttons[2] = btn3;
        buttons[3] = btn4;
        buttons[4] = btn5;
        buttons[5] = btn6;
        buttons[6] = btn7;
        buttons[7] = btn8;
        buttons[8] = btn9;

        fillTheList();

        playGame();


    }


    private void computerTurn() {
        for (int i = 0; i < buttons.length; i++) {

            if (availableBtns.size() > 0) {
                int random = new Random().nextInt(availableBtns.size());
                availableBtns.get(random).setBackgroundResource(R.drawable.o_sign);
                availableBtns.get(random).setEnabled(false);
                availableBtns.remove(random);
            }

            break;

        }
    }

    private void fillTheList() {
        for (Button button : buttons) {
            availableBtns.add(button);

        }
    }

    private void playGame() {
        for (int i = 0; i < buttons.length; i++) {

            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.button1:

                            if (btn1.getText().toString().equals("")) {
                                btn1.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn1);
                                btn1.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();



                            break;
                        case R.id.button2:

                            if (btn2.getText().toString().equals("")) {
                                btn2.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn2);
                                btn2.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();



                            break;
                        case R.id.button3:

                            if (btn3.getText().toString().equals("")) {
                                btn3.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn3);
                                btn3.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();



                            break;
                        case R.id.button4:

                            if (btn4.getText().toString().equals("")) {
                                btn4.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn4);
                                btn4.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();



                            break;
                        case R.id.button5:

                            if (btn5.getText().toString().equals("")) {
                                btn5.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn5);
                                btn5.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();



                            break;
                        case R.id.button6:

                            if (btn6.getText().toString().equals("")) {
                                btn6.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn6);
                                btn6.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();



                            break;
                        case R.id.button7:

                            if (btn7.getText().toString().equals("")) {
                                btn7.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn7);
                                btn7.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();



                            break;
                        case R.id.button8:

                            if (btn8.getText().toString().equals("")) {
                                btn8.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn8);
                                btn8.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();



                            break;
                        case R.id.button9:

                            if (btn9.getText().toString().equals("")) {
                                btn9.setBackgroundResource(R.drawable.x_sign);
                                availableBtns.remove(btn9);
                                btn9.setEnabled(false);
                                if (checkPlayerXresult()) {
                                    break;
                                }


                            }
                            computerTurn();
                            checkPlayerOresult();


                            break;
                    }


                }
            });

        }
    }

    private boolean checkPlayerXresult() {


        if (btn1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()

                || btn4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()

                || btn7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()

                || btn1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()

                || btn2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()

                || btn3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()

                || btn1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()

                || btn3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()
                && btn7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.x_sign).getConstantState()) {

            closeGame();
            playerXWon();
            //Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;


        }


        return false;

    }

    private boolean checkPlayerOresult() {


        if (btn1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()

                || btn4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()

                || btn7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()

                || btn1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()

                || btn2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()

                || btn3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()

                || btn1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()

                || btn3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()
                && btn7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.o_sign).getConstantState()) {


                closeGame();
                androidWon();

            //Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;

        }

        return false;

    }


    private boolean allButtonsFilled() {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].getText().toString().isEmpty()) {
                return false;
            }

        }
        return true;
    }

    private void closeGame() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }
    }

    public void playerXWon() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Player X win!");
        builder.setMessage("Do you want to play again?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    public void androidWon() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Player Y win!");
        builder.setMessage("Do you want to play again?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void tieResult() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("It's a DRAW!");
        builder.setMessage("Do you want to play again?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}


  /*  public void playerWon(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Player X win!");
        builder.setMessage("Do you want to play again?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    public void androidWon() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Player Y win!");
        builder.setMessage("Do you want to play again?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
*/

  /*  AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Player X win!");
                    builder.setMessage("Do you want to play again?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
        recreate();
        }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
        finish();
        }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        closeGame();*/


