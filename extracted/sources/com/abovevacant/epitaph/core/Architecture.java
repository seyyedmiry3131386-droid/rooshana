package com.abovevacant.epitaph.core;

/* JADX INFO: loaded from: classes.dex */
public enum Architecture {
    /* JADX INFO: Fake field, exist only in values array */
    ARM32(0),
    /* JADX INFO: Fake field, exist only in values array */
    ARM64(1),
    /* JADX INFO: Fake field, exist only in values array */
    X86(2),
    /* JADX INFO: Fake field, exist only in values array */
    X86_64(3),
    /* JADX INFO: Fake field, exist only in values array */
    RISCV64(4),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(5);

    public final int a;

    Architecture(int i) {
        this.a = i;
    }
}
