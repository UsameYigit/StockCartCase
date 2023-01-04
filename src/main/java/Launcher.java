import Business.Concrete.StockCartManager;
import Data.Concrete.StockCartOperations;
import UI01.Controller.StockCartFrameController;
import UI01.View.MainPage;

public class Launcher {
	public static void main(String[] args) {
		MainPage frame = new MainPage();
		StockCartManager scm = new StockCartManager(new StockCartOperations());
		
		StockCartFrameController scFrameController = new StockCartFrameController(frame, scm);
		
		scFrameController.launch();
	}
}
