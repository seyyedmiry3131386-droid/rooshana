package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vx0 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ vx0(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                int i3 = ComponentActivity.u;
                componentActivity.reportFullyDrawn();
                return tx8.a;
            case 1:
                return new xo2(componentActivity.f, new vx0(componentActivity, i2));
            case 2:
                int i4 = ComponentActivity.u;
                oo1 oo1Var = new oo1();
                componentActivity.c().b.j(oo1Var);
                return oo1Var;
            case 3:
                int i5 = ComponentActivity.u;
                return new rd7(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i6 = ComponentActivity.u;
                ws5 ws5Var = new ws5(new ux0(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (js3.i(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.a.a(new wx0(ws5Var, componentActivity, 0));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new g7(componentActivity, ws5Var, 6));
                    }
                }
                return ws5Var;
        }
    }
}
