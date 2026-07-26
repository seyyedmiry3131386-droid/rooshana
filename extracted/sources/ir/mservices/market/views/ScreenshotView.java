package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.av2;
import defpackage.bp2;
import defpackage.d04;
import defpackage.dp2;
import defpackage.ea7;
import defpackage.f57;
import defpackage.f88;
import defpackage.fo0;
import defpackage.j61;
import defpackage.js3;
import defpackage.k61;
import defpackage.l61;
import defpackage.m61;
import defpackage.n61;
import defpackage.o61;
import defpackage.p61;
import defpackage.pq6;
import defpackage.qc;
import defpackage.sj8;
import defpackage.uv1;
import defpackage.zk8;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotView extends Hilt_ScreenshotView {
    public d04 f;
    public dp2 g;
    public bp2 h;
    public int i;
    public int j;
    public Side k;
    public p61 l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenshotView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public static /* synthetic */ void setStyle$default(ScreenshotView screenshotView, Integer num, Integer num2, Side side, int i, Object obj) {
        if ((i & 1) != 0) {
            num = 0;
        }
        if ((i & 2) != 0) {
            num2 = Integer.valueOf(screenshotView.getResources().getDimensionPixelSize(pq6.default_image_corner_radius));
        }
        if ((i & 4) != 0) {
            side = Side.b;
        }
        screenshotView.setStyle(num, num2, side);
    }

    public final void c(String str, String str2) {
        f57 f57VarV;
        p61 p61Var = this.l;
        av2 av2Var = new av2(p61Var.a, p61Var.b, p61Var.c, p61Var.d);
        f57 f57VarP = zk8.P(this, str2);
        f57 f57Var = (str == null || f88.n0(str) || str.equalsIgnoreCase(str2)) ? null : f57VarP;
        if (f57Var != null && (f57VarV = f57Var.V((f57) ((f57) zk8.P(this, str).W(uv1.b()).J(new fo0(), av2Var)).E(2000))) != null) {
            f57VarP = f57VarV;
        }
        ((f57) f57VarP.J(new fo0(), av2Var)).W(uv1.b()).L(new qc(5, this)).P(this);
    }

    public final void d() {
        p61 o61Var;
        int iOrdinal = this.k.ordinal();
        if (iOrdinal == 0) {
            o61Var = m61.e;
        } else if (iOrdinal == 1) {
            o61Var = new o61(this.j);
        } else if (iOrdinal == 2) {
            o61Var = new k61(this.j);
        } else if (iOrdinal == 3) {
            o61Var = new n61(this.j, getLanguageHelper().f());
        } else if (iOrdinal == 4) {
            o61Var = new l61(this.j, getLanguageHelper().f());
        } else {
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            o61Var = new j61(this.j);
        }
        this.l = o61Var;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = true;
        ea7Var.h = 0;
        ea7Var.b = this.i;
        ea7Var.d = this.l.a;
        ea7Var.b();
        ea7Var.e = this.l.b;
        ea7Var.b();
        ea7Var.f = this.l.d;
        ea7Var.b();
        ea7Var.g = this.l.c;
        ea7Var.b();
        setBackground(ea7Var.a());
        requestLayout();
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.f;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final bp2 getOnError() {
        return this.h;
    }

    public final dp2 getOnLoad() {
        return this.g;
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.f = d04Var;
    }

    public final void setOnError(bp2 bp2Var) {
        this.h = bp2Var;
    }

    public final void setOnLoad(dp2 dp2Var) {
        this.g = dp2Var;
    }

    public final void setSize(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    public final void setStyle(Integer num, Integer num2, Side side) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                iIntValue = sj8.b().p;
            }
            this.i = iIntValue;
        }
        if (num2 != null) {
            this.j = num2.intValue();
        }
        if (side != null) {
            this.k = side;
        }
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenshotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        this.i = sj8.b().p;
        this.j = getResources().getDimensionPixelSize(pq6.default_image_corner_radius);
        this.k = Side.b;
        this.l = m61.e;
        d();
    }

    public /* synthetic */ ScreenshotView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
