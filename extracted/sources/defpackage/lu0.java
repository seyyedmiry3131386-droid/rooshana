package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.c;
import com.google.protobuf.e;
import com.google.protobuf.f;
import com.google.protobuf.g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lu0 {
    public int a;
    public g b;

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static lu0 h(InputStream inputStream) {
        if (inputStream != null) {
            return new e(inputStream);
        }
        byte[] bArr = tr3.b;
        return j(bArr, 0, bArr.length, false);
    }

    public static lu0 i(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return j(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && uy8.d) {
            return new f(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return j(bArr, 0, iRemaining, true);
    }

    public static c j(byte[] bArr, int i, int i2, boolean z) {
        c cVar = new c(bArr, i, i2, z);
        try {
            cVar.l(i2);
            return cVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int y(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.i();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.i();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract String D();

    public abstract String E();

    public abstract int F();

    public abstract int G();

    public abstract long H();

    public abstract boolean I(int i);

    public abstract void a(int i);

    public final void b() {
        if (this.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void k(int i);

    public abstract int l(int i);

    public abstract boolean m();

    public abstract ByteString n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract void t(int i, dv4 dv4Var, h72 h72Var);

    public abstract int u();

    public abstract long v();

    public abstract void w(dv4 dv4Var, h72 h72Var);

    public abstract int x();

    public abstract int z();
}
