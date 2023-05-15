package org.wlcg.storage.api.model.error;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

public class InvalidRequestErrorModel extends ErrorModel {
  
  @Schema(description = "The list of invalid parameters given")
  private List<InvalidParamModel> invalidParams;
  
  public InvalidRequestErrorModel() {
    super("https://our-api-documentation.net/request-validation-error", "Your request content is not correct", 400, "One or multiple parameters of your request are not correctly set");
    this.invalidParams = new ArrayList<InvalidParamModel>();
  }

  public List<InvalidParamModel> getInvalidParams() {
    return invalidParams;
  }

  public void setInvalidParams(List<InvalidParamModel> invalidParams) {
    this.invalidParams = invalidParams;
  }
  
  public void addInvalidParam(InvalidParamModel invalidParam) {
    this.invalidParams.add(invalidParam);
  }
  
}
