package androidx.paging;

import android.os.Build;
import android.util.Log;
import defpackage.cw;
import defpackage.cx;
import defpackage.fx8;
import defpackage.h06;
import defpackage.hk3;
import defpackage.iz5;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pa2;
import defpackage.pz2;
import defpackage.rm7;
import defpackage.rv6;
import defpackage.vy2;
import defpackage.w61;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final w61 a;
    public pz2 b;
    public fx8 c = new h06();
    public iz5 d;
    public final pa2 e;
    public final cw f;
    public final m g;
    public volatile boolean h;
    public volatile int i;
    public final kotlinx.coroutines.flow.l j;
    public final rv6 k;
    public final kotlinx.coroutines.flow.i l;
    public final /* synthetic */ cx m;

    public a(cx cxVar, w61 w61Var) {
        this.m = cxVar;
        this.a = w61Var;
        iz5 iz5Var = iz5.e;
        js3.n(iz5Var, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        this.d = iz5Var;
        pa2 pa2Var = new pa2(22);
        this.e = pa2Var;
        cw cwVar = new cw(1);
        this.f = cwVar;
        this.g = new m(true);
        this.j = ja1.b(Boolean.FALSE);
        this.k = (rv6) pa2Var.d;
        this.l = vy2.d(0, 64, BufferOverflow.b);
        ((CopyOnWriteArrayList) cwVar.b).add(new hk3(29, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.paging.a r17, java.util.List r18, int r19, int r20, boolean r21, defpackage.na4 r22, defpackage.na4 r23, defpackage.pz2 r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a.a(androidx.paging.a, java.util.List, int, int, boolean, na4, na4, pz2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(int i) {
        Object value;
        Object value2;
        kotlinx.coroutines.flow.l lVar = this.j;
        do {
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.TRUE));
        this.h = true;
        this.i = i;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            js3.p("Accessing item index[" + i + ']', "message");
        }
        pz2 pz2Var = this.b;
        if (pz2Var != null) {
            pz2Var.d(this.d.a(i));
        }
        iz5 iz5Var = this.d;
        if (i < 0) {
            iz5Var.getClass();
        } else if (i < iz5Var.d()) {
            int i2 = i - iz5Var.c;
            Object objB = (i2 < 0 || i2 >= iz5Var.b) ? null : iz5Var.b(i2);
            kotlinx.coroutines.flow.l lVar2 = this.j;
            do {
                value2 = lVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!lVar2.n(value2, Boolean.FALSE));
            return objB;
        }
        StringBuilder sbR = rm7.r(i, "Index: ", ", Size: ");
        sbR.append(iz5Var.d());
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.hs9 r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a.c(hs9, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
