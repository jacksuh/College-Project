package Interface;

@Override
public void actionPerformed(ActionEvent e) {
    /*
     A ideia � assim: � um listerner para todos os bot�es.
     O Listener deve identificar qual bot�o foi clicado e disparar
     uma a��o espec�fica para cada um
     */
    if (e.getSource() == btnAdicionar) { //Para o bot�o adicionar
        String[] linha = {txtNome.getText(),
            txtTelefone.getText(),
            cmbCidadesModel.getSelectedItem().toString()};
        tblClientesModel.addRow(linha);
        JOptionPane.showMessageDialog(this, "Dados adicionados", "Feito", JOptionPane.PLAIN_MESSAGE);
    } else if (e.getSource() == btnLimpar) { //Para o bot�o limpar
        int op = JOptionPane.showConfirmDialog(this, "Quer, realmente, limpar os campos?", "Limpar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == 0) {
            txtNome.setText(null);
            txtTelefone.setText(null);
            cmbCidadesModel.setSelectedItem("S�o Paulo");
            txtNome.requestFocus(); //Coloca o cursor no txtNome
        }
    
}

}
