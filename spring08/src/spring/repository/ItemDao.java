package spring.repository;

import java.util.List;

import spring.entity.ItemDto;

public interface ItemDao {
	void insert(String name, String type, int price);

	List<ItemDto> list();
}
