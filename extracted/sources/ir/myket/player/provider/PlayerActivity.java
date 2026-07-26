package ir.myket.player.provider;

import android.content.Context;
import android.os.Bundle;
import defpackage.a42;
import defpackage.bt2;
import defpackage.c24;
import defpackage.ci1;
import defpackage.dp2;
import defpackage.e51;
import defpackage.e62;
import defpackage.g8;
import defpackage.gy0;
import defpackage.hy2;
import defpackage.ig1;
import defpackage.js3;
import defpackage.ly;
import defpackage.n52;
import defpackage.o06;
import defpackage.qg1;
import defpackage.rc6;
import defpackage.rs5;
import defpackage.sg4;
import defpackage.ts5;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.wc6;
import defpackage.yh0;
import defpackage.yq2;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerActivity extends FullscreenActivity {
    public static final /* synthetic */ int K = 0;
    public final Object E;
    public final Object F;
    public e62 G;
    public final Object H;
    public final e51 I;
    public final c24 J;

    public PlayerActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.a;
        this.E = kotlin.a.b(lazyThreadSafetyMode, new rc6(this, 0));
        this.F = kotlin.a.b(lazyThreadSafetyMode, new rc6(this, 1));
        this.H = kotlin.a.b(lazyThreadSafetyMode, new rc6(this, 2));
        ug1 ug1Var = up1.a;
        this.I = js3.a(sg4.a);
        this.J = kotlin.a.a(new o06(4, this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        js3.p(context, "newBase");
        ir.myket.common.utils.a.a.getClass();
        super.attachBaseContext(ir.myket.common.utils.a.c(context));
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [c24, java.lang.Object] */
    @Override // ir.myket.player.provider.FullscreenActivity, org.koin.androidx.scope.RetainedScopeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yh0.k(c(), this, new dp2() { // from class: ir.myket.player.provider.a
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                int i = PlayerActivity.K;
                js3.p((rs5) obj, "$this$addCallback");
                PlayerActivity playerActivity = this.a;
                if (!yq2.n0(playerActivity)) {
                    playerActivity.setRequestedOrientation(1);
                }
                bt2.G(playerActivity.I, null, null, new PlayerActivity$onCreate$1$1(playerActivity, null), 3);
                playerActivity.finish();
                return tx8.a;
            }
        });
        wc6 wc6Var = (wc6) this.F.getValue();
        wc6Var.getClass();
        ts5 ts5Var = new ts5(6, wc6Var);
        ly lyVar = new ly(3, 0, 1, 1, 0, false);
        Context context = wc6Var.a;
        n52 n52Var = new n52(context);
        n52Var.d(new ci1(context, new hy2(24)));
        qg1 qg1Var = new qg1(context);
        qg1Var.c = true;
        n52Var.c(qg1Var);
        n52Var.b(new ig1(ts5Var));
        e62 e62VarA = n52Var.a();
        e62VarA.u0(new a42());
        e62VarA.T0(lyVar, true);
        e62VarA.c();
        this.G = e62VarA;
        gy0.a(this, new androidx.compose.runtime.internal.a(385082921, new g8(19, this), true));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        e62 e62Var = this.G;
        if (e62Var != null) {
            e62Var.stop();
        }
        e62 e62Var2 = this.G;
        if (e62Var2 != null) {
            e62Var2.a();
        }
        this.G = null;
        super.onDestroy();
    }
}
