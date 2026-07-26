package androidx.compose.ui.platform;

import defpackage.dp2;
import defpackage.eg2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeView$indirectPointerNavigationGestureDetector$1 extends Lambda implements dp2 {
    public final /* synthetic */ AndroidComposeView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$indirectPointerNavigationGestureDetector$1(AndroidComposeView androidComposeView) {
        super(1);
        this.g = androidComposeView;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((androidx.compose.ui.focus.c) this.g.getFocusOwner()).g(((eg2) obj).a, false);
        return tx8.a;
    }
}
