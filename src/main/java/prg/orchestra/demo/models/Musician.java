package prg.orchestra.demo.models;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Musician {
  private Instrument instrument;
  private int payment = 0;

  public void setPayment(int payment) {
    this.payment = payment;
  }

  public Instrument getInstrument() {
    return instrument;
  }

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  public void play() {
    //if (this.payment >= 150)
      instrument.playInstrument();
    //else
      //System.out.println("Fuck off! I'm not playing for " + this.payment);
  }

  @PostConstruct
  public void sayHello() {
    System.out.println("Hello, I'm the Musician: " + this);
  }

}
