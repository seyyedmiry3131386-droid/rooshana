package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle$Event;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public class jy0 extends Dialog implements g64, xs5, dk5, qd7 {
    public i64 a;
    public final rn6 b;
    public final c24 c;
    public final c24 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(Context context, int i) {
        super(context, i);
        js3.p(context, "context");
        this.b = new rn6(new bp4(this, new o06(17, this)));
        final int i2 = 0;
        this.c = a.a(new bp2(this) { // from class: iy0
            public final /* synthetic */ jy0 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        oo1 oo1Var = new oo1();
                        this.b.c().b.j(oo1Var);
                        return oo1Var;
                    default:
                        return new ws5(new b7(11, this.b));
                }
            }
        });
        final int i3 = 1;
        this.d = a.a(new bp2(this) { // from class: iy0
            public final /* synthetic */ jy0 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        oo1 oo1Var = new oo1();
                        this.b.c().b.j(oo1Var);
                        return oo1Var;
                    default:
                        return new ws5(new b7(11, this.b));
                }
            }
        });
    }

    public static void b(jy0 jy0Var) {
        super.onBackPressed();
    }

    @Override // defpackage.g64
    public final i64 D() {
        i64 i64Var = this.a;
        if (i64Var != null) {
            return i64Var;
        }
        i64 i64Var2 = new i64(this, true);
        this.a = i64Var2;
        return i64Var2;
    }

    @Override // defpackage.dk5
    public final ai0 a() {
        return c().b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        js3.p(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.xs5
    public final ws5 c() {
        return (ws5) this.d.getValue();
    }

    public final void d() {
        Window window = getWindow();
        js3.m(window);
        View decorView = window.getDecorView();
        js3.o(decorView, "getDecorView(...)");
        j27.k(decorView, this);
        Window window2 = getWindow();
        js3.m(window2);
        View decorView2 = window2.getDecorView();
        js3.o(decorView2, "getDecorView(...)");
        decorView2.setTag(bs6.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        js3.m(window3);
        View decorView3 = window3.getDecorView();
        js3.o(decorView3, "getDecorView(...)");
        o27.i(decorView3, this);
        Window window4 = getWindow();
        js3.m(window4);
        View decorView4 = window4.getDecorView();
        js3.o(decorView4, "getDecorView(...)");
        decorView4.setTag(lr6.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.qd7
    public final bn6 o() {
        return (bn6) this.b.c;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((oo1) this.c.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ws5 ws5VarC = c();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            js3.o(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            ws5VarC.c(onBackInvokedDispatcher);
        }
        this.b.v(bundle);
        i64 i64Var = this.a;
        if (i64Var == null) {
            i64Var = new i64(this, true);
            this.a = i64Var;
        }
        i64Var.d(Lifecycle$Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        js3.o(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.b.w(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        i64 i64Var = this.a;
        if (i64Var == null) {
            i64Var = new i64(this, true);
            this.a = i64Var;
        }
        i64Var.d(Lifecycle$Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        i64 i64Var = this.a;
        if (i64Var == null) {
            i64Var = new i64(this, true);
            this.a = i64Var;
        }
        i64Var.d(Lifecycle$Event.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        js3.p(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        js3.p(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
