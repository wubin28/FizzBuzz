package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-7-5
 * Time: 下午6:43
 */
public class Fizz implements SoundMaker{
  private SoundMaker nextHandler;
  private String sound;

  public Fizz(SoundMaker nextHandler, String sound) {
    this.nextHandler = nextHandler;
    this.sound = sound;
  }

  public static Fizz newInstance(SoundMaker nextHandler, String sound) {
    return new Fizz(nextHandler, sound);
  }

  @Override
  public void handleRequest(int number, StringBuffer sound) {
    if (number % 3 == 0) {
      sound.append(this.sound);
    }
    if (this.nextHandler != null) {
      this.nextHandler.handleRequest(number, sound);
    }
  }
}
