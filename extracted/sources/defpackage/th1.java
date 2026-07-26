package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class th1 implements Comparable {
    public final boolean a;
    public final boolean b;

    public th1(b bVar, int i) {
        this.a = (bVar.e & 1) != 0;
        this.b = bl4.l(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        th1 th1Var = (th1) obj;
        return dx0.a.d(this.b, th1Var.b).d(this.a, th1Var.a).f();
    }
}
