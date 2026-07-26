package androidx.compose.ui.platform;

import android.view.View;
import defpackage.dp2;
import defpackage.wn5;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class FocusFinderCompat_androidKt$findUserSetNextFocus$1 extends Lambda implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        View view = (View) obj;
        final int nextFocusForwardId = view.getNextFocusForwardId();
        dp2 dp2Var = new dp2() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(((View) obj2).getId() == nextFocusForwardId);
            }
        };
        View view2 = null;
        View view3 = null;
        while (true) {
            View viewK = wn5.K(view, dp2Var, view3);
            if (viewK != null) {
                view2 = viewK;
                break;
            }
            Object parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            View view4 = (View) parent;
            view3 = view;
            view = view4;
        }
        return Boolean.valueOf(view2 == null);
    }
}
