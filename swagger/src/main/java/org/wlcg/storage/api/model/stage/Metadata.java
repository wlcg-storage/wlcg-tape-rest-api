package org.wlcg.storage.api.model.stage;

import java.util.HashMap;
import java.util.Map;

import io.swagger.v3.oas.annotations.media.Schema;

public class Metadata {
  @Schema(description = "The id of the endpoint the metadata are intended to")
  String endpointId;
  @Schema(description = "The metadata (key-value pairs)")
  Map<String,String>  data;
  
  public Metadata() {
    this.data = new HashMap<String, String>();
  }
  
  public Metadata(String endpointId) {
    this.endpointId = endpointId;
    this.data = new HashMap<String, String>();
  }
  
  public String getEndpointId() {
    return endpointId;
  }
  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }
  public Map<String, String> getData() {
    return data;
  }
  public void setData(Map<String, String> metadata) {
    this.data = metadata;
  }
  
  public void addData(String key, String value) {
    this.data.put(key, value);
  }
}
