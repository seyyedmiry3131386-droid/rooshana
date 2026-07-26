package ir.myket.network.model;

import androidx.annotation.Keep;
import defpackage.b88;
import defpackage.j32;
import defpackage.js3;
import defpackage.k32;
import defpackage.no7;
import defpackage.so7;
import defpackage.to7;
import defpackage.uz0;
import defpackage.wq2;
import defpackage.xq3;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
@so7
@Keep
public final class ErrorDto {
    public static final int $stable = 0;
    public static final k32 Companion = new k32();
    private final Integer code;
    private final int httpStatus;
    private final String messageCode;
    private final String translatedMessage;

    public /* synthetic */ ErrorDto(int i, String str, Integer num, String str2, int i2, to7 to7Var) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, j32.a.getDescriptor());
            throw null;
        }
        this.messageCode = str;
        this.code = num;
        if ((i & 4) == 0) {
            this.translatedMessage = null;
        } else {
            this.translatedMessage = str2;
        }
        if ((i & 8) == 0) {
            this.httpStatus = -1;
        } else {
            this.httpStatus = i2;
        }
    }

    public static /* synthetic */ ErrorDto copy$default(ErrorDto errorDto, String str, Integer num, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorDto.messageCode;
        }
        if ((i2 & 2) != 0) {
            num = errorDto.code;
        }
        if ((i2 & 4) != 0) {
            str2 = errorDto.translatedMessage;
        }
        if ((i2 & 8) != 0) {
            i = errorDto.httpStatus;
        }
        return errorDto.copy(str, num, str2, i);
    }

    public static /* synthetic */ void getCode$annotations() {
    }

    public static /* synthetic */ void getHttpStatus$annotations() {
    }

    public static /* synthetic */ void getMessageCode$annotations() {
    }

    public static /* synthetic */ void getTranslatedMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$network_release(ErrorDto errorDto, uz0 uz0Var, no7 no7Var) {
        b88 b88Var = b88.a;
        uz0Var.z(no7Var, 0, b88Var, errorDto.messageCode);
        uz0Var.z(no7Var, 1, xq3.a, errorDto.code);
        if (uz0Var.f(no7Var) || errorDto.translatedMessage != null) {
            uz0Var.z(no7Var, 2, b88Var, errorDto.translatedMessage);
        }
        if (!uz0Var.f(no7Var) && errorDto.httpStatus == -1) {
            return;
        }
        uz0Var.v(3, errorDto.httpStatus, no7Var);
    }

    public final String component1() {
        return this.messageCode;
    }

    public final Integer component2() {
        return this.code;
    }

    public final String component3() {
        return this.translatedMessage;
    }

    public final int component4() {
        return this.httpStatus;
    }

    public final ErrorDto copy(String str, Integer num, String str2, int i) {
        return new ErrorDto(str, num, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorDto)) {
            return false;
        }
        ErrorDto errorDto = (ErrorDto) obj;
        return js3.i(this.messageCode, errorDto.messageCode) && js3.i(this.code, errorDto.code) && js3.i(this.translatedMessage, errorDto.translatedMessage) && this.httpStatus == errorDto.httpStatus;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final int getHttpStatus() {
        return this.httpStatus;
    }

    public final String getMessageCode() {
        return this.messageCode;
    }

    public final String getTranslatedMessage() {
        return this.translatedMessage;
    }

    public int hashCode() {
        String str = this.messageCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.code;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.translatedMessage;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.httpStatus;
    }

    public String toString() {
        return "ErrorDto(messageCode=" + this.messageCode + ", code=" + this.code + ", translatedMessage=" + this.translatedMessage + ", httpStatus=" + this.httpStatus + ")";
    }

    public ErrorDto(String str, Integer num, String str2, int i) {
        this.messageCode = str;
        this.code = num;
        this.translatedMessage = str2;
        this.httpStatus = i;
    }

    public /* synthetic */ ErrorDto(String str, Integer num, String str2, int i, int i2, yd1 yd1Var) {
        this(str, num, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? -1 : i);
    }
}
