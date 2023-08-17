package application;

import java.util.Date;
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

		Department department = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			
			System.out.println(obj);
		}
		System.out.println("\n====TESTE 3 Seller findAll=====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			
			System.out.println(obj);
		}
		
		System.out.println("\n====TESTE 4 Seller insert=====");
		Seller newSeller = new Seller(null, "Junior", "junior@gmail.com", new Date(),6000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+ newSeller.getId());
		
		System.out.println("\n====TESTE 5 Seller update=====");
		seller = sellerDao.findById(1);
		seller.setName("Chico Chavier");
		seller.setEmail("chicobutico@hotmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}

}
