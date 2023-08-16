package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;
import model.dao.impl.SellerDaoJBDC;

public class Program {

	public static void main(String[] args) {
	
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
				
	    Seller seller = sellerDao.findById(3);
	    
	    System.out.println("====TESTE 1 Seller findById=====");
		
		System.out.println(seller);

	}

}
