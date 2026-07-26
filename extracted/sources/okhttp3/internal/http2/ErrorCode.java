package okhttp3.internal.http2;

import defpackage.cv;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorCode {
    public static final cv b;
    public static final ErrorCode c;
    public static final ErrorCode d;
    public static final ErrorCode e;
    public static final ErrorCode f;
    public static final ErrorCode g;
    public static final ErrorCode h;
    public static final /* synthetic */ ErrorCode[] i;
    public final int a;

    static {
        ErrorCode errorCode = new ErrorCode("NO_ERROR", 0, 0);
        c = errorCode;
        ErrorCode errorCode2 = new ErrorCode("PROTOCOL_ERROR", 1, 1);
        d = errorCode2;
        ErrorCode errorCode3 = new ErrorCode("INTERNAL_ERROR", 2, 2);
        e = errorCode3;
        ErrorCode errorCode4 = new ErrorCode("FLOW_CONTROL_ERROR", 3, 3);
        f = errorCode4;
        ErrorCode errorCode5 = new ErrorCode("SETTINGS_TIMEOUT", 4, 4);
        ErrorCode errorCode6 = new ErrorCode("STREAM_CLOSED", 5, 5);
        ErrorCode errorCode7 = new ErrorCode("FRAME_SIZE_ERROR", 6, 6);
        ErrorCode errorCode8 = new ErrorCode("REFUSED_STREAM", 7, 7);
        g = errorCode8;
        ErrorCode errorCode9 = new ErrorCode("CANCEL", 8, 8);
        h = errorCode9;
        ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, errorCode9, new ErrorCode("COMPRESSION_ERROR", 9, 9), new ErrorCode("CONNECT_ERROR", 10, 10), new ErrorCode("ENHANCE_YOUR_CALM", 11, 11), new ErrorCode("INADEQUATE_SECURITY", 12, 12), new ErrorCode("HTTP_1_1_REQUIRED", 13, 13)};
        i = errorCodeArr;
        a.a(errorCodeArr);
        b = new cv(18);
    }

    public ErrorCode(String str, int i2, int i3) {
        this.a = i3;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) i.clone();
    }
}
