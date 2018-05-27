package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;
    //@PathVariable("id") Integer id 对应 /say/{id}
    //@RequestMapping(value = {"/say","/hi"},method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        //return girlProperties.getCupSize();
        //return "index";
        return "id:"+id;
    }
}
