package com.mybatisTest.pojo;

import org.apache.ibatis.type.Alias;

/**
 * Books类与mybookshop数据库中的books表对应
 * 包含id，title，author,unitPrice及种类
 */
@Alias("books")
public class Books {

  private String id;
  private String title;
  private String author;
  private double unitPrice;
  private long categoryId;
  Categories categories;

  @Override
  public String toString() {
    return "Books{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", unitPrice=" + unitPrice +
            ", categoryId=" + categoryId +
            ", categories=" + categories +
            '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

  public Categories getCategories() {
    return categories;
  }

  public void setCategories(Categories categories) {
    this.categories = categories;
  }
}
