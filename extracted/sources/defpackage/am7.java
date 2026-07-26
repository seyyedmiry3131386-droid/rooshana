package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class am7 {
    public static final vl7 a = new vl7(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(vl7 vl7Var) {
        js3.p(vl7Var, "segment");
        if (vl7Var.f != null || vl7Var.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (vl7Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        vl7 vl7Var2 = a;
        vl7 vl7Var3 = (vl7) atomicReference.getAndSet(vl7Var2);
        if (vl7Var3 == vl7Var2) {
            return;
        }
        int i = vl7Var3 != null ? vl7Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(vl7Var3);
            return;
        }
        vl7Var.f = vl7Var3;
        vl7Var.b = 0;
        vl7Var.c = i + 8192;
        atomicReference.set(vl7Var);
    }

    public static final vl7 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        vl7 vl7Var = a;
        vl7 vl7Var2 = (vl7) atomicReference.getAndSet(vl7Var);
        if (vl7Var2 == vl7Var) {
            return new vl7();
        }
        if (vl7Var2 == null) {
            atomicReference.set(null);
            return new vl7();
        }
        atomicReference.set(vl7Var2.f);
        vl7Var2.f = null;
        vl7Var2.c = 0;
        return vl7Var2;
    }
}
