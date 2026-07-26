package io.sentry.cache.tape;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends g {
    public final j a;
    public final c b = new c();
    public final f c;

    public e(j jVar, f fVar) {
        this.a = jVar;
        this.c = fVar;
    }

    @Override // io.sentry.cache.tape.g
    public final void clear() throws IOException {
        this.a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.cache.tape.g
    public final void d(Object obj) throws IOException {
        long j;
        char c;
        long j2;
        long j3;
        long j4;
        long j5;
        c cVar = this.b;
        cVar.reset();
        this.c.b(obj, cVar);
        byte[] bArrB = cVar.b();
        int size = cVar.size();
        j jVar = this.a;
        jVar.getClass();
        byte[] bArr = jVar.g;
        if (bArrB == null) {
            throw new NullPointerException("data == null");
        }
        if (size < 0 || size > bArrB.length) {
            throw new IndexOutOfBoundsException();
        }
        if (jVar.j) {
            throw new IllegalStateException("closed");
        }
        int i = jVar.i;
        if (i != -1 && jVar.d == i) {
            jVar.U(1);
        }
        long j6 = ((long) size) + 4;
        long j7 = jVar.c;
        long jF0 = 32;
        if (jVar.d == 0) {
            c = 1;
            j = 4;
            j2 = 32;
        } else {
            h hVar = jVar.f;
            long j8 = hVar.a;
            int i2 = hVar.b;
            j = 4;
            long j9 = jVar.e.a;
            if (j8 >= j9) {
                j2 = (j8 - j9) + 4 + ((long) i2) + 32;
                c = 1;
            } else {
                c = 1;
                j2 = (((j8 + 4) + ((long) i2)) + j7) - j9;
            }
        }
        long j10 = j7 - j2;
        if (j10 < j6) {
            do {
                j10 += j7;
                j7 <<= c;
            } while (j10 < j6);
            jVar.a.setLength(j7);
            jVar.a.getChannel().force(c);
            h hVar2 = jVar.f;
            long jF02 = jVar.F0(hVar2.a + j + ((long) hVar2.b));
            if (jF02 <= jVar.e.a) {
                FileChannel channel = jVar.a.getChannel();
                channel.position(jVar.c);
                j3 = jF02 - 32;
                if (channel.transferTo(32L, j3, channel) != j3) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            } else {
                j3 = 0;
            }
            long j11 = jVar.f.a;
            long j12 = jVar.e.a;
            if (j11 < j12) {
                j5 = 0;
                long j13 = (jVar.c + j11) - 32;
                j4 = j7;
                jVar.H0(j4, jVar.d, j12, j13);
                jVar.f = new h(jVar.f.b, j13);
            } else {
                j4 = j7;
                j5 = 0;
                jVar.H0(j4, jVar.d, j12, j11);
            }
            jVar.c = j4;
            long j14 = 32;
            long j15 = j3;
            while (j15 > j5) {
                int iMin = (int) Math.min(j15, 4096);
                jVar.C0(iMin, j14, j.k);
                long j16 = iMin;
                j15 -= j16;
                j14 += j16;
            }
        }
        boolean z = jVar.d == 0;
        if (!z) {
            h hVar3 = jVar.f;
            jF0 = jVar.F0(hVar3.a + j + ((long) hVar3.b));
        }
        long j17 = jF0;
        h hVar4 = new h(size, j17);
        j.L0(bArr, 0, size);
        jVar.C0(4, j17, bArr);
        jVar.C0(size, j17 + j, bArrB);
        jVar.H0(jVar.c, jVar.d + 1, z ? j17 : jVar.e.a, j17);
        jVar.f = hVar4;
        jVar.d++;
        jVar.h++;
        if (z) {
            jVar.e = hVar4;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j jVar = this.a;
        jVar.getClass();
        return new d(this, new i(jVar));
    }

    @Override // io.sentry.cache.tape.g
    public final int size() {
        return this.a.d;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.a + '}';
    }

    @Override // io.sentry.cache.tape.g
    public final void y(int i) {
        this.a.U(i);
    }
}
