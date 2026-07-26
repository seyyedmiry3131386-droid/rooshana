package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.activity.ForceCloseReportingActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fz2 extends FragmentActivity implements br2 {
    public xe1 B;
    public volatile f7 C;
    public final Object D = new Object();
    public boolean E = false;

    public fz2() {
        I(new sm((ForceCloseReportingActivity) this, 8));
    }

    public final f7 O() {
        if (this.C == null) {
            synchronized (this.D) {
                try {
                    if (this.C == null) {
                        this.C = new f7(this, 0);
                    }
                } finally {
                }
            }
        }
        return this.C;
    }

    @Override // defpackage.br2
    public final Object e() {
        return O().e();
    }

    @Override // androidx.activity.ComponentActivity, defpackage.jx2
    public final q79 h() {
        q79 q79VarH = super.h();
        do3 do3VarA = ((q91) ((ji1) rq4.x(ji1.class, this))).a();
        f24 f24Var = (f24) do3VarA.a;
        q79VarH.getClass();
        return new yy2(f24Var, q79VarH, (qq4) do3VarA.b);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f7 f7Var = (f7) O().d;
        xe1 xe1Var = ((b8) f7.c(f7Var.b, (FragmentActivity) f7Var.d).o(g27.a(b8.class))).c;
        this.B = xe1Var;
        if (((ta5) xe1Var.b) == null) {
            ta5 ta5VarI = i();
            y97.q(xe1Var.a, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            xe1Var.b = ta5VarI;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        xe1 xe1Var = this.B;
        if (xe1Var != null) {
            xe1Var.b = null;
        }
    }
}
