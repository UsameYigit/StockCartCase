package UI01.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import Business.Abstract.IStockCartService;
import Entity.StockCart;
import UI01.View.MainPage;

public class GeneralStockCartOperations {
	private MainPage frame;
	private IStockCartService stockCartService;
	
	public GeneralStockCartOperations(MainPage frame, IStockCartService stockCartService) {
		this.frame = frame;
		this.stockCartService = stockCartService;
	}
	
	public void addStockCart() {
		if(frame.getAddPage().getTxtStockCode().getText().isEmpty() || 
				frame.getAddPage().getTxtStockName().getText().isEmpty() || 
				frame.getAddPage().getTxtBarcode().getText().isEmpty() || 
				frame.getAddPage().getFtxtFieldCreationDate().getText().isEmpty() || 
				frame.getAddPage().getTxtAreaDescription().getText().isEmpty())
			JOptionPane.showMessageDialog(null, "Lütfen bütün alanları doldurunuz.");
		else {
			StockCart sc = new StockCart(
					frame.getAddPage().getTxtStockCode().getText(),
					frame.getAddPage().getTxtStockName().getText(), 
					Integer.parseInt(frame.getAddPage().getCmbStockType().getSelectedItem().toString()),
					frame.getAddPage().getCmbUnit().getSelectedItem().toString(),
					frame.getAddPage().getTxtBarcode().getText(),
					Double.parseDouble(frame.getAddPage().getCmbTaxType().getSelectedItem().toString()),
					frame.getAddPage().getTxtAreaDescription().getText(),
					LocalDateTime.now());
			
			if(doesExist(sc)) {
				stockCartService.update(sc);
				resetAddFields();
			}else {
				stockCartService.create(sc);
				resetAddFields();
				refreshLists();
			}
		}
			
	}
	
	public boolean doesExist(StockCart sc) {
		ArrayList<StockCart> al = stockCartService.getAll();
		for(int i = 0; i<al.size(); i++)
			if(al.get(i).getStockCode().equals(sc.getStockCode()))
				return true;
		return false;
	}
	
	
	public void updateStockCart() {
		if(frame.getUpdatePage().getTxtStockName().getText().isEmpty() || 
				frame.getUpdatePage().getTxtBarcode().getText().isEmpty() || 
				frame.getUpdatePage().getFtxtFieldCreationDate().getText().isEmpty() || 
				frame.getUpdatePage().getTxtAreaDescription().getText().isEmpty())
			
			JOptionPane.showMessageDialog(null, "Lütfen bütün alanları doldurunuz.");
		else {
			StockCart sc = new StockCart(
					frame.getUpdatePage().getCmbStockCode().getSelectedItem().toString(),
					frame.getUpdatePage().getTxtStockName().getText(), 
					Integer.parseInt(frame.getUpdatePage().getCmbStockType().getSelectedItem().toString()),
					frame.getUpdatePage().getCmbUnit().getSelectedItem().toString(),
					frame.getUpdatePage().getTxtBarcode().getText(),
					Double.parseDouble(frame.getUpdatePage().getCmbTaxType().getSelectedItem().toString()),
					frame.getUpdatePage().getTxtAreaDescription().getText(),
					LocalDateTime.now());
			
			stockCartService.update(sc);
			resetUpdateFields();
		}
	}
	
	public void searchStockCart() {
		if(frame.getSearchPage().getTxtSearch().getText().isEmpty()) 
			JOptionPane.showMessageDialog(null, "Lütfen arama alanını doldurunuz.");
		else {
			DefaultListModel stockCarts = new DefaultListModel();
			String data = frame.getSearchPage().getTxtSearch().getText();
			StockCart sc = stockCartService.getByStockCode(data);
			if(sc != null)
				stockCarts.addElement(sc.getStockCode());
			else {
				ArrayList<StockCart> al = stockCartService.getByBarcode(data);
				if(!al.isEmpty())
					for(int i = 0; i<al.size(); i++)
						stockCarts.addElement(al.get(i).getStockCode());
				else {
					al = stockCartService.getByStockName(data);
					if(!al.isEmpty())
						for(int i = 0; i<al.size(); i++)
							stockCarts.addElement(al.get(i).getStockCode());
				}
			}
			
			frame.getSearchPage().getListStockCarts().setModel(stockCarts);	
		}
		
	}
	
	
	
