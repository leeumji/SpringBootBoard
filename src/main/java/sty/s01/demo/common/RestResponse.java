package sty.s01.demo.common;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RestResponse<T> {

    @Getter
    @AllArgsConstructor
    enum ResultCode {
        SUCCESS("00", "성공")
        , FAIL("01", "실패");
        private String resultCode;
        private String resultMessage;
    }
    private String code = ResultCode.SUCCESS.getResultCode();
    private String message = ResultCode.SUCCESS.getResultMessage();

    private T data;
}
