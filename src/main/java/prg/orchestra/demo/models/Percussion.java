package prg.orchestra.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Percussion extends AbstractInstrument {

  public Percussion(String instrName) {
    super(instrName);
  }

}
