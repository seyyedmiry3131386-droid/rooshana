package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class y62 extends a80 {
    public final b72 g;
    public final boolean h;
    public final /* synthetic */ ExtendedFloatingActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y62(ExtendedFloatingActionButton extendedFloatingActionButton, pj9 pj9Var, b72 b72Var, boolean z) {
        super(extendedFloatingActionButton, pj9Var);
        this.i = extendedFloatingActionButton;
        this.g = b72Var;
        this.h = z;
    }

    @Override // defpackage.a80
    public final AnimatorSet a() {
        ez4 ez4Var = this.f;
        if (ez4Var == null) {
            if (this.e == null) {
                this.e = ez4.b(this.a, c());
            }
            ez4Var = this.e;
            ez4Var.getClass();
        }
        boolean zG = ez4Var.g("width");
        b72 b72Var = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        if (zG) {
            PropertyValuesHolder[] propertyValuesHolderArrE = ez4Var.e("width");
            propertyValuesHolderArrE[0].setFloatValues(extendedFloatingActionButton.getWidth(), b72Var.b());
            ez4Var.h("width", propertyValuesHolderArrE);
        }
        if (ez4Var.g("height")) {
            PropertyValuesHolder[] propertyValuesHolderArrE2 = ez4Var.e("height");
            propertyValuesHolderArrE2[0].setFloatValues(extendedFloatingActionButton.getHeight(), b72Var.a());
            ez4Var.h("height", propertyValuesHolderArrE2);
        }
        if (ez4Var.g("paddingStart")) {
            PropertyValuesHolder[] propertyValuesHolderArrE3 = ez4Var.e("paddingStart");
            propertyValuesHolderArrE3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), b72Var.p());
            ez4Var.h("paddingStart", propertyValuesHolderArrE3);
        }
        if (ez4Var.g("paddingEnd")) {
            PropertyValuesHolder[] propertyValuesHolderArrE4 = ez4Var.e("paddingEnd");
            propertyValuesHolderArrE4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), b72Var.h());
            ez4Var.h("paddingEnd", propertyValuesHolderArrE4);
        }
        if (ez4Var.g("labelOpacity")) {
            PropertyValuesHolder[] propertyValuesHolderArrE5 = ez4Var.e("labelOpacity");
            boolean z = this.h;
            propertyValuesHolderArrE5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            ez4Var.h("labelOpacity", propertyValuesHolderArrE5);
        }
        return b(ez4Var);
    }

    @Override // defpackage.a80
    public final int c() {
        return this.h ? jp6.mtrl_extended_fab_change_size_expand_motion_spec : jp6.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.a80
    public final void e() {
        this.d.a = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.V = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        b72 b72Var = this.g;
        layoutParams.width = b72Var.k().width;
        layoutParams.height = b72Var.k().height;
    }

    @Override // defpackage.a80
    public final void f(Animator animator) {
        pj9 pj9Var = this.d;
        Animator animator2 = (Animator) pj9Var.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        pj9Var.a = animator;
        boolean z = this.h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.U = z;
        extendedFloatingActionButton.V = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // defpackage.a80
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        boolean z = this.h;
        extendedFloatingActionButton.U = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.y0 = layoutParams.width;
            extendedFloatingActionButton.z0 = layoutParams.height;
        }
        b72 b72Var = this.g;
        layoutParams.width = b72Var.k().width;
        layoutParams.height = b72Var.k().height;
        if (z) {
            extendedFloatingActionButton.l(extendedFloatingActionButton.x0);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.l(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(b72Var.p(), extendedFloatingActionButton.getPaddingTop(), b72Var.h(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
    }

    @Override // defpackage.a80
    public final boolean h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        return this.h == extendedFloatingActionButton.U || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
