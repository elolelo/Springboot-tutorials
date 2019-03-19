package com.simplewebapp.demo.controller.exceptions;

public class BookNotFoundExeption extends RuntimeException {

  public BookNotFoundExeption() {
    super();
  }

  public BookNotFoundExeption(final String message, final Throwable cause) {
    super(message, cause);
  }

  public BookNotFoundExeption(final String message) {
    super(message);
  }

  public BookNotFoundExeption(final Throwable cause) {
    super(cause);
  }
}