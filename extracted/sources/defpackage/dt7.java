package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class dt7 extends ct7 {
    public boolean f = false;
    public float g = 0.0f;

    public dt7(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new uq0(1, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    @Override // defpackage.ct7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.widget.FrameLayout r10) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt7.a(android.widget.FrameLayout):void");
    }

    @Override // defpackage.ct7
    public final boolean b() {
        return !this.f || this.a;
    }
}
