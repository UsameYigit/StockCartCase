package UI01.Commands.Concrete;

import Business.Concrete.StockCartManager;
import Entity.StockCart;
import UI01.Commands.Abstract.ICommand;
import UI01.Controller.GeneralStockCartOperations;

public class UpdateStockCartCommand implements ICommand{
	GeneralStockCartOperations generalStockCartOperations;
	
	public UpdateStockCartCommand(GeneralStockCartOperations generalStockCartOperations) {
		this.generalStockCartOperations = generalStockCartOperations;
	}
	@Override
	public void execute() {
		generalStockCartOperations.updateStockCart();		
	}

}
