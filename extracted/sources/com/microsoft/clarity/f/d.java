package com.microsoft.clarity.f;

import com.microsoft.clarity.d.i;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {
    public int f;

    @Override // com.microsoft.clarity.f.e
    public final void a(i iVar) throws EOFException {
        com.microsoft.clarity.e.a aVar = new com.microsoft.clarity.e.a(this.d);
        if ((aVar.a() | aVar.a()) < 0) {
            throw new EOFException();
        }
        aVar.c();
        this.f = aVar.c();
        this.e = true;
    }
}
