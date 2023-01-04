package UI01.View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;


public class UpdatePage extends JPanel {
	
	private JComboBox cmbStockCode;
	private JTextField txtStockName;
	private JTextField txtBarcode;
	private JComboBox cmbStockType;
	private JComboBox cmbUnit;
	private JComboBox cmbTaxType;
	private JFormattedTextField ftxtFieldCreationDate;
	private JTextArea txtAreaDescription;
	JButton btnUpdate;
	
	/**
	 * Create the panel.
	 */
	public UpdatePage() {
		
		initialize();
	}
	
	
	private void initialize() {
		setLayout(null);
		
		 
		cmbStockCode = new JComboBox();
		cmbStockCode.setBounds(30, 39, 150, 22);
		add(cmbStockCode);
		
		txtStockName = new JTextField();
		txtStockName.setBounds(30, 100, 150, 20);
		add(txtStockName);
		txtStockName.setColumns(10);
		
		cmbStockType = new JComboBox();
		cmbStockType.setModel(new DefaultComboBoxModel(new String[] {"11", "12", "21", "22"}));
		cmbStockType.setBounds(30, 160, 150, 22);
		add(cmbStockType);
		
		cmbUnit = new JComboBox();
		cmbUnit.setModel(new DefaultComboBoxModel(new String[] {"İç", "Dış"}));
		cmbUnit.setBounds(30, 221, 150, 22);
		add(cmbUnit);
		
		txtBarcode = new JTextField();
		txtBarcode.setBounds(220, 40, 150, 20);
		add(txtBarcode);
		txtBarcode.setColumns(10);
		
		cmbTaxType = new JComboBox();
		cmbTaxType.setModel(new DefaultComboBoxModel(new String[] {"0.01", "0.08", "0.18"}));
		cmbTaxType.setBounds(220, 99, 150, 22);
		add(cmbTaxType);
		
		ftxtFieldCreationDate = new JFormattedTextField();
		ftxtFieldCreationDate.setBounds(220, 161, 150, 20);
		add(ftxtFieldCreationDate);
		
		txtAreaDescription = new JTextArea();
		txtAreaDescription.setBounds(220, 221, 200, 97);
		add(txtAreaDescription);
		
		btnUpdate = new JButton("Güncelle");
		btnUpdate.setBounds(30, 280, 150, 23);
		add(btnUpdate);
		
		//Labels
		JLabel lblStockCode = new JLabel("Stok Kodu");
		lblStockCode.setBounds(30, 15, 120, 14);
		add(lblStockCode);
		
		JLabel lblStockName = new JLabel("Stok Adı");
		lblStockName.setBounds(30, 75, 120, 14);
		add(lblStockName);
		
		JLabel lblStockType = new JLabel("Stok Tipi");
		lblStockType.setBounds(30, 135, 120, 14);
		add(lblStockType);
		
		JLabel lblUnit = new JLabel("Birimi");
		lblUnit.setBounds(30, 195, 120, 14);
		add(lblUnit);
		
		JLabel lblBarcode = new JLabel("Barkod");
		lblBarcode.setBounds(226, 15, 114, 14);
		add(lblBarcode);
		
		JLabel lblTaxType = new JLabel("Vergi Tipi");
		lblTaxType.setBounds(220, 75, 120, 14);
		add(lblTaxType);
		
		JLabel lblCreationDate = new JLabel("Oluşturma Tarihi");
		lblCreationDate.setBounds(220, 135, 120, 14);
		add(lblCreationDate);
		
		JLabel lblDescription = new JLabel("Açıklama");
		lblDescription.setBounds(220, 195, 120, 14);
		add(lblDescription);

	}
	
	public JComboBox getCmbStockCode() {
		return cmbStockCode;
	}



	public void setCmbStockCode(JComboBox cmbStockCode) {
		this.cmbStockCode = cmbStockCode;
	}



	public JTextField getTxtStockName() {
		return txtStockName;
	}



	public void setTxtStockName(JTextField txtStockName) {
		this.txtStockName = txtStockName;
	}



	public JTextField getTxtBarcode() {
		return txtBarcode;
	}



	public void setTxtBarcode(JTextField txtBarcode) {
		this.txtBarcode = txtBarcode;
	}



	public JComboBox getCmbStockType() {
		return cmbStockType;
	}



	public void setCmbStockType(JComboBox cmbStockType) {
		this.cmbStockType = cmbStockType;
	}



	public JComboBox getCmbUnit() {
		return cmbUnit;
	}



	public void setCmbUnit(JComboBox cmbUnit) {
		this.cmbUnit = cmbUnit;
	}



	public JComboBox getCmbTaxType() {
		return cmbTaxType;
	}



	public void setCmbTaxType(JComboBox cmbTaxType) {
		this.cmbTaxType = cmbTaxType;
	}



	public JFormattedTextField getFtxtFieldCreationDate() {
		return ftxtFieldCreationDate;
	}



	public void setFtxtFieldCreationDate(JFormattedTextField ftxtFieldCreationDate) {
		this.ftxtFieldCreationDate = ftxtFieldCreationDate;
	}



	public JTextArea getTxtAreaDescription() {
		return txtAreaDescription;
	}



	public void setTxtAreaDescription(JTextArea txtAreaDescription) {
		this.txtAreaDescription = txtAreaDescription;
	}
	
	public JButton getBtnUpdate() {
		return btnUpdate;
	}



	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}
}
