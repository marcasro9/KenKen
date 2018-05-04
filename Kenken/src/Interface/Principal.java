/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
    DefaultListModel modelo = new DefaultListModel();
    JFileChooser seleccionar=new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
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
        CUADRO = new JButton[fils][cols];
        OPE=new JButton[fils][cols];
        this.matrizP=matriz;
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
    public String AbrirArchivo(File archivo){
        String documento="";
        try{
            entrada=new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter=(char)ascci;
                documento+=caracter;
            }
            
        }catch(Exception e){
            
        }
        return documento;
    }
    
    public String GuardarArchivo(File archivo,String documento){
        String mensaje=null;
        try{
            salida=new FileOutputStream(archivo);
            byte[] bytxt=documento.getBytes();
            salida.write(bytxt);
            mensaje="Archivo guardado";
        }catch(Exception e){
            
        }
        return mensaje;
        
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
    	
    }//GEN-LAST:event_jSaveActionPerformed

    private void jBLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoadActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                String documento=AbrirArchivo(archivo);
                for(int i=0;i<documento.length();i++){
                    System.out.println(documento.indexOf(i));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_jBLoadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComplete;
    private javax.swing.JButton jBLoad;
    private javax.swing.JButton jSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelKenKen;
    private javax.swing.JPanel panelOperations;
    // End of variables declaration//GEN-END:variables
}
