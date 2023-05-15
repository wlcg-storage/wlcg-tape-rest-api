package org.wlcg.storage.api.model.stage;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Stage file model")
public class File {
  @Schema(description="Path of the file")
  private String path;
  @Schema(description="Metadata associated to the file",nullable = true)
  private List<Metadata> metadata;
  
  public File() {
    this.metadata = new ArrayList<Metadata>();
  }
  
  public File(String path) {
    this.path = path;
    this.metadata = new ArrayList<Metadata>();
  }
  
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }
  public List<Metadata> getMetadata() {
    return metadata;
  }
  public void setMetadata(List<Metadata> metadata) {
    this.metadata = metadata;
  }
}
