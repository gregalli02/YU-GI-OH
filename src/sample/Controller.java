package sample;

import java.util.Collections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Controller {
    private Carta x1;
    private Carta x2;
    private int lifePointsG1;
    private int lifePointsG2;
    private int punti, difesa1, difesa2, attacco1, attacco2, posizione;
    private ArrayList<Carta> cimitero1 = new ArrayList<>();
    private ArrayList<Carta> cimitero2 = new ArrayList<>();
    private ArrayList<Carta> mazzo1 = new ArrayList<>();
    private ArrayList<Carta> mazzo2 = new ArrayList<>();

    private int contatore1 = 0;
    private int contatore2 = 0;


    @FXML
    private ImageView TAPPETINO1;

    @FXML
    private ImageView TAPPETINO2;

    @FXML
    private ImageView CARTA2;

    @FXML
    private ImageView CARTA1;

    @FXML
    private Button CAMBIOG2; //cambiare carta giocatore 2

    @FXML
    private Button CAMBIOG1; //cambiare carta giocatore 1

    @FXML
    private Label PUNTIG2; //testo dove ci sono scritti i lifepoints di G2

    @FXML
    private Label PUNTIG1; //testo dove ci sono scritti i lifepoints di G1

    @FXML
    private Button COMBAT; //duello

    @FXML
    private Button START; //inizio partita

    @FXML
    private Button CAMBIOPG2; //cambio posizione G2

    @FXML
    private Button CAMBIOPG1; //cambio posizione G1



    @FXML
    void Start(ActionEvent event) {
        start();
    }

    void start(){
        lifePointsG1 = 8000;
        lifePointsG2 = 8000;
        PUNTIG1.setText(""+lifePointsG1);
        PUNTIG2.setText(""+lifePointsG2);
        creaCarte();
        Collections.shuffle(mazzo1);
        Collections.shuffle(mazzo2);
        CambioG11();
        CambioG22();
    }

    void creaCarte(){
        String s;
        int l, a, d;
        Carta x;
        Image i1 = new Image(getClass().getResourceAsStream("icons/dragoArcobalenoOscuro.jpg"));

        //Carta1
        s = "Drago Arcobaleno Oscuro";
        l = 10;
        a = 4000;
        d = 0;
        x = new Carta(s, l, a, d, i1);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta2
        Image i2 = new Image(getClass().getResourceAsStream("icons/corridoreTop.jpg"));
        s = "Corridore Top";
        l = 4;
        a = 1100;
        d = 800;
        x = new Carta(s, l, a, d, i2);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta3
        Image i3 = new Image(getClass().getResourceAsStream("icons/Arcidemone.jpg"));
        s = "Arcidemone teschio del fulmine";
        l = 6;
        a = 2500;
        d = 1200;
        x = new Carta(s, l, a, d, i3);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta4
        Image i4 = new Image(getClass().getResourceAsStream("icons/espulsore della carta.jpg"));
        s = "Espulsore della carta";
        l = 3;
        a = 400;
        d = 400;
        x = new Carta(s, l, a, d, i4);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta5
        Image i5 = new Image(getClass().getResourceAsStream("icons/dragoschianto.jpg"));
        s = "Drago schianto-gravitazionale";
        l = 6;
        a = 2400;
        d = 1200;
        x = new Carta(s, l, a, d, i5);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta6
        Image i6 = new Image(getClass().getResourceAsStream("icons/alanera.jpg"));
        s = "Alanera - Ghibli il vento ardente";
        l = 3;
        a = 0;
        d = 1600;
        x = new Carta(s, l, a, d, i6);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta7
        Image i7 = new Image(getClass().getResourceAsStream("icons/lancianera.jpg"));
        s = "Lancianera dragunità";
        l = 3;
        a = 1000;
        d = 1000;
        x = new Carta(s, l, a, d, i7);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta8
        Image i8 = new Image(getClass().getResourceAsStream("icons/dragobianco.jpg"));
        s = "Drago bianco occhi blu";
        l = 8;
        a = 3000;
        d = 2500;
        x = new Carta(s, l, a, d, i8);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta9
        Image i9 = new Image(getClass().getResourceAsStream("icons/cerbero.jpg"));
        s = "Cerbero fotonico";
        l = 3;
        a = 1300;
        d = 600;
        x = new Carta(s, l, a, d, i9);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta10
        Image i10 = new Image(getClass().getResourceAsStream("icons/ascia.jpg"));
        s = "Ascia da guerra infuriata";
        l = 4;
        a = 1700;
        d = 1000;
        x = new Carta(s, l, a, d, i10);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta11
        Image i11 = new Image(getClass().getResourceAsStream("icons/cavaliere.jpg"));
        s = "Cavaliere familiare";
        l = 3;
        a = 1200;
        d = 1400;
        x = new Carta(s, l, a, d, i11);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta12
        Image i12 = new Image(getClass().getResourceAsStream("icons/goblin.jpg"));
        s = "Goblindbergh";
        l = 4;
        a = 1400;
        d = 0;
        x = new Carta(s, l, a, d, i12);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta13
        Image i13 = new Image(getClass().getResourceAsStream("icons/gatto.jpg"));
        s = "Bestia cristallo gatto ametista";
        l = 3;
        a = 1200;
        d = 400;
        x = new Carta(s, l, a, d, i13);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta14
        Image i14 = new Image(getClass().getResourceAsStream("icons/tartaruga.jpg"));
        s = "Bestia cristallo tartaruga smeraldo";
        l = 3;
        a = 600;
        d = 2000;
        x = new Carta(s, l, a, d, i14);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta15
        Image i15 = new Image(getClass().getResourceAsStream("icons/monolop.jpg"));
        s = "Jurrac monoloph";
        l = 3;
        a = 1500;
        d = 1200;
        x = new Carta(s, l, a, d, i15);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta16
        Image i16 = new Image(getClass().getResourceAsStream("icons/mammut.jpg"));
        s = "Bestia cristallo mammut ambra";
        l = 4;
        a = 1700;
        d = 1600;
        x = new Carta(s, l, a, d, i16);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta17
        Image i17 = new Image(getClass().getResourceAsStream("icons/carbuncle.jpg"));
        s = "Bestia cristallo carbuncle rubino";
        l = 3;
        a = 300;
        d = 300;
        x = new Carta(s, l, a, d, i17);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta18
        Image i18 = new Image(getClass().getResourceAsStream("icons/jur.png"));
        s = "Cerbero fotonico";
        l = 3;
        a = 1000;
        d = 1000;
        x = new Carta(s, l, a, d, i18);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta19
        Image i19 = new Image(getClass().getResourceAsStream("icons/cyber.jpg"));
        s = "Cyber ginnasta";
        l = 4;
        a = 800;
        d = 1800;
        x = new Carta(s, l, a, d, i19);
        mazzo1.add(x);
        mazzo2.add(x);

        //Carta20
        Image i20 = new Image(getClass().getResourceAsStream("icons/mangia.jpg"));
        s = "Mangia livello";
        l = 1;
        a = 600;
        d = 0;
        x = new Carta(s, l, a, d, i20);
        mazzo1.add(x);
        mazzo2.add(x);
    }

    @FXML
    void CambioG1(ActionEvent event) {
        CambioG11();
    }


    void CambioG11(){

        x1 = mazzo1.get(contatore1);

        String s = x1.getName();

        int l = x1.getLevel();
        int a = x1.getAttack();
        int d = x1.getDefence();
        Image ix = x1.getImage();
        x1.setPosition(0);
/*
        Random random = new Random();
        String s = "mostro";
        int l = random.nextInt(10);
        int a = random.nextInt(400);
        int d = random.nextInt(400);
        x1 = set1(s,l,a,d);
*/


/*
        NOMEG1.setText(""+s);
        LIVELLOG1.setText(""+l);
        ATTACCOG1.setText(""+a);
        DIFESAG1.setText(""+d);
        POSIZIONEG1.setText("ATTACCO");*/
        CARTA1.setImage(ix);
        CARTA1.setRotate(180);
        contatore1 ++;
    }

    @FXML
    void CambioG2(ActionEvent event){
        CambioG22();
    }

    void CambioG22(){

        x2 = mazzo2.get(contatore2);

        String s = x2.getName();

        int l = x2.getLevel();
        int a = x2.getAttack();
        int d = x2.getDefence();
        Image ix = x2.getImage();
        x2.setPosition(0);

/*
        Random random = new Random();
        String s = "mostro";
        int l = random.nextInt(10);
        int a = random.nextInt(400);
        int d = random.nextInt(400);

        x2 = set1(s,l,a,d);
*/

        /*NOMEG2.setText(""+s);
        LIVELLOG2.setText(""+l);
        ATTACCOG2.setText(""+a);
        DIFESAG2.setText(""+d);
        POSIZIONEG2.setText("ATTACCO");*/
        CARTA2.setImage(ix);
        contatore2++;
    }

    @FXML
    void Lotta(ActionEvent event) {
        attaccoG1aG2();
    }



    Carta set1(String s, int l, int a, int d, Image i){
        Carta c = new Carta(s,l,a,d, i);
        return c;
    }


    @FXML
    void setPositionG1(ActionEvent event) {
        posizione = x1.getPosition();
        if(posizione == 0){
            x1.setPosition(1);
            //Image image = new Image(getClass().getResourceAsStream("icons/back3.jpg"));
            //CARTA1.setImage(image);
            CARTA1.setRotate(90);
        }
        else if(posizione == 1){
            x1.setPosition(0);
            CARTA1.setRotate(180);
        }
    }

    @FXML
    void setPositionG2(ActionEvent event) {
        posizione = x2.getPosition();
        if(posizione == 0){
            x2.setPosition(1);
            CARTA2.setRotate(-90);
        }
        else if(posizione == 1){
            x2.setPosition(0);
            CARTA2.setRotate(0);
        }
    }

    void attaccoG1aG2(){
        posizione = x2.getPosition();
        if(posizione == 0){         //G2 in attacco
            attacco1 = x1.getAttack();
            attacco2 = x2.getAttack();

            if(attacco1 > attacco2){
                punti = attacco1-attacco2;
                lifePointsG2 = lifePointsG2 - punti;
                PUNTIG2.setText(""+lifePointsG2);
                cimitero2.add(x2);
                CambioG22();
            }
            else if(attacco1 < attacco2){
                punti = attacco2-attacco1;
                lifePointsG1 = lifePointsG1 - punti;
                PUNTIG1.setText(""+lifePointsG1);
                cimitero1.add(x1);
                CambioG11();
            }
        }
        else if(posizione == 1){    //G2 in difesa
            attacco1 = x1.getAttack();
            difesa2 = x2.getDefence();

            if(attacco1 > difesa2){
                punti = attacco1-difesa2;
                lifePointsG2 = lifePointsG2 - punti;
                PUNTIG2.setText(""+lifePointsG2);
                cimitero2.add(x2);
                CambioG22();
            }
            else if(attacco1 < difesa2){
                punti = difesa2-attacco1;
                lifePointsG1 = lifePointsG1 - punti;
                PUNTIG1.setText(""+lifePointsG1);
                cimitero1.add(x1);
                CambioG11();
            }
        }
        if((lifePointsG1 <= 0) || (lifePointsG2 <= 0)){
            start();
        }
    }

}


