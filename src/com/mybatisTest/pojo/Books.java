package com.mybatisTest.pojo;

import org.apache.ibatis.type.Alias;

@Alias("books")
public class Books {

  private String id;
  private String title;
  private String author;
  private long publisherId;
  private java.sql.Timestamp publishDate;
  private String isbn;
  private long wordsCount;
  private double unitPrice;
  private String contentDescription;
  private String aurhorDescription;
  private String editorComment;
  private String toc;
  private long categoryId;
  private long clicks;

  @Override
  public String toString() {
    return "Books{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", publisherId=" + publisherId +
            ", publishDate=" + publishDate +
            ", isbn='" + isbn + '\'' +
            ", wordsCount=" + wordsCount +
            ", unitPrice=" + unitPrice +
            ", contentDescription='" + contentDescription + '\'' +
            ", aurhorDescription='" + aurhorDescription + '\'' +
            ", editorComment='" + editorComment + '\'' +
            ", toc='" + toc + '\'' +
            ", categoryId=" + categoryId +
            ", clicks=" + clicks +
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


  public long getPublisherId() {
    return publisherId;
  }

  public void setPublisherId(long publisherId) {
    this.publisherId = publisherId;
  }


  public java.sql.Timestamp getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(java.sql.Timestamp publishDate) {
    this.publishDate = publishDate;
  }


  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }


  public long getWordsCount() {
    return wordsCount;
  }

  public void setWordsCount(long wordsCount) {
    this.wordsCount = wordsCount;
  }


  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }


  public String getContentDescription() {
    return contentDescription;
  }

  public void setContentDescription(String contentDescription) {
    this.contentDescription = contentDescription;
  }


  public String getAurhorDescription() {
    return aurhorDescription;
  }

  public void setAurhorDescription(String aurhorDescription) {
    this.aurhorDescription = aurhorDescription;
  }


  public String getEditorComment() {
    return editorComment;
  }

  public void setEditorComment(String editorComment) {
    this.editorComment = editorComment;
  }


  public String getToc() {
    return toc;
  }

  public void setToc(String toc) {
    this.toc = toc;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public long getClicks() {
    return clicks;
  }

  public void setClicks(long clicks) {
    this.clicks = clicks;
  }

}
