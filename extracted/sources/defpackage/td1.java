package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class td1 implements j50, fq8 {
    public static final ImmutableList p = ImmutableList.r(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList q = ImmutableList.r(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ImmutableList r = ImmutableList.r(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ImmutableList s = ImmutableList.r(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ImmutableList t = ImmutableList.r(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ImmutableList u = ImmutableList.r(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static td1 v;
    public final Context a;
    public final ImmutableMap b;
    public final i50 c;
    public final td8 d;
    public final boolean e;
    public final az7 f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public String o;

    public td1(Context context, HashMap map) {
        boolean z;
        td8 td8Var = td8.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = ImmutableMap.b(map);
        i50 i50Var = new i50();
        i50Var.a = new CopyOnWriteArrayList();
        this.c = i50Var;
        this.f = new az7();
        this.d = td8Var;
        this.e = true;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        fn5 fn5VarA = fn5.a(context);
        int iB = fn5VarA.b();
        this.n = iB;
        this.l = a(iB);
        sd1 sd1Var = new sd1(this);
        Executor executorS = y40.s();
        CopyOnWriteArrayList<en5> copyOnWriteArrayList = (CopyOnWriteArrayList) fn5VarA.d;
        for (en5 en5Var : copyOnWriteArrayList) {
            if (en5Var.a.get() == null) {
                copyOnWriteArrayList.remove(en5Var);
            }
        }
        en5 en5Var2 = new en5(fn5VarA, sd1Var, executorS);
        synchronized (fn5VarA.e) {
            ((CopyOnWriteArrayList) fn5VarA.d).add(en5Var2);
            z = fn5VarA.b;
        }
        if (z) {
            en5Var2.b.execute(new u03(12, en5Var2));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1149:0x1225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(int r18) {
        /*
            Method dump skipped, instruction units count: 8770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td1.a(int):long");
    }

    public final void b(long j, int i, long j2) {
        long j3;
        int i2;
        long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        for (h50 h50Var : this.c.a) {
            if (h50Var.c) {
                j3 = j;
                i2 = i;
                j4 = j2;
            } else {
                j3 = j;
                i2 = i;
                j4 = j2;
                h50Var.a.post(new m00(h50Var, i2, j3, j4, 1));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }
}
