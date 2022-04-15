package prg.orchestra.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import prg.orchestra.demo.models.Cello;
import prg.orchestra.demo.models.Clarinet;
import prg.orchestra.demo.models.Flute;
import prg.orchestra.demo.models.HornTrumpet;
import prg.orchestra.demo.models.Instrument;
import prg.orchestra.demo.models.Percussion;
import prg.orchestra.demo.models.Trombone;
import prg.orchestra.demo.models.Viola;
import prg.orchestra.demo.models.Violin;

@Configuration
@PropertySource("classpath:application.properties")
public class BeanConfig {

  @Value("${instrument.cello.name}")
  private String celloName;

  @Bean
  public Instrument cello() {
    return new Cello(celloName);
  }

  @Value("${instrument.clarinet.name}")
  private String clarinetName;

  @Bean
  public Instrument clarinet() {
    return new Clarinet(clarinetName);
  }

  @Value("${instrument.flute.name}")
  private String fluteName;

  @Bean
  public Instrument flute() {
    return new Flute(fluteName);
  }

  @Value("${instrument.hornTrumpet.name}")
  private String hornTrumpetName;

  @Bean
  public Instrument hornTrumpet() {
    return new HornTrumpet(hornTrumpetName);
  }

  @Value("${instrument.percussion.name}")
  private String percussionName;

  @Bean
  public Instrument percussion() {
    return new Percussion(percussionName);
  }

  @Value("${instrument.trombone.name}")
  private String tromboneName;

  @Bean
  public Instrument trombone() {
    return new Trombone(tromboneName);
  }

}
