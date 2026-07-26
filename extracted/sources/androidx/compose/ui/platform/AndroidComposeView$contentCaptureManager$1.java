package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.p3;
import defpackage.s31;
import defpackage.te;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements bp2 {
    @Override // defpackage.bp2
    public final Object invoke() {
        ContentCaptureSession contentCaptureSessionU;
        View view = (View) this.receiver;
        dp2 dp2Var = d.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            p3.u(view);
        }
        if (i < 29 || (contentCaptureSessionU = te.u(view)) == null) {
            return null;
        }
        return new s31(contentCaptureSessionU, view);
    }
}
