package com.itdfq.houtai.controller;

import com.itdfq.core.web.BasicController;
import com.itdfq.houtai.model.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/authority")
public class AuthorityController extends BasicController {

    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> add(@RequestBody List<Authority>  ls){
        map.clear();
        try{
            this.AuthorityService.addAuthority(ls);
            map.put("msg","1");
        }catch (Exception e){
            map.put("msg",e.getMessage());
            e.printStackTrace();
        }

        return map;
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Map<String,Object> remove(@RequestBody List<Authority> ls){
        map.clear();
        try{
            this.AuthorityService.removeAuthortiy(ls);
            map.put("msg","1");
        }catch (Exception e){
            map.put("msg",e.getMessage());
            e.printStackTrace();
        }

        return map;
    }

    @Autowired
    private com.itdfq.houtai.service.AuthorityService AuthorityService;
}
