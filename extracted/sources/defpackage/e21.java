package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.sync.a;

/* JADX INFO: loaded from: classes.dex */
public final class e21 implements mb7, dc5 {
    public final mb7 a;
    public final dc5 b;
    public w61 c;
    public Throwable d;
    public final d21 e;

    public e21(mb7 mb7Var) {
        a aVar = new a();
        js3.p(mb7Var, "delegate");
        this.a = mb7Var;
        this.b = aVar;
        this.e = new d21(this);
    }

    @Override // defpackage.dc5
    public final Object b(g51 g51Var) {
        return this.b.b(g51Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        d21 d21Var = this.e;
        if (d21Var != null) {
            d21Var.evictAll();
        }
        this.a.close();
    }

    @Override // defpackage.dc5
    public final void d(Object obj) {
        this.b.d(null);
    }

    public final void g(StringBuilder sb) {
        List listB;
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            w61 w61Var = this.c;
            if (w61Var != null) {
                sb.append("\t\tCoroutine: " + w61Var);
                sb.append('\n');
            }
            Throwable th = this.d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                m74 m74Var = new m74(wu8.I(th));
                if (m74Var.hasNext()) {
                    Object next = m74Var.next();
                    if (m74Var.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (m74Var.hasNext()) {
                            arrayList.add(m74Var.next());
                        }
                        listB = arrayList;
                    } else {
                        listB = br9.B(next);
                    }
                } else {
                    listB = EmptyList.a;
                }
                Iterator it = kotlin.collections.a.j0(listB).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        d21 d21Var = this.e;
        if (d21Var != null) {
            sb.append("\t\tPrepared Statement Cache Size: " + d21Var.size());
            sb.append('\n');
        }
    }

    @Override // defpackage.mb7
    public final rb7 m1(String str) {
        js3.p(str, "sql");
        d21 d21Var = this.e;
        if (d21Var == null) {
            return this.a.m1(str);
        }
        Object obj = d21Var.get(str);
        js3.m(obj);
        return new c21((rb7) obj);
    }

    @Override // defpackage.mb7
    public final boolean n() {
        return this.a.n();
    }

    public final String toString() {
        return this.a.toString();
    }
}
