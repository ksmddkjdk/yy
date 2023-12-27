package com.example.spingboot_web.contral;

import com.example.spingboot_web.Pojo.Emp;
import com.example.spingboot_web.Pojo.Result;
import com.example.spingboot_web.service.EmpService;
import com.example.spingboot_web.service.impl.EmpServiceA;
import com.example.spingboot_web.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



    @RestController
    public class EmpController {
private EmpService empService = new EmpServiceA();
        @RequestMapping("/listEmp")
        public Result list(){
            List<Emp> empList = empService.listEmp();


            //3. 响应数据
            return Result.success(empList);
        }
}
