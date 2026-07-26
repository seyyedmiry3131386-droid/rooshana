package com.google.common.hash;

import defpackage.mx2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class HashCode$LongHashCode extends mx2 implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.mx2
    public final byte[] a() {
        return new byte[]{(byte) 0, (byte) (0 >> 8), (byte) (0 >> 16), (byte) (0 >> 24), (byte) (0 >> 32), (byte) (0 >> 40), (byte) (0 >> 48), (byte) (0 >> 56)};
    }

    @Override // defpackage.mx2
    public final int b() {
        return (int) 0;
    }

    @Override // defpackage.mx2
    public final long c() {
        return 0L;
    }

    @Override // defpackage.mx2
    public final int e() {
        return 64;
    }

    @Override // defpackage.mx2
    public final boolean f(mx2 mx2Var) {
        return 0 == mx2Var.c();
    }
}
