package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl4;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorCode implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED_ERR(9),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_STATE_ERR(11),
    /* JADX INFO: Fake field, exist only in values array */
    SECURITY_ERR(18),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERR(19),
    /* JADX INFO: Fake field, exist only in values array */
    ABORT_ERR(20),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT_ERR(23),
    /* JADX INFO: Fake field, exist only in values array */
    ENCODING_ERR(27),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERR(28),
    /* JADX INFO: Fake field, exist only in values array */
    CONSTRAINT_ERR(29),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_ERR(30),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ALLOWED_ERR(35),
    /* JADX INFO: Fake field, exist only in values array */
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new h();
    public final int a;

    public static class UnsupportedErrorCodeException extends Exception {
    }

    ErrorCode(int i) {
        this.a = i;
    }

    public static ErrorCode a(int i) throws UnsupportedErrorCodeException {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.a) {
                return errorCode;
            }
        }
        Locale locale = Locale.US;
        throw new UnsupportedErrorCodeException(bl4.q(i, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
