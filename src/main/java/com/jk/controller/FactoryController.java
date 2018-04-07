package com.jk.controller;

import com.jk.pojo.Factory;
import com.jk.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FactoryController {

    @Autowired
    private FactoryService factoryService;


    //列表
    @RequestMapping("/basicinfo/factory/list.action")
    public String list(Factory factory, Model model){
        List<Factory> list = factoryService.find(factory);
        model.addAttribute("dataList",list);
        return "/basicinfo/factory/jFactoryList";
    }

    //转向新增页面
    @RequestMapping("/basicinfo/factory/tocreate.action")
    public String tocreate(){
       return "/basicinfo/factory/jFactoryCreate";
    }

    //新增保存
    @RequestMapping("/basicinfo/factory/insert.action")
    public String insert(Factory factory){
        factoryService.insert(factory);
        return "redirect:/basicinfo/factory/list.action";
    }


    //转向修改页面
    @RequestMapping("/basicinfo/factory/toupdate.action")
    public String toUpdate(String id,Model model){
       //准备修改的对象
        Factory factory=factoryService.get(id);
        model.addAttribute("obj",factory);
        return "/basicinfo/factory/jFactoryUpdate";
    }


    //保存修改
    @RequestMapping
    public String update(Factory factory){
        factoryService.update(factory);
        return "redirect:/basicinfo/factory/list.action";
    }

    //删除一条
    @RequestMapping("/basicinfo/factory/delete.action")
    public String delete(String id){
        factoryService.delete(id);
        return "redirect:/basicinfo/factory/list.action";
    }


    //批量删除
    @RequestMapping("/basicinfo/factory/deletebatch.action")
    public String deleteBatch(String [] id){
        factoryService.delteBatch(id);
        return "redirect:/basicinfo/factory/list.action";
    }


    //转向查看页面
    @RequestMapping("/basicinfo/factory/toview.action")
    public String toView(String id,Model model){
        Factory factory = factoryService.get(id);
        model.addAttribute("obj",factory);
        return "/basicinfo/factory/jFactoryView";
    }


}
