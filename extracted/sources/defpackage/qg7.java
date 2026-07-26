package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qg7 implements hy5 {
    public final int a;
    public final List b;
    public Float c = null;
    public Float d = null;
    public gg7 e = null;
    public gg7 f = null;

    public qg7(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.hy5
    public final boolean p() {
        return this.b.contains(this);
    }
}
