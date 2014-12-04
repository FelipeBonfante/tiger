/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiger.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author galerinha do print
 */
public class GraphicCodeScreenTigerNovo extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJFrame
     */
    private int cont;     
    public GraphicCodeScreenTigerNovo() {
        initComponents();
        this.setClosable(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        arqName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodeTextTiger = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Interface Gráfica Tiger"));

        jLabel1.setText("Nome do Arquivo");

        jScrollPane1.setViewportView(CodeTextTiger);

        jLabel2.setText("Digite o código abaixo");

        jButton1.setText("Compilar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Abrir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arqName)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 488, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arqName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cont =1;
        FileWriter arq = null; 
       String path = new java.io.File("").getAbsolutePath()+File.separator+"test";
       String fileName = arqName.getText();
       String definitivePath = path+File.separator+fileName+".tig";
        try {
            arq = new FileWriter(definitivePath);
        } catch (IOException ex) {
            Logger.getLogger(GraphicCodeScreenTiger.class.getName()).log(Level.SEVERE, null, ex);
        }
       PrintWriter gravarArq = new PrintWriter(arq); 
       gravarArq.printf(CodeTextTiger.getText());
        try {
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(GraphicCodeScreenTiger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, fileName +".tig criado com sucesso", "Criação do Arquivo .tig", JOptionPane.INFORMATION_MESSAGE);
        Tiger.compileCode(definitivePath);
        if(cont ==1){
        verificaStatus(false);
        }
        JOptionPane.showMessageDialog(null,"Há problemas nos registradores e labels.Para compilar reabra a aplicação ", "Controle de Execução", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser janelaArquivos = new JFileChooser();
        if (janelaArquivos.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File arquivoEscolhido = janelaArquivos.getSelectedFile();
            String textoArquivo = pegaTextoArquivo(arquivoEscolhido);
            CodeTextTiger.setText(textoArquivo);
            String nomeArquivo = arquivoEscolhido.getName();
            String fileName = nomeArquivo.substring(0, nomeArquivo.lastIndexOf("."));
            arqName.setText(fileName);
            CodeTextTiger.setCaretPosition(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
 
    private void verificaStatus(boolean par) {
      jButton1.setEnabled(par);
      jButton2.setEnabled(par);
    }
    
    public String pegaTextoArquivo(File arquivo) {
        if (arquivo != null && arquivo.exists()) {
            try {
                FileReader leitorArquivo = new FileReader(arquivo);
                BufferedReader leitorBuferizado = new BufferedReader(
                        leitorArquivo);
                String textoArquivo = "";
                String linhaArquivo = null;
                while ((linhaArquivo = leitorBuferizado.readLine()) != null) {
                    textoArquivo += linhaArquivo + "\n";
                }
                leitorBuferizado.close();
                return textoArquivo;
            } catch (Exception e) {
                System.out.println("Arquivo nao pode ser lido!");
                e.printStackTrace();
            }
        }
        return "";
    }
        
        
    /**
     * @param args the command line arguments
     */

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane CodeTextTiger;
    private javax.swing.JTextField arqName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
