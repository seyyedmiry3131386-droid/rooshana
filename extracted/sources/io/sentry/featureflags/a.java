package io.sentry.featureflags;

import defpackage.bl4;
import io.sentry.protocol.i;
import io.sentry.r;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {
    public volatile CopyOnWriteArrayList a;
    public final AutoClosableReentrantLock b;

    public a(int i) {
        this.b = new AutoClosableReentrantLock();
        this.a = new CopyOnWriteArrayList();
    }

    @Override // io.sentry.featureflags.b
    public final void clear() {
        r rVarA = this.b.a();
        try {
            this.a.clear();
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

    @Override // io.sentry.featureflags.b
    public final b clone() {
        return new a(this);
    }

    @Override // io.sentry.featureflags.b
    public final i i() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        return new i(arrayList);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m31clone() {
        return new a(this);
    }

    public a(int i, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.b = new AutoClosableReentrantLock();
        this.a = copyOnWriteArrayList;
    }

    public a(a aVar) {
        this.b = new AutoClosableReentrantLock();
        this.a = new CopyOnWriteArrayList(aVar.a);
    }
}
