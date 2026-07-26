package com.google.firebase.messaging.reporting;

import defpackage.en6;

/* JADX INFO: loaded from: classes.dex */
public enum MessagingClientEvent$Event implements en6 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);

    public final int a;

    MessagingClientEvent$Event(int i) {
        this.a = i;
    }

    @Override // defpackage.en6
    public final int getNumber() {
        return this.a;
    }
}
