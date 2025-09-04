package Pacman_Game;

import java.util.Random;
import java.util.Scanner;

class point{

    public int x;
    public int y;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void setY(int yy) {
        y = yy;
    }
    public point(){
        x =0;
        y =0;
    }
    public point(int X,int Y) {
        this();


        this.x = X;
        y = Y;
    }


    public void setX(int xx) {
        x = xx;
    }


    public String toString() {
        String p = "[" + x + "," + y + "]";
        return p;
    }
}
class Enemies{
    public point E_coordinates;
    public char enemy_name;

    public Enemies(char enemy_name,int x,int y){
        E_coordinates = new point(x,y);
        this.enemy_name=enemy_name;
    }
    public point moveE(){
        Scanner sc= new Scanner(System.in);
        int RandomDirection;
        Random r = new Random();

        RandomDirection=r.nextInt(4);

        if (RandomDirection==0){
            Board.bound[this.E_coordinates.x][this.E_coordinates.y] = '.';
            this.E_coordinates.x++;
            if (Board.bound[this.E_coordinates.x][this.E_coordinates.y] == '#') {
                this.E_coordinates.x--;
            }
            Board.bound[this.E_coordinates.x][this.E_coordinates.y]=enemy_name;}
        if (RandomDirection==1){
            Board.bound[this.E_coordinates.x][this.E_coordinates.y] = '.';
            this.E_coordinates.x--;
            if (Board.bound[this.E_coordinates.x][this.E_coordinates.y] == '#') {
                this.E_coordinates.x++;
            }
            Board.bound[this.E_coordinates.x][this.E_coordinates.y]=enemy_name;}
        if (RandomDirection==2){
            Board.bound[this.E_coordinates.x][this.E_coordinates.y] = '.';
            this.E_coordinates.y++;
            if (Board.bound[this.E_coordinates.x][this.E_coordinates.y] == '#') {
                this.E_coordinates.y--;
            }
            Board.bound[this.E_coordinates.x][this.E_coordinates.y]=enemy_name;}
        if (RandomDirection==3){
            Board.bound[this.E_coordinates.x][this.E_coordinates.y] = '.';
            this.E_coordinates.y--;
            if (Board.bound[this.E_coordinates.x][this.E_coordinates.y] == '#') {
                this.E_coordinates.y++;
            }
            Board.bound[this.E_coordinates.x][this.E_coordinates.y]=enemy_name;}

        return this.E_coordinates;
    }
}
class pacman_controlled_walk {
    public char pacman_name;
    public point coordinates;

    public pacman_controlled_walk(char name, int x, int y) {
        coordinates = new point(x, y);
        this.pacman_name = name;
    }

    public point moveP() {

        Scanner sc = new Scanner(System.in);
        System.out.println("press 5 for right");
        System.out.println("press 2 for left");
        System.out.println("press 3 for down");
        System.out.println("press 1 for up");

        int b = sc.nextInt();

        if (b == 5) {
            Board.bound[this.coordinates.x][this.coordinates.y] = ' ';
            this.coordinates.y++;
                    if ((Board.bound[this.coordinates.x][this.coordinates.y] == '#')) {
                        this.coordinates.y--;
                    }
            Board.bound[this.coordinates.x][this.coordinates.y] = pacman_name;


        }
        if (b == 2) {
            Board.bound[this.coordinates.x][this.coordinates.y] = ' ';
            this.coordinates.y--;
            if ((Board.bound[this.coordinates.x][this.coordinates.y] == '#')) {
                this.coordinates.y++;
            }

            Board.bound[this.coordinates.x][this.coordinates.y] = pacman_name;


        }
        if (b == 3) {
            Board.bound[this.coordinates.x][this.coordinates.y] = ' ';
            this.coordinates.x++;
            if ((Board.bound[this.coordinates.x][this.coordinates.y] == '#')) {
                this.coordinates.x--;
            }
            Board.bound[this.coordinates.x][this.coordinates.y] = pacman_name;

        }
        if (b == 1) {
            Board.bound[this.coordinates.x][this.coordinates.y] = ' ';
            this.coordinates.x--;
            if ((Board.bound[this.coordinates.x][this.coordinates.y] == '#')) {
                this.coordinates.x++;
            }
            Board.bound[this.coordinates.x][this.coordinates.y] = pacman_name;

        }

        return this.coordinates;
    }

}



