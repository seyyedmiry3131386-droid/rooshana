package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ak2 extends hs9 implements fa5 {
    public ak2() {
        super(16);
    }

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract fa5 A();

    @Override // defpackage.fa5
    public final boolean containsKey(Object obj) {
        return A().containsKey(obj);
    }

    @Override // defpackage.fa5
    public final boolean equals(Object obj) {
        return obj == this || A().equals(obj);
    }

    @Override // defpackage.fa5
    public final int hashCode() {
        return A().hashCode();
    }

    @Override // defpackage.fa5
    public final boolean i(Object obj, Object obj2) {
        return A().i(obj, obj2);
    }

    @Override // defpackage.fa5
    public final boolean isEmpty() {
        return A().isEmpty();
    }

    @Override // defpackage.fa5
    public final int size() {
        return A().size();
    }
}
