package com.abovevacant.epitaph.core;

/* JADX INFO: loaded from: classes.dex */
public enum MemoryError$Type {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    USE_AFTER_FREE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_FREE(2),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_FREE(3),
    /* JADX INFO: Fake field, exist only in values array */
    BUFFER_OVERFLOW(4),
    /* JADX INFO: Fake field, exist only in values array */
    BUFFER_UNDERFLOW(5);

    public final int a;

    MemoryError$Type(int i) {
        this.a = i;
    }
}
