package org.immregistries.message_modifier.webui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ModifyController {

    @GetMapping("/modify")
    public String greetingForm(Model model) {
        model.addAttribute("modifyRequest", new ModifyRequest());
        return "modifyRequest";
    }

    @PostMapping("/modify")
    public String greetingSubmit(@ModelAttribute ModifyRequest greeting) {
        return "modifyResult";
    }

}
