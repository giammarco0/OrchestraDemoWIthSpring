package prg.orchestra.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Flute extends AbstractInstrument {

  public Flute(String instrName) {
    super(instrName);
  }

}
