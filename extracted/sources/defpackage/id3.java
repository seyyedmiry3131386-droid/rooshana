package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class id3 implements vi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ id3(i1 i1Var, int i) {
        this.a = i;
        this.b = i1Var;
    }

    @Override // defpackage.vi4
    public final void a(vp7 vp7Var, co5 co5Var) {
        switch (this.a) {
            case 0:
                jd3.i((jd3) this.b, vp7Var, ((hd3) co5Var).f);
                return;
            case 1:
                jd3.i((jd3) this.b, vp7Var, ((fd3) co5Var).f);
                return;
            default:
                String str = ((nf8) co5Var).f;
                ((h28) vp7Var.d).a.append(str);
                ArrayList arrayList = ((r51) this.b).a;
                if (arrayList.isEmpty()) {
                    return;
                }
                vp7Var.h0();
                str.getClass();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    throw bl4.o(it);
                }
                return;
        }
    }
}
