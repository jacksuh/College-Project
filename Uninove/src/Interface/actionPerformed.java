package Interface;

@Override
public void actionPerformed(ActionEvent e) {
    /*
     A ideia é assim: É um listerner para todos os botões.
     O Listener deve identificar qual botão foi clicado e disparar
     uma ação específica para cada um
     */
    if (e.getSource() == btnAdicionar) { //Para o botão adicionar
        String[] linha = {txtNome.getText(),
            txtTelefone.getText(),
            cmbCidadesModel.getSelectedItem().toString()};
        tblClientesModel.addRow(linha);
        JOptionPane.showMessageDialog(this, "Dados adicionados", "Feito", JOptionPane.PLAIN_MESSAGE);
    } else if (e.getSource() == btnLimpar) { //Para o botão limpar
        int op = JOptionPane.showConfirmDialog(this, "Quer, realmente, limpar os campos?", "Limpar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == 0) {
            txtNome.setText(null);
            txtTelefone.setText(null);
            cmbCidadesModel.setSelectedItem("São Paulo");
            txtNome.requestFocus(); //Coloca o cursor no txtNome
        }
    
}

}
