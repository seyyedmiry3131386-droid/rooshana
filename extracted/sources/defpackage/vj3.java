package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.media3.common.StreamKey;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.common.collect.Range;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.ui.recycler.b;
import ir.mservices.market.app.detail.update.InAppFragment;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import j$.util.Objects;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vj3 implements yp2, og5, h32, lv7, n31, zr7, xm4, q94, ro4, wq4, hs4 {
    public final /* synthetic */ int a;

    public /* synthetic */ vj3(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException f(Object obj) {
        return (ForegroundServiceStartNotAllowedException) obj;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ boolean i(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    @Override // defpackage.ro4
    public void a(go4 go4Var) {
        switch (this.a) {
            case 18:
                gn4 gn4Var = go4Var.a;
                if (go4Var.E()) {
                    gn4Var.getClass();
                    vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
                    gn4Var.d.getClass();
                    return;
                }
                return;
            case 19:
                go4Var.i.f(26, new vv1(12));
                return;
            case 20:
                gn4 gn4Var2 = go4Var.a;
                Objects.requireNonNull(gn4Var2);
                gn4Var2.j0(new u03(7, gn4Var2));
                return;
            default:
                throw new ClassCastException();
        }
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((Range) obj).b;
            case 22:
                StreamKey streamKey = (StreamKey) obj;
                streamKey.getClass();
                Bundle bundle = new Bundle();
                int i = streamKey.a;
                if (i != 0) {
                    bundle.putInt(StreamKey.d, i);
                }
                int i2 = streamKey.b;
                if (i2 != 0) {
                    bundle.putInt(StreamKey.e, i2);
                }
                int i3 = streamKey.c;
                if (i3 != 0) {
                    bundle.putInt(StreamKey.f, i3);
                }
                return bundle;
            case 23:
                ip4 ip4Var = (ip4) obj;
                ip4Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(ip4.h, ip4Var.a);
                String str = ip4Var.b;
                if (str != null) {
                    bundle2.putString(ip4.i, str);
                }
                String str2 = ip4Var.c;
                if (str2 != null) {
                    bundle2.putString(ip4.j, str2);
                }
                int i4 = ip4Var.d;
                if (i4 != 0) {
                    bundle2.putInt(ip4.k, i4);
                }
                int i5 = ip4Var.e;
                if (i5 != 0) {
                    bundle2.putInt(ip4.l, i5);
                }
                String str3 = ip4Var.f;
                if (str3 != null) {
                    bundle2.putString(ip4.m, str3);
                }
                String str4 = ip4Var.g;
                if (str4 != null) {
                    bundle2.putString(ip4.n, str4);
                }
                return bundle2;
            default:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(ip4.h);
                uri.getClass();
                String string = bundle3.getString(ip4.i);
                String string2 = bundle3.getString(ip4.j);
                int i6 = bundle3.getInt(ip4.k, 0);
                int i7 = bundle3.getInt(ip4.l, 0);
                String string3 = bundle3.getString(ip4.m);
                String string4 = bundle3.getString(ip4.n);
                sx0 sx0Var = new sx0();
                sx0Var.d = uri;
                sx0Var.a = tv4.m(string);
                sx0Var.e = string2;
                sx0Var.b = i6;
                sx0Var.c = i7;
                sx0Var.f = string3;
                sx0Var.g = string4;
                return new ip4(sx0Var);
        }
    }

    @Override // defpackage.lv7
    public boolean b() {
        return false;
    }

    @Override // defpackage.xm4
    public int c(Object obj) {
        String str = ((sm4) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // defpackage.wq4
    public void d(gq4 gq4Var, int i) {
        switch (this.a) {
            case 26:
                gq4Var.getClass();
                break;
            case 27:
                gq4Var.getClass();
                break;
            default:
                gq4Var.d(i);
                break;
        }
    }

    @Override // defpackage.zr7
    public r61 e(r61 r61Var) {
        int i = MaskableFrameLayout.i;
        return r61Var instanceof i ? new ms0(((i) r61Var).a) : r61Var;
    }

    @Override // defpackage.hs4
    public Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        xq4Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ((eb6) obj).r(1);
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        int i = LaunchContentActivity.B1;
        ((ErrorDTO) serializable).getTranslatedMessage();
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        b bVar = (b) qg5Var;
        AppDownloadData appDownloadData = (AppDownloadData) obj;
        switch (this.a) {
            case 1:
                int i = InAppFragment.a1;
                js3.p(view, "<unused var>");
                js3.p(bVar, "<unused var>");
                js3.p(appDownloadData, "<unused var>");
                break;
            case 2:
                int i2 = InAppFragment.a1;
                js3.p(view, "<unused var>");
                js3.p(bVar, "<unused var>");
                js3.p(appDownloadData, "<unused var>");
                break;
            case 3:
                int i3 = InAppFragment.a1;
                js3.p(view, "<unused var>");
                js3.p(bVar, "<unused var>");
                js3.p(appDownloadData, "<unused var>");
                break;
            default:
                int i4 = InAppFragment.a1;
                js3.p(view, "<unused var>");
                js3.p(bVar, "<unused var>");
                js3.p(appDownloadData, "<unused var>");
                break;
        }
    }
}
