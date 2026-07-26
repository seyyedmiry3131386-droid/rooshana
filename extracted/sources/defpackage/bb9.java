package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bb9 {
    public static final boolean c = cb9.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(long j, String str) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new ab9(j, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b() {
        long j;
        this.b = true;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((ab9) arrayList.get(arrayList.size() - 1)).a - ((ab9) arrayList.get(0)).a;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((ab9) this.a.get(0)).a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            long j3 = ((ab9) it.next()).a;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b();
    }
}
