package prg.orchestra.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Cello extends AbstractInstrument{

  public Cello(String instrName) {
    super(instrName);
  }

}
