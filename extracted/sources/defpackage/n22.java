package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n22 extends k79 {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.k79
    public final void d() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            ((u79) ((Map.Entry) it.next()).getValue()).a();
        }
    }
}
