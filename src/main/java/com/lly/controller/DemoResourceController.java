package com.lly.controller;

/**
 * <p>
 *
 * </p>
 *
 * @author dongwu
 * @since 2022/5/24
 */

import com.lly.config.MessageUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/i18n")
public class DemoResourceController {

    @GetMapping ("/listMessages")
    public String listMessages() {
        return MessageUtils.get("user.name");
    }

}
