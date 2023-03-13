package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Item;

@Mapper
public interface ItemMapper {
	public List<Item> findAll();
	public void insert(Item item);/* ☆追加箇所：入力値をDBに登録するメソッドを追加する☆ */
	public Item findById(Integer id);/* ☆追加箇所：idを基にデータをselectしてEntityを返すメソッドを追加する☆ */
	public void update(Item item);/* ☆追加箇所：DBのデータを更新するメソッドを追加する☆ */
	public void deleteById(Integer id);/* ☆追加箇所：idを基にDBのデータを削除するメソッドを追加する☆ */
}