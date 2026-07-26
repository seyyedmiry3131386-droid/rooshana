package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class a79 extends ok4 {
    public static final boolean s = true;
    public final fp7 j;
    public boolean k;
    public final View l;
    public boolean m;
    public final Choreographer n;
    public final z69 o;
    public final Handler p;
    public a79 q;
    public static final int r = Build.VERSION.SDK_INT;
    public static final ReferenceQueue t = new ReferenceQueue();
    public static final y69 u = new y69(0);

    public a79(int i, View view, Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        this.j = new fp7(8, this);
        this.k = false;
        pc9[] pc9VarArr = new pc9[i];
        this.l = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (s) {
            this.n = Choreographer.getInstance();
            this.o = new z69(this);
        } else {
            this.o = null;
            this.p = new Handler(Looper.myLooper());
        }
    }

    public static a79 f0(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, Object obj) {
        if (obj == null) {
            return fa1.c(layoutInflater, i, viewGroup, z);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h0(android.view.View r22, java.lang.Object[] r23, defpackage.sk6 r24, android.util.SparseIntArray r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a79.h0(android.view.View, java.lang.Object[], sk6, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] i0(View view, int i, sk6 sk6Var, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        h0(view, objArr, sk6Var, sparseIntArray, true);
        return objArr;
    }

    public static Object[] j0(View[] viewArr, int i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View view : viewArr) {
            h0(view, objArr, null, sparseIntArray, true);
        }
        return objArr;
    }

    public abstract void b0();

    public final void c0() {
        if (this.m) {
            k0();
        } else if (e0()) {
            this.m = true;
            b0();
            this.m = false;
        }
    }

    public final void d0() {
        a79 a79Var = this.q;
        if (a79Var == null) {
            c0();
        } else {
            a79Var.d0();
        }
    }

    public abstract boolean e0();

    public abstract void g0();

    public final void k0() {
        a79 a79Var = this.q;
        if (a79Var != null) {
            a79Var.k0();
            return;
        }
        synchronized (this) {
            try {
                if (this.k) {
                    return;
                }
                this.k = true;
                if (s) {
                    this.n.postFrameCallback(this.o);
                } else {
                    this.p.post(this.j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l0(View view) {
        view.setTag(as6.dataBinding, this);
    }

    public final void m0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(as6.dataBinding, this);
        }
    }
}
