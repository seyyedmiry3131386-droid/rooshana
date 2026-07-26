package defpackage;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po3 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo3 b;

    public /* synthetic */ po3(qo3 qo3Var, int i) {
        this.a = i;
        this.b = qo3Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        fs8 fs8Var = (fs8) obj;
        switch (this.a) {
            case 0:
                js3.n(fs8Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                qo3 qo3Var = (qo3) fs8Var;
                me9 me9Var = this.b.p;
                if (!js3.i(qo3Var.o, me9Var)) {
                    qo3Var.o = me9Var;
                    qo3Var.D0();
                }
                return TraversableNode$Companion$TraverseDescendantsAction.b;
            default:
                js3.n(fs8Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                this.b.o = ((qo3) fs8Var).p;
                return Boolean.FALSE;
        }
    }
}
