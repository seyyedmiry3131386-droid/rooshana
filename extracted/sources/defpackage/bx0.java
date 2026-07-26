package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class bx0 extends dx0 {
    public static dx0 g(int i) {
        return i < 0 ? dx0.b : i > 0 ? dx0.c : dx0.a;
    }

    @Override // defpackage.dx0
    public final dx0 a(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.dx0
    public final dx0 b(Comparable comparable, Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }

    @Override // defpackage.dx0
    public final dx0 c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.dx0
    public final dx0 d(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.dx0
    public final dx0 e(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }

    @Override // defpackage.dx0
    public final int f() {
        return 0;
    }
}
