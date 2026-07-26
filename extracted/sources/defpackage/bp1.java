package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bp1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                synchronized (((np1) this.b)) {
                    try {
                        np1 np1Var = (np1) this.b;
                        if (np1Var.i == null) {
                            return null;
                        }
                        np1Var.k0();
                        if (((np1) this.b).D()) {
                            ((np1) this.b).R();
                            ((np1) this.b).k = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            default:
                dx dxVar = (dx) this.b;
                dxVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    dxVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        dxVar.c.set(true);
                        throw th;
                    } finally {
                        dxVar.b(null);
                    }
                }
        }
    }
}
