package com.example.monikaverma.firebaseexample;

/**
 * Created by Monika.verma on 21-07-2017.
 */

public class Person
{
  //name and address string
  private String name;
  private String address;

  public Person() {
      /*Blank default constructor essential for Firebase*/
  }
  //Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
