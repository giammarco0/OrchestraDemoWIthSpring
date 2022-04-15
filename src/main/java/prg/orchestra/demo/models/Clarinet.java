package prg.orchestra.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Clarinet extends AbstractInstrument {

  public Clarinet(String instrName) {
    super(instrName);
  }

}
