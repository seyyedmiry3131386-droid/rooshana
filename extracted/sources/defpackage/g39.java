package defpackage;

import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g39 implements dp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ g39(int i) {
        this.a = i;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                long j = ((zq3) obj).a;
                return new al((int) (j >> 32), (int) (j & 4294967295L));
            case 1:
                al alVar = (al) obj;
                int iRound = Math.round(alVar.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(alVar.b);
                return new zq3((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 2:
                sy6 sy6Var = (sy6) obj;
                return new cl(sy6Var.a, sy6Var.b, sy6Var.c, sy6Var.d);
            case 3:
                cl clVar = (cl) obj;
                return new sy6(clVar.a, clVar.b, clVar.c, clVar.d);
            case 4:
                return Float.valueOf(((zk) obj).a);
            case 5:
                return new n22();
            case 6:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bl4.G((MyketRecyclerData) it.next(), arrayList);
                }
                return arrayList;
            case 7:
                return ((rf9) obj).e;
            case 8:
                return ((rf9) obj).f;
            case 9:
                return ((rf9) obj).c;
            case 10:
                ag9 ag9Var = (ag9) obj;
                js3.p(ag9Var, "it");
                return ag9Var;
            default:
                js3.p((yg9) obj, "it");
                return Boolean.TRUE;
        }
    }
}
