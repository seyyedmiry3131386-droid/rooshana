package io.sentry;

import defpackage.rm7;
import io.sentry.util.AutoClosableReentrantLock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class i6 implements g2 {
    public final Date a;
    public Date b;
    public final AtomicInteger c;
    public final String d;
    public final String e;
    public Boolean f;
    public Session$State g;
    public Long h;
    public Double i;
    public final String j;
    public String k;
    public final String l;
    public final String m;
    public String n;
    public final AutoClosableReentrantLock o = new AutoClosableReentrantLock();
    public ConcurrentHashMap p;

    public i6(Session$State session$State, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
        this.g = session$State;
        this.a = date;
        this.b = date2;
        this.c = new AtomicInteger(i);
        this.d = str;
        this.e = str2;
        this.f = bool;
        this.h = l;
        this.i = d;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = str7;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i6 clone() {
        return new i6(this.g, this.a, this.b, this.c.get(), this.d, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public final void b(Date date) {
        r rVarA = this.o.a();
        try {
            this.f = null;
            if (this.g == Session$State.Ok) {
                this.g = Session$State.Exited;
            }
            if (date != null) {
                this.b = date;
            } else {
                this.b = io.sentry.config.a.z();
            }
            if (this.b != null) {
                this.i = Double.valueOf(Math.abs(r6.getTime() - this.a.getTime()) / 1000.0d);
                long time = this.b.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.h = Long.valueOf(time);
            }
            rVarA.close();
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Date c() {
        Date date = this.a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public final boolean d(Session$State session$State, String str, boolean z, String str2) {
        boolean z2;
        r rVarA = this.o.a();
        boolean z3 = true;
        if (session$State != null) {
            try {
                this.g = session$State;
                z2 = true;
            } catch (Throwable th) {
                try {
                    rVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            z2 = false;
        }
        if (str != null) {
            this.k = str;
            z2 = true;
        }
        if (z) {
            this.c.addAndGet(1);
            z2 = true;
        }
        if (str2 != null) {
            this.n = str2;
        } else {
            z3 = z2;
        }
        if (z3) {
            this.f = null;
            Date dateZ = io.sentry.config.a.z();
            this.b = dateZ;
            if (dateZ != null) {
                long time = dateZ.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.h = Long.valueOf(time);
            }
        }
        rVarA.close();
        return z3;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        String str = this.e;
        if (str != null) {
            cVar.q("sid");
            cVar.z(str);
        }
        String str2 = this.d;
        if (str2 != null) {
            cVar.q("did");
            cVar.z(str2);
        }
        if (this.f != null) {
            cVar.q("init");
            cVar.x(this.f);
        }
        cVar.q("started");
        cVar.w(u0Var, this.a);
        cVar.q("status");
        cVar.w(u0Var, this.g.name().toLowerCase(Locale.ROOT));
        if (this.h != null) {
            cVar.q("seq");
            cVar.y(this.h);
        }
        cVar.q("errors");
        cVar.v(this.c.intValue());
        if (this.i != null) {
            cVar.q("duration");
            cVar.y(this.i);
        }
        if (this.b != null) {
            cVar.q("timestamp");
            cVar.w(u0Var, this.b);
        }
        if (this.n != null) {
            cVar.q("abnormal_mechanism");
            cVar.w(u0Var, this.n);
        }
        cVar.q("attrs");
        cVar.d();
        cVar.q("release");
        cVar.w(u0Var, this.m);
        String str3 = this.l;
        if (str3 != null) {
            cVar.q("environment");
            cVar.w(u0Var, str3);
        }
        String str4 = this.j;
        if (str4 != null) {
            cVar.q("ip_address");
            cVar.w(u0Var, str4);
        }
        if (this.k != null) {
            cVar.q("user_agent");
            cVar.w(u0Var, this.k);
        }
        cVar.n();
        ConcurrentHashMap concurrentHashMap = this.p;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.p, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
