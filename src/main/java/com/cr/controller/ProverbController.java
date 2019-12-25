package com.cr.controller;

import com.cr.service.ProverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/proverb")
public class ProverbController {

    @Autowired
    private ProverbService proverbService;

    @GetMapping("/list")
    public String proverbs(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                           @RequestParam(value = "pageSize", defaultValue = "5") int pageSize,
                           Model model) {
        model.addAttribute("proverbList", proverbService.getProverbList(pageNum, pageSize));
        return "proverbs";
    }

    @GetMapping("/{proverbId}")
    public String proverb(@PathVariable Integer proverbId, Model model) {
        model.addAttribute("proverb", proverbService.getProverb(proverbId));
        return "proverb";
    }

    @PutMapping("/like/{proverbId}")
    @ResponseBody
    public Boolean likeProverb(@PathVariable Integer proverbId) {
        Boolean result = proverbService.updateProverbStar(proverbId);
        return result;
    }

}
