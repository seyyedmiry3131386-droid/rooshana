package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tq2 implements bp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tq2(pj3 pj3Var, int i, ye6 ye6Var, qp2 qp2Var) {
        this.c = pj3Var;
        this.b = i;
        this.d = ye6Var;
        this.e = qp2Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        Object next;
        switch (this.a) {
            case 0:
                return new sq2(this.c, (String) this.d, this.b, (xb5) this.e);
            default:
                pj3 pj3Var = (pj3) this.c;
                ye6 ye6Var = (ye6) this.d;
                qp2 qp2Var = (qp2) this.e;
                Iterator<E> it = pj3Var.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((tu6) next).b == this.b) {
                        }
                    } else {
                        next = null;
                    }
                }
                tu6 tu6Var = (tu6) next;
                if (tu6Var != null) {
                    ye6Var.a.b(true);
                    qp2Var.invoke(Integer.valueOf(tu6Var.b), tu6Var.c);
                }
                return tx8.a;
        }
    }

    public /* synthetic */ tq2(List list, String str, int i, l lVar) {
        this.c = list;
        this.d = str;
        this.b = i;
        this.e = lVar;
    }
}
