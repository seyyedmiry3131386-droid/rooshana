package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.e51;
import defpackage.ez0;
import defpackage.ko5;
import defpackage.li1;
import defpackage.s08;
import defpackage.so1;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.vq3;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ScrollCaptureCallback {
    public final androidx.compose.ui.semantics.c a;
    public final vq3 b;
    public final c c;
    public final AndroidComposeView d;
    public final e51 e;
    public final b f;

    public a(androidx.compose.ui.semantics.c cVar, vq3 vq3Var, e51 e51Var, c cVar2, AndroidComposeView androidComposeView) {
        this.a = cVar;
        this.b = vq3Var;
        this.c = cVar2;
        this.d = androidComposeView;
        this.e = new e51(e51Var.a.l0(so1.b));
        this.f = new b(vq3Var.a(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.scrollcapture.a r12, android.view.ScrollCaptureSession r13, defpackage.vq3 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.a.a(androidx.compose.ui.scrollcapture.a, android.view.ScrollCaptureSession, vq3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        bt2.G(this.e, ko5.b, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, final CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        li1 li1VarG = bt2.G(this.e, null, null, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, null), 3);
        li1VarG.s0(new dp2() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return tx8.a;
            }
        });
        cancellationSignal.setOnCancelListener(new ez0(0, li1VarG));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.n(uy6.r(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        ((s08) this.c.a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
