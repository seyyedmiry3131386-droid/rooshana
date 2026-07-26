package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ga5 extends js3 {
    public final /* synthetic */ Comparator i;

    public ga5(Comparator comparator) {
        this.i = comparator;
    }

    @Override // defpackage.js3
    public final Map w() {
        return new TreeMap(this.i);
    }
}
