package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bk2 extends uj2 implements oa5 {
    public bk2() {
        super(16);
    }

    @Override // defpackage.oa5
    public boolean K(int i, Object obj) {
        return Y().K(i, obj);
    }

    @Override // defpackage.uj2
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public abstract oa5 Y();

    @Override // defpackage.oa5
    public int add(int i, Object obj) {
        return Y().add(i, obj);
    }

    @Override // java.util.Collection, defpackage.oa5
    public final boolean equals(Object obj) {
        return obj == this || Y().equals(obj);
    }

    @Override // java.util.Collection, defpackage.oa5
    public final int hashCode() {
        return Y().hashCode();
    }

    @Override // defpackage.oa5
    public int j1(Object obj) {
        return Y().j1(obj);
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        return Y().s0(obj);
    }

    @Override // defpackage.oa5
    public int w0(int i, Object obj) {
        return Y().w0(i, obj);
    }
}
