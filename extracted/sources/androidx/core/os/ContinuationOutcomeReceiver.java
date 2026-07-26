package androidx.core.os;

import android.os.OutcomeReceiver;
import defpackage.om0;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;

/* JADX INFO: loaded from: classes.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    public final om0 a;

    public ContinuationOutcomeReceiver(om0 om0Var) {
        super(false);
        this.a = om0Var;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(b.a(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
