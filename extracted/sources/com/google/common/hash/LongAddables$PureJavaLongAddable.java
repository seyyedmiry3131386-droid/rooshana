package com.google.common.hash;

import defpackage.be4;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
final class LongAddables$PureJavaLongAddable extends AtomicLong implements be4 {
    private LongAddables$PureJavaLongAddable() {
    }

    @Override // defpackage.be4
    public final void add(long j) {
        getAndAdd(j);
    }

    public /* synthetic */ LongAddables$PureJavaLongAddable(int i) {
        this();
    }
}
