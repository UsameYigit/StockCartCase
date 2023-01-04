package UI01.Commands.Concrete;

import UI01.Commands.Abstract.ICommand;
import UI01.Controller.GeneralStockCartOperations;

public class SetDeleteFieldsCommand implements ICommand{
GeneralStockCartOperations generalStockCartOperations;
	
	public SetDeleteFieldsCommand(GeneralStockCartOperations generalStockCartOperations) {
		this.generalStockCartOperations = generalStockCartOperations;
	}

	@Override
	public void execute() {
		generalStockCartOperations.setDeleteFields();
	}
}
