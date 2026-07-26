package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.transition.TransitionSet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l38 {
    public static final cy1 p = new cy1(1);
    public static final cy1 q = new cy1(2);
    public static final cy1 r = new cy1(3);
    public static final cy1 s = new cy1(4);
    public static final cy1 t = new cy1(5);
    public static final cy1 u = new cy1(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final is3 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public m38 m;
    public float n;
    public boolean o;

    public l38(bv bvVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new dy1(bvVar);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static ok b() {
        ThreadLocal threadLocal = ok.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new ok(new do3(5)));
        }
        return (ok) threadLocal.get();
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        if (this.m == null) {
            this.m = new m38(f);
        }
        m38 m38Var = this.m;
        double d = f;
        m38Var.i = d;
        double d2 = (float) d;
        if (d2 > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        m38Var.d = dAbs;
        m38Var.e = dAbs * 62.5d;
        do3 do3Var = b().e;
        do3Var.getClass();
        if (Thread.currentThread() != ((Looper) do3Var.b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.v(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b().a(this);
    }

    public final void c(float f) {
        ArrayList arrayList;
        this.e.L(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                cr8 cr8Var = (cr8) arrayList.get(i);
                float f2 = this.b;
                TransitionSet transitionSet = cr8Var.h;
                long jMax = Math.max(-1L, Math.min(transitionSet.A + 1, Math.round(f2)));
                transitionSet.G(jMax, cr8Var.a);
                cr8Var.a = jMax;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.m.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        do3 do3Var = b().e;
        do3Var.getClass();
        if (Thread.currentThread() != ((Looper) do3Var.b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.o = true;
        }
    }

    public l38(Object obj, is3 is3Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = is3Var;
        if (is3Var != r && is3Var != s && is3Var != t) {
            if (is3Var == u) {
                this.j = 0.00390625f;
            } else if (is3Var != p && is3Var != q) {
                this.j = 1.0f;
            } else {
                this.j = 0.002f;
            }
        } else {
            this.j = 0.1f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}
