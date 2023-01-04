package Business.Concrete;

import java.util.ArrayList;
import java.util.List;

import Business.Abstract.IStockCartService;
import Data.Abstract.IStockCartRepository;
import Entity.StockCart;

public class StockCartManager implements IStockCartService{

	IStockCartRepository stockRepository;
	
	public StockCartManager(IStockCartRepository stockRepository) {
		this.stockRepository = stockRepository;
	}
	
	public ArrayList<StockCart> getAll() {
		return stockRepository.getAll();
	}

	public void create(StockCart entity) {
		stockRepository.create(entity);
	}

	public void delete(StockCart entity) {
		stockRepository.delete(entity);
	}

	public void update(StockCart entity) {
		stockRepository.update(entity);
	}

	public StockCart getByStockCode(String stockCode) {
		return stockRepository.getByStockCode(stockCode);
	}

	public ArrayList<StockCart> getByStockName(String stockName) {
		return stockRepository.getByStockName(stockName);
	}

	public ArrayList<StockCart> getByBarcode(String barcode) {
		return stockRepository.getByBarcode(barcode);
	}

}
