package androidx.compose.ui.node;

import defpackage.bp2;
import defpackage.n14;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class LayoutNode$_foldedChildren$1 extends Lambda implements bp2 {
    public final /* synthetic */ h g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$_foldedChildren$1(h hVar) {
        super(0);
        this.g = hVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        n14 n14VarT = this.g.t();
        n14VarT.p.y = true;
        k kVar = n14VarT.q;
        if (kVar != null) {
            kVar.s = true;
        }
        return tx8.a;
    }
}
