
package com.mycompany.caducalc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author jØww
 */
public class frmCalculadora extends javax.swing.JFrame {

     List<String> numero = new ArrayList<String>();
    private boolean Virgular=true;
    String Valor1, Valor2, conteudo, operacao;
    Double resultado;
    
    
    /**
     * Creates new form frmCalculadora
     */
    public frmCalculadora() {
        initComponents();
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        txtmostrar = new javax.swing.JTextField();
        btIgual = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btHistorico = new javax.swing.JButton();
        btMultiplicaçao = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btMais = new javax.swing.JButton();
        btMaiseMenos = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btRaiz = new javax.swing.JButton();
        btAC = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        btVirgular = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        btBorrachar = new javax.swing.JButton();
        bt1x = new javax.swing.JButton();
        btx2 = new javax.swing.JButton();
        JFrTela = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmostrar.setFont(new java.awt.Font("Lucida Console", 1, 36)); // NOI18N
        txtmostrar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtmostrar.setText("0");
        getContentPane().add(txtmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 320, 70));

        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });
        getContentPane().add(btIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 80, 60));

        btDividir.setText("/");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });
        getContentPane().add(btDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 80, 60));

        btHistorico.setText("Historico");
        btHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHistoricoMouseClicked(evt);
            }
        });
        btHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHistoricoActionPerformed(evt);
            }
        });
        getContentPane().add(btHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, 140));

        btMultiplicaçao.setText("*");
        btMultiplicaçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicaçaoActionPerformed(evt);
            }
        });
        getContentPane().add(btMultiplicaçao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 80, 60));

        btMenos.setText("-");
        btMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 80, 60));

        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 80, 60));

        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        getContentPane().add(bt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 80, 60));

        btMais.setText("+");
        btMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisActionPerformed(evt);
            }
        });
        getContentPane().add(btMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 80, 60));

        btMaiseMenos.setText("+/-");
        btMaiseMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaiseMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btMaiseMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 80, 60));

        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 80, 60));

        btRaiz.setText("\t√");
        btRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRaizActionPerformed(evt);
            }
        });
        getContentPane().add(btRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 80, 60));

        btAC.setText("AC");
        btAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACActionPerformed(evt);
            }
        });
        getContentPane().add(btAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 60));

        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 80, 60));

        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 80, 60));

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 100, 60));

        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        getContentPane().add(bt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 80, 60));

        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 80, 60));

        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 80, 60));

        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 80, 60));

        btVirgular.setText(",");
        btVirgular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVirgularActionPerformed(evt);
            }
        });
        getContentPane().add(btVirgular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 80, 60));

        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        getContentPane().add(bt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 80, 60));

        btBorrachar.setText("<---");
        btBorrachar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorracharActionPerformed(evt);
            }
        });
        getContentPane().add(btBorrachar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, 60));

        bt1x.setText("1/X");
        bt1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1xActionPerformed(evt);
            }
        });
        getContentPane().add(bt1x, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 80, 60));

        btx2.setText("X^2");
        btx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btx2ActionPerformed(evt);
            }
        });
        getContentPane().add(btx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 80, 60));

        JFrTela.setText("0");
        getContentPane().add(JFrTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
String resultadototal;
Valor2=txtmostrar.getText();
if(!Valor2.equals("")){
    resultadototal=operacoes(Valor1,Valor2, operacao);
    txtmostrar.setText(resultadototal);
}
    }//GEN-LAST:event_btIgualActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        // TODO add your handling code here:
        if(!txtmostrar.getText().equals("")){
    Valor1=txtmostrar.getText();
    operacao="/";
    txtmostrar.setText("");
        }
    }//GEN-LAST:event_btDividirActionPerformed

    private void btHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHistoricoActionPerformed

    }//GEN-LAST:event_btHistoricoActionPerformed

    private void btMultiplicaçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicaçaoActionPerformed
if(!txtmostrar.getText().equals("")){
    Valor1=txtmostrar.getText();
    operacao="*";
    txtmostrar.setText("");    }//GEN-LAST:event_btMultiplicaçaoActionPerformed
    }
    private void btMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosActionPerformed
        if(!txtmostrar.getText().equals("")){
    Valor1=txtmostrar.getText();
    operacao="-";
    txtmostrar.setText("");
        }
    }//GEN-LAST:event_btMenosActionPerformed
    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        txtmostrar.setText(txtmostrar.getText() +"2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
     txtmostrar.setText(txtmostrar.getText() +"0");
    }//GEN-LAST:event_bt0ActionPerformed

    private void btMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisActionPerformed
if(!txtmostrar.getText().equals("")){
    Valor1=txtmostrar.getText();
    operacao="+";
    txtmostrar.setText("");
}
    }//GEN-LAST:event_btMaisActionPerformed

    private void btMaiseMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaiseMenosActionPerformed
