package com.prepjava.core.semaphores;

import java.util.Random;

public class Shirt {
  public String name;

  public Shirt(int nameLength) {
    this.name = this.generateRandomString(nameLength);
  }

  // Method to generate random string of given length
  private String generateRandomString(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    Random random = new Random();
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < length; i++) {
      int index = random.nextInt(characters.length()); // pick random index
      result.append(characters.charAt(index)); // add character
    }

    return result.toString();
  }
}
