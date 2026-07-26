package org.junit.internal;

import defpackage.bt2;
import defpackage.ck4;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
class SerializableMatcherDescription<T> extends bt2 implements Serializable {
    @Override // defpackage.dn7
    public final void a(ck4 ck4Var) {
        ck4Var.getClass();
        try {
            ((StringBuilder) ck4Var.b).append((CharSequence) null);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }
}
