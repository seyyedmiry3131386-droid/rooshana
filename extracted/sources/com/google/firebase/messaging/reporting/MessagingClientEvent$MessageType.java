package com.google.firebase.messaging.reporting;

import defpackage.en6;

/* JADX INFO: loaded from: classes.dex */
public enum MessagingClientEvent$MessageType implements en6 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int a;

    MessagingClientEvent$MessageType(int i) {
        this.a = i;
    }

    @Override // defpackage.en6
    public final int getNumber() {
        return this.a;
    }
}
