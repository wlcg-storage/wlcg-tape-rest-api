package org.wlcg.storage.api.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wlcg.storage.api.error.NotImplementedError;
import org.wlcg.storage.api.model.BulkRequestStatusModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Tag(name = "stage", description = "The **Stage** bulk-request API")
@RequestMapping(path = "/v1/stage")
public class StageResourceController extends BaseBulkRequestController {
	
	@GetMapping(value = "/{id}")
	@Operation(summary = "Returns the status of a request")
	public BulkRequestStatusModel getRequestStatus(@PathVariable String id) {
		throw new NotImplementedError();
	}

}
