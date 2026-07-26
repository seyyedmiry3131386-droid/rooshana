package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.p;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class AndroidViewHolder$runUpdate$1 extends Lambda implements bp2 {
    public final /* synthetic */ AndroidViewHolder g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.g = androidViewHolder;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        AndroidViewHolder androidViewHolder = this.g;
        if (androidViewHolder.e && androidViewHolder.isAttachedToWindow() && androidViewHolder.getView().getParent() == androidViewHolder) {
            p snapshotObserver = androidViewHolder.getSnapshotObserver();
            snapshotObserver.a.d(androidViewHolder, AndroidViewHolder.A, androidViewHolder.getUpdate());
        }
        return tx8.a;
    }
}
