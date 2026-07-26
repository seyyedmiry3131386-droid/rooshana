package ir.mservices.market.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import defpackage.b8;
import defpackage.br2;
import defpackage.d04;
import defpackage.d56;
import defpackage.do3;
import defpackage.f24;
import defpackage.f7;
import defpackage.g27;
import defpackage.ji1;
import defpackage.pr7;
import defpackage.q79;
import defpackage.q91;
import defpackage.qq4;
import defpackage.rq4;
import defpackage.s50;
import defpackage.sm;
import defpackage.ta5;
import defpackage.w91;
import defpackage.xe1;
import defpackage.y97;
import defpackage.yy2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_BaseActivity extends AppCompatActivity implements br2 {
    public xe1 C;
    public volatile f7 D;
    public final Object E = new Object();
    public boolean F = false;

    public Hilt_BaseActivity() {
        I(new sm(this, 2));
    }

    public final f7 Q() {
        if (this.D == null) {
            synchronized (this.E) {
                try {
                    if (this.D == null) {
                        this.D = new f7(this, 0);
                    }
                } finally {
                }
            }
        }
        return this.D;
    }

    public void R() {
        if (this.F) {
            return;
        }
        this.F = true;
        BaseActivity baseActivity = (BaseActivity) this;
        w91 w91Var = ((q91) ((s50) e())).a;
        baseActivity.G = (d04) w91Var.p.get();
        baseActivity.H = (pr7) w91Var.s.get();
        baseActivity.I = (d56) w91Var.U.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        return Q().e();
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
        f7 f7Var = (f7) Q().d;
        xe1 xe1Var = ((b8) f7.c(f7Var.b, (FragmentActivity) f7Var.d).o(g27.a(b8.class))).c;
        this.C = xe1Var;
        if (((ta5) xe1Var.b) == null) {
            ta5 ta5VarI = i();
            y97.q(xe1Var.a, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            xe1Var.b = ta5VarI;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        xe1 xe1Var = this.C;
        if (xe1Var != null) {
            xe1Var.b = null;
        }
    }
}
