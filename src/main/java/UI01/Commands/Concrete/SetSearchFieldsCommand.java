package UI01.Commands.Concrete;

import UI01.Commands.Abstract.ICommand;
import UI01.Controller.GeneralStockCartOperations;

public class SetSearchFieldsCommand implements ICommand{
	GeneralStockCartOperations generalStockCartOperations;
	
	public SetSearchFieldsCommand(GeneralStockCartOperations generalStockCartOperations) {
		this.generalStockCartOperations = generalStockCartOperations;
	}
	
	@Override
	public void execute() {
		generalStockCartOperations.setSearchFields();
	}

}
