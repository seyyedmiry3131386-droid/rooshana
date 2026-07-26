package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ig2 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wb5 c;

    public /* synthetic */ ig2(ArrayList arrayList, wb5 wb5Var, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = wb5Var;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                gr3 gr3Var = (gr3) obj;
                boolean z = gr3Var instanceof gg2;
                ArrayList arrayList = this.b;
                if (z) {
                    arrayList.add(gr3Var);
                } else if (gr3Var instanceof hg2) {
                    arrayList.remove(((hg2) gr3Var).a);
                }
                this.c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                gr3 gr3Var2 = (gr3) obj;
                boolean z2 = gr3Var2 instanceof rj6;
                ArrayList arrayList2 = this.b;
                if (z2) {
                    arrayList2.add(gr3Var2);
                } else if (gr3Var2 instanceof sj6) {
                    arrayList2.remove(((sj6) gr3Var2).a);
                } else if (gr3Var2 instanceof qj6) {
                    arrayList2.remove(((qj6) gr3Var2).a);
                }
                this.c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return tx8.a;
    }
}
