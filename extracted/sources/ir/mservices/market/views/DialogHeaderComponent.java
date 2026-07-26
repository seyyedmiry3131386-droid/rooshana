package ir.mservices.market.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.d04;
import defpackage.ea7;
import defpackage.f57;
import defpackage.f88;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw;
import defpackage.ne5;
import defpackage.pq6;
import defpackage.r22;
import defpackage.rr6;
import defpackage.rx2;
import defpackage.sj8;
import defpackage.t61;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.ApplicationLauncher;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogHeaderComponent extends Hilt_DialogHeaderComponent {
    public rx2 s;
    public d04 t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ComponentGravity {
        public static final ComponentGravity a;
        public static final ComponentGravity b;
        public static final /* synthetic */ ComponentGravity[] c;
        public static final /* synthetic */ r22 d;

        static {
            ComponentGravity componentGravity = new ComponentGravity("CENTER", 0);
            a = componentGravity;
            ComponentGravity componentGravity2 = new ComponentGravity("SIDE", 1);
            b = componentGravity2;
            ComponentGravity[] componentGravityArr = {componentGravity, componentGravity2};
            c = componentGravityArr;
            d = kotlin.enums.a.a(componentGravityArr);
        }

        public static ComponentGravity valueOf(String str) {
            return (ComponentGravity) Enum.valueOf(ComponentGravity.class, str);
        }

        public static ComponentGravity[] values() {
            return (ComponentGravity[]) c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHeaderComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = rx2.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        rx2 rx2Var = (rx2) a79.f0(layoutInflaterFrom, js6.header_dialog_component, this, true, null);
        js3.o(rx2Var, "inflate(...)");
        this.s = rx2Var;
        setComponentGravity(ComponentGravity.a);
        setTheme(sj8.b());
    }

    public final rx2 getBinding() {
        return this.s;
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.t;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final void setBinding(rx2 rx2Var) {
        js3.p(rx2Var, "<set-?>");
        this.s = rx2Var;
    }

    public final void setComponentGravity(ComponentGravity componentGravity) {
        js3.p(componentGravity, "gravity");
        ViewGroup.LayoutParams layoutParams = this.s.y.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.s.x.getLayoutParams();
        js3.n(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.margin_default_v2);
        int iOrdinal = componentGravity.ordinal();
        if (iOrdinal == 0) {
            ViewGroup.LayoutParams layoutParams5 = this.s.w.getLayoutParams();
            js3.n(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams5).E = 0.5f;
            layoutParams4.E = 0.5f;
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = dimensionPixelSize * 2;
            layoutParams2.e = 0;
            layoutParams2.h = 0;
            layoutParams2.g = -1;
            layoutParams2.i = -1;
            layoutParams2.j = rr6.image_layout;
            layoutParams2.E = 0.5f;
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
            layoutParams2.f = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = t() ? (dimensionPixelSize / 2) + dimensionPixelSize : 0;
            layoutParams4.e = 0;
            layoutParams4.h = 0;
            layoutParams4.g = -1;
            layoutParams4.i = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = 0;
            layoutParams4.f = 0;
            this.s.x.setTextSize(0, getResources().getDimensionPixelSize(pq6.font_size_normal));
            this.s.y.setTextSize(0, getResources().getDimensionPixelSize(pq6.font_size_huge));
            this.s.y.setIncludeFontPadding(true);
            this.s.x.setIncludeFontPadding(true);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            float f = getLanguageHelper().f() ? 1.0f : 0.0f;
            ViewGroup.LayoutParams layoutParams6 = this.s.w.getLayoutParams();
            js3.n(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams6).E = f;
            layoutParams4.E = f;
            layoutParams2.E = f;
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            this.s.x.setTextSize(0, getResources().getDimensionPixelSize(pq6.font_size_medium));
            this.s.y.setTextSize(0, getResources().getDimensionPixelSize(t() ? pq6.font_size_large : pq6.font_size_huge));
            this.s.y.setIncludeFontPadding(false);
            this.s.x.setIncludeFontPadding(false);
            layoutParams2.i = rr6.image_layout;
            layoutParams2.j = -1;
            if (getLanguageHelper().f()) {
                layoutParams2.e = 0;
                layoutParams2.f = -1;
                layoutParams2.h = -1;
                layoutParams2.g = rr6.image_layout;
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = t() ? dimensionPixelSize : 0;
                layoutParams4.e = 0;
                layoutParams4.f = -1;
                layoutParams4.h = -1;
                layoutParams4.g = rr6.image_layout;
                ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = 0;
                if (!t()) {
                    dimensionPixelSize = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = dimensionPixelSize;
                this.s.y.setGravity(5);
                this.s.x.setGravity(5);
            } else {
                layoutParams2.e = -1;
                layoutParams2.f = rr6.image_layout;
                layoutParams2.h = 0;
                layoutParams2.g = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = t() ? dimensionPixelSize : 0;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
                layoutParams4.e = -1;
                layoutParams4.f = rr6.image_layout;
                layoutParams4.h = 0;
                layoutParams4.g = -1;
                if (!t()) {
                    dimensionPixelSize = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = dimensionPixelSize;
                ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = 0;
                this.s.y.setGravity(3);
                this.s.x.setGravity(3);
            }
        }
        this.s.y.requestLayout();
    }

    public final void setImage(String str, int i) {
        f57 f57VarH;
        ImageView imageView = this.s.v;
        int i2 = 0;
        if (str == null || f88.n0(str)) {
            this.s.y.setPadding(0, getResources().getDimensionPixelSize(pq6.space_16), 0, 0);
            i2 = 8;
        } else {
            int dimensionPixelSize = getResources().getDimensionPixelSize(i);
            this.s.v.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            ImageView imageView2 = this.s.v;
            Context context = getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            ea7Var.b = sj8.b().l;
            ea7Var.h = 0;
            ea7Var.c(dimensionPixelSize / 2);
            imageView2.setBackground(ea7Var.a());
            if (f88.n0(str)) {
                lw.g(null, "url is empty", null);
                str = "empty_url";
            }
            try {
                f57VarH = com.bumptech.glide.a.f(this).q(new ne5(str, null));
                js3.m(f57VarH);
            } catch (Exception unused) {
                f57VarH = t61.h(str, null, com.bumptech.glide.a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
            }
            ((f57) ((f57) f57VarH.v(dimensionPixelSize, dimensionPixelSize)).d()).P(this.s.v);
        }
        imageView.setVisibility(i2);
    }

    public final void setImageView(View view) {
        js3.p(view, "view");
        this.s.w.addView(view);
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.t = d04Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setSubtitle(java.lang.String r10) {
        /*
            r9 = this;
            rx2 r0 = r9.s
            ir.mservices.market.views.MyketTextView r0 = r0.x
            if (r10 == 0) goto L27
            boolean r1 = defpackage.f88.n0(r10)
            if (r1 != 0) goto Le
        Lc:
            r2 = r10
            goto L10
        Le:
            r10 = 0
            goto Lc
        L10:
            if (r2 == 0) goto L27
            rx2 r10 = r9.s
            ir.mservices.market.views.MyketTextView r1 = r10.x
            java.lang.String r10 = "subtitle"
            defpackage.js3.o(r1, r10)
            r7 = 28
            r8 = 0
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            ir.mservices.market.views.MyketTextView.setTextFromHtml$default(r1, r2, r3, r4, r5, r6, r7, r8)
            r10 = 0
            goto L29
        L27:
            r10 = 8
        L29:
            r0.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.views.DialogHeaderComponent.setSubtitle(java.lang.String):void");
    }

    public final void setTheme(ThemeData themeData) {
        js3.p(themeData, "theme");
        this.s.y.setTextColor(themeData.m);
        this.s.x.setTextColor(themeData.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTitle(java.lang.String r10) {
        /*
            r9 = this;
            rx2 r0 = r9.s
            ir.mservices.market.views.MyketTextView r0 = r0.y
            if (r10 == 0) goto L27
            boolean r1 = defpackage.f88.n0(r10)
            if (r1 != 0) goto Le
        Lc:
            r2 = r10
            goto L10
        Le:
            r10 = 0
            goto Lc
        L10:
            if (r2 == 0) goto L27
            rx2 r10 = r9.s
            ir.mservices.market.views.MyketTextView r1 = r10.y
            java.lang.String r10 = "title"
            defpackage.js3.o(r1, r10)
            r7 = 28
            r8 = 0
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            ir.mservices.market.views.MyketTextView.setTextFromHtml$default(r1, r2, r3, r4, r5, r6, r7, r8)
            r10 = 0
            goto L29
        L27:
            r10 = 8
        L29:
            r0.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.views.DialogHeaderComponent.setTitle(java.lang.String):void");
    }

    public final boolean t() {
        return this.s.w.getChildCount() > 1 || this.s.v.getVisibility() == 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogHeaderComponent(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final void setImage(Drawable drawable, int i) {
        int i2;
        ImageView imageView = this.s.v;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            int dimensionPixelSize = getResources().getDimensionPixelSize(i);
            ImageView imageView2 = this.s.v;
            Context context = getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            ea7Var.b = sj8.b().l;
            i2 = 0;
            ea7Var.h = 0;
            ea7Var.c(dimensionPixelSize / 2);
            imageView2.setBackground(ea7Var.a());
            this.s.v.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }
}
