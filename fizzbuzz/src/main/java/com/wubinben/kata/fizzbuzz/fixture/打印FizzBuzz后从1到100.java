package com.wubinben.kata.fizzbuzz.fixture;

import com.wubinben.kata.fizzbuzz.Buzz;
import com.wubinben.kata.fizzbuzz.Fizz;
import com.wubinben.kata.fizzbuzz.SoundMaker;

/**
 * User: Ben
 * Date: 13-7-5
 * Time: 下午3:10
 */
public class 打印FizzBuzz后从1到100 {

  private int number;
  private SoundMaker fizz;
  private SoundMaker buzz;

  public 打印FizzBuzz后从1到100() {
    this.buzz = Buzz.newInstance(null, "buzz");
    this.fizz = Fizz.newInstance(buzz, "fizz");
  }

  public void set从1到100(int number) {
    this.number = number;
  }
  
  public String FizzBuzz后的数() {
    StringBuffer sound = new StringBuffer("");
    this.fizz.handleRequest(this.number, sound);
    if (sound.toString().equals("")) {
      sound.append(Integer.toString(this.number));
    }
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
