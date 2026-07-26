package org.koin.android.scope;

import android.app.Service;
import defpackage.c24;
import defpackage.lf7;
import defpackage.o06;
import defpackage.rh;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScopeService extends Service implements rh {
    public final c24 a = a.a(new o06(28, this));

    @Override // defpackage.rh
    public final lf7 b() {
        return (lf7) this.a.getValue();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (b() == null) {
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        b().a();
    }
}
