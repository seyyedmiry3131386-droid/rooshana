package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class bn9 extends zl9 implements gn9 {
    public final AtomicReference n;
    public boolean o;

    public bn9() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.n = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m0(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = defpackage.dw1.o(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            io.sentry.android.core.t0.n(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn9.m0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // defpackage.gn9
    public final void I(Bundle bundle) {
        AtomicReference atomicReference = this.n;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.o = true;
                } finally {
                    this.n.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle L(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.n;
        synchronized (atomicReference) {
            if (!this.o) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.n.get();
        }
        return bundle;
    }

    @Override // defpackage.zl9
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) am9.a(parcel, Bundle.CREATOR);
        am9.d(parcel);
        I(bundle);
        parcel2.writeNoException();
        return true;
    }
}
