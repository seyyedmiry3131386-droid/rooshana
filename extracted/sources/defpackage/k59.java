package defpackage;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class k59 implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ m59 b;

    public k59(m59 m59Var, DisplayManager displayManager) {
        this.b = m59Var;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            m59.a(this.b, this.a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
