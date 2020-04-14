package cn.com.git.msdp.services;

import cn.com.git.msdp.api.DemoController;
import cn.com.git.msdp.api.dto.DemoDTO;
import cn.com.git.msdp.api.dto.base.BaseRequest;
import cn.com.git.msdp.api.dto.base.BaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService implements DemoController {
    @Override
    public BaseResponse<DemoDTO> getDemo(BaseRequest<DemoDTO> req) {
        BaseResponse<DemoDTO> response = new BaseResponse();
        response.setData(req.getParam());
        return response;
    }
}
