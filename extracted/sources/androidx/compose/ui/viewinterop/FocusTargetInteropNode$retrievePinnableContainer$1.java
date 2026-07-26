package androidx.compose.ui.viewinterop;

import androidx.compose.ui.layout.j;
import defpackage.bp2;
import defpackage.tx8;
import defpackage.y97;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
final class FocusTargetInteropNode$retrievePinnableContainer$1 extends Lambda implements bp2 {
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetInteropNode$retrievePinnableContainer$1(Ref$ObjectRef ref$ObjectRef, h hVar) {
        super(0);
        this.g = ref$ObjectRef;
        this.h = hVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        this.g.a = y97.t(this.h, j.a);
        return tx8.a;
    }
}
