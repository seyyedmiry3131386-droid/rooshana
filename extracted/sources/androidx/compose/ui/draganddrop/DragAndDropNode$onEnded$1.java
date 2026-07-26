package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import defpackage.cc7;
import defpackage.dp2;
import defpackage.gu1;
import defpackage.iu1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class DragAndDropNode$onEnded$1 extends Lambda implements dp2 {
    public final /* synthetic */ gu1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(gu1 gu1Var) {
        super(1);
        this.g = gu1Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        iu1 iu1Var = (iu1) obj;
        if (!iu1Var.a.n) {
            return TraversableNode$Companion$TraverseDescendantsAction.b;
        }
        iu1 iu1Var2 = iu1Var.p;
        if (iu1Var2 != null) {
            DragAndDropNode$onEnded$1 dragAndDropNode$onEnded$1 = new DragAndDropNode$onEnded$1(this.g);
            if (dragAndDropNode$onEnded$1.invoke(iu1Var2) == TraversableNode$Companion$TraverseDescendantsAction.a) {
                cc7.I(iu1Var2, dragAndDropNode$onEnded$1);
            }
        }
        iu1Var.p = null;
        iu1Var.o = null;
        return TraversableNode$Companion$TraverseDescendantsAction.a;
    }
}
