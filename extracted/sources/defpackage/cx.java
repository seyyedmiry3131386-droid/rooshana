package defpackage;

import androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1;
import androidx.paging.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class cx {
    public final r79 a;
    public final w61 b;
    public int d;
    public final a f;
    public final AtomicInteger g;
    public final xe2 h;
    public final pv6 i;
    public final AtomicReference j;
    public final CopyOnWriteArrayList k;
    public final n l;
    public final c24 m;
    public final g6 n;
    public final l c = ja1.b(Boolean.FALSE);
    public final AtomicReference e = new AtomicReference(null);

    public cx(r79 r79Var, w61 w61Var, w61 w61Var2) {
        this.a = r79Var;
        this.b = w61Var2;
        a aVar = new a(this, w61Var);
        this.f = aVar;
        this.g = new AtomicInteger(0);
        vb7 vb7Var = new vb7(new AsyncPagingDataDiffer$special$$inlined$transform$1(d.d(new o4(aVar.k, 9), -1), null, this));
        ug1 ug1Var = up1.a;
        this.h = d.t(vb7Var, sg4.a);
        this.i = new pv6(aVar.l);
        this.j = new AtomicReference(null);
        this.k = new CopyOnWriteArrayList();
        this.l = new n(12, this);
        this.m = kotlin.a.a(new v7(14));
        this.n = new g6(this);
    }
}
