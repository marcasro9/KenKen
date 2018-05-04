/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import kenken.Figure;
import kenken.Structure;

/**
 *
 * @author Armando
 */
public final class Principal extends javax.swing.JFrame {

    JButton [][] CUADRO; 
    JButton [][] OPE; 
    int fils;
    int cols;
    int matrizP[][];
    List<Figure> figuresP;
    DefaultListModel modelo = new DefaultListModel();

    /**
     * Creates new form KenKen
     * @param x
     * @param y
     */
    public Principal(int x,int y) {
        initComponents();
        setSize(x*50+117,y*50+80);
        Structure prueba=new Structure();
        prueba.createEstructure(x,y);
        setMatriz(x,y,prueba.returnMatriz(),prueba.returnFigures());
    }

    public void setMatriz(int fils,int cols,int matriz[][],List<Figure> figures){
        //panelKenKen.removeAll();
        //panelOperations.removeAll();
        CUADRO = new JButton[fils][cols];
        OPE=new JButton[fils][cols];
        this.matrizP=matriz;
        this.figuresP=figures;
        this.fils=fils;
        this.cols=cols;
        int listColor[][]={
                      {255,0,0} , {255,0,0} , {0,255,0} , {0,0,255} , {255,255,0} , {165,10,0}
                    , {0,255,255} , {255,0,255} , {192,192,192} , {128,128,128} , {128,50,50} 
                    , {128,128,0} , {0,128,0} , {128,0,128} , {0,128,128} , {0,0,128} , {255,127,80}
                    , {250,128,114} , {255,69,0} , {255,140,0} , {255,165,0} , {184,134,11} , {218,165,32}
                    , {189,183,107} , {128,128,0} , {124,252,0} , {173,255,47} , {34,139,34} , {144,238,144} 
                    , {0,255,127} , {46,139,87} , {102,205,170} , {0,128,128} , {176,224,230} , {0,191,255}
                    , {147,112,219} , {139,0,139} , {186,85,211} , {216,191,216} , {238,130,238} , {255,20,147}
                    , {245,222,179} , {245,245,220} , {210,105,30} , {222,184,135} , {210,180,140} , {255,228,181}
                    ,{255,0,0} , {255,0,0} , {0,255,0} , {0,0,255} , {255,255,0} , {165,10,0}
                    , {0,255,255} , {255,0,255} , {192,192,192} , {128,128,128} , {128,50,50} 
                    , {128,128,0} , {0,128,0} , {128,0,128} , {0,128,128} , {0,0,128} , {255,127,80}
                    , {250,128,114} , {255,69,0} , {255,140,0} , {255,165,0} , {184,134,11} , {218,165,32}
                    , {189,183,107} , {128,128,0} , {124,252,0} , {173,255,47} , {34,139,34} , {144,238,144} 
                    , {0,255,127} , {46,139,87} , {102,205,170} , {0,128,128} , {176,224,230} , {0,191,255}
                    , {147,112,219} , {139,0,139} , {186,85,211} , {216,191,216} , {238,130,238} , {255,20,147}
                    , {245,222,179} , {245,245,220} , {210,105,30} , {222,184,135} , {210,180,140} , {255,228,181}
                    ,{255,0,0} , {255,0,0} , {0,255,0} , {0,0,255} , {255,255,0} , {165,10,0}
                    , {0,255,255} , {255,0,255} , {192,192,192} , {128,128,128} , {128,50,50} 
                    , {128,128,0} , {0,128,0} , {128,0,128} , {0,128,128} , {0,0,128} , {255,127,80}
                    , {250,128,114} , {255,69,0} , {255,140,0} , {255,165,0} , {184,134,11} , {218,165,32}
                    , {189,183,107} , {128,128,0} , {124,252,0} , {173,255,47} , {34,139,34} , {144,238,144} 
                    , {0,255,127} , {46,139,87} , {102,205,170} , {0,128,128} , {176,224,230} , {0,191,255}
                    , {147,112,219} , {139,0,139} , {186,85,211} , {216,191,216} , {238,130,238} , {255,20,147}
                    , {245,222,179} , {245,245,220} , {210,105,30} , {222,184,135} , {210,180,140} , {255,228,181}
                    ,{255,0,0} , {255,0,0} , {0,255,0} , {0,0,255} , {255,255,0} , {165,10,0}
                    , {0,255,255} , {255,0,255} , {192,192,192} , {128,128,128} , {128,50,50} 
                    , {128,128,0} , {0,128,0} , {128,0,128} , {0,128,128} , {0,0,128} , {255,127,80}
                    , {250,128,114} , {255,69,0} , {255,140,0} , {255,165,0} , {184,134,11} , {218,165,32}
                    , {189,183,107} , {128,128,0} , {124,252,0} , {173,255,47} , {34,139,34} , {144,238,144} 
                    , {0,255,127} , {46,139,87} , {102,205,170} , {0,128,128} , {176,224,230} , {0,191,255}
                    , {147,112,219} , {139,0,139} , {186,85,211} , {216,191,216} , {238,130,238} , {255,20,147}
                    , {245,222,179} , {245,245,220} , {210,105,30} , {222,184,135} , {210,180,140} , {255,228,181}};
        
        int x=0;
        int y=0;
        int x2=0;
        int y2=30;
        int fig;
        for(int i=0;i<figures.size();i++){
            int idColor=figures.get(i).id;
            if(figures.get(i).operacion==0){
                JButton button=new JButton(figures.get(i).id+":"+figures.get(i).total+"+");
                Color color=new Color(listColor[idColor][0],listColor[idColor][1],listColor[idColor][2]);
                button.setBackground(color);
                button.setBounds(x2,y2,50,10);
                panelOperations.add(button);
                panelOperations.updateUI();
                y2+=10;
            }
            if(figures.get(i).operacion==1){
                JButton button=new JButton(figures.get(i).id+":"+figures.get(i).total+"-");
                Color color=new Color(listColor[idColor][0],listColor[idColor][1],listColor[idColor][2]);
                button.setBackground(color);
                button.setBounds(x2,y2,50,10);
                panelOperations.add(button);
                panelOperations.updateUI();
                y2+=10;
            }
            if(figures.get(i).operacion==2){
                JButton button=new JButton(figures.get(i).id+":"+figures.get(i).total+"*");
                Color color=new Color(listColor[idColor][0],listColor[idColor][1],listColor[idColor][2]);
                button.setBackground(color);
                button.setBounds(x2,y2,50,10);
                panelOperations.add(button);
                panelOperations.updateUI();
                y2+=10;
            }
            if(figures.get(i).operacion==3){
                JButton button=new JButton(figures.get(i).id+":"+figures.get(i).total+"/");
                Color color=new Color(listColor[idColor][0],listColor[idColor][1],listColor[idColor][2]);
                button.setBackground(color);
                button.setBounds(x2,y2,50,10);
                panelOperations.add(button);
                panelOperations.updateUI();
                y2+=10;
            }
            if(figures.get(i).operacion==4){
                JButton button=new JButton(figures.get(i).id+":"+figures.get(i).total+"%");
                Color color=new Color(listColor[idColor][0],listColor[idColor][1],listColor[idColor][2]);
                button.setBackground(color);
                button.setBounds(x2,y2,50,10);
                panelOperations.add(button);
                panelOperations.updateUI();
                y2+=10;
            }
            if(figures.get(i).operacion==5){
                JButton button=new JButton(figures.get(i).id+":"+figures.get(i).total+"^");
                Color color=new Color(listColor[idColor][0],listColor[idColor][1],listColor[idColor][2]);
                button.setBackground(color);
                button.setBounds(x2,y2,50,10);
                button.setSize(10, 10);
                panelOperations.add(button);
                panelOperations.updateUI();
                y2+=10;
            }
        }
        Font controlFont = new Font("Dialog", Font.BOLD, 15);
        List<Integer> intList = new ArrayList<>();
        
        for(int i=0; i < fils ; i++){
            for(int j=0; j < cols; j++){
                if(labelTrue(intList,matriz[i][j])==true){
                        JLabel label= new JLabel(""+matriz[i][j]);
                        label.setFont(controlFont);
                        label.setBounds(x+2,y,30,30);
                        panelKenKen.add(label);
                        intList.add(matriz[i][j]);
                }
                CUADRO[i][j]=new JButton();
                CUADRO[i][j].setFont(controlFont);
                CUADRO[i][j].setText("");
                CUADRO[i][j].setBounds(x,y,50,50);
                fig=matriz[i][j];
                Color color=new Color(listColor[fig][0],listColor[fig][1],listColor[fig][2]);
                CUADRO[i][j].setBackground(color);
                CUADRO[i][j].setEnabled(false);
                //CUADRO[i][j].setBorder(BorderFactory.createBevelBorder(0,color,color));
                panelKenKen.add(CUADRO[i][j]);
                panelKenKen.updateUI();
                x+=50;
            }
            x=0;
            y+=50;
        }
       
    }
    public boolean labelTrue(List<Integer> intList ,int l){
        boolean estado=true;
        for(int i=0;i<intList.size();i++){
            if(l==intList.get(i)){
                estado=false;
                return estado;
            }
        }
        return estado;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelKenKen = new javax.swing.JPanel();
        jBComplete = new javax.swing.JButton();
        jSave = new javax.swing.JButton();
        jBLoad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelOperations = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBComplete.setText("Complete");
        jBComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCompleteActionPerformed(evt);
            }
        });

        jSave.setText("Save");
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        jBLoad.setText("Load");
        jBLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKenKenLayout = new javax.swing.GroupLayout(panelKenKen);
        panelKenKen.setLayout(panelKenKenLayout);
        panelKenKenLayout.setHorizontalGroup(
            panelKenKenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKenKenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBComplete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLoad)
                .addContainerGap(883, Short.MAX_VALUE))
        );
        panelKenKenLayout.setVerticalGroup(
            panelKenKenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKenKenLayout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addGroup(panelKenKenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBComplete)
                    .addComponent(jSave)
                    .addComponent(jBLoad))
                .addContainerGap())
        );

        panelOperations.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panelOperations);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelKenKen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKenKen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        // TODO add your handling code here:
    	//Un texto cualquiera guardado en una variable
        String matriz="";
        String figures="";
        for(int i=0;i<figuresP.size();i++){
            figures+="/"+String.valueOf(figuresP.get(i).id)+","+String.valueOf(figuresP.get(i).nombre)+","+String.valueOf(figuresP.get(i).operacion)+","+String.valueOf(figuresP.get(i).total)+","+String.valueOf(figuresP.get(i).cuadritos);
            for(int j=0;j<figuresP.get(i).posiciones.size();j++){
                figures+=",("+String.valueOf(figuresP.get(i).posiciones.get(j).x)+"."+String.valueOf(figuresP.get(i).posiciones.get(j).y+")");
            }
            figures+="\r\n";
        }
        for(int i=0;i<fils;i++){
            for(int j=0;j<cols;j++){
                matriz+=String.valueOf(matrizP[i][j])+",";
            }
        }
        try
        {
        //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
        File archivo=new File("C:\\Users\\Armando\\Documents\\PrimerSemestre2018\\Analisis\\matriz.txt");
        File archivo2=new File("C:\\Users\\Armando\\Documents\\PrimerSemestre2018\\Analisis\\figures.txt");

        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
        FileWriter escribir=new FileWriter(archivo,true);
        FileWriter escribir2=new FileWriter(archivo2,true);

        //Escribimos en el archivo con el metodo write 
        escribir.write(matriz);
        escribir2.write(figures);
        //Cerramos la conexion
        escribir.close();
        escribir2.close();
        }

        //Si existe un problema al escribir cae aqui
        catch(Exception e)
        {
        System.out.println("Error al escribir");
        }
    }//GEN-LAST:event_jSaveActionPerformed

    private void jBLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoadActionPerformed
        // TODO add your handling code here:
        String texto="";
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            BufferedReader bf1 = new BufferedReader(new FileReader("C:\\Users\\Armando\\Documents\\PrimerSemestre2018\\Analisis\\matriz.txt"));
            BufferedReader bf2 = new BufferedReader(new FileReader("C:\\Users\\Armando\\Documents\\PrimerSemestre2018\\Analisis\\figures.txt"));
            // Lectura del fichero
            String linea1="";
            String linea2="";
            String bfRead1;
            String bfRead2;
            String[] arregloDeCadena1=null;
            String[] arregloDeCadena2=null;
            String[] arregloFigura=null;
            while ((bfRead1 = bf1.readLine()) != null) {
                linea1 =linea1 + bfRead1;
                arregloDeCadena1 = linea1.split(",");
            }
            while ((bfRead2 = bf2.readLine()) != null) {
                linea2 =linea2 + bfRead2;
                arregloDeCadena2 = linea2.split("/");
                arregloFigura = linea2.split(",");
            }
            for(int i=0;i<fils;i++){
                for(int j=0;j<cols;j++){
                    matrizP[i][j]=Integer.parseInt(arregloDeCadena1[i+j]);
                }
            }
            setMatriz(fils,cols,matrizP,figuresP);
            //for(int i=0;i<arregloDeCadena2.length;i++){
            //    figuresP.get(i).id=Integer.parseInt(arregloDeCadena2[i]);
            //}
//            for(int i=0;i<arregloDeCadena2.length;i++){
//                String dato=arregloDeCadena2[i];
//                for(int j=0;j<dato.length();j++){
//                    figuresP.get(i).id=dato.charAt(0);
//                    figuresP.get(i).id=dato.charAt(1);
//                    System.out.println(dato.charAt(j));
//                    System.out.println("-------------");
//                }
//            }
            
            
        } catch (Exception e) {
            System.err.println("No se pudo abrir");
        }
    }//GEN-LAST:event_jBLoadActionPerformed

    private void jBCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCompleteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBCompleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComplete;
    private javax.swing.JButton jBLoad;
    private javax.swing.JButton jSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelKenKen;
    private javax.swing.JPanel panelOperations;
    // End of variables declaration//GEN-END:variables
}
