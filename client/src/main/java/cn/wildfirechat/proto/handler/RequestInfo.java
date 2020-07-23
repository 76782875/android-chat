package cn.wildfirechat.proto.handler;

import com.comsince.github.push.Signal;
import com.comsince.github.push.SubSignal;

public class RequestInfo {
    private Signal signal;
    private SubSignal subSignal;
    private Class type;
    private Object callback;
    private long protoMessageId;
    private String callbackParam;
    private int retryCount = 0;

    public RequestInfo(Signal signal, SubSignal subSignal, Class type, Object callback) {
        this.signal = signal;
        this.subSignal = subSignal;
        this.type = type;
        this.callback = callback;
    }

    public Signal getSignal() {
        return signal;
    }

    public void setSignal(Signal signal) {
        this.signal = signal;
    }

    public SubSignal getSubSignal() {
        return subSignal;
    }

    public void setSubSignal(SubSignal subSignal) {
        this.subSignal = subSignal;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public Object getCallback() {
        return callback;
    }

    public void setCallback(Object callback) {
        this.callback = callback;
    }

    public String getCallbackParam() {
        return callbackParam;
    }

    public void setCallbackParam(String callbackParam) {
        this.callbackParam = callbackParam;
    }

    public long getProtoMessageId() {
        return protoMessageId;
    }

    public void setProtoMessageId(long protoMessageId) {
        this.protoMessageId = protoMessageId;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public void increaseRetryCount(){
        this.retryCount += 1;
    }
}
