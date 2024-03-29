package com.example.spingboot_web.service.impl;

import com.example.spingboot_web.Pojo.Emp;
import com.example.spingboot_web.dao.EmpDao;
import com.example.spingboot_web.dao.impl.EmpDaoA;
import com.example.spingboot_web.service.EmpService;

import java.util.List;

public class EmpServiceA implements EmpService {
//调用Dao，获取数据
    private EmpDao empDao= new EmpDaoA();
    @Override
    public List<Emp> listEmp() {
        //2. 对数据进行转换处理 - gender, job
        List<Emp> empList =empDao.listEmp();
        empList.stream().forEach(emp -> {
            //处理 gender 1: 男, 2: 女
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });
return  empList;
    }
}
