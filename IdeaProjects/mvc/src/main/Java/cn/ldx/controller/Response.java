package cn.ldx.controller;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

/**
 * Created by Doenix Liu on 2017/2/16.
 */
public class Response {

    private static final String OK = "ok";
    private static final String ERROR = "error";

    private OPTN meta;
    private Object data;

    public Response success() {
        this.meta = new OPTN(true, OK);
        return this;
    }

    public Response success(Object data) {
        this.meta = new OPTN(true, OK);
        this.data = data;
        return this;
    }

    public Response failure() {
        this.meta = new OPTN(false, ERROR);
        return this;
    }

    public Response failure(String message) {
        this.meta = new OPTN(false, message);
        return this;
    }

    public OPTN getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

    public class OPTN {

        private boolean success;
        private String message;

        public OPTN(boolean success) {
            this.success = success;
        }

        public OPTN(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }
    }
}
