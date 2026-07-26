package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class ub7 implements g51, f71 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ub7.class, Object.class, "result");
    public final g51 a;
    private volatile Object result;

    public ub7(g51 g51Var) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        this.a = g51Var;
        this.result = coroutineSingletons;
    }

    @Override // defpackage.f71
    public final f71 getCallerFrame() {
        g51 g51Var = this.a;
        if (g51Var instanceof f71) {
            return (f71) g51Var;
        }
        return null;
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.b;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.a;
            if (obj2 != coroutineSingletons2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
