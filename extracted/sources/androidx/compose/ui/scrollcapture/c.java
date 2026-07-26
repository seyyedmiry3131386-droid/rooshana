package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.g;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.c26;
import defpackage.dp2;
import defpackage.ew;
import defpackage.ex0;
import defpackage.hg7;
import defpackage.js3;
import defpackage.mn7;
import defpackage.sy6;
import defpackage.uy6;
import defpackage.vq3;
import defpackage.w61;
import defpackage.wb5;
import defpackage.zb5;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final wb5 a = g.h(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, mn7 mn7Var, w61 w61Var, Consumer consumer) {
        zb5 zb5Var = new zb5(0, new hg7[16]);
        d.a(mn7Var.a(), 0, new ScrollCapture$onScrollCaptureSearch$1(1, zb5Var, zb5.class, AppStatusDto.Type.ADD, "add(Ljava/lang/Object;)Z", 8));
        ew.T0(zb5Var.a, new ex0(0, new dp2[]{new dp2() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return Integer.valueOf(((hg7) obj).b);
            }
        }, new dp2() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return Integer.valueOf(((hg7) obj).c.a());
            }
        }}), 0, zb5Var.c);
        int i = zb5Var.c;
        hg7 hg7Var = (hg7) (i == 0 ? null : zb5Var.a[i - 1]);
        if (hg7Var == null) {
            return;
        }
        vq3 vq3Var = hg7Var.c;
        a aVar = new a(hg7Var.a, vq3Var, js3.a(w61Var), this, androidComposeView);
        m mVar = hg7Var.d;
        sy6 sy6VarI = c26.t(mVar).I(mVar, true);
        long jB = vq3Var.b();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, uy6.r(js3.R(sy6VarI)), new Point((int) (jB >> 32), (int) (jB & 4294967295L)), aVar);
        scrollCaptureTarget.setScrollBounds(uy6.r(vq3Var));
        consumer.n(scrollCaptureTarget);
    }
}
