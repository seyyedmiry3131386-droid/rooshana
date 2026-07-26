package com.google.android.gms.fido.u2f.api.messagebased;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public enum RequestType {
    /* JADX INFO: Fake field, exist only in values array */
    REGISTER("u2f_register_request"),
    /* JADX INFO: Fake field, exist only in values array */
    SIGN("u2f_sign_request");

    public final String a;

    public static class UnsupportedRequestTypeException extends Exception {
    }

    RequestType(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
