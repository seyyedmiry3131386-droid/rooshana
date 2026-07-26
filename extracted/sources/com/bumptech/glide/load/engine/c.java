package com.bumptech.glide.load.engine;

import defpackage.e22;
import defpackage.vy2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final com.bumptech.glide.request.a b;
    public final /* synthetic */ d c;

    public /* synthetic */ c(d dVar, com.bumptech.glide.request.a aVar, int i) {
        this.a = i;
        this.c = dVar;
        this.b = aVar;
    }

    private final void a() {
        com.bumptech.glide.request.a aVar = this.b;
        aVar.a.a();
        synchronized (aVar.b) {
            synchronized (this.c) {
                try {
                    if (((ArrayList) this.c.a.b).contains(new e22(this.b, vy2.e))) {
                        d dVar = this.c;
                        try {
                            this.b.f(dVar.q, 5);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    this.c.d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                com.bumptech.glide.request.a aVar = this.b;
                aVar.a.a();
                synchronized (aVar.b) {
                    synchronized (this.c) {
                        try {
                            if (((ArrayList) this.c.a.b).contains(new e22(this.b, vy2.e))) {
                                this.c.s.b();
                                d dVar = this.c;
                                try {
                                    this.b.h(dVar.s, dVar.o, dVar.v);
                                    this.c.j(this.b);
                                } catch (Throwable th) {
                                    throw new CallbackException(th);
                                }
                            }
                            this.c.d();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
