package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a80 {
    public final Context a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList c = new ArrayList();
    public final pj9 d;
    public ez4 e;
    public ez4 f;

    public a80(ExtendedFloatingActionButton extendedFloatingActionButton, pj9 pj9Var) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = pj9Var;
    }

    public AnimatorSet a() {
        ez4 ez4Var = this.f;
        if (ez4Var == null) {
            if (this.e == null) {
                this.e = ez4.b(this.a, c());
            }
            ez4Var = this.e;
            ez4Var.getClass();
        }
        return b(ez4Var);
    }

    public final AnimatorSet b(ez4 ez4Var) {
        ArrayList arrayList = new ArrayList();
        boolean zG = ez4Var.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (zG) {
            arrayList.add(ez4Var.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (ez4Var.g("scale")) {
            arrayList.add(ez4Var.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(ez4Var.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (ez4Var.g("width")) {
            arrayList.add(ez4Var.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.B0));
        }
        if (ez4Var.g("height")) {
            arrayList.add(ez4Var.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.C0));
        }
        if (ez4Var.g("paddingStart")) {
            arrayList.add(ez4Var.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.D0));
        }
        if (ez4Var.g("paddingEnd")) {
            arrayList.add(ez4Var.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.E0));
        }
        if (ez4Var.g("labelOpacity")) {
            arrayList.add(ez4Var.d("labelOpacity", extendedFloatingActionButton, new z70(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        vy2.L(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int c();

    public void d() {
        this.d.a = null;
    }

    public abstract void e();

    public abstract void f(Animator animator);

    public abstract void g();

    public abstract boolean h();
}
