package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rx7 implements i21 {
    public final /* synthetic */ wx7 a;

    public rx7(wx7 wx7Var) {
        this.a = wx7Var;
    }

    @Override // defpackage.i21
    public final void a(boolean z) {
        ArrayList arrayList;
        i29.a();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((i21) it.next()).a(z);
        }
    }
}
