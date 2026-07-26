package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import defpackage.cc7;
import defpackage.dg;
import defpackage.dp2;
import defpackage.gu1;
import defpackage.hu1;
import defpackage.iu1;
import defpackage.rn3;
import defpackage.sv;
import defpackage.zv;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnDragListener, hu1 {
    public final iu1 a;
    public final zv b;
    public final dg c;

    public a() {
        iu1 iu1Var = new iu1();
        iu1Var.q = 0L;
        this.a = iu1Var;
        this.b = new zv(0);
        this.c = new dg(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        final gu1 gu1Var = new gu1(dragEvent);
        int action = dragEvent.getAction();
        zv zvVar = this.b;
        final iu1 iu1Var = this.a;
        switch (action) {
            case 1:
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                dp2 dp2Var = new dp2(gu1Var, iu1Var, ref$BooleanRef) { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
                    public final /* synthetic */ Ref$BooleanRef g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.g = ref$BooleanRef;
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        iu1 iu1Var2 = (iu1) obj;
                        if (!iu1Var2.n) {
                            return TraversableNode$Companion$TraverseDescendantsAction.b;
                        }
                        if (iu1Var2.p != null) {
                            rn3.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                        }
                        iu1Var2.p = null;
                        Ref$BooleanRef ref$BooleanRef2 = this.g;
                        ref$BooleanRef2.a = ref$BooleanRef2.a;
                        return TraversableNode$Companion$TraverseDescendantsAction.a;
                    }
                };
                if (dp2Var.invoke(iu1Var) == TraversableNode$Companion$TraverseDescendantsAction.a) {
                    cc7.I(iu1Var, dp2Var);
                }
                boolean z = ref$BooleanRef.a;
                zvVar.getClass();
                sv svVar = new sv(zvVar);
                while (svVar.hasNext()) {
                    ((iu1) svVar.next()).G0(gu1Var);
                }
                break;
            case 2:
                iu1Var.F0(gu1Var);
                break;
            case 4:
                DragAndDropNode$onEnded$1 dragAndDropNode$onEnded$1 = new DragAndDropNode$onEnded$1(gu1Var);
                if (dragAndDropNode$onEnded$1.invoke(iu1Var) == TraversableNode$Companion$TraverseDescendantsAction.a) {
                    cc7.I(iu1Var, dragAndDropNode$onEnded$1);
                }
                zvVar.clear();
                break;
            case 5:
                iu1Var.D0(gu1Var);
                break;
            case 6:
                iu1Var.E0(gu1Var);
                break;
        }
        return false;
    }
}
