package org.wlcg.storage.api.model.unpin;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

public class UnpinBulkRequestModel {
  @Schema(description = "The paths of the files to unpin")
  private List<String> paths;
  
  public UnpinBulkRequestModel() {
    this.paths = new ArrayList<String>();
  }
  
  public void addPath(String path) {
    this.paths.add(path);
  }

  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }
}
