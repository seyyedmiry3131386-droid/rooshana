package defpackage;

import androidx.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nn2 extends pr8 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ pn2 e;

    public nn2(pn2 pn2Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = pn2Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void b(Transition transition) {
        pn2 pn2Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            pn2Var.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            pn2Var.z(obj2, this.d, null);
        }
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void d(Transition transition) {
        transition.C(this);
    }
}
