package androidx.compose.ui.viewinterop;

import defpackage.dp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class AndroidViewHolder$layoutNode$1$coreModifier$4 extends Lambda implements dp2 {
    public final /* synthetic */ AndroidViewHolder g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.g = androidViewHolder;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        this.g.q = (dp2) obj;
        return tx8.a;
    }
}
