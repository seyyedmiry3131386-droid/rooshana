package androidx.core.util;

import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
final class ContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (compareAndSet(false, true)) {
            throw null;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
