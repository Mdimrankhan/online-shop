package net.imr.onlineshopbackend.dao;

import java.util.List;

import net.imr.onlineshopbackend.dto.Category;

public interface CategoryDAO {
 
	List<Category> list();
	Category get(int id);
}
