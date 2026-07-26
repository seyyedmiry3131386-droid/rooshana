package defpackage;

import androidx.compose.ui.node.h;
import ir.mservices.market.download.app.recycler.AppDownloadData;
import ir.mservices.market.pika.send.model.c;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rt1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rt1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iCompare = ((qt1) this.b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : bt2.t(Long.valueOf(((AppDownloadData) obj2).A), Long.valueOf(((AppDownloadData) obj).A));
            case 1:
                m22 m22Var = (m22) this.b;
                return bt2.t((Comparable) m22Var.invoke(obj), (Comparable) m22Var.invoke(obj2));
            case 2:
                c cVar = (c) this.b;
                return bt2.t(cVar.b.u(((rp3) obj).a), cVar.b.u(((rp3) obj2).a));
            case 3:
                hb5 hb5Var = (hb5) this.b;
                return bt2.t(Float.valueOf(hb5Var.c(((Map.Entry) obj2).getKey())), Float.valueOf(hb5Var.c(((Map.Entry) obj).getKey())));
            case 4:
                int iCompare2 = ((Comparator) this.b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : h.V.compare(((androidx.compose.ui.semantics.c) obj).c, ((androidx.compose.ui.semantics.c) obj2).c);
            default:
                int iCompare3 = ((rt1) this.b).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : bt2.t(Integer.valueOf(((androidx.compose.ui.semantics.c) obj).g), Integer.valueOf(((androidx.compose.ui.semantics.c) obj2).g));
        }
    }

    public rt1(Comparator comparator) {
        this.a = 4;
        i14 i14Var = h.S;
        this.b = comparator;
    }
}
