package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.o31;
import defpackage.u72;
import defpackage.xf9;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class MulticastConsumer implements o31 {
    public final Context a;
    public xf9 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.a = context;
    }

    public final void a(o31 o31Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            xf9 xf9Var = this.c;
            if (xf9Var != null) {
                o31Var.accept(xf9Var);
            }
            this.d.add(o31Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.o31
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        js3.p(windowLayoutInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            xf9 xf9VarC = u72.c(this.a, windowLayoutInfo);
            this.c = xf9VarC;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((o31) it.next()).accept(xf9VarC);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
