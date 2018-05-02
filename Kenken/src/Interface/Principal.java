/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import kenken.Structure;

/**
 *
 * @author Armando
 */
public final class Principal extends javax.swing.JFrame {

    JButton [][] CUADRO;   
    int fils;
    int cols;
    DefaultListModel modelo = new DefaultListModel();
    /**
     * Creates new form KenKen
     * @param x
     * @param y
     */
    public Principal(int x,int y) {
        initComponents();
        listOperations.setModel(modelo);
        setSize(x*50+107,y*50+28);
        Structure prueba=new Structure();
        prueba.createEstructure(x,y);
        setMatriz(x,y,prueba.returnMatriz());
    }

    public void setMatriz(int fils,int cols,int matriz[][]){
        CUADRO = new JButton[fils][cols];
        int listColor[][]={{255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},
        {64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},
        {238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238},{255,255,255},{255,228,196},{30,144,255},
        {64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},
        {191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},
        {255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},
        {191,239,55},{255,181,197},{238,121,159},{238,210,238},{255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},
        {255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},
        {64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},
        {238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238},{255,255,255},{255,228,196},{30,144,255},
        {64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},
        {191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},
        {255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},
        {191,239,55},{255,181,197},{238,121,159},{238,210,238},{255,255,255},{255,228,196},{30,144,255},{64,224,208},{0,255,127},{255,255,0},{191,239,55},{255,181,197},{238,121,159},{238,210,238,255,255,255},{255,228,196}};
        
        int x=0;
        int y=0;
        int fig;
        int totalOperations=0;
        for(int i=0; i < fils ; i++){
            for(int j=0; j < cols; j++){
                if(matriz[i][j]>totalOperations){
                    totalOperations=matriz[i][j];
                }
            }
        }
        for(int i=0;i<totalOperations;i++){
            modelo.addElement((i+1)+":operation");
        }
        for(int i=0; i < fils ; i++){
            for(int j=0; j < cols; j++){
                CUADRO[i][j]=new JButton(""+matriz[i][j]+"");
                CUADRO[i][j].setBounds(x,y,50,50);
                fig=matriz[i][j];
                Color color=new Color(listColor[fig][0],listColor[fig][1],listColor[fig][2]);
                CUADRO[i][j].setBackground(color);
                CUADRO[i][j].setBorder(BorderFactory.createBevelBorder(0,color,color));
                panelKenKen.add(CUADRO[i][j]);
                panelKenKen.updateUI();
                x+=50;
            }
            x=0;
            y+=50;
        }
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
        panelOperations = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOperations = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout panelKenKenLayout = new javax.swing.GroupLayout(panelKenKen);
        panelKenKen.setLayout(panelKenKenLayout);
        panelKenKenLayout.setHorizontalGroup(
            panelKenKenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        panelKenKenLayout.setVerticalGroup(
            panelKenKenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Operations");

        jScrollPane1.setViewportView(listOperations);

        javax.swing.GroupLayout panelOperationsLayout = new javax.swing.GroupLayout(panelOperations);
        panelOperations.setLayout(panelOperationsLayout);
        panelOperationsLayout.setHorizontalGroup(
            panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelOperationsLayout.setVerticalGroup(
            panelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperationsLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelKenKen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKenKen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listOperations;
    private javax.swing.JPanel panelKenKen;
    private javax.swing.JPanel panelOperations;
    // End of variables declaration//GEN-END:variables
}
