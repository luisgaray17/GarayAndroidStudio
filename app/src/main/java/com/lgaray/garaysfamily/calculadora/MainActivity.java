package com.lgaray.garaysfamily.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button boton7;
    Button boton8;
    Button boton9;
    Button boton0;
    Button botonSuma;
    Button botonResta;
    Button botonMultiplicacion;
    Button botonDivision;
    Button botonAC;
    Button botonIgual;

    //TextView textoV1;
    String operacion = "";
    Double numero1;
    Double numero2;
    Double resultado;
    int bandera = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazar botones a las botones de la Aplicacion
        boton1 = (Button)findViewById(R.id.button7);
        boton2 = (Button)findViewById(R.id.button8);
        boton3 = (Button)findViewById(R.id.button9);
        boton4 = (Button)findViewById(R.id.button4);
        boton5 = (Button)findViewById(R.id.button5);
        boton6 = (Button)findViewById(R.id.button6);
        boton7 = (Button)findViewById(R.id.button);
        boton8 = (Button)findViewById(R.id.button2);
        boton9 = (Button)findViewById(R.id.button3);
        boton0 = (Button)findViewById(R.id.button10);
        botonSuma = (Button)findViewById(R.id.button15);
        botonResta = (Button)findViewById(R.id.button14);
        botonMultiplicacion = (Button)findViewById(R.id.button13);
        botonDivision = (Button)findViewById(R.id.button11);
        botonAC = (Button)findViewById(R.id.button16);
        botonIgual = (Button)findViewById(R.id.button12);



        //Metodo Escucha Boton 1
        boton0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "0");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "0");
                }



            }

        });//Fin del metodo Escucha del Boton
        //Metodo Escucha Boton 1
        boton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "1");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "1");
                }



            }

        });//Fin del metodo Escucha del Boton

        boton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "2");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "2");
                }

            }

        });//Fin del metodo Escucha del Boton

        boton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "3");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "3");
                }

            }


        });//Fin del metodo Escucha del Boton

        boton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "4");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "4");
                }

            }


        });//Fin del metodo Escucha del Boton

        boton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "5");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "5");
                }

            }


        });//Fin del metodo Escucha del Boton
        boton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "6");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "6");
                }

            }


        });//Fin del metodo Escucha del Boton
        boton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "7");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "7");
                }

            }


        });//Fin del metodo Escucha del Boton
        boton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "8");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "8");
                }

            }


        });//Fin del metodo Escucha del Boton
        boton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(bandera==1){
                    bandera = 0;
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;
                    textoV1.setText("");
                    textoV1.setText(textoV1.getText() + "9");

                }
                else{
                    //Enlzar el Texto a el TextView de la Aplicacion
                    TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                    textoV1.setText(textoV1.getText() + "9");
                }

            }


        });//Fin del metodo Escucha del Boton


        botonSuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Enlzar el Texto a el TextView de la Aplicacion
                TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                if(textoV1.getText().equals("")){
                    textoV1.setText("0.0");
                    bandera = 1;
                }else{
                    numero1 = Double.parseDouble(textoV1.getText().toString());

                    textoV1.setText("");

                    operacion = "s";
                }



            }


        });//Fin del metodo Escucha del Boton

        botonResta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Enlzar el Texto a el TextView de la Aplicacion
                TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                if(textoV1.getText().equals("")){
                    textoV1.setText("0.0");
                    bandera = 1;
                }else{
                    numero1 = Double.parseDouble(textoV1.getText().toString());

                    textoV1.setText("");

                    operacion = "r";
                }



            }


        });//Fin del metodo Escucha del Boton
        botonMultiplicacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Enlzar el Texto a el TextView de la Aplicacion
                TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                if(textoV1.getText().equals("")){
                    textoV1.setText("0.0");
                    bandera = 1;
                }else{
                    numero1 = Double.parseDouble(textoV1.getText().toString());

                    textoV1.setText("");

                    operacion = "m";
                }



            }


        });//Fin del metodo Escucha del Boton

        botonDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Enlzar el Texto a el TextView de la Aplicacion
                TextView textoV1 = (TextView)findViewById(R.id.textView) ;

                if(textoV1.getText().equals("")){
                    textoV1.setText("0.0");
                    bandera = 1;
                }else{
                    numero1 = Double.parseDouble(textoV1.getText().toString());

                    textoV1.setText("");

                    operacion = "d";
                }

            }


        });//Fin del metodo Escucha del Boton


        botonAC.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){

            numero1=0.0;
            numero2=0.0;
            TextView textoV1 = (TextView) findViewById(R.id.textView) ;
            textoV1.setText("0.0");
        }


        });//Fin del metodo Escucha del Boton

        botonIgual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                TextView textoV1 = (TextView) findViewById(R.id.textView) ;
                numero2 = Double.parseDouble(textoV1.getText().toString());
                bandera = 1;

                if(operacion.equals("s"))
                {
                    resultado= numero1+numero2;
                    textoV1.setText(resultado.toString());
                }
                else if(operacion.equals("r"))
                {
                    resultado= numero1-numero2;
                    textoV1.setText(resultado.toString());
                }
                else if(operacion.equals("m"))
                {
                    resultado= numero1*numero2;
                    textoV1.setText(resultado.toString());
                }
                else if(operacion.equals("d"))
                {
                    resultado= numero1/numero2;
                    if(numero2 == 0.0){
                        textoV1.setText("Error Matematico");
                    }
                    else{
                        textoV1.setText(resultado.toString());
                    }
                }
                //textoV1.setText(resultado.toString());
            }


        });//Fin del metodo Escucha del Boton





    }
}
