package com.wubinben.kata.fizzbuzz.fixture;

/**
 * User: Ben
 * Date: 13-7-5
 * Time: 下午3:10
 */
public class 打印FizzBuzz后从1到100 {

  private int number;

  public void set从1到100(int number) {
    this.number = number;
  }
  
  public String FizzBuzz后的数() {
    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    }
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }
    return Integer.toString(number);
  }
}
