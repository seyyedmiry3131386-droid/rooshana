package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.ViewLayer;

/* JADX INFO: loaded from: classes.dex */
public final class do1 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ do1(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).e) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                js3.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                throw null;
        }
    }
}
