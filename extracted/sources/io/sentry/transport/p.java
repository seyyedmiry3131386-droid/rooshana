package io.sentry.transport;

import io.sentry.DataCategory;
import io.sentry.b6;
import io.sentry.util.AutoClosableReentrantLock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Closeable {
    public final b6 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public Timer e = null;
    public final AutoClosableReentrantLock f = new AutoClosableReentrantLock();
    public final d a = d.a;

    public p(b6 b6Var) {
        this.b = b6Var;
    }

    public final void b(DataCategory dataCategory, Date date) {
        ConcurrentHashMap concurrentHashMap = this.c;
        Date date2 = (Date) concurrentHashMap.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(dataCategory, date);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((o) it.next()).I(this);
            }
            io.sentry.r rVarA = this.f.a();
            try {
                if (this.e == null) {
                    this.e = new Timer(true);
                }
                this.e.schedule(new io.sentry.n(2, this), date);
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
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.f.a();
        try {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
            rVarA.close();
            this.d.clear();
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean d(DataCategory dataCategory) {
        Date date;
        this.a.getClass();
        Date date2 = new Date(System.currentTimeMillis());
        DataCategory dataCategory2 = DataCategory.All;
        ConcurrentHashMap concurrentHashMap = this.c;
        Date date3 = (Date) concurrentHashMap.get(dataCategory2);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (DataCategory.Unknown.equals(dataCategory) || (date = (Date) concurrentHashMap.get(dataCategory)) == null) {
            return false;
        }
        return !date2.after(date);
    }
}
