package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jq2 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final yg2 f = new yg2(19);
    public long b;
    public long c;
    public final ArrayList a = new ArrayList();
    public final ArrayList d = new ArrayList();

    public static o c(RecyclerView recyclerView, int i, long j) {
        int iO = recyclerView.f.o();
        for (int i2 = 0; i2 < iO; i2++) {
            o oVarO = RecyclerView.O(recyclerView.f.n(i2));
            if (oVarO.c == i && !oVarO.g()) {
                return null;
            }
        }
        l lVar = recyclerView.c;
        if (j == Long.MAX_VALUE) {
            try {
                if (uo8.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.W(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.V();
        o oVarL = lVar.l(i, j);
        if (oVarL != null) {
            if (!oVarL.f() || oVarL.g()) {
                lVar.a(oVarL, false);
            } else {
                lVar.i(oVarL.a);
            }
        }
        recyclerView.W(false);
        Trace.endSection();
        return oVarL;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.s) {
            if (RecyclerView.Z0 && !this.a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        sr0 sr0Var = recyclerView.D0;
        sr0Var.a = i;
        sr0Var.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r18) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq2.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
