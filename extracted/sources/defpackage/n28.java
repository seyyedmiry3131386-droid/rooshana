package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n28 extends mq3 {
    public int a;
    public final /* synthetic */ m28 b;

    public n28(m28 m28Var) {
        this.b = m28Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.f();
    }

    @Override // defpackage.mq3
    public final int nextInt() {
        int i = this.a;
        this.a = i + 1;
        return this.b.d(i);
    }
}
