package blog.lucent.code.Controller;

import blog.lucent.code.Bean.GeneratorConfig;
import blog.lucent.code.Tools.CodeGenerator;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @ResponseBody
    @RequestMapping("gen")
    public String gen(@RequestBody GeneratorConfig config){
        try {
            CodeGenerator.geterator(config);
        }catch (Exception e){
            e.printStackTrace();
            return "生成失败！";
        }
        return "生成成功！";
    }
}
