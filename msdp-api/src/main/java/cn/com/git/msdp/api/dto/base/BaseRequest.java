package cn.com.git.msdp.api.dto.base;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseRequest<Param>{
    Param param;
}
