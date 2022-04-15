package prg.orchestra.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import prg.orchestra.demo.models.Cello;
import prg.orchestra.demo.models.Clarinet;
import prg.orchestra.demo.models.Flute;
import prg.orchestra.demo.models.HornTrumpet;
import prg.orchestra.demo.models.Instrument;
import prg.orchestra.demo.models.Musician;
import prg.orchestra.demo.models.Percussion;
import prg.orchestra.demo.models.Trombone;
import prg.orchestra.demo.models.Viola;
import prg.orchestra.demo.models.Violin;

@Service
public class OrchestraService {

  @Autowired
  private ApplicationContext ctx;
  @Autowired
  List<Instrument> instruments;
  List<Musician> musicians;

  public OrchestraService() { }

  public void playOrchestra() {
    musicians = new ArrayList<>(instruments.size());
    Random r = new Random();

    Musician m;
    for (Instrument i : instruments) {
      m = ctx.getBean(Musician.class);
      m.setInstrument(i);
      m.setPayment(r.nextInt());
      musicians.add(m);
    }

    musicians.parallelStream().forEach(Musician::play);
  }

}
