package prg.orchestra.demo.models;

public abstract class AbstractInstrument implements Instrument {
  private String instrumentName;

  protected AbstractInstrument(String instrName) {
    this.instrumentName = instrName;
  }

  @Override
  public void playInstrument() {
    System.out.println("Playing " + this.instrumentName);
  }
}
