package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-7-5
 * Time: 下午6:45
 */
public class Buzz implements SoundMaker{
  private SoundMaker nextHandler;
  private String sound;

  public Buzz(SoundMaker nextHandler, String sound) {
    this.nextHandler = nextHandler;
    this.sound = sound;
  }

  public static Buzz newInstance(SoundMaker nextHandler, String sound) {
    return new Buzz(nextHandler, sound);
  }

  @Override
  public void handleRequest(int number, StringBuffer sound) {
    if (number % 5 == 0) {
      sound.append(this.sound);
    }
    if (this.nextHandler != null) {
      this.nextHandler.handleRequest(number, sound);
    }
  }
}
