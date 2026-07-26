package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import defpackage.ah6;
import defpackage.cc7;
import defpackage.dh6;
import defpackage.dp2;
import defpackage.fs8;
import defpackage.fu1;
import defpackage.gx4;
import defpackage.jh;
import defpackage.m01;
import defpackage.qj1;
import defpackage.ql3;
import defpackage.ro8;
import defpackage.vg6;
import defpackage.y40;
import defpackage.yg6;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends gx4 implements fs8, dh6, m01 {
    public fu1 o;
    public jh p;
    public boolean q;

    public b(jh jhVar, fu1 fu1Var) {
        this.o = fu1Var;
        this.p = jhVar;
    }

    @Override // defpackage.dh6
    public final void B() {
        G0();
    }

    public final void C0() {
        jh jhVar;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        cc7.G(this, new HoverIconModifierNode$findOverridingAncestorNode$1(1));
        b bVar = (b) ref$ObjectRef.a;
        if (bVar == null || (jhVar = bVar.p) == null) {
            jhVar = this.p;
        }
        D0(jhVar);
    }

    public abstract void D0(yg6 yg6Var);

    public final void E0() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.a = true;
        cc7.I(this, new dp2() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                if (!((b) obj).q) {
                    return TraversableNode$Companion$TraverseDescendantsAction.a;
                }
                ref$BooleanRef.a = false;
                return TraversableNode$Companion$TraverseDescendantsAction.c;
            }
        });
        if (ref$BooleanRef.a) {
            C0();
        }
    }

    public abstract boolean F0(int i);

    public final void G0() {
        if (this.q) {
            this.q = false;
            if (this.n) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                cc7.G(this, new dp2() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        b bVar = (b) obj;
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        Object obj2 = ref$ObjectRef2.a;
                        if (obj2 == null && bVar.q) {
                            ref$ObjectRef2.a = bVar;
                        } else if (obj2 != null) {
                            bVar.getClass();
                        }
                        return Boolean.TRUE;
                    }
                });
                b bVar = (b) ref$ObjectRef.a;
                if (bVar != null) {
                    bVar.C0();
                } else {
                    D0(null);
                }
            }
        }
    }

    @Override // defpackage.dh6
    public final /* synthetic */ void I() {
    }

    @Override // defpackage.dh6
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // defpackage.dh6
    public final void i0() {
        B();
    }

    @Override // defpackage.dh6
    public final long m() {
        fu1 fu1Var = this.o;
        if (fu1Var == null) {
            return ro8.a;
        }
        qj1 qj1Var = y40.H(this).A;
        int i = ro8.b;
        return ql3.q(qj1Var.b0(fu1Var.a), qj1Var.b0(fu1Var.b), qj1Var.b0(fu1Var.c), qj1Var.b0(fu1Var.d));
    }

    @Override // defpackage.dh6
    public final void t(vg6 vg6Var, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.b) {
            List list = vg6Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (F0(((ah6) list.get(i)).i)) {
                    int i2 = vg6Var.f;
                    if (i2 == 4) {
                        this.q = true;
                        E0();
                        return;
                    } else {
                        if (i2 == 5) {
                            G0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.gx4
    public final void t0() {
        B();
    }

    @Override // defpackage.gx4
    public final void u0() {
        G0();
    }
}
