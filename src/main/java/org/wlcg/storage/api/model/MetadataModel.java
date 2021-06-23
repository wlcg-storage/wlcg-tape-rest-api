package org.wlcg.storage.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class MetadataModel {
  @Schema(description = "The key name of the metadata", required = true)
  private String key;
  @Schema(description = "The value associated to the key", required = true)
  private String value;
  
  public MetadataModel(String key, String value) {
    this.key = key;
    this.value = value;
  }
  
  public String getKey() {
    return key;
  }
  
  public void setKey(String key) {
    this.key = key;
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
}
