package org.wlcg.storage.api.model.stage;
import java.util.ArrayList;
import java.util.List;


import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Stage bulk request object")
public class StageBulkRequestModel {
  @Schema(description = "The files that are contained in the bulk-request")
  private List<File> files;
  
  public StageBulkRequestModel() {
    this.files = new ArrayList<File>();
  }
  
  public List<File> getFiles(){
    return this.files;
  }
  
  public void setFiles(List<File> files) {
    this.files = files;
  }
}
