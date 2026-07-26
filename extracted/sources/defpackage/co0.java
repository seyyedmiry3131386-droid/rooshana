package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class co0 extends ya8 implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        co0 co0Var = (co0) obj;
        if (d(4) != co0Var.d(4)) {
            return d(4) ? 1 : -1;
        }
        long j = this.g - co0Var.g;
        if (j == 0) {
            j = this.k - co0Var.k;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
