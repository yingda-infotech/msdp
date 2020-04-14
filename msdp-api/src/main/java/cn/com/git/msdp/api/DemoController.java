package cn.com.git.msdp.api;

import cn.com.git.msdp.api.dto.DemoDTO;
import cn.com.git.msdp.api.dto.base.BaseRequest;
import cn.com.git.msdp.api.dto.base.BaseResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/demo")
public interface DemoController {
    @RequestMapping(value = "/getDemo", method = RequestMethod.POST)
    BaseResponse<DemoDTO> getDemo(@RequestBody BaseRequest<DemoDTO> req);
}
