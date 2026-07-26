package defpackage;

import android.content.ClipDescription;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.paging.LoadType;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingtoolbar.FloatingToolbarLayout;
import ir.mservices.market.version2.fragments.content.CropContentFragment;
import ir.mservices.market.version2.fragments.dialog.AlertButtonComponentDialogFragment;
import ir.mservices.market.version2.fragments.dialog.ConfirmBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.KidsModeDeActiveBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment;
import ir.mservices.market.views.FastDownloadView;
import j$.util.Objects;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes.dex */
public class ca7 implements rm1, ms5, lo, b70, h32, lm0, zc7, s82, qj4 {
    public static ca7 c;
    public static final ca7 e;
    public static final dr2 f;
    public final /* synthetic */ int a;
    public Object b;
    public static final RootTelemetryConfiguration d = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public static final xs8 g = new xs8();

    static {
        int i = 1;
        e = new ca7(i, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        f = new dr2(i);
    }

    public /* synthetic */ ca7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static synchronized ca7 f() {
        try {
            if (c == null) {
                c = new ca7(0, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    @Override // defpackage.jl0
    public void b() {
        CropContentFragment cropContentFragment = (CropContentFragment) this.b;
        int i = CropContentFragment.c1;
        if (cropContentFragment.J0.g() instanceof ProgressDialogFragment) {
            cropContentFragment.J0.q();
        }
        pk5.a(cropContentFragment.J0);
        t32.b().j(new s71(null, false, cropContentFragment.b1.c));
    }

    @Override // defpackage.b70
    public void d(ConnectionResult connectionResult) {
        d70 d70Var = (d70) this.b;
        if (connectionResult.b == 0) {
            d70Var.getRemoteService(null, d70Var.getScopes());
        } else if (d70Var.zzl() != null) {
            d70Var.zzl().onConnectionFailed(connectionResult);
        }
    }

    public i g(LoadType loadType) {
        vp7 vp7Var = (vp7) this.b;
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 1) {
            return ((oz2) vp7Var.b).b;
        }
        if (iOrdinal == 2) {
            return ((oz2) vp7Var.c).b;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    @Override // defpackage.lm0
    public void h(Typeface typeface) {
        qu0 qu0Var = (qu0) this.b;
        if (qu0Var.z(typeface)) {
            qu0Var.l(false);
        }
    }

    public void i(x47 x47Var, ry ryVar, g6 g6Var) {
        synchronized (x47Var.e) {
            x47Var.j = true;
        }
        x47Var.a("post-response");
        ((vg) this.b).execute(new w42(x47Var, ryVar, g6Var, 0));
    }

    @Override // defpackage.h32
    public /* bridge */ /* synthetic */ void j(Serializable serializable) {
    }

    public synchronized void k(ws2 ws2Var) {
        ws2Var.b = null;
        ws2Var.c = null;
        ((ArrayDeque) this.b).offer(ws2Var);
    }

    @Override // defpackage.s82
    public void n(FastDownloadView fastDownloadView, r82 r82Var) {
        bn6 bn6Var = (bn6) ((vr1) this.b).p;
        if (bn6Var != null) {
            bn6Var.n(fastDownloadView, r82Var);
        } else {
            js3.V("fastDownloadListener");
            throw null;
        }
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 4:
                AlertButtonComponentDialogFragment alertButtonComponentDialogFragment = (AlertButtonComponentDialogFragment) this.b;
                Bundle bundle = new Bundle();
                bundle.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                alertButtonComponentDialogFragment.N0(DialogResult.b, bundle);
                break;
            case 15:
                ConfirmBottomDialogFragment confirmBottomDialogFragment = (ConfirmBottomDialogFragment) this.b;
                confirmBottomDialogFragment.e1.w.setCancelButtonEnable(false);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                confirmBottomDialogFragment.R0(DialogResult.b, bundle2);
                break;
            default:
                ((KidsModeDeActiveBottomDialogFragment) this.b).R0(DialogResult.b, new Bundle());
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 4:
                ((AlertButtonComponentDialogFragment) this.b).N0(DialogResult.a, new Bundle());
                break;
            case 15:
                ((ConfirmBottomDialogFragment) this.b).R0(DialogResult.a, new Bundle());
                break;
            default:
                ((KidsModeDeActiveBottomDialogFragment) this.b).X0();
                break;
        }
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        switch (this.a) {
            case 5:
                AppBarLayout appBarLayout = (AppBarLayout) this.b;
                lf9 lf9Var2 = appBarLayout.getFitsSystemWindows() ? lf9Var : null;
                if (!Objects.equals(appBarLayout.g, lf9Var2)) {
                    appBarLayout.g = lf9Var2;
                    appBarLayout.setWillNotDraw(!(appBarLayout.x != null && appBarLayout.getTopInset() > 0));
                    appBarLayout.requestLayout();
                }
                break;
            default:
                FloatingToolbarLayout floatingToolbarLayout = (FloatingToolbarLayout) this.b;
                if (floatingToolbarLayout.a || floatingToolbarLayout.c || floatingToolbarLayout.b || floatingToolbarLayout.d) {
                    no3 no3VarG = lf9Var.a.g(655);
                    floatingToolbarLayout.f = no3VarG.d;
                    floatingToolbarLayout.g = no3VarG.b;
                    floatingToolbarLayout.i = no3VarG.c;
                    floatingToolbarLayout.h = no3VarG.a;
                    floatingToolbarLayout.a();
                }
                break;
        }
        return lf9Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ca7(int i, boolean z) {
        this.a = i;
    }

    public ca7(d70 d70Var) {
        this.a = 9;
        Objects.requireNonNull(d70Var);
        this.b = d70Var;
    }

    public ca7(kj7 kj7Var) {
        this.a = 7;
        js3.p(kj7Var, "searchResultService");
        this.b = kj7Var;
    }

    public ca7(Handler handler) {
        this.a = 21;
        this.b = new vg(handler, 2);
    }

    public ca7(boolean z) {
        this.a = 8;
        this.b = new AtomicBoolean(z);
    }

    public ca7(int i) {
        cv4 cv4Var;
        this.a = i;
        switch (i) {
            case 3:
                ft9 ft9Var = ft9.c;
                xg5 xg5Var = new xg5(20, new bt9[]{hy2.y, g});
                Charset charset = qs9.a;
                this.b = xg5Var;
                break;
            case 12:
                char[] cArr = i29.a;
                this.b = new ArrayDeque(0);
                break;
            case 24:
                this.b = new vp7(this);
                break;
            default:
                hn6 hn6Var = hn6.c;
                try {
                    cv4Var = (cv4) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    cv4Var = f;
                }
                cv4[] cv4VarArr = {dr2.b, cv4Var};
                xg4 xg4Var = new xg4();
                xg4Var.a = cv4VarArr;
                Charset charset2 = ur3.a;
                this.b = xg4Var;
                break;
        }
    }

    public ca7(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 25;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new bo3(uri, clipDescription, uri2);
        } else {
            this.b = new pa2(uri, clipDescription, uri2, 6);
        }
    }

    @Override // defpackage.lo
    public void a(int i) {
    }

    @Override // defpackage.lo
    public void c(int i) {
    }

    public ca7(List list) {
        this.a = 19;
        js3.p(list, "callsToExecute");
        this.b = list;
    }

    @Override // defpackage.lo
    public void e(int i, float f2) {
    }
}
