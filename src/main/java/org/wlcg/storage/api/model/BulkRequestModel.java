package org.wlcg.storage.api.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Bulk request base object")
public class BulkRequestModel {

  @ArraySchema(minItems = 1,
      schema = @Schema(description = "Paths that are targets of this bulk request"))
  private List<String> paths;


  public BulkRequestModel() {
    this.paths = new ArrayList<String>();
  }
  
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }


}
