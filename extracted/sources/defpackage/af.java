package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ af(AndroidComposeView androidComposeView, int i) {
        this.a = i;
        this.b = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AndroidComposeView androidComposeView = this.b;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.h1;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!androidComposeView.h.isEmpty()) {
                    try {
                        ((bp2) androidComposeView.h.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            default:
                androidComposeView.Z0 = false;
                MotionEvent motionEvent = androidComposeView.R0;
                js3.m(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.H(motionEvent);
                return;
        }
    }
}
