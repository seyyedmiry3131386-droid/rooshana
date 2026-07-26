package com.google.firebase.messaging.reporting;

import defpackage.en6;

/* JADX INFO: loaded from: classes.dex */
public enum MessagingClientEvent$SDKPlatform implements en6 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int a;

    MessagingClientEvent$SDKPlatform(int i) {
        this.a = i;
    }

    @Override // defpackage.en6
    public final int getNumber() {
        return this.a;
    }
}
