package defpackage;

import com.google.common.collect.MutableClassToInstanceMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sa5 extends fk2 {
    public final /* synthetic */ MutableClassToInstanceMap s;

    public sa5(MutableClassToInstanceMap mutableClassToInstanceMap) {
        super(16);
        this.s = mutableClassToInstanceMap;
    }

    @Override // defpackage.fk2
    /* JADX INFO: renamed from: Z */
    public final Set A() {
        throw null;
    }

    @Override // defpackage.uj2, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gi4(A().iterator(), 3);
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return tv8.D(this, objArr);
    }
}
