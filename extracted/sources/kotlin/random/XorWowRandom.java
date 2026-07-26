package kotlin.random;

import defpackage.js3;
import defpackage.yu6;
import java.io.InvalidObjectException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class XorWowRandom extends yu6 implements Serializable {
    private static final long serialVersionUID = 0;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public XorWowRandom(int i, int i2) {
        int i3 = ~i;
        int i4 = (i << 10) ^ (i2 >>> 4);
        this.c = i;
        this.d = i2;
        this.e = 0;
        this.f = 0;
        this.g = i3;
        this.h = i4;
        e();
        for (int i5 = 0; i5 < 64; i5++) {
            b();
        }
    }

    private final Object readResolve() throws Throwable {
        try {
            e();
            return this;
        } catch (Throwable th) {
            Throwable thInitCause = new InvalidObjectException(th.getMessage()).initCause(th);
            js3.o(thInitCause, "initCause(...)");
            throw thInitCause;
        }
    }

    @Override // defpackage.yu6
    public final int a(int i) {
        return ((-i) >> 31) & (b() >>> (32 - i));
    }

    @Override // defpackage.yu6
    public final int b() {
        int i = this.c;
        int i2 = i ^ (i >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.g;
        this.f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.g = i4;
        int i5 = this.h + 362437;
        this.h = i5;
        return i4 + i5;
    }

    public final void e() {
        if ((this.c | this.d | this.e | this.f | this.g) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }
}
