package net.tedata.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("OpenShift")
public class OpenShiftController {

	@GetMapping("/GetMessages")
	public String getMessage() {
		return "Message From Open Shift  -_-";
	}
}
