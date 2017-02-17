package cn.ldx.model;

/**
 * Created by Doenix Liu on 2017/2/16.
 */
public class ResponseEntity {

    private static final String OK = "ok";
    private static final String ERROR = "error";

    private OPTN option;
    private Object data;

    public ResponseEntity success() {
        this.option = new OPTN(true, OK);
        return this;
    }

    public ResponseEntity success(Object data) {
        this.option = new OPTN(true, OK);
        this.data = data;
        return this;
    }

    public ResponseEntity failure() {
        this.option = new OPTN(false, ERROR);
        return this;
    }

    public ResponseEntity failure(String message) {
        this.option = new OPTN(false, message);
        return this;
    }

    public OPTN getOPTN() {
        return option;
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
