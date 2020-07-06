package net.imr.onlineshopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.imr.onlineshopbackend.dao.CategoryDAO;
import net.imr.onlineshopbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static{
		
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("This is the best available Mobile in the Market!");
		category.setImageURL("mobile_1");
		categories.add(category);
		
		//adding second category
		category = new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setDescription("This is the best available Laptop in the Market!");
		category.setImageURL("laptop_1");
		categories.add(category);
		
		//adding third category
		category = new Category();
		category.setId(3);
		category.setName("Shoes");
		category.setDescription("This is the best available Shoes in the Market!");
		category.setImageURL("shoes_1");
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		//enchanced for loop
		for(Category category : categories){
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
