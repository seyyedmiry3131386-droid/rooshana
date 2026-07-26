package org.pcap4j.core;

/* JADX INFO: loaded from: classes4.dex */
public final class PcapNativeException extends Exception {
    private static final long serialVersionUID = -6458526492950674556L;
    private Integer returnCode;

    public PcapNativeException() {
        this.returnCode = null;
    }

    public Integer getReturnCode() {
        return this.returnCode;
    }

    public void setReturnCode(Integer num) {
        this.returnCode = num;
    }

    public PcapNativeException(String str) {
        super(str);
        this.returnCode = null;
    }

    public PcapNativeException(String str, Integer num) {
        super(str);
        this.returnCode = num;
    }

    public PcapNativeException(String str, Throwable th) {
        super(str, th);
        this.returnCode = null;
    }

    public PcapNativeException(Throwable th) {
        super(th);
        this.returnCode = null;
    }
}
