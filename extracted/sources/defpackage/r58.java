package defpackage;

import android.content.res.AssetFileDescriptor;
import io.sentry.k0;
import java.net.InetAddress;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r58 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r58(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return (AssetFileDescriptor) this.b;
            default:
                k0 k0Var = (k0) this.b;
                try {
                    k0Var.e.getClass();
                    k0Var.b = InetAddress.getLocalHost().getCanonicalHostName();
                    k0Var.c = System.currentTimeMillis() + k0Var.a;
                    k0Var.d.set(false);
                    return null;
                } catch (Throwable th) {
                    k0Var.d.set(false);
                    throw th;
                }
        }
    }
}
