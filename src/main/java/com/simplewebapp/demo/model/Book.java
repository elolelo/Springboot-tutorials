package com.simplewebapp.demo.model;

import javax.persistence.*;

@Entity
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false, unique = true)
  private String title;

  @Column(nullable = false)
  private String author;

  public Long getId() {
    return id;
  }
}