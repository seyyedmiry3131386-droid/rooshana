package defpackage;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import defpackage.fs8;
import defpackage.gu9;
import defpackage.hs9;
import defpackage.iu1;
import defpackage.y40;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class iu1 extends gx4 implements fs8, t04 {
    public iu1 o;
    public iu1 p;
    public long q;

    public final boolean C0(gu1 gu1Var) {
        iu1 iu1Var = this.o;
        if (iu1Var != null) {
            return iu1Var.C0(gu1Var);
        }
        iu1 iu1Var2 = this.p;
        if (iu1Var2 != null) {
            return iu1Var2.C0(gu1Var);
        }
        return false;
    }

    public final void D0(gu1 gu1Var) {
        iu1 iu1Var = this.p;
        if (iu1Var != null) {
            iu1Var.D0(gu1Var);
            return;
        }
        iu1 iu1Var2 = this.o;
        if (iu1Var2 != null) {
            iu1Var2.D0(gu1Var);
        }
    }

    public final void E0(gu1 gu1Var) {
        iu1 iu1Var = this.p;
        if (iu1Var != null) {
            iu1Var.E0(gu1Var);
        }
        iu1 iu1Var2 = this.o;
        if (iu1Var2 != null) {
            iu1Var2.E0(gu1Var);
        }
        this.o = null;
    }

    public final void F0(final gu1 gu1Var) {
        fs8 fs8Var;
        iu1 iu1Var;
        iu1 iu1Var2 = this.o;
        if (iu1Var2 == null || !hs9.o(iu1Var2, gu9.u(gu1Var))) {
            if (this.a.n) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                cc7.I(this, new dp2() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        fs8 fs8Var2 = (fs8) obj;
                        iu1 iu1Var3 = (iu1) fs8Var2;
                        if (!((a) y40.I(this).getDragAndDropManager()).b.contains(iu1Var3) || !hs9.o(iu1Var3, gu9.u(gu1Var))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.a;
                        }
                        ref$ObjectRef.a = fs8Var2;
                        return TraversableNode$Companion$TraverseDescendantsAction.c;
                    }
                });
                fs8Var = (fs8) ref$ObjectRef.a;
            } else {
                fs8Var = null;
            }
            iu1Var = (iu1) fs8Var;
        } else {
            iu1Var = iu1Var2;
        }
        if (iu1Var != null && iu1Var2 == null) {
            iu1Var.D0(gu1Var);
            iu1Var.F0(gu1Var);
            iu1 iu1Var3 = this.p;
            if (iu1Var3 != null) {
                iu1Var3.E0(gu1Var);
            }
        } else if (iu1Var == null && iu1Var2 != null) {
            iu1 iu1Var4 = this.p;
            if (iu1Var4 != null) {
                iu1Var4.D0(gu1Var);
                iu1Var4.F0(gu1Var);
            }
            iu1Var2.E0(gu1Var);
        } else if (!js3.i(iu1Var, iu1Var2)) {
            if (iu1Var != null) {
                iu1Var.D0(gu1Var);
                iu1Var.F0(gu1Var);
            }
            if (iu1Var2 != null) {
                iu1Var2.E0(gu1Var);
            }
        } else if (iu1Var != null) {
            iu1Var.F0(gu1Var);
        } else {
            iu1 iu1Var5 = this.p;
            if (iu1Var5 != null) {
                iu1Var5.F0(gu1Var);
            }
        }
        this.o = iu1Var;
    }

    public final void G0(gu1 gu1Var) {
        iu1 iu1Var = this.p;
        if (iu1Var != null) {
            iu1Var.G0(gu1Var);
            return;
        }
        iu1 iu1Var2 = this.o;
        if (iu1Var2 != null) {
            iu1Var2.G0(gu1Var);
        }
    }

    @Override // defpackage.t04
    public final /* synthetic */ void k(v04 v04Var) {
    }

    @Override // defpackage.fs8
    public final Object l() {
        return th0.i;
    }

    @Override // defpackage.t04
    public final void n(long j) {
        this.q = j;
    }

    @Override // defpackage.gx4
    public final void u0() {
        this.p = null;
        this.o = null;
    }
}