class Board {
    int row = 16;
    int col = 15;
    public static char bound[][];
    public void board(){
        char p = 35; //ascii value of hashtag
        char q = 46; //ascii value of dot
        bound = new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 && j>=0 && j<=14){
                    bound[i][j]=p;
                } else if (j==0 && i>=1 && j<=15 ) {
                    bound[i][j]=p;
                }
                else if (j==14 && i>=1 && j<=15 ) {
                    bound[i][j]=p;
                }
                else if(i==15 && j>=1 && j<=13){
                    bound[i][j]=p;
                }
                else if ((i==2 && j==4)||(i==2 && j==11)){
                    bound[i][j]=p;
                }
                else if (i==3 && j>=4 && j<=11){
                    bound[i][j]=p;
                }
                else if (i==4 && j==2){
                    bound[i][j]=p;
                }
                else if ((i==5 && j==2)||(i==5 && j==12)||(i==5 && j>=4 && j<=5)||(i==5 && j>=7 && j<=9)){
                    bound[i][j]=p;
                }
                else if ((i==6 && j==2)||(i==6 && j==5)||(i==6 && j==9)||(i==6 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==7 && j==2)||(i==7 && j==5)||(i==7 && j==9)||(i==7 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==8 && j==2)||(i==8 && j==5)||(i==8 && j==9)||(i==8 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==9 && j==2)||(i==9 && j>=6 && j<=7)||(i==9 && j==9)||(i==9 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==10 && j==2)||(i==10 && j==7)||(i==10 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==11 && j==2)||(i==11 && j==4)||(i==11 && j>=7 && j<=8)||(i==11 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==12 && j==4)||(i==12 && j>=8 && j<=10)){
                    bound[i][j]=p;
                }
                else if ((i==13 && j>=4 && j<=6)){
                    bound[i][j]=p;
                }
                else {
                    bound[i][j]=q;
                }
            }
        }
    }

    public static void draw() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(bound[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class  Score_Card{
    public int score = 0;
    public void Calculate_Scores(){
        for(int i=0;i<16;i++){
            for(int j=0;j<15;j++){
                if(Board.bound[i][j]==' '){
                    score+=1;

                }

            }
        }System.out.println("Your Total Score is :"+score);
    }
}

class PLay{
    int PacMan_lives =5;
    Board objB = new Board();
    Score_Card objSc=new Score_Card();
    public void move(pacman_controlled_walk Player ,Enemies E1,Enemies E2){
        objB.bound[Player.coordinates.x][Player.coordinates.y]= Player.pacman_name;
        objB.bound[E1.E_coordinates.x][E1.E_coordinates.y]=E1.enemy_name;
        objB.bound[E2.E_coordinates.x][E2.E_coordinates.y]=E2.enemy_name;

        Board.draw();


        Scanner input =new Scanner(System.in);
        System.out.println("==>ENTER THE STEPS YOU WANNA PLAY :");
        int stepss = input.nextInt();
        int count_dot = 0;

        for(int i=0; i<stepss; i++) {
            System.out.println("Current Position of Enemy E1 is : "+E1.moveE());
            System.out.println("Current Position of Enemy E2 is : "+E2.moveE());
            System.out.println("Current Position of Pacman "+Player.pacman_name+": "+Player.moveP());

            Board.draw();

            if(((Player.coordinates.x == E1.E_coordinates.x)&&(Player.coordinates.y == E1.E_coordinates.y)) || ((Player.coordinates.x == E2.E_coordinates.x)&&(Player.coordinates.y == E2.E_coordinates.y))){
                PacMan_lives-=1;
                System.out.println("Enemy attacked you \nOnly "+PacMan_lives+" Pacman lives Remaining\nBe careful from Enemy!!!");
                if(PacMan_lives< 1) {
                    System.out.println("ENEMY KILLED YOU!!! \nGAME OVER!!!");
                    objSc.Calculate_Scores();
                    break;
                }
            }
           for (int j=0;j<16;j++) {
               for (int k=0;k<15;k++){
                   if(Board.bound[j][k]=='.'){
                       count_dot+=1;
                       if(count_dot==0){
                           System.out.println("HOORAYYYY!!!...YOU SUCCESSFULLY ATE EVERY FOOD!!!...\nYOU GOT MAXIMUM SCORE");
                           objSc.Calculate_Scores();
                           break;
                       }
                   }
               }
           }
        }
    }
}
public class DriverOfPacman {

    public static void main(String[] args) {
        System.out.println("-----------------------WELCOME TO PACMAN GAME------------------------ \nYOU HAVE 5 LIVES :)\n ");
        System.out.println("Game and Condition :\n1.You have to eat Enemies food which it keeps in place\n2.Enemy will refill the food when it came back to non food place\n3.if you eat the all food then,you will get highest score and you will win \n4.If enemy will catch you, You will lose your lives\n5.if your lives become 0 then, your game is over\n6.Finally your score will calculate base on how many places are there without food\n   ");
        Scanner input = new Scanner(System.in);
        System.out.println("==>ENTER THE 1ST LETTER OF THE PLAYER NAME");
        char player_name = input.next().charAt(0);
        Board p = new Board();
        p.board();
        pacman_controlled_walk Player = new pacman_controlled_walk(player_name,1,1);
        Enemies E1 = new Enemies('@',4,4);
        Enemies E2 = new Enemies('@',6,6);
        PLay start = new PLay();
        start.move(Player,E1,E2);

    }
}

