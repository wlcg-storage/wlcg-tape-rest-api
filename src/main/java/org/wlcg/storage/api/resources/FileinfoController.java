package org.wlcg.storage.api.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wlcg.storage.api.model.fileinfo.FileInfoBulkRequestStatusModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "fileinfo", description = "The **Fileinfo** bulk-request API")
@RequestMapping(path = "/v1/fileinfo")
public class FileinfoController extends BaseBulkRequestController {
	
	@GetMapping(value = "/{id}")
	@Operation(summary = "Returns the status of a request")
	@Override
	public FileInfoBulkRequestStatusModel getRequestStatus(@PathVariable String id) {
		return new FileInfoBulkRequestStatusModel();
	}
	
}
