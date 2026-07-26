package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.bt2;
import defpackage.dg8;
import defpackage.dp2;
import defpackage.eg8;
import defpackage.jg8;
import defpackage.kg8;
import defpackage.nr5;
import defpackage.tx8;
import defpackage.y97;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class TextContextMenuGestureNode$1$1 extends FunctionReferenceImpl implements dp2 {
    public final void b(long j) {
        eg8 eg8Var = (eg8) this.receiver;
        eg8Var.getClass();
        jg8 jg8Var = (jg8) y97.t(eg8Var, kg8.a);
        if (jg8Var == null) {
            return;
        }
        bt2.G(eg8Var.o0(), null, null, new TextContextMenuGestureNode$tryShowContextMenu$1(eg8Var, j, jg8Var, new dg8(eg8Var, j), null), 3);
    }

    @Override // defpackage.dp2
    public final /* synthetic */ Object invoke(Object obj) {
        b(((nr5) obj).a);
        return tx8.a;
    }
}
