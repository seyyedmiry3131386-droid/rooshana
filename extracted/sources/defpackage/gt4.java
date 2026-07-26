package defpackage;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class gt4 extends Pointer {
    public static final Map c = DesugarCollections.synchronizedMap(new WeakHashMap());
    public long b;

    static {
        new ReferenceQueue();
        new IdentityHashMap();
    }

    public gt4(long j) {
        this.b = j;
        if (j <= 0) {
            throw new IllegalArgumentException("Allocation size must be greater than zero");
        }
        long jMalloc = Native.malloc(j);
        this.a = jMalloc;
        if (jMalloc != 0) {
            c.put(this, new WeakReference(this));
        } else {
            throw new OutOfMemoryError("Cannot allocate " + j + " bytes");
        }
    }

    @Override // com.sun.jna.Pointer
    public final void A(long j, Pointer pointer) {
        O(j, Native.i);
        super.A(j, pointer);
    }

    @Override // com.sun.jna.Pointer
    public final void B(long j, short s) {
        O(j, 2L);
        super.B(j, s);
    }

    @Override // com.sun.jna.Pointer
    public final void D(String str) {
        O(0L, (((long) str.length()) + 1) * ((long) Native.k));
        super.D(str);
    }

    @Override // com.sun.jna.Pointer
    public final Pointer E(long j) {
        return F(j, this.b - j);
    }

    @Override // com.sun.jna.Pointer
    public final Pointer F(long j, long j2) {
        O(j, j2);
        return new ft4(this, j, j2);
    }

    @Override // com.sun.jna.Pointer
    public final void G(int i, long j, byte[] bArr) {
        O(j, i);
        super.G(i, j, bArr);
    }

    @Override // com.sun.jna.Pointer
    public final void H(int i, long j, long[] jArr) {
        O(j, ((long) i) * 8);
        super.H(i, j, jArr);
    }

    @Override // com.sun.jna.Pointer
    public final void I(long j, char[] cArr, int i) {
        O(j, ((long) i) * 2);
        super.I(j, cArr, i);
    }

    @Override // com.sun.jna.Pointer
    public final void J(long j, double[] dArr, int i) {
        O(j, ((long) i) * 8);
        super.J(j, dArr, i);
    }

    @Override // com.sun.jna.Pointer
    public final void K(long j, float[] fArr, int i) {
        O(j, ((long) i) * 4);
        super.K(j, fArr, i);
    }

    @Override // com.sun.jna.Pointer
    public final void L(long j, int[] iArr, int i) {
        O(j, ((long) i) * 4);
        super.L(j, iArr, i);
    }

    @Override // com.sun.jna.Pointer
    public final void N(long j, short[] sArr, int i) {
        O(j, ((long) i) * 2);
        super.N(j, sArr, i);
    }

    public void O(long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException(bl4.r(j, "Invalid offset: "));
        }
        long j3 = j + j2;
        if (j3 <= this.b) {
            return;
        }
        throw new IndexOutOfBoundsException("Bounds exceeds available space : size=" + this.b + ", offset=" + j3);
    }

    public synchronized void P() {
        try {
            long j = this.a;
            if (j != 0) {
                Native.free(j);
            }
        } finally {
            c.remove(this);
            this.a = 0L;
        }
    }

    @Override // com.sun.jna.Pointer
    public final byte a(long j) {
        O(j, 1L);
        return Native.getByte(this, this.a, j);
    }

    @Override // com.sun.jna.Pointer
    public final char b(long j) {
        O(j, 1L);
        return Native.getChar(this, this.a, j);
    }

    @Override // com.sun.jna.Pointer
    public final double c(long j) {
        O(j, 8L);
        return Native.getDouble(this, this.a, j);
    }

    @Override // com.sun.jna.Pointer
    public final float d(long j) {
        O(j, 4L);
        return Native.getFloat(this, this.a, j);
    }

    @Override // com.sun.jna.Pointer
    public final int e(long j) {
        O(j, 4L);
        return Native.getInt(this, this.a, j);
    }

    @Override // com.sun.jna.Pointer
    public final long f(long j) {
        O(j, 8L);
        return Native.getLong(this, this.a, j);
    }

    public final void finalize() {
        P();
    }

    @Override // com.sun.jna.Pointer
    public final Pointer g(long j) {
        O(j, Native.i);
        return super.g(j);
    }

    @Override // com.sun.jna.Pointer
    public final short h(long j) {
        O(j, 2L);
        return Native.getShort(this, this.a, j);
    }

    @Override // com.sun.jna.Pointer
    public final String i(String str) {
        O(0L, 0L);
        return super.i(str);
    }

    @Override // com.sun.jna.Pointer
    public final String l() {
        O(0L, 0L);
        return Native.getWideString(this, this.a, 0L);
    }

    @Override // com.sun.jna.Pointer
    public final void m(int i, long j, byte[] bArr) {
        O(j, i);
        super.m(i, j, bArr);
    }

    @Override // com.sun.jna.Pointer
    public final void n(int i, long j, long[] jArr) {
        O(j, ((long) i) * 8);
        super.n(i, j, jArr);
    }

    @Override // com.sun.jna.Pointer
    public final void o(long j, char[] cArr, int i) {
        O(j, ((long) i) * 2);
        super.o(j, cArr, i);
    }

    @Override // com.sun.jna.Pointer
    public final void p(long j, double[] dArr, int i) {
        O(j, ((long) i) * 8);
        super.p(j, dArr, i);
    }

    @Override // com.sun.jna.Pointer
    public final void q(long j, float[] fArr, int i) {
        O(j, ((long) i) * 4);
        super.q(j, fArr, i);
    }

    @Override // com.sun.jna.Pointer
    public final void r(long j, int[] iArr, int i) {
        O(j, ((long) i) * 4);
        super.r(j, iArr, i);
    }

    @Override // com.sun.jna.Pointer
    public final void t(long j, short[] sArr, int i) {
        O(j, ((long) i) * 2);
        super.t(j, sArr, i);
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        StringBuilder sb = new StringBuilder("allocated@0x");
        sb.append(Long.toHexString(this.a));
        sb.append(" (");
        return bl4.s(this.b, " bytes)", sb);
    }

    @Override // com.sun.jna.Pointer
    public final void u(long j, byte b) {
        O(j, 1L);
        super.u(j, b);
    }

    @Override // com.sun.jna.Pointer
    public final void v(long j, char c2) {
        O(j, Native.k);
        super.v(j, c2);
    }

    @Override // com.sun.jna.Pointer
    public final void w(long j, double d) {
        O(j, 8L);
        super.w(j, d);
    }

    @Override // com.sun.jna.Pointer
    public final void x(float f, long j) {
        O(j, 4L);
        super.x(f, j);
    }

    @Override // com.sun.jna.Pointer
    public final void y(int i, long j) {
        O(j, 4L);
        super.y(i, j);
    }

    @Override // com.sun.jna.Pointer
    public final void z(long j, long j2) {
        O(j, 8L);
        super.z(j, j2);
    }
}
