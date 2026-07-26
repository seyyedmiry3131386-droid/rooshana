package defpackage;

import android.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import ir.myket.player.provider.FullscreenActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(FullscreenActivity fullscreenActivity, a aVar) {
        int i = 0;
        View childAt = ((ViewGroup) fullscreenActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        AttributeSet attributeSet = null;
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(aVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(fullscreenActivity, attributeSet, 6, i);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(aVar);
        View decorView = fullscreenActivity.getWindow().getDecorView();
        if (j27.d(decorView) == null) {
            j27.k(decorView, fullscreenActivity);
        }
        if (z27.g(decorView) == null) {
            z27.l(decorView, fullscreenActivity);
        }
        if (o27.e(decorView) == null) {
            o27.i(decorView, fullscreenActivity);
        }
        fullscreenActivity.setContentView(composeView2, a);
    }
}
