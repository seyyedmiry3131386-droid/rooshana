package androidx.compose.ui.node;

import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class NodeCoordinator$invalidateParentLayer$1 extends Lambda implements bp2 {
    public final /* synthetic */ m g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$invalidateParentLayer$1(m mVar) {
        super(0);
        this.g = mVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        m mVar = this.g.s;
        if (mVar != null) {
            mVar.Q0();
        }
        return tx8.a;
    }
}
