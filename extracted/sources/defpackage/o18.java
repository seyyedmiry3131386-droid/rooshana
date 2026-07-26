package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o18 implements g00 {
    public int b;
    public float c;
    public float d;
    public f00 e;
    public f00 f;
    public f00 g;
    public f00 h;
    public boolean i;
    public n18 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.g00
    public final boolean b() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.g00
    public final boolean c() {
        if (this.p) {
            n18 n18Var = this.j;
            if (n18Var != null) {
                vy2.s(n18Var.m >= 0);
                if (n18Var.m * n18Var.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.g00
    public final ByteBuffer d() {
        n18 n18Var = this.j;
        if (n18Var != null) {
            int i = n18Var.b;
            vy2.s(n18Var.m >= 0);
            int i2 = n18Var.m * i * 2;
            if (i2 > 0) {
                if (this.k.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                vy2.s(n18Var.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i, n18Var.m);
                int i3 = iMin * i;
                shortBuffer.put(n18Var.l, 0, i3);
                int i4 = n18Var.m - iMin;
                n18Var.m = i4;
                short[] sArr = n18Var.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += (long) i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = g00.a;
        return byteBuffer;
    }

    @Override // defpackage.g00
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            n18 n18Var = this.j;
            n18Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = n18Var.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = n18Var.c(n18Var.j, n18Var.k, i2);
            n18Var.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, n18Var.k * i, ((i2 * i) * 2) / 2);
            n18Var.k += i2;
            n18Var.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.g00
    public final f00 f(f00 f00Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (f00Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(f00Var);
        }
        int i = this.b;
        if (i == -1) {
            i = f00Var.a;
        }
        this.e = f00Var;
        f00 f00Var2 = new f00(i, f00Var.b, 2);
        this.f = f00Var2;
        this.i = true;
        return f00Var2;
    }

    @Override // defpackage.g00
    public final void flush() {
        if (b()) {
            f00 f00Var = this.e;
            this.g = f00Var;
            f00 f00Var2 = this.f;
            this.h = f00Var2;
            if (this.i) {
                this.j = new n18(this.c, this.d, f00Var.a, f00Var.b, f00Var2.a);
            } else {
                n18 n18Var = this.j;
                if (n18Var != null) {
                    n18Var.k = 0;
                    n18Var.m = 0;
                    n18Var.o = 0;
                    n18Var.p = 0;
                    n18Var.q = 0;
                    n18Var.r = 0;
                    n18Var.s = 0;
                    n18Var.t = 0;
                    n18Var.u = 0;
                    n18Var.v = 0;
                    n18Var.w = 0.0d;
                }
            }
        }
        this.m = g00.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.g00
    public final void g() {
        n18 n18Var = this.j;
        if (n18Var != null) {
            int i = n18Var.k;
            float f = n18Var.c;
            float f2 = n18Var.d;
            double d = f / f2;
            double d2 = n18Var.e * f2;
            int i2 = n18Var.r;
            int i3 = n18Var.m + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + n18Var.w) + ((double) n18Var.o)) / d2) + 0.5d));
            n18Var.w = 0.0d;
            short[] sArr = n18Var.j;
            int i4 = n18Var.h * 2;
            n18Var.j = n18Var.c(sArr, i, i4 + i);
            int i5 = 0;
            while (true) {
                int i6 = n18Var.b;
                if (i5 >= i4 * i6) {
                    break;
                }
                n18Var.j[(i6 * i) + i5] = 0;
                i5++;
            }
            n18Var.k = i4 + n18Var.k;
            n18Var.f();
            if (n18Var.m > i3) {
                n18Var.m = Math.max(i3, 0);
            }
            n18Var.k = 0;
            n18Var.r = 0;
            n18Var.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.g00
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        f00 f00Var = f00.e;
        this.e = f00Var;
        this.f = f00Var;
        this.g = f00Var;
        this.h = f00Var;
        ByteBuffer byteBuffer = g00.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
