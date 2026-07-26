package defpackage;

import androidx.compose.runtime.internal.AtomicInt;

/* JADX INFO: loaded from: classes.dex */
public abstract class f58 implements e58 {
    public final AtomicInt a = new AtomicInt(0);

    @Override // defpackage.e58
    public /* synthetic */ g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        return null;
    }

    public final boolean f(int i) {
        return (i & this.a.get()) != 0;
    }

    public final void g(int i) {
        AtomicInt atomicInt;
        int i2;
        do {
            atomicInt = this.a;
            i2 = atomicInt.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(i2, i2 | i));
    }
}
