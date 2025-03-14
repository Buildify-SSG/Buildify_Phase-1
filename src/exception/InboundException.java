package exception;

import common.ErrorCode;

public class InboundException extends RuntimeException {
    private final ErrorCode error;

    public InboundException(ErrorCode error){
        super(error.getText());
        this.error = error;
    }
}
