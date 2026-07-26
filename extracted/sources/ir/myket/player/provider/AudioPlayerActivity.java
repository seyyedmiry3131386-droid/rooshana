package ir.myket.player.provider;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import defpackage.ab1;
import defpackage.bt2;
import defpackage.c24;
import defpackage.d87;
import defpackage.dn4;
import defpackage.do3;
import defpackage.e51;
import defpackage.e87;
import defpackage.eq7;
import defpackage.gn4;
import defpackage.gp6;
import defpackage.gy0;
import defpackage.iz;
import defpackage.j29;
import defpackage.js3;
import defpackage.jz;
import defpackage.li1;
import defpackage.lz;
import defpackage.n;
import defpackage.qn4;
import defpackage.rs5;
import defpackage.sg4;
import defpackage.sl3;
import defpackage.sq4;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.x2;
import defpackage.yh0;
import defpackage.yq2;
import ir.myket.player.provider.service.PlaybackService;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioPlayerActivity extends FullscreenActivity {
    public static final /* synthetic */ int K = 0;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final e51 I;
    public final c24 J;

    public AudioPlayerActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.a;
        this.E = kotlin.a.b(lazyThreadSafetyMode, new jz(this, 0));
        this.F = kotlin.a.b(lazyThreadSafetyMode, new jz(this, 1));
        this.G = kotlin.a.b(lazyThreadSafetyMode, new jz(this, 2));
        this.H = kotlin.a.b(lazyThreadSafetyMode, new jz(this, 3));
        ug1 ug1Var = up1.a;
        this.I = js3.a(sg4.a);
        this.J = kotlin.a.a(new x2(9, this));
    }

    public static void Q(AudioPlayerActivity audioPlayerActivity, rs5 rs5Var) {
        Object d87Var;
        js3.p(rs5Var, "$this$addCallback");
        if (!yq2.n0(audioPlayerActivity)) {
            audioPlayerActivity.setRequestedOrientation(1);
        }
        bt2.G(audioPlayerActivity.I, null, null, new AudioPlayerActivity$onCreate$1$1(audioPlayerActivity, null), 3);
        if (audioPlayerActivity.getIntent().getBooleanExtra("HAS_CUSTOM_ANIMATION", false)) {
            if (Build.VERSION.SDK_INT >= 34) {
                audioPlayerActivity.overrideActivityTransition(1, gp6.activity_hold, gp6.audio_player_out);
                d87Var = new e87(tx8.a);
            } else {
                d87Var = new d87();
            }
            if (d87Var instanceof d87) {
                audioPlayerActivity.overridePendingTransition(gp6.activity_hold, gp6.audio_player_out);
            }
        }
        audioPlayerActivity.finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        js3.p(context, "newBase");
        ir.myket.common.utils.a.a.getClass();
        super.attachBaseContext(ir.myket.common.utils.a.c(context));
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [c24, java.lang.Object] */
    @Override // ir.myket.player.provider.FullscreenActivity, org.koin.androidx.scope.RetainedScopeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final sq4 sq4Var = (sq4) this.H.getValue();
        Context context = sq4Var.a;
        if (sq4Var.c == null) {
            eq7 eq7Var = new eq7(context, new ComponentName(context, (Class<?>) PlaybackService.class));
            Bundle bundle2 = Bundle.EMPTY;
            sl3 sl3Var = new sl3(4);
            Looper looperX = j29.x();
            final qn4 qn4Var = new qn4(looperX);
            j29.a0(new Handler(looperX), new dn4(qn4Var, new gn4(context, eq7Var, bundle2, sl3Var, looperX, qn4Var, eq7Var.a.d() ? new do3(new ab1(context)) : null), 0));
            qn4Var.e(new Runnable() { // from class: ir.myket.player.provider.service.a
                @Override // java.lang.Runnable
                public final void run() {
                    Object objA;
                    sq4 sq4Var2 = sq4Var;
                    try {
                        Object obj = qn4Var.get();
                        gn4 gn4Var = (gn4) obj;
                        gn4Var.n((b) sq4Var2.j.getValue());
                        sq4Var2.a();
                        sq4Var2.b();
                        if (gn4Var.H()) {
                            li1 li1Var = sq4Var2.i;
                            if (li1Var != null) {
                                li1Var.g(null);
                            }
                            sq4Var2.i = bt2.G(sq4Var2.h, null, null, new MediaSessionController$startProgressUpdates$1(sq4Var2, null), 3);
                        }
                        objA = (gn4) obj;
                    } catch (Throwable th) {
                        objA = kotlin.b.a(th);
                    }
                    sq4Var2.c = (gn4) (objA instanceof Result.Failure ? null : objA);
                }
            }, ContextCompat.getMainExecutor(context));
            sq4Var.b = qn4Var;
        }
        yh0.k(c(), this, new n(13, this));
        gy0.a(this, new androidx.compose.runtime.internal.a(151601683, new iz(this, ((lz) this.F.getValue()).a(), 0), true));
    }
}
