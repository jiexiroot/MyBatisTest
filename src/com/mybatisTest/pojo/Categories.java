package com.mybatisTest.pojo;

import org.apache.ibatis.type.Alias;

import java.awt.print.Book;
import java.util.List;

/**
 * 和mybookshop数据库中categories表对应
 */
@Alias("categories")
public class Categories {

  private long id;
  private String name;
  private List<Book> bookList;

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  @Override
  public String toString() {
    return "Categories{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", bookList=" + bookList +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
