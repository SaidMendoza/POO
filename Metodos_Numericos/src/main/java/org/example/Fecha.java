package org.example;

import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class Fecha extends Thread {

    private JLabel caja2;


    public Fecha (JLabel caja2){
        this.caja2 = caja2;
    }


    public void run(){

        while(true){

            Calendar c = Calendar.getInstance();
            int dia = c.get(Calendar.DAY_OF_MONTH);
            int mes = c.get(Calendar.MONTH) + 1;
            int anio = c.get(Calendar.YEAR);
            String Date;

            switch(mes){
                case 1:
                    Date = dia + "/" + "ENE" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 2:
                    Date = dia + "/" + "FEB" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 3:
                    Date = dia + "/" + "MAR" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 4:
                    Date = dia + "/" + "ABR" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 5:
                    Date = dia + "/" + "MAY" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 6:
                    Date = dia + "/" + "JUN" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 7:
                    Date = dia + "/" + "JUL" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 8:
                    Date = dia + "/" + "AGO" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 9:
                    Date = dia + "/" + "SEP" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 10:
                    Date = dia + "/" + "OCT" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 11:
                    Date = dia + "/" + "NOV" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;
                case 12:
                    Date = dia + "/" + "DIC" + "/" + anio ;
                    this.caja2.setText(Date);
                    break;

            }

        }
    }




}