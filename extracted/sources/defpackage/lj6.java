package defpackage;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj6 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ lj6(Ref$ObjectRef ref$ObjectRef, int i) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        int i = this.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        switch (i) {
            case 0:
                fs8 fs8Var = (fs8) obj;
                js3.n(fs8Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                g34 g34Var = ((hs8) fs8Var).o;
                List listE = (List) ref$ObjectRef.a;
                if (listE != null) {
                    listE.add(g34Var);
                } else {
                    listE = br9.E(g34Var);
                }
                ref$ObjectRef.a = listE;
                return TraversableNode$Companion$TraverseDescendantsAction.b;
            default:
                kv3 kv3Var = (kv3) obj;
                js3.p(kv3Var, "it");
                ref$ObjectRef.a = kv3Var;
                return tx8.a;
        }
    }
}
