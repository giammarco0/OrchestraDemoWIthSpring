package prg.orchestra.demo;

import org.springframework.beans.propertyeditors.ResourceBundleEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import prg.orchestra.demo.service.OrchestraService;

import java.util.ResourceBundle;

public class Application {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext("prg.orchestra.demo.models", "prg.orchestra.demo.service", "prg.orchestra.demo.config");
    OrchestraService service = ctx.getBean(OrchestraService.class);
    service.playOrchestra();
  }

}
