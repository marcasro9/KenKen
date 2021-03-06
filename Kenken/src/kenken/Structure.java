/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kenken;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Armando
 */
public class Structure {

    int matriz[][];
    int resultado[][];
    List<Figure> figures=new  ArrayList<>();
    int x;
    int y;
    Permutations permutations=new Permutations();
    
    public void createEstructure(int x, int y) {
        this.x = x;
        this.y = y;
        int cont=1;
        this.matriz = new int[x][y];
        this.resultado=new int [x][y];
        Random num = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                resultado[i][j] = -1;
            }
        }
        
        Coordinate[] coordinate;
        int i = 0;
        int j = 0;
        while (i < x) {
            
            if (i < x) {
                if (j < y) {
                    int fig = num.nextInt(12);
                    
                    if (matriz[i][j] == 0) {
                        if (fig == 0) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"ele1");
                            coordinate = figure.elePos1();
                            if (verifyFigure(coordinate, i, j) == true) {
                                

                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);
                            }
                            
                            j++;
                        }
                        if (fig == 1) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"ele2");
                            coordinate = figure.elePos2();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 2) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"ele3");
                             coordinate = figure.elePos3();
                            if (verifyFigure(coordinate, i, j) == true) {

                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 3) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"ele4");
                            coordinate = figure.elePos4();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 4) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"te1");
                            coordinate = figure.tePos1();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 5) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"te2");
                            coordinate = figure.tePos2();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 6) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"te3");
                            coordinate = figure.tePos3();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                           
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 7) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"te4");
                            coordinate = figure.tePos4();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 8) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"zeta1");
                            coordinate = figure.zetaPos1();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                           
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 9) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"zeta2");
                            coordinate = figure.zetaPos2();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 10) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"largo1");
                            coordinate = figure.largoPos1();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                           
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 11) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"largo2");
                            coordinate = figure.largoPos2();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                        if (fig == 12) {
                            int ope = num.nextInt(4);
                            int res = result(4,ope,this.x);
                            Figure figure = new Figure(ope,res,4,cont,"cuadrado");
                            coordinate = figure.cuadrado();
                            if (verifyFigure(coordinate, i, j) == true) {
                                
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    coordinate[pos].x=coordinate[pos].x+j;
                                    coordinate[pos].y=coordinate[pos].y+i;
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            figure.posiciones.add(coordinate[pos]);
                                            matriz[yPos][xPos] = cont;
                                            
                                        }
                                    }
                                }
                                cont++;
                                figures.add(figure);    
                            }
                            
                            j++;
                        }
                    }
                    else {
                        j++;
                    }
                }
            }
            if (j == y) {
                
                i++;
                j = 0;
            }
        }
        fillStructure(cont);
    }
    public void fillStructure(int fig2){
        Coordinate[] coordinate;
        Random num = new Random();
        int i = 0;
        int j = 0;
        int fig=fig2;
        while (i < x) {
            
            if (i < x) {
                if (j < y) {
                    if (matriz[i][j] == 0) {
                        for(int x1=0;x1<16;x1++){
                            if (x1 == 0) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"ele1");
                                coordinate = figure.elePos1();
                                if (verifyFigure(coordinate, i, j) == true) {

                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 1) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"ele2");
                                coordinate = figure.elePos2();
                                if (verifyFigure(coordinate, i, j) == true) {

                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 2) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"ele3");
                                coordinate = figure.elePos3();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 3) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"ele4");
                                coordinate = figure.elePos4();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 4) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"te1");
                                coordinate = figure.tePos1();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 5) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"te2");
                                coordinate = figure.tePos2();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 6) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"te3");
                                coordinate = figure.tePos3();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                               
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 7) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"te4");
                                coordinate = figure.tePos4();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 8) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"zeta3");
                                coordinate = figure.zetaPos1();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 9) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"zeta2");
                                coordinate = figure.zetaPos2();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 10) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"largo1");
                                coordinate = figure.largoPos1();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 11) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"largo2");
                                coordinate = figure.largoPos2();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    

                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 12) {
                                int ope = num.nextInt(4);
                                int res = result(4,ope,this.x);
                                Figure figure = new Figure(ope,res,4,fig,"cuadrado");
                                coordinate = figure.cuadrado();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 13) {
                                int ope = num.nextInt(5);
                                int res = result(2,ope,this.x);
                                Figure figure = new Figure(ope,res,2,fig,"medio1");
                                coordinate = figure.medioPos1();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 14) {
                                int ope = num.nextInt(5);
                                int res = result(2,ope,this.x);
                                Figure figure = new Figure(ope,res,2,fig,"medio2");
                                coordinate = figure.medioPos2();
                                if (verifyFigure(coordinate, i, j) == true) {


                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                                
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                            if (x1 == 15) {
                                int ope = 5;
                                int res = result(1,ope,this.x);
                                Figure figure = new Figure(ope,res,1,fig,"corto1");
                                coordinate = figure.corto();
                                if (verifyFigure(coordinate, i, j) == true) {

                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        coordinate[pos].x=coordinate[pos].x+j;
                                        coordinate[pos].y=coordinate[pos].y+i;
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                figure.posiciones.add(coordinate[pos]);
                                                matriz[yPos][xPos] = fig;
                                            }
                                        }
                                    }
                                    fig++;
                                    figures.add(figure); 
                                }
                            }
                        }
                        j++;
                    }
                    else {
                        j++;
                    }
                }
            }
            if (j == y) {
                i++;
                j = 0;
            }
        }
        String figura="";
        for(int fig3=0;fig3<figures.size();fig3++){
            figura+=figures.get(fig3).id+"\t"+figures.get(fig3).nombre+"\toperación:"+figures.get(fig3).operacion+"\t total:"+figures.get(fig3).total+"\tcuadritos:"+figures.get(fig3).cuadritos;
            for(int cor=0;cor<figures.get(fig3).posiciones.size();cor++){
                figura+="\t("+figures.get(fig3).posiciones.get(cor).x+","+figures.get(fig3).posiciones.get(cor).y+")";    
            }
            figura+="\n";
        }
        Collections.sort(figures);
    }
    public boolean verifyFigure(Coordinate[] coordinate, int i, int j) {

         boolean state = true;
         int k = 0;
         while (k < coordinate.length) {
             int xPos = coordinate[k].x + j;
             int yPos = coordinate[k].y + i;
             if (xPos < x) {
                 if (yPos < y) {
                     if (matriz[yPos][xPos] != 0) {
                         state = false;
                         
                         return state;
                     }
                 } else {
                     
                     state = false;
                     return state;
                 }
             } else {
                 
                 state = false;
                 return state;
             }
             k++;
         }
         return state;
    } 
    public int result(int cuadritos,int operacion,int x){
        int result;
        Random num = new Random();
        if(cuadritos==4){
            if(operacion==0){//suma
                result=num.nextInt((2*(x)+(x-1)+(x-2))-9)+10;
                return result;
            }
            if(operacion==1){//resta
                result=num.nextInt(x);
                return result;
            }
            if(operacion==2){//multiplicacion
                result=num.nextInt((2*x)*(x-1)*(x-2))+1;
                return result;
            }
            if(operacion==3){//division
                result=num.nextInt(x/2)+1;
                return result;
            }
        }
        if(cuadritos==2){
            if(operacion==0){
                result=num.nextInt(x+(x-1))+1;
                return result;
            }
            if(operacion==1){
                result=num.nextInt(x-(x-1))+1;
                return result;
            }
            if(operacion==2){
                result=num.nextInt(x*(x-1))+1;
                return result;
            }
            if(operacion==3){
                result=num.nextInt(x)+1;
                return result;
            }
            if(operacion==4){//modulo
                result=num.nextInt(x%(x-1))+1;
                return result;
            }
        }
        if(cuadritos==1){//potencia
            result=(int)Math.pow(num.nextInt(x)+1,3);
            return result;
        }
        return 0;
    }
    public int [][] returnMatriz(){
        return matriz;
    }
    public List<Figure> returnFigures(){
        return figures;
    }
    public int [][] returnResult(){
        return resultado;
    }
    public void resolve(){
        permutations();
        backtracking(0,figures,resultado);
        print();
    }
    public void permutations(){
        for(int s=0;s<figures.size();s++){
           
            switch(figures.get(s).operacion){
                case 0:
                    figures.get(s).posiblesRes=permutations.aditionPermutations(x, figures.get(s).total, figures.get(s).cuadritos);
                    //permutations.print(figures.get(s).posiblesRes);
                    break;
                case 1:
                    figures.get(s).posiblesRes=permutations.subtractionPermutations(x, figures.get(s).total, figures.get(s).cuadritos);
                    //permutations.print(figures.get(s).posiblesRes);
                    break;
                case 2:
                    figures.get(s).posiblesRes=permutations.multiPermutations(x, figures.get(s).total, figures.get(s).cuadritos);
                    //permutations.print(figures.get(s).posiblesRes);
                    break;
                case 3:
                    figures.get(s).posiblesRes=permutations.divisionPermutations(x, figures.get(s).total, figures.get(s).cuadritos);
                    //permutations.print(figures.get(s).posiblesRes);
                    break;
                case 4:
                    figures.get(s).posiblesRes=permutations.moduloPermutations(x, figures.get(s).total, figures.get(s).cuadritos);
                    //permutations.print(figures.get(s).posiblesRes);
                    break;
                case 5:
                    figures.get(s).posiblesRes=permutations.powerPermutations(x, figures.get(s).total, figures.get(s).cuadritos);
                    //permutations.print(figures.get(s).posiblesRes);
                    break;
            }
        }
    }
    public void print(){
        for(int i1=0;i1<x;i1++){
            for(int j1=0;j1<y;j1++){
               System.out.print(resultado[i1][j1]+"\t"); 
            }
            System.out.println();
        }
    }
    public boolean backtracking(int posF,List<Figure> figures, int[][] resultado){
        if(isFilled(resultado)!=true){
            System.out.println("Entro al backtraking");
            for(int i=posF;i<figures.size();i++){//eligue figura 
                System.out.println(figures.get(i).nombre);
                for(int j=0;j<figures.get(i).posiblesRes.size();j++){//eligue posible conjunto de solucion
                    for(int k=0;k<figures.get(i).posiblesRes.get(j).length;k++){//eligue el numero del conjunto de soluciones
                        int x1=figures.get(i).posiciones.get(k).x;
                        int y1=figures.get(i).posiciones.get(k).y;
                        int num=figures.get(i).posiblesRes.get(j)[k];
                        if(checkRows(resultado,x1,y1,num)==false){
                            if(checkCols(resultado,x1,y1,num)==false){
                                resultado[x1][y1]=num;
                                if(backtracking(posF++,figures,resultado)==true){
                                    return true;
                                }
                                resultado[x1][y1]=-1;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    public boolean isFilled(int[][] resultado){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(resultado[i][j]==-1){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkRows(int[][] resultado,int x1,int y1,int num){
        boolean estado=false;
        for(int i=0;i<x;i++){
            if(num==resultado[i][y1]){
                return true;
            }
        }
        return estado;
    }
    public boolean checkCols(int[][] resultado,int x1,int y1,int num){
        boolean estado=false;
        for(int i=0;i<y;i++){
            if(num==resultado[x1][i]){
                return true;
            }
        }
        return estado;
    }
}
