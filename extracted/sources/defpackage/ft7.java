package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ft7 extends ct7 {
    public ft7(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new et7(this));
    }

    @Override // defpackage.ct7
    public final void a(FrameLayout frameLayout) {
        frameLayout.setClipToOutline(!this.a);
        if (this.a) {
            frameLayout.invalidate();
        } else {
            frameLayout.invalidateOutline();
        }
    }

    @Override // defpackage.ct7
    public final boolean b() {
        return this.a;
    }
}
