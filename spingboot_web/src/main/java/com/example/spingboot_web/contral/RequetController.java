package com.example.spingboot_web.contral;

import com.example.spingboot_web.Pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//测试
//请求参数接收
@RestController
public class RequetController {
    //原始方式
    @RequestMapping("/simpleParam")
//        public String SimpleParam(HttpServletRequest request){
//String name=request.getParameter("name");
//String ageStr=request.getParameter("age");
//int age=Integer.parseInt(ageStr);
//          System.out.println(name+":"+age);
//          return "ok";


    //springboot 简单参数
    public String SimpleParam(String name, Integer age) {

        System.out.println(name + ":" + age);
        return "ok";

//实体参数
    }

    @RequestMapping("/simplePojo")
    public String simplePOjo(User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/complexPojo")
    public String complexPOjo(User user) {
        System.out.println(user);
        return "ok";
    }

    //数组参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }
    //集合参数
    @RequestMapping("/listParam")
    public String listParam( @RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "ok";
    }
    //时间日期参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:s")LocalDateTime updateTime){
        System.out.println(updateTime);
        return "ok";
    }

    //json参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "ok";
    }

    //路径参数
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return "ok";

    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParam2(@PathVariable Integer id ,@PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        return "ok";

    }
}
