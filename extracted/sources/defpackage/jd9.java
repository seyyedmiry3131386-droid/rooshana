package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jd9 implements Comparable {
    public final int a;
    public final fd9 b;

    public jd9(int i, fd9 fd9Var) {
        this.a = i;
        this.b = fd9Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((jd9) obj).a);
    }
}
