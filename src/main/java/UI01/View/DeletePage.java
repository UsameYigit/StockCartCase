package UI01.View;

import javax.swing.JPanel;
import javax.swing.JList;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class DeletePage extends JPanel {
	
	private JTextField txtBarcode;
	private JTextArea txtAreaDescription;
	private JTextField txtCreationDate;
	private JList listStockCode;
	private JButton btnDelete;
	private JButton btnCopy;


	/**
	 * Create the panel.
	 */
	public DeletePage() {
		initialize();
	}
	

	private void initialize() {
		setLayout(null);
		 
		listStockCode = new JList();
		listStockCode.setBounds(30, 36, 206, 319);
		add(listStockCode);
		
		btnDelete = new JButton("Sil");
		btnDelete.setBounds(275, 298, 171, 23);
		add(btnDelete);
		
		btnCopy = new JButton("Kopyala");
		btnCopy.setBounds(275, 332, 171, 23);
		add(btnCopy);
		
		txtBarcode = new JTextField();
		txtBarcode.setEnabled(false);
		txtBarcode.setBounds(275, 59, 171, 20);
		add(txtBarcode);
		txtBarcode.setColumns(10);
		
		txtAreaDescription = new JTextArea();
		txtAreaDescription.setEnabled(false);
		txtAreaDescription.setBounds(275, 115, 171, 116);
		add(txtAreaDescription);
		
		txtCreationDate = new JTextField();
		txtCreationDate.setEnabled(false);
		txtCreationDate.setBounds(275, 267, 171, 20);
		add(txtCreationDate);
		txtCreationDate.setColumns(10);
		
		//Labels
		JLabel lblStockCarts = new JLabel("Stok Kartları");
		lblStockCarts.setBounds(30, 11, 87, 14);
		add(lblStockCarts);
		
		JLabel lblBarcode = new JLabel("Barkod");
		lblBarcode.setBounds(275, 36, 123, 14);
		add(lblBarcode);
		
		JLabel lblDescription = new JLabel("Açıklama");
		lblDescription.setBounds(275, 90, 123, 14);
		add(lblDescription);
		
		JLabel lblCreationDate = new JLabel("Oluşturulma Tarihi");
		lblCreationDate.setBounds(275, 242, 123, 14);
		add(lblCreationDate);

	}
	
	public JButton getBtnCopy() {
		return btnCopy;
	}


	public void setBtnCopy(JButton btnCopy) {
		this.btnCopy = btnCopy;
	}
	
	public JButton getBtnDelete() {
		return btnDelete;
	}


	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}


	public JTextField getTxtBarcode() {
		return txtBarcode;
	}


	public void setTxtBarcode(JTextField txtBarcode) {
		this.txtBarcode = txtBarcode;
	}


	public JTextArea getTxtAreaDescription() {
		return txtAreaDescription;
	}


	public void setTxtAreaDescription(JTextArea txtAreaDescription) {
		this.txtAreaDescription = txtAreaDescription;
	}


	public JTextField getTxtCreationDate() {
		return txtCreationDate;
	}


	public void setTxtCreationDate(JTextField txtCreationDate) {
		this.txtCreationDate = txtCreationDate;
	}


	public JList getListStockCode() {
		return listStockCode;
	}


	public void setListStockCode(JList listStockCode) {
		this.listStockCode = listStockCode;
	}
}
