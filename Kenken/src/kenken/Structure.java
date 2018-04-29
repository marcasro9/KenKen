/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kenken;

import java.util.Random;

/**
 *
 * @author Armando
 */
public class Structure {

    int matriz[][];
    int x;
    int y;

    public void createEstructure(int x, int y) {
        this.x = x;
        this.y = y;
        this.matriz = new int[x][y];
        Random num = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matriz[i][j] = 0;
            }
        }
        Figure figure = new Figure();
        Coordinate[] coordinate;
        int i = 0;
        int j = 0;
        while (i < x) {
            System.out.println("Entrando a la posicion" + "(" + i + "," + j + ")");
            if (i < x) {
                if (j < y) {
                    int fig = num.nextInt(12);
                    System.out.println("Figura:" + fig);
                    if (matriz[i][j] == 0) {
                        if (fig == 0) {
                            coordinate = figure.elePos1();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");

                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 1;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                                
                            }
                            j++;
                        }
                        if (fig == 1) {
                            coordinate = figure.elePos2();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 2;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 2) {
                            coordinate = figure.elePos3();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 3;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 3) {
                            coordinate = figure.elePos4();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 4;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 4) {
                            coordinate = figure.tePos1();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 5;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 5) {
                            coordinate = figure.tePos2();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 6;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 6) {
                            coordinate = figure.tePos3();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 7;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 7) {
                            coordinate = figure.tePos4();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 8;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 8) {
                            coordinate = figure.zetaPos1();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 9;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 9) {
                            coordinate = figure.zetaPos2();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 10;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 10) {
                            coordinate = figure.largoPos1();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 11;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                                j++;
                            }
                        }
                        if (fig == 11) {
                            coordinate = figure.largoPos2();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 12;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
                            }
                            j++;
                        }
                        if (fig == 12) {
                            coordinate = figure.cuadrado();
                            if (verifyFigure(coordinate, i, j) == true) {
                                System.out.println("Si se puede usar la figura");
                                System.out.println("Entre a marcar las casillas");
                                for (int pos = 0; pos < coordinate.length; pos++) {
                                    int xPos = coordinate[pos].x + j;
                                    //System.out.println("Pos x"+xPos);
                                    int yPos = coordinate[pos].y + i;
                                    //System.out.println("Pos y"+yPos);
                                    if (xPos < x) {
                                        if (yPos < y) {
                                            matriz[yPos][xPos] = 13;
                                            System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                        }
                                    }
                                }
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
                System.out.println("Ya termino todas las columnas");
                i++;
                j = 0;
            }
        }
        for(int i1=0;i1<x;i1++){
            for(int j1=0;j1<y;j1++){
               System.out.print(matriz[i1][j1]+"\t"); 
            }
            System.out.println();
        }
        fillStructure();
    }

    public void fillStructure(){
        Figure figure = new Figure();
        Coordinate[] coordinate;
        int i = 0;
        int j = 0;
        while (i < x) {
            System.out.println("Entrando a la posicion" + "(" + i + "," + j + ")");
            if (i < x) {
                if (j < y) {
                    if (matriz[i][j] == 0) {
                        for(int x1=0;x1<16;x1++){
                            if (x1 == 0) {
                                coordinate = figure.elePos1();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");

                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 1;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }

                                }
                            }
                            if (x1 == 1) {
                                coordinate = figure.elePos2();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 2;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 2) {
                                coordinate = figure.elePos3();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 3;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 3) {
                                coordinate = figure.elePos4();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 4;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 4) {
                                coordinate = figure.tePos1();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 5;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 5) {
                                coordinate = figure.tePos2();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 6;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 6) {
                                coordinate = figure.tePos3();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 7;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 7) {
                                coordinate = figure.tePos4();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 8;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 8) {
                                coordinate = figure.zetaPos1();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 9;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 9) {
                                coordinate = figure.zetaPos2();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 10;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 10) {
                                coordinate = figure.largoPos1();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 11;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 11) {
                                coordinate = figure.largoPos2();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 12;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 12) {
                                coordinate = figure.cuadrado();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 13;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 13) {
                                coordinate = figure.medioPos1();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 14;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 14) {
                                coordinate = figure.medioPos2();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 15;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
                                }
                            }
                            if (x1 == 15) {
                                coordinate = figure.corto();
                                if (verifyFigure(coordinate, i, j) == true) {
                                    System.out.println("Si se puede usar la figura");
                                    System.out.println("Entre a marcar las casillas");
                                    for (int pos = 0; pos < coordinate.length; pos++) {
                                        int xPos = coordinate[pos].x + j;
                                        //System.out.println("Pos x"+xPos);
                                        int yPos = coordinate[pos].y + i;
                                        //System.out.println("Pos y"+yPos);
                                        if (xPos < x) {
                                            if (yPos < y) {
                                                matriz[yPos][xPos] = 16;
                                                System.out.println("Casilla" + "(" + yPos + "," + xPos + ")" + " marcada");
                                            }
                                        }
                                    }
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
                System.out.println("Ya termino todas las columnas");
                i++;
                j = 0;
            }
        }
         for(int i1=0;i1<x;i1++){
            for(int j1=0;j1<y;j1++){
               System.out.print(matriz[i1][j1]+"\t"); 
            }
            System.out.println();
        }
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
                         System.out.println("Ya una casilla esta utilizada");
                         return state;
                     }
                 } else {
                     System.out.println("Fuera de rango");
                     state = false;
                     return state;
                 }
             } else {
                 System.out.println("Fuera de rango");
                 state = false;
                 return state;
             }
             k++;
         }
         System.out.println("En teoria salio true");
         return state;
    } 
}
