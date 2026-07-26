package com.google.common.hash;

import defpackage.vb8;

/* JADX INFO: loaded from: classes.dex */
public final class b implements vb8 {
    public final /* synthetic */ int a;

    @Override // defpackage.vb8
    public final Object get() {
        switch (this.a) {
            case 0:
                return new LongAdder();
            default:
                return new LongAddables$PureJavaLongAddable(0);
        }
    }
}
