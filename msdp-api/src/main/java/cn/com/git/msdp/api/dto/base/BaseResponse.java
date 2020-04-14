package cn.com.git.msdp.api.dto.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse<Data> {
    Data data;
}
