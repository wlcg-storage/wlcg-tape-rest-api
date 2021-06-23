package org.wlcg.storage.api.model.stage;

import java.util.ArrayList;
import java.util.List;

import org.wlcg.storage.api.model.BulkRequestModel;
import org.wlcg.storage.api.model.BulkRequestOptionsModel;
import org.wlcg.storage.api.model.MetadataModel;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Stage bulk request object")
public class StageBulkRequestModel extends BulkRequestModel {

  @Schema(description = "Not in V1 ? EOSCTA would like something simple as a first API", required = false)
  private BulkRequestOptionsModel options;
  
  @Schema(description = "Metadata associated to all the files provided (e.g activity)", required = false)
  private List<MetadataModel> metadata;
  
  public StageBulkRequestModel() {
    this.metadata = new ArrayList<MetadataModel>();
  }

  public List<MetadataModel> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<MetadataModel> metadata) {
    this.metadata = metadata;
  }
}
