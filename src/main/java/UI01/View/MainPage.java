package UI01.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import Business.Concrete.StockCartManager;
import Data.Concrete.StockCartOperations;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MainPage extends JFrame{;
	private AddPage addPanel;
	private DeletePage deletePanel;
	private UpdatePage updatePanel;
	private SearchPage searchPanel;
	
	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 550, 425);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Stok Kart");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		addPanel = new AddPage();
		tabbedPane.addTab("Ekle", null, addPanel, null);
		
		deletePanel = new DeletePage();
		tabbedPane.addTab("Sil", null, deletePanel, null);
		
		updatePanel = new UpdatePage();
		tabbedPane.addTab("Güncelle", null, updatePanel, null);
		
		searchPanel = new SearchPage();
		tabbedPane.addTab("Ara", null, searchPanel, null);
	}
	
	public AddPage getAddPage() {
		return this.addPanel;
	}
	
	public DeletePage getDeletePage() {
		return this.deletePanel;
	}
	
	public UpdatePage getUpdatePage() {
		return this.updatePanel;
	}
	
	public SearchPage getSearchPage() {
		return this.searchPanel;
	}
}
