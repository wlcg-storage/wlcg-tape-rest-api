package org.wlcg.storage.api.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Bulk request base object")
public class BulkRequestModel {


  @ArraySchema(minItems = 1,
      schema = @Schema(description = "Paths that are targets of this bulk request"))
  private List<String> paths;

  @Schema(description = "Prefix used to resolve relative paths", required = false)
  private String prefix;

  @Schema(description = "Request management options", required = false)
  private BulkRequestOptionsModel options;

  public BulkRequestModel() {
  }

  public BulkRequestOptionsModel getOptions() {
    return options;
  }

  public void setOptions(BulkRequestOptionsModel options) {
    this.options = options;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }


}
