package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import defpackage.at2;
import defpackage.f87;
import defpackage.mi;
import defpackage.n80;
import defpackage.q46;
import defpackage.rq4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends f87> extends at2 {
    public static final mi M = new mi(14);
    public f87 H;
    public Status I;
    public volatile boolean J;
    public boolean K;
    public final Object D = new Object();
    public final CountDownLatch E = new CountDownLatch(1);
    public final ArrayList F = new ArrayList();
    public final AtomicReference G = new AtomicReference();
    public boolean L = false;

    public BasePendingResult(GoogleApiClient googleApiClient) {
        new n80(googleApiClient != null ? googleApiClient.b() : Looper.getMainLooper(), 3);
        new WeakReference(googleApiClient);
    }

    public final void o0(q46 q46Var) {
        synchronized (this.D) {
            try {
                if (r0()) {
                    q46Var.a(this.I);
                } else {
                    this.F.add(q46Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract f87 p0(Status status);

    public final void q0(Status status) {
        synchronized (this.D) {
            try {
                if (!r0()) {
                    s0(p0(status));
                    this.K = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r0() {
        return this.E.getCount() == 0;
    }

    public final void s0(f87 f87Var) {
        synchronized (this.D) {
            try {
                if (this.K) {
                    return;
                }
                r0();
                rq4.q("Results have already been set", !r0());
                rq4.q("Result has already been consumed", !this.J);
                this.H = f87Var;
                this.I = f87Var.d();
                this.E.countDown();
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((q46) arrayList.get(i)).a(this.I);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
