package org.wlcg.storage.api.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

  @Value("${springdoc.swagger-ui.path}")
  String apiDocsResource;


  @GetMapping
  public String getRoot() {
    return "redirect:" + apiDocsResource;
  }

}
