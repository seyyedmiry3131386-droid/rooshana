package androidx.compose.ui.node;

import defpackage.bp2;
import defpackage.cl4;
import defpackage.dp2;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.i14;
import defpackage.o01;
import defpackage.qp2;
import defpackage.tx8;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ d a = new d();
    public static final bp2 b;
    public static final bp2 c;
    public static final qp2 d;
    public static final qp2 e;
    public static final qp2 f;
    public static final qp2 g;
    public static final dp2 h;

    static {
        i14 i14Var = h.S;
        b = h.T;
        c = new bp2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // defpackage.bp2
            public final Object invoke() {
                return new h(2);
            }
        };
        d = new qp2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                ((h) ((hz0) obj)).B0((hx4) obj2);
                return tx8.a;
            }
        };
        e = new qp2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                ((h) ((hz0) obj)).w0((o01) obj2);
                return tx8.a;
            }
        };
        f = new qp2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                ((h) ((hz0) obj)).A0((cl4) obj2);
                return tx8.a;
            }
        };
        g = new qp2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                ((h) ((hz0) obj)).getClass();
                return tx8.a;
            }
        };
        h = new dp2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                hz0 hz0Var = (hz0) obj;
                h hVar = hz0Var instanceof h ? (h) hz0Var : null;
                if (hVar == null || !hVar.R) {
                    return tx8.a;
                }
                throw new IllegalStateException("Apply is called on deactivated node " + hz0Var);
            }
        };
    }
}
