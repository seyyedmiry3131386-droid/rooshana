package defpackage;

import android.graphics.Rect;
import androidx.compose.ui.window.PopupLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ei6 extends rl3 {
    @Override // defpackage.rl3
    public final void B(PopupLayout popupLayout, int i, int i2) {
        popupLayout.setSystemGestureExclusionRects(br9.E(new Rect(0, 0, i, i2)));
    }
}