conteudo=txtmostrar.getText();
if(conteudo.length()>0){
    resultado=(-1)*Double.parseDouble(conteudo);
    txtmostrar.setText(resultado.toString());
    
}
    }//GEN-LAST:event_btMaiseMenosActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
txtmostrar.setText(txtmostrar.getText() +"6");    }//GEN-LAST:event_bt6ActionPerformed

    private void btRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRaizActionPerformed
       conteudo=txtmostrar.getText();
       if(conteudo.length()>0){
           resultado=Math.sqrt(Double.parseDouble(conteudo));
           txtmostrar.setText(resultado.toString());
       }
    }//GEN-LAST:event_btRaizActionPerformed

    private void btACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACActionPerformed
txtmostrar.setText("");
    }//GEN-LAST:event_btACActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        txtmostrar.setText(txtmostrar.getText() +"7");
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
txtmostrar.setText(txtmostrar.getText() +"3");    }//GEN-LAST:event_bt3ActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btFecharActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
txtmostrar.setText(txtmostrar.getText() +"9");    }//GEN-LAST:event_bt9ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
txtmostrar.setText(txtmostrar.getText() +"5");    }//GEN-LAST:event_bt5ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
txtmostrar.setText(txtmostrar.getText() +"4");    }//GEN-LAST:event_bt4ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText() +"1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void btVirgularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVirgularActionPerformed
conteudo=txtmostrar.getText();
if(conteudo.length()<=0){
    txtmostrar.setText(",");
}else 
    if (txtmostrar.getText().contains(",")){
        
    }else{
        txtmostrar.setText(txtmostrar.getText()+",");
        Virgular=false;
    }
    }//GEN-LAST:event_btVirgularActionPerformed
public static String operacoes(String Valor1,String Valor2,String operacao){
    Double resultadodacalc=0.0;
    String resposta;
    
    if (operacao.equals("+")){
    resultadodacalc=Double.parseDouble(Valor1)+Double.parseDouble(Valor2);
}else if (operacao.equals("-")){
    resultadodacalc=Double.parseDouble(Valor1)-Double.parseDouble(Valor2);
}else if (operacao.equals("*")){
    resultadodacalc=Double.parseDouble(Valor1)*Double.parseDouble(Valor2);
}else if (operacao.equals("/")){
    resultadodacalc=Double.parseDouble(Valor1)/Double.parseDouble(Valor2);
}
    resposta=resultadodacalc.toString();
    return resposta;
}    
    
       
    
    /*
public class ControladoraController {

private Double total;
    
public ControladoraController(){
    total = 0.0;
}

public Double realizaOperacao(EnumOperacao operacao, Double valor){
        if (operacao.equals(EnumOperacao.SOMA)){
            total += valor;
        } else  if (operacao.equals(EnumOperacao.SUBTRAÇÃO)){
            total -= valor;
      }else  if (operacao.equals(EnumOperacao.MULTIPLICAÇAO)){
            total *= valor;
      }else  if (operacao.equals(EnumOperacao.DIVISAO)){
            total /= valor;
                }
        return total;
    }
 public Double getTotal(){
        return this.total;
    }
    
    public void zerar(){
        total = 0.0; 
    }   
}
  */  
    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
txtmostrar.setText(txtmostrar.getText() +"8");    }//GEN-LAST:event_bt8ActionPerformed

    private void btBorracharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorracharActionPerformed
conteudo=txtmostrar.getText();
if(conteudo.length()>0){
    conteudo=conteudo.substring(0,conteudo.length()-1);
    txtmostrar.setText(conteudo);
}
    }//GEN-LAST:event_btBorracharActionPerformed

    private void bt1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1xActionPerformed
       conteudo=txtmostrar.getText();
       if(conteudo.length()>0){
           resultado=1/(Double.parseDouble(conteudo));
           txtmostrar.setText(resultado.toString());
       }
    }//GEN-LAST:event_bt1xActionPerformed

    private void btx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btx2ActionPerformed
 conteudo=txtmostrar.getText();
       if(conteudo.length()>0){
        resultado=Math.pow(Double.parseDouble(conteudo), 2);
        txtmostrar.setText(resultado.toString());
       }
    }//GEN-LAST:event_btx2ActionPerformed

    private void btHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHistoricoMouseClicked
    
    }//GEN-LAST:event_btHistoricoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JFrTela;
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt1x;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btAC;
    private javax.swing.JButton btBorrachar;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btHistorico;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMais;
    private javax.swing.JButton btMaiseMenos;
    private javax.swing.JButton btMenos;
    private javax.swing.JButton btMultiplicaçao;
    private javax.swing.JButton btRaiz;
    private javax.swing.JButton btVirgular;
    private javax.swing.JButton btx2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtmostrar;
    // End of variables declaration//GEN-END:variables
}
