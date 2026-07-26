package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class fk2 extends uj2 implements Set {
    public fk2() {
        super(16);
    }

    @Override // defpackage.uj2
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Set Y();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || Y().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return Y().hashCode();
    }
}
