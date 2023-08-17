package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
				
	    Seller seller = sellerDao.findById(3);
	    
	    System.out.println("====TESTE 1 Seller findById=====");
		
		System.out.println(seller);
		
		System.out.println("\n====TESTE 2 Seller findById=====");

		Department departmant = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(departmant);
		for (Seller obj : list) {
			
			System.out.println(obj);
		}
		System.out.println("\n====TESTE 3 Seller findAll=====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			
			System.out.println(obj);
		}
		
		
	}

}
