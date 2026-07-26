package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class zj2 extends hs9 implements Map.Entry {
    public abstract Map.Entry Y();

    public boolean equals(Object obj) {
        return Y().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Y().getKey();
    }

    public Object getValue() {
        return Y().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Y().hashCode();
    }

    public Object setValue(Object obj) {
        return Y().setValue(obj);
    }
}
