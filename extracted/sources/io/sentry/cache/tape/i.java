package io.sentry.cache.tape;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterator {
    public int a = 0;
    public long b;
    public int c;
    public final /* synthetic */ j d;

    public i(j jVar) {
        this.d = jVar;
        this.b = jVar.e.a;
        this.c = jVar.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        j jVar = this.d;
        if (jVar.j) {
            throw new IllegalStateException("closed");
        }
        if (jVar.h == this.c) {
            return this.a != jVar.d;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = j.k;
        j jVar = this.d;
        if (jVar.j) {
            throw new IllegalStateException("closed");
        }
        if (jVar.h != this.c) {
            throw new ConcurrentModificationException();
        }
        int i = jVar.d;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        if (this.a >= i) {
            throw new NoSuchElementException();
        }
        try {
            h hVarU = jVar.u(this.b);
            int i2 = hVarU.b;
            long j = hVarU.a;
            byte[] bArr2 = new byte[i2];
            long j2 = j + 4;
            long jF0 = jVar.F0(j2);
            this.b = jF0;
            if (!jVar.r0(i2, jF0, bArr2)) {
                this.a = jVar.d;
                return bArr;
            }
            this.b = jVar.F0(j2 + ((long) i2));
            this.a++;
            return bArr2;
        } catch (IOException e) {
            throw e;
        } catch (OutOfMemoryError unused) {
            jVar.l0();
            this.a = jVar.d;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        j jVar = this.d;
        if (jVar.h != this.c) {
            throw new ConcurrentModificationException();
        }
        if (jVar.d == 0) {
            throw new NoSuchElementException();
        }
        if (this.a != 1) {
            throw new UnsupportedOperationException("Removal is only permitted from the head.");
        }
        jVar.U(1);
        this.c = jVar.h;
        this.a--;
    }
}
