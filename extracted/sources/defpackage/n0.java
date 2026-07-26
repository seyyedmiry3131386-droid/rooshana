package defpackage;

import com.google.common.util.concurrent.b;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends bt2 {
    public static final Unsafe n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new m0());
        }
        try {
            p = unsafe.objectFieldOffset(b.class.getDeclaredField(ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME));
            o = unsafe.objectFieldOffset(b.class.getDeclaredField("b"));
            q = unsafe.objectFieldOffset(b.class.getDeclaredField("a"));
            r = unsafe.objectFieldOffset(o0.class.getDeclaredField("a"));
            s = unsafe.objectFieldOffset(o0.class.getDeclaredField("b"));
            n = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.bt2
    public final void M(o0 o0Var, o0 o0Var2) {
        n.putObject(o0Var, s, o0Var2);
    }

    @Override // defpackage.bt2
    public final void N(o0 o0Var, Thread thread) {
        n.putObject(o0Var, r, thread);
    }

    @Override // defpackage.bt2
    public final boolean m(b bVar, d0 d0Var, d0 d0Var2) {
        return k0.a(n, bVar, o, d0Var, d0Var2);
    }

    @Override // defpackage.bt2
    public final boolean n(b bVar, Object obj, Object obj2) {
        return l0.a(n, bVar, q, obj, obj2);
    }

    @Override // defpackage.bt2
    public final boolean o(b bVar, o0 o0Var, o0 o0Var2) {
        return j0.a(n, bVar, p, o0Var, o0Var2);
    }

    @Override // defpackage.bt2
    public final d0 v(b bVar) {
        d0 d0Var;
        d0 d0Var2 = d0.d;
        do {
            d0Var = bVar.b;
            if (d0Var2 == d0Var) {
                break;
            }
        } while (!m(bVar, d0Var, d0Var2));
        return d0Var;
    }

    @Override // defpackage.bt2
    public final o0 w(b bVar) {
        o0 o0Var;
        o0 o0Var2 = o0.c;
        do {
            o0Var = bVar.c;
            if (o0Var2 == o0Var) {
                break;
            }
        } while (!o(bVar, o0Var, o0Var2));
        return o0Var;
    }
}
