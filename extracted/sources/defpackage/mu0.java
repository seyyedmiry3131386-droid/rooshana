package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class mu0 {
    public int a;
    public Object b;

    public mu0(int i) {
        this.a = i;
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static b f(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.l(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i);

    public void G() throws InvalidProtocolBufferException {
        int iC;
        do {
            iC = C();
            if (iC == 0) {
                return;
            }
            int i = this.a;
            if (i >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            this.a--;
        } while (F(iC));
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract lf9 i(lf9 lf9Var, List list);

    public abstract rn6 j(ue9 ue9Var, rn6 rn6Var);

    public abstract void k(int i);

    public abstract int l(int i);

    public abstract boolean m();

    public abstract ByteString n();

    public abstract double o();

    public abstract int p();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public void g(ue9 ue9Var) {
    }

    public void h(ue9 ue9Var) {
    }
}
