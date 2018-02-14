package org.immregistries.message_modifier.webui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import gov.nist.healthcare.hl7.mm.v2.script.execution.MessageModifierService;
import gov.nist.healthcare.hl7.mm.v2.script.execution.ModificationResult;

@Controller
public class ModifyController {

    @GetMapping("/modify")
    public String greetingForm(Model model) {
        model.addAttribute("modifyRequest", new ModifyRequest());
        return "modifyRequest";
    }

    @PostMapping("/modify")
    public String greetingSubmit(@ModelAttribute ModifyRequest modifyRequest) {
    	MessageModifierService mms = new MessageModifierService();
    	ModificationResult modificationResult =  mms.modify(modifyRequest.getContent(), modifyRequest.getScript());
    	modifyRequest.setContentResult(modificationResult.getResultMessage());
        return "modifyResult";
    }

}
