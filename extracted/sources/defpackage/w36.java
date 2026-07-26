package defpackage;

import android.os.Trace;
import androidx.collection.e;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.runtime.l;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class w36 {
    public final j01 a;
    public final d01 b;
    public final qz0 c;
    public final qp2 d;
    public final boolean e;
    public final sk6 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(PausedCompositionState.c);
    public long i = o37.c();
    public e j;
    public final l37 k;
    public final l l;

    public w36(j01 j01Var, d01 d01Var, qz0 qz0Var, tb5 tb5Var, qp2 qp2Var, boolean z, sk6 sk6Var, Object obj) {
        this.a = j01Var;
        this.b = d01Var;
        this.c = qz0Var;
        this.d = qp2Var;
        this.e = z;
        this.f = sk6Var;
        this.g = obj;
        sb5 sb5Var = de7.a;
        js3.n(sb5Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.j = sb5Var;
        l37 l37Var = new l37();
        l37Var.h(tb5Var, qz0Var.A());
        this.k = l37Var;
        this.l = new l(sk6Var.d);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((PausedCompositionState) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.f;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.g;
                    while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                        if (atomicReference.get() != pausedCompositionState) {
                            wi6.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.a);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                } finally {
                    this.k.c();
                    this.a.q = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((PausedCompositionState) this.h.get()).compareTo(PausedCompositionState.f) >= 0;
    }

    public final void d() {
        boolean z;
        PausedCompositionState pausedCompositionState = PausedCompositionState.d;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.f;
        while (true) {
            AtomicReference atomicReference = this.h;
            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                z = true;
                break;
            } else if (atomicReference.get() != pausedCompositionState) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        wi6.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    public final boolean e(lv7 lv7Var) throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((PausedCompositionState) atomicReference.get()).ordinal();
            j01 j01Var = this.a;
            d01 d01Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    qz0 qz0Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        qz0Var.z = 100;
                        qz0Var.y = true;
                    }
                    try {
                        this.j = d01Var.b(j01Var, lv7Var, this.d);
                        PausedCompositionState pausedCompositionState = PausedCompositionState.c;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.d;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                                if (atomicReference.get() != pausedCompositionState) {
                                    wi6.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                                }
                            }
                        }
                        if (this.j.b()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z) {
                            qz0Var.t();
                        }
                    }
                case 3:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.d;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.e;
                    while (true) {
                        if (!atomicReference.compareAndSet(pausedCompositionState3, pausedCompositionState4)) {
                            if (atomicReference.get() != pausedCompositionState3) {
                                wi6.b("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + '.');
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = o37.c();
                        this.j = d01Var.q(j01Var, lv7Var, this.j);
                        this.i = j;
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.e;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.d;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState5, pausedCompositionState6)) {
                                if (atomicReference.get() != pausedCompositionState5) {
                                    wi6.b("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + '.');
                                }
                            }
                        }
                        if (this.j.b()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.e;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.d;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState7, pausedCompositionState8)) {
                                if (atomicReference.get() != pausedCompositionState7) {
                                    wi6.b("Unexpected state change from: " + pausedCompositionState7 + " to: " + pausedCompositionState8 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    sz0.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.a);
            throw e;
        }
    }
}
