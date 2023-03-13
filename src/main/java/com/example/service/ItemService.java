package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.entity.Item;
import com.example.mapper.ItemMapper;

@Service
public class ItemService {
	private final ItemMapper itemMapper;

	@Autowired
	public ItemService(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}

	public List<Item> findAll() {
		return this.itemMapper.findAll();
	}

	/* ☆追加箇所：入力値を登録する処理を追加する☆ */
	public void insert(String name, Integer price, Integer categoryId) {
		Item item = new Item();
		item.setName(name);
		item.setPrice(price);
		Category category = new Category();
		category.setId(categoryId);
		item.setCategory(category);
		this.itemMapper.insert(item);
	}

	public Item findById(Integer id) {
		return this.itemMapper.findById(id);
	}

	/* ☆追加箇所：入力値でデータを更新する処理を追加する☆ */
	public void update(Integer id, String name, Integer price, Integer categoryId) {
	Item item = new Item();
		item.setId(id);
		item.setName(name);
		item.setPrice(price);
		Category category = new Category();
		category.setId(categoryId);
		item.setCategory(category);
		this.itemMapper.update(item);
	}

	/* ☆追加箇所：idを基にデータを削除する機能を追加する☆ */
	public void deleteById(Integer id) {
		this.itemMapper.deleteById(id);
	}
}