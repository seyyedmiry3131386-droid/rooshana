package defpackage;

import android.content.Context;
import android.content.Intent;
import ir.mservices.market.version2.manager.serversync.JustKeepAppAliveService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ep7 {
    public final String a;
    public final String b;
    public final String c;
    public lu7 d;
    public nu7 e;
    public vl8 f;
    public final Context g;
    public Integer h;
    public Long i;
    public Long j;
    public boolean k;

    public ep7(Context context) {
        String name = getClass().getName();
        this.k = false;
        this.g = context;
        this.a = lu7.a(name.concat("_PRIOR_FAIL_COUNTS"));
        this.b = lu7.a(name.concat("_LAST_SUCCESSFUL_SYNC_TIME"));
        this.c = lu7.a(name.concat("_LAST_RUN_TIME"));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r5) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep7.a(boolean):void");
    }

    public final long b() {
        if (this.j == null) {
            this.j = Long.valueOf(this.d.d(this.c));
        }
        return this.j.longValue();
    }

    public void c() {
        e(0L);
        d(0L);
        f(0);
        nu7 nu7Var = this.e;
        nu7Var.a(0L);
        nu7Var.b.getClass();
        lw.b(null, null, vl8.c(0L));
        nu7Var.a.h(0L, lu7.L);
        nu7Var.d = 0L;
    }

    public final void d(long j) {
        lw.f(null, null, j >= 0);
        this.f.getClass();
        lw.b(null, null, vl8.c(j));
        this.d.h(j, this.c);
        this.j = Long.valueOf(j);
    }

    public final void e(long j) {
        lw.f(null, null, j >= 0);
        this.f.getClass();
        lw.b(null, null, vl8.c(j));
        this.i = Long.valueOf(j);
        this.d.h(j, this.b);
    }

    public final void f(int i) {
        lw.f(null, null, i >= 0);
        this.h = Integer.valueOf(i);
        this.d.g(i, this.a);
    }

    public abstract boolean g();

    public abstract void h();

    public final void i(boolean z) {
        lw.f(null, null, this.k);
        long jCurrentTimeMillis = System.currentTimeMillis();
        d(jCurrentTimeMillis);
        if (z) {
            e(jCurrentTimeMillis);
            f(0);
        } else {
            if (this.h == null) {
                this.h = Integer.valueOf(this.d.c(0, this.a));
            }
            f(this.h.intValue() + 1);
        }
        lw.f(null, null, this.k);
        this.k = false;
        Context context = this.g;
        try {
            int i = JustKeepAppAliveService.a - 1;
            JustKeepAppAliveService.a = i;
            if (i == 0) {
                context.stopService(new Intent(context, (Class<?>) JustKeepAppAliveService.class));
                JustKeepAppAliveService.b.D();
            }
        } catch (Exception unused) {
        }
    }
}
