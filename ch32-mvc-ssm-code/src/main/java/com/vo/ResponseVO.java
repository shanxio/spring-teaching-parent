package com.vo;

import lombok.Data;

/**
 * @author cj
 * @date 2019/11/25
 */
@Data
public class ResponseVO {
    private String code;
    private String msg;
    private Object data;

    private ResponseVO(Builder builder) {
        setCode(builder.code);
        setMsg(builder.msg);
        setData(builder.data);
    }


    public static void main(String[] args) {
       /* ResponseVO responseVO = new ResponseVO();
        responseVO.setCode("2020");
        responseVO.setMsg("afs");*/

        //
       // ResponseVO responseVO1 =
            //    new ResponseVO("200", "saf", null);

        ResponseVO responseVO1 = ResponseVO.newBuilder()
                .code("200")
                .data(null)
                .msg("succes")
                .build();

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(ResponseVO copy) {
        Builder builder = new Builder();
        builder.code = copy.getCode();
        builder.msg = copy.getMsg();
        builder.data = copy.getData();
        return builder;
    }

    public static final class Builder {
        private String code;
        private String msg;
        private Object data;

        private Builder() {
        }

        public Builder code(String val) {
            code = val;
            return this;
        }

        public Builder msg(String val) {
            msg = val;
            return this;
        }

        public Builder data(Object val) {
            data = val;
            return this;
        }

        public ResponseVO build() {
            return new ResponseVO(this);
        }
    }
}
