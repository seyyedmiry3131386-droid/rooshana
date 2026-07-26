package com.google.android.datatransport.runtime.firebase.transport;

import defpackage.en6;

/* JADX INFO: loaded from: classes.dex */
public enum LogEventDropped$Reason implements en6 {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int a;

    LogEventDropped$Reason(int i2) {
        this.a = i2;
    }

    @Override // defpackage.en6
    public final int getNumber() {
        return this.a;
    }
}
