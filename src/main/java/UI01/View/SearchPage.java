package UI01.View;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class SearchPage extends JPanel {
	
	private JButton btnSearch;
	private JTextField txtSearch;
	private JTextField txtStockCode;
	private JTextField txtStockName;
	private JTextField txtStockType;
	private JTextField txtUnit;
	private JTextField txtBarcode;
	private JTextField txtTaxType;
	private JFormattedTextField ftxtDateCreated;
	private JTextArea txtAreaDescription;
	private JList listStockCarts;
	private JLabel lblSearch;
	private JLabel lblStockCarts;
	private JLabel lblStockCode;
	private JLabel lblStockName;
	private JLabel lblStockType;
	private JLabel lblUnit;
	private JLabel lblBarcode;
	private JLabel lblTaxtType;
	private JLabel lblDataCreated;
	private JLabel lblDescription;

	/**
	 * Create the panel.
	 */
	public SearchPage() {
		initialize();

	}
	
	
	private void initialize() {
		setLayout(null);
		
		listStockCarts = new JList();
		listStockCarts.setBounds(30, 78, 175, 234);
		add(listStockCarts);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(30, 30, 86, 20);
		add(txtSearch);
		txtSearch.setColumns(10);
		
		btnSearch = new JButton("Ara");
		btnSearch.setBounds(126, 29, 79, 23);
		add(btnSearch);
		
		txtStockCode = new JTextField();
		txtStockCode.setEnabled(false);
		txtStockCode.setBounds(240, 76, 86, 20);
		add(txtStockCode);
		txtStockCode.setColumns(10);
		
		txtStockName = new JTextField();
		txtStockName.setEnabled(false);
		txtStockName.setBounds(240, 130, 86, 20);
		add(txtStockName);
		txtStockName.setColumns(10);
		
		txtStockType = new JTextField();
		txtStockType.setEnabled(false);
		txtStockType.setBounds(240, 180, 86, 20);
		add(txtStockType);
		txtStockType.setColumns(10);
		
		txtUnit = new JTextField();
		txtUnit.setEnabled(false);
		txtUnit.setBounds(240, 230, 86, 20);
		add(txtUnit);
		txtUnit.setColumns(10);
		
		txtBarcode = new JTextField();
		txtBarcode.setEnabled(false);
		txtBarcode.setBounds(360, 76, 86, 20);
		add(txtBarcode);
		txtBarcode.setColumns(10);
		
		txtTaxType = new JTextField();
		txtTaxType.setEnabled(false);
		txtTaxType.setBounds(360, 130, 86, 20);
		add(txtTaxType);
		txtTaxType.setColumns(10);
		
		ftxtDateCreated = new JFormattedTextField();
		ftxtDateCreated.setEnabled(false);
		ftxtDateCreated.setBounds(360, 180, 86, 20);
		add(ftxtDateCreated);
		
		txtAreaDescription = new JTextArea();
		txtAreaDescription.setEnabled(false);
		txtAreaDescription.setBounds(360, 233, 125, 79);
		add(txtAreaDescription);
		
		lblSearch = new JLabel("Ara");
		lblSearch.setBounds(30, 11, 70, 14);
		add(lblSearch);
		
		lblStockCarts = new JLabel("Stok Kartları");
		lblStockCarts.setBounds(30, 53, 99, 14);
		add(lblStockCarts);
		
		lblStockCode = new JLabel("Stok Kodu");
		lblStockCode.setBounds(240, 51, 75, 14);
		add(lblStockCode);
		
		lblStockName = new JLabel("Stok Adı");
		lblStockName.setBounds(360, 53, 75, 14);
		add(lblStockName);
		
		lblStockType = new JLabel("Stok Tipi");
		lblStockType.setBounds(240, 105, 75, 14);
		add(lblStockType);
		
		lblUnit = new JLabel("Birimi");
		lblUnit.setBounds(360, 105, 75, 14);
		add(lblUnit);
		
		lblBarcode = new JLabel("Barkod");
		lblBarcode.setBounds(240, 155, 75, 14);
		add(lblBarcode);
		
		lblTaxtType = new JLabel("Vergi Tipi");
		lblTaxtType.setBounds(360, 155, 75, 14);
		add(lblTaxtType);
		
		lblDataCreated = new JLabel("Oluşturma Tarihi");
		lblDataCreated.setBounds(240, 205, 99, 14);
		add(lblDataCreated);
		
		lblDescription = new JLabel("Açıklama");
		lblDescription.setBounds(360, 208, 75, 14);
		add(lblDescription);
	}
	

	public JTextField getTxtSearch() {
		return txtSearch;
	}


	public void setTxtSearch(JTextField txtSearch) {
		this.txtSearch = txtSearch;
	}


	public JTextField getTxtStockCode() {
		return txtStockCode;
	}


	public void setTxtStockCode(JTextField txtStockCode) {
		this.txtStockCode = txtStockCode;
	}


	public JTextField getTxtStockName() {
		return txtStockName;
	}


	public void setTxtStockName(JTextField txtStockName) {
		this.txtStockName = txtStockName;
	}


	public JTextField getTxtStockType() {
		return txtStockType;
	}


	public void setTxtStockType(JTextField txtStockType) {
		this.txtStockType = txtStockType;
	}


	public JTextField getTxtUnit() {
		return txtUnit;
	}


	public void setTxtUnit(JTextField txtUnit) {
		this.txtUnit = txtUnit;
	}


	public JTextField getTxtBarcode() {
		return txtBarcode;
	}


	public void setTxtBarcode(JTextField txtBarcode) {
		this.txtBarcode = txtBarcode;
	}


	public JTextField getTxtTaxType() {
		return txtTaxType;
	}


	public void setTxtTaxType(JTextField txtTaxType) {
		this.txtTaxType = txtTaxType;
	}


	public JFormattedTextField getFtxtDateCreated() {
		return ftxtDateCreated;
	}


	public void setFtxtDateCreated(JFormattedTextField ftxtDateCreated) {
		this.ftxtDateCreated = ftxtDateCreated;
	}


	public JTextArea getTxtAreaDescription() {
		return txtAreaDescription;
	}


	public void setTxtAreaDescription(JTextArea txtAreaDescription) {
		this.txtAreaDescription = txtAreaDescription;
	}


	public JList getListStockCarts() {
		return listStockCarts;
	}


	public void setListStockCarts(JList listStockCarts) {
		this.listStockCarts = listStockCarts;
	}
	
	public JButton getBtnSearch() {
		return btnSearch;
	}


	public void setBtnSearch(JButton btnSearch) {
		this.btnSearch = btnSearch;
	}
}
