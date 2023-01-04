package UI01.Controller;

import java.awt.EventQueue;
import java.time.LocalDateTime;
import java.util.ArrayList;

import Business.Abstract.IStockCartService;
import Entity.StockCart;
import UI01.Commands.GeneralAction;
import UI01.Commands.GeneralSelection;
import UI01.Commands.Concrete.AddStockCartCommand;
import UI01.Commands.Concrete.CopyStockCartCommand;
import UI01.Commands.Concrete.DeleteStockCartCommand;
import UI01.Commands.Concrete.SearchStockCartCommand;
import UI01.Commands.Concrete.SetDeleteFieldsCommand;
import UI01.Commands.Concrete.SetSearchFieldsCommand;
import UI01.Commands.Concrete.UpdateStockCartCommand;
import UI01.View.MainPage;


public class StockCartFrameController {
	MainPage frame;
	IStockCartService stockCartService;
	GeneralStockCartOperations generalStockCartOperations;
	
	public StockCartFrameController(MainPage frame, IStockCartService stockCartService){
		this.frame = frame;
		this.stockCartService = stockCartService;
		generalStockCartOperations = new GeneralStockCartOperations(this.frame, this.stockCartService);
	}
	
	public void launch(){
		try {
			generalStockCartOperations.refreshLists();
			setButtonListeners();
			setListListeners();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setButtonListeners() { 
		frame.getAddPage().getBtnAdd().addActionListener(new GeneralAction(new AddStockCartCommand(generalStockCartOperations)));
		frame.getUpdatePage().getBtnUpdate().addActionListener(new GeneralAction(new UpdateStockCartCommand(generalStockCartOperations)));
		frame.getDeletePage().getBtnDelete().addActionListener(new GeneralAction(new DeleteStockCartCommand(generalStockCartOperations)));
		frame.getSearchPage().getBtnSearch().addActionListener(new GeneralAction(new SearchStockCartCommand(generalStockCartOperations)));
		frame.getDeletePage().getBtnCopy().addActionListener(new GeneralAction(new CopyStockCartCommand(generalStockCartOperations)));
	}
	
	private void setListListeners() {
		frame.getSearchPage().getListStockCarts().addListSelectionListener(new GeneralSelection(new SetSearchFieldsCommand(generalStockCartOperations)));
		frame.getDeletePage().getListStockCode().addListSelectionListener(new GeneralSelection(new SetDeleteFieldsCommand(generalStockCartOperations)));
	}
	
}
