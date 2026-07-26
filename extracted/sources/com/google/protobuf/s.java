package com.google.protobuf;

import defpackage.qj0;
import defpackage.sj0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends sj0 {
    public final t b;
    public sj0 c;

    public s(RopeByteString ropeByteString) {
        super(0);
        this.b = new t(ropeByteString);
        this.c = b();
    }

    @Override // defpackage.sj0
    public final byte a() {
        sj0 sj0Var = this.c;
        if (sj0Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = sj0Var.a();
        if (!this.c.hasNext()) {
            this.c = b();
        }
        return bA;
    }

    public final qj0 b() {
        t tVar = this.b;
        if (tVar.hasNext()) {
            return new qj0(tVar.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }
}
