package com.google.common.hash;

import defpackage.mx2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class HashCode$IntHashCode extends mx2 implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.mx2
    public final byte[] a() {
        return new byte[]{(byte) 0, (byte) (0 >> 8), (byte) (0 >> 16), (byte) (0 >> 24)};
    }

    @Override // defpackage.mx2
    public final int b() {
        return 0;
    }

    @Override // defpackage.mx2
    public final long c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.mx2
    public final int e() {
        return 32;
    }

    @Override // defpackage.mx2
    public final boolean f(mx2 mx2Var) {
        return mx2Var.b() == 0;
    }
}
