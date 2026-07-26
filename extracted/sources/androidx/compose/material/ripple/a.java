package androidx.compose.material.ripple;

import androidx.compose.material3.c;
import defpackage.ad3;
import defpackage.ai0;
import defpackage.az1;
import defpackage.bt2;
import defpackage.dt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.gg2;
import defpackage.gr3;
import defpackage.hg2;
import defpackage.js3;
import defpackage.lt8;
import defpackage.rf0;
import defpackage.s97;
import defpackage.tj6;
import defpackage.tx8;
import defpackage.vu1;
import defpackage.wu1;
import defpackage.xu1;
import defpackage.zc3;
import defpackage.ze2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ze2 {
    public final /* synthetic */ RippleNode a;
    public final /* synthetic */ e71 b;

    public a(RippleNode rippleNode, e71 e71Var) {
        this.a = rippleNode;
        this.b = e71Var;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        gr3 gr3Var = (gr3) obj;
        boolean z = gr3Var instanceof tj6;
        RippleNode rippleNode = this.a;
        if (!z) {
            ai0 ai0Var = rippleNode.s;
            if (ai0Var == null) {
                boolean z2 = rippleNode.p;
                c cVar = rippleNode.r;
                ai0Var = new ai0();
                ai0Var.a = z2;
                ai0Var.b = cVar;
                ai0Var.c = dt2.a(0.0f);
                ai0Var.d = new ArrayList();
                rf0.z(rippleNode);
                rippleNode.s = ai0Var;
            }
            ArrayList arrayList = (ArrayList) ai0Var.d;
            if (gr3Var instanceof zc3) {
                arrayList.add(gr3Var);
            } else if (gr3Var instanceof ad3) {
                arrayList.remove(((ad3) gr3Var).a);
            } else if (gr3Var instanceof gg2) {
                arrayList.add(gr3Var);
            } else if (gr3Var instanceof hg2) {
                arrayList.remove(((hg2) gr3Var).a);
            } else if (gr3Var instanceof wu1) {
                arrayList.add(gr3Var);
            } else if (gr3Var instanceof xu1) {
                arrayList.remove(((xu1) gr3Var).a);
            } else if (gr3Var instanceof vu1) {
                arrayList.remove(((vu1) gr3Var).a);
            }
            gr3 gr3Var2 = (gr3) kotlin.collections.a.v0(arrayList);
            if (!js3.i((gr3) ai0Var.e, gr3Var2)) {
                e71 e71Var = this.b;
                if (gr3Var2 != null) {
                    ((c) ai0Var.b).invoke();
                    boolean z3 = gr3Var2 instanceof zc3;
                    float f = z3 ? 0.08f : gr3Var2 instanceof gg2 ? 0.1f : gr3Var2 instanceof wu1 ? 0.16f : 0.0f;
                    lt8 lt8Var = s97.a;
                    if (!z3 && ((gr3Var2 instanceof gg2) || (gr3Var2 instanceof wu1))) {
                        lt8Var = new lt8(45, az1.c, 2);
                    }
                    bt2.G(e71Var, null, null, new StateLayer$handleInteraction$1(ai0Var, f, lt8Var, null), 3);
                } else {
                    gr3 gr3Var3 = (gr3) ai0Var.e;
                    lt8 lt8Var2 = s97.a;
                    if (!(gr3Var3 instanceof zc3) && !(gr3Var3 instanceof gg2) && (gr3Var3 instanceof wu1)) {
                        lt8Var2 = new lt8(150, az1.c, 2);
                    }
                    bt2.G(e71Var, null, null, new StateLayer$handleInteraction$2(ai0Var, lt8Var2, null), 3);
                }
                ai0Var.e = gr3Var2;
            }
        } else if (rippleNode.v) {
            rippleNode.C0((tj6) gr3Var);
        } else {
            rippleNode.w.g(gr3Var);
        }
        return tx8.a;
    }
}
