package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x82 extends ac7 {
    public final HashMap e = new HashMap();

    @Override // defpackage.ac7
    public final xb7 a(Object obj) {
        return (xb7) this.e.get(obj);
    }

    @Override // defpackage.ac7
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.e.remove(obj);
        return objC;
    }
}