	public void copySelectedItem() {
		if(frame.getDeletePage().getListStockCode().getSelectedValue() != null) {
			UUID uuid = UUID.randomUUID();
			StockCart sc = stockCartService.getByStockCode(frame.getDeletePage().getListStockCode().getSelectedValue().toString());
			sc.setStockCode(uuid.toString().substring(0, 8));
			stockCartService.create(sc);
			resetDeleteFields();
			refreshLists();
		}
	}
	
	public void deleteSelectedItem(){
		if(frame.getDeletePage().getListStockCode().getSelectedValue() != null) {
			StockCart sc = stockCartService.getByStockCode(frame.getDeletePage().getListStockCode().getSelectedValue().toString());
			stockCartService.delete(sc);
			resetDeleteFields();
			refreshLists();
		}
	}
	
	
	
	public void setSearchFields(){
		if(frame.getSearchPage().getListStockCarts().getSelectedValue() != null) {
			StockCart sc = stockCartService.getByStockCode(frame.getSearchPage().getListStockCarts().getSelectedValue().toString());
			frame.getSearchPage().getTxtStockCode().setText(sc.getStockCode());
			frame.getSearchPage().getTxtStockName().setText(sc.getStockName());
			frame.getSearchPage().getTxtStockType().setText(sc.getStockType()+"");
			frame.getSearchPage().getTxtUnit().setText(sc.getUnit());
			frame.getSearchPage().getTxtBarcode().setText(sc.getBarcode());
			frame.getSearchPage().getTxtTaxType().setText(sc.getTaxType()+"");
			frame.getSearchPage().getFtxtDateCreated().setText(sc.getCreationDate().toString());
			frame.getSearchPage().getTxtAreaDescription().setText(sc.getDescription());
		}
	}
	
	public void setDeleteFields() {
		if(frame.getDeletePage().getListStockCode().getSelectedValue() != null) {
			StockCart sc = stockCartService.getByStockCode(frame.getDeletePage().getListStockCode().getSelectedValue().toString());
			frame.getDeletePage().getTxtBarcode().setText(sc.getBarcode());
			frame.getDeletePage().getTxtAreaDescription().setText(sc.getDescription());
			frame.getDeletePage().getTxtCreationDate().setText(sc.getCreationDate().toString());
		}
	}
	
	
	
	public void refreshLists() {
		frame.getSearchPage().getListStockCarts().setModel(getStockCarts());
		frame.getDeletePage().getListStockCode().setModel(getStockCarts());
		initializeStockCode();
	}
	
	private DefaultListModel getStockCarts() {
		DefaultListModel stockCarts = new DefaultListModel();
		ArrayList<StockCart> al = stockCartService.getAll();
		for(int i = 0; i<al.size(); i++)
			stockCarts.addElement(al.get(i).getStockCode());
		return stockCarts;
	}
	
	private void initializeStockCode() {
		frame.getUpdatePage().getCmbStockCode().removeAllItems();
		ArrayList<StockCart> al = stockCartService.getAll();
		if(al != null)
			for(int i = 0; i<al.size(); i++)
				frame.getUpdatePage().getCmbStockCode().addItem(al.get(i).getStockCode());
	}
	
	
	private void resetAddFields() {
		frame.getAddPage().getTxtStockCode().setText("");
		frame.getAddPage().getTxtStockName().setText(""); 
		frame.getAddPage().getCmbStockType().setSelectedIndex(0);
		frame.getAddPage().getCmbUnit().setSelectedIndex(0);
		frame.getAddPage().getTxtBarcode().setText("");
		frame.getAddPage().getCmbTaxType().setSelectedIndex(0);
		frame.getAddPage().getTxtAreaDescription().setText("");
		frame.getAddPage().getFtxtFieldCreationDate().setText("");
	}
	
	private void resetUpdateFields() {
		frame.getUpdatePage().getCmbStockCode().setSelectedIndex(0);
		frame.getUpdatePage().getTxtStockName().setText(""); 
		frame.getUpdatePage().getCmbStockType().setSelectedIndex(0);
		frame.getUpdatePage().getCmbUnit().setSelectedIndex(0);
		frame.getUpdatePage().getTxtBarcode().setText("");
		frame.getUpdatePage().getCmbTaxType().setSelectedIndex(0);
		frame.getUpdatePage().getTxtAreaDescription().setText("");
		frame.getUpdatePage().getFtxtFieldCreationDate().setText("");
	}
	
	private void resetDeleteFields() {
		frame.getDeletePage().getTxtBarcode().setText("");
		frame.getDeletePage().getTxtAreaDescription().setText("");
		frame.getDeletePage().getTxtCreationDate().setText("");
	}
}
