package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ye8 implements e64 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.e64
    public final void b() {
        Iterator it = i29.e(this.a).iterator();
        while (it.hasNext()) {
            ((ve8) it.next()).b();
        }
    }

    @Override // defpackage.e64
    public final void e() {
        Iterator it = i29.e(this.a).iterator();
        while (it.hasNext()) {
            ((ve8) it.next()).e();
        }
    }

    @Override // defpackage.e64
    public final void k() {
        Iterator it = i29.e(this.a).iterator();
        while (it.hasNext()) {
            ((ve8) it.next()).k();
        }
    }
}
