package ir.mservices.market.screenshots;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.g;
import defpackage.bi5;
import defpackage.bv1;
import defpackage.d04;
import defpackage.de;
import defpackage.dg7;
import defpackage.dw1;
import defpackage.ea7;
import defpackage.ew;
import defpackage.fa1;
import defpackage.g27;
import defpackage.gv;
import defpackage.jr0;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw;
import defpackage.pq6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.uo2;
import defpackage.yq6;
import ir.mservices.market.screenshots.DraggableScreenshotFragment;
import ir.mservices.market.views.ExtendedViewPager;
import java.util.ArrayList;
import java.util.Collections;
import me.relex.circleindicator.CircleIndicator;

/* JADX INFO: loaded from: classes3.dex */
public final class DraggableScreenshotFragment extends Hilt_DraggableScreenshotFragment {
    public d04 a1;
    public uo2 b1;
    public dg7 c1;
    public final bi5 d1 = new bi5(g27.a(bv1.class), new de(16, this));

    public static void P0(int i, dg7 dg7Var, ImageView imageView, ImageView imageView2) {
        imageView.setVisibility(i == (dg7Var != null ? dg7Var.h.size() : 0) + (-1) ? 8 : 0);
        imageView2.setVisibility(i == 0 ? 8 : 0);
    }

    @Override // defpackage.z80
    public final String C() {
        String string = K().getString(rs6.page_name_full_screenshots);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDraggableFragment
    public final String I0() {
        String str = O0().b;
        if (str.length() > 0) {
            return dw1.n("FullImage for: ", str);
        }
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDraggableFragment
    public final int[] J0() {
        return O0().e;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDraggableFragment
    public final String K0() {
        return O0().c;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDraggableFragment
    public final ConstraintLayout L0(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = uo2.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        uo2 uo2Var = (uo2) fa1.c(layoutInflaterFrom, js6.full_screenshot, null, false);
        this.b1 = uo2Var;
        js3.m(uo2Var);
        ConstraintLayout constraintLayout = uo2Var.y;
        d04 d04Var = this.a1;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        constraintLayout.setLayoutDirection(d04Var.c());
        if (O0().d.length == 0) {
            lw.g(null, "FullScreenshotDialogFragment lunched with null or zero screenshot field!", null);
            A0(false, false);
        }
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.screenshot_arrow_size);
        ea7 ea7Var = new ea7(context);
        ea7Var.c(dimensionPixelSize / 2);
        ea7Var.h = 0;
        ea7Var.b = sj8.b().J.f;
        int dimensionPixelSize2 = (dimensionPixelSize - K().getDimensionPixelSize(pq6.margin_default_v2_double)) / 2;
        uo2 uo2Var2 = this.b1;
        js3.m(uo2Var2);
        ImageView imageView = uo2Var2.v;
        imageView.setBackground(ea7Var.a());
        imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        imageView.setImageResource(yq6.ic_arrow_left);
        uo2 uo2Var3 = this.b1;
        js3.m(uo2Var3);
        ImageView imageView2 = uo2Var3.w;
        imageView2.setBackground(ea7Var.a());
        imageView2.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        imageView2.setImageResource(yq6.ic_arrow_right);
        int size = O0().a;
        ArrayList arrayListA1 = ew.a1(O0().d);
        d04 d04Var2 = this.a1;
        if (d04Var2 == null) {
            js3.V("languageHelper");
            throw null;
        }
        final int i2 = 1;
        if (d04Var2.f()) {
            size = Math.abs(size - (O0().d.length - 1));
            Collections.reverse(arrayListA1);
        }
        uo2 uo2Var4 = this.b1;
        js3.m(uo2Var4);
        uo2Var4.v.setOnClickListener(new View.OnClickListener(this) { // from class: av1
            public final /* synthetic */ DraggableScreenshotFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        DraggableScreenshotFragment draggableScreenshotFragment = this.b;
                        uo2 uo2Var5 = draggableScreenshotFragment.b1;
                        js3.m(uo2Var5);
                        ExtendedViewPager extendedViewPager = uo2Var5.z;
                        js3.m(draggableScreenshotFragment.b1);
                        extendedViewPager.setCurrentItem(Math.max(r3.z.getCurrentItem() - 1, 0));
                        break;
                    default:
                        DraggableScreenshotFragment draggableScreenshotFragment2 = this.b;
                        uo2 uo2Var6 = draggableScreenshotFragment2.b1;
                        js3.m(uo2Var6);
                        ExtendedViewPager extendedViewPager2 = uo2Var6.z;
                        uo2 uo2Var7 = draggableScreenshotFragment2.b1;
                        js3.m(uo2Var7);
                        extendedViewPager2.setCurrentItem(Math.min(uo2Var7.z.getCurrentItem() + 1, draggableScreenshotFragment2.O0().d.length - 1));
                        break;
                }
            }
        });
        uo2 uo2Var5 = this.b1;
        js3.m(uo2Var5);
        uo2Var5.w.setOnClickListener(new View.OnClickListener(this) { // from class: av1
            public final /* synthetic */ DraggableScreenshotFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        DraggableScreenshotFragment draggableScreenshotFragment = this.b;
                        uo2 uo2Var52 = draggableScreenshotFragment.b1;
                        js3.m(uo2Var52);
                        ExtendedViewPager extendedViewPager = uo2Var52.z;
                        js3.m(draggableScreenshotFragment.b1);
                        extendedViewPager.setCurrentItem(Math.max(r3.z.getCurrentItem() - 1, 0));
                        break;
                    default:
                        DraggableScreenshotFragment draggableScreenshotFragment2 = this.b;
                        uo2 uo2Var6 = draggableScreenshotFragment2.b1;
                        js3.m(uo2Var6);
                        ExtendedViewPager extendedViewPager2 = uo2Var6.z;
                        uo2 uo2Var7 = draggableScreenshotFragment2.b1;
                        js3.m(uo2Var7);
                        extendedViewPager2.setCurrentItem(Math.min(uo2Var7.z.getCurrentItem() + 1, draggableScreenshotFragment2.O0().d.length - 1));
                        break;
                }
            }
        });
        if (O0().d.length <= 1) {
            uo2 uo2Var6 = this.b1;
            js3.m(uo2Var6);
            uo2Var6.x.setVisibility(4);
        }
        g gVarG = G();
        js3.o(gVarG, "getChildFragmentManager(...)");
        this.c1 = new dg7(gVarG, arrayListA1);
        uo2 uo2Var7 = this.b1;
        js3.m(uo2Var7);
        ExtendedViewPager extendedViewPager = uo2Var7.z;
        extendedViewPager.setAdapter(this.c1);
        extendedViewPager.setPageTransformer(true, new gv(13));
        extendedViewPager.setPageMargin(extendedViewPager.getResources().getDimensionPixelOffset(pq6.margin_default_v2_triple));
        extendedViewPager.setCurrentItem(size);
        dg7 dg7Var = this.c1;
        uo2 uo2Var8 = this.b1;
        js3.m(uo2Var8);
        ImageView imageView3 = uo2Var8.w;
        js3.o(imageView3, "arrowRight");
        uo2 uo2Var9 = this.b1;
        js3.m(uo2Var9);
        ImageView imageView4 = uo2Var9.v;
        js3.o(imageView4, "arrowLeft");
        P0(size, dg7Var, imageView3, imageView4);
        uo2 uo2Var10 = this.b1;
        js3.m(uo2Var10);
        CircleIndicator circleIndicator = uo2Var10.x;
        dg7 dg7Var2 = this.c1;
        int size2 = dg7Var2 != null ? dg7Var2.h.size() : 0;
        dg7 dg7Var3 = this.c1;
        d04 d04Var3 = this.a1;
        if (d04Var3 == null) {
            js3.V("languageHelper");
            throw null;
        }
        if (d04Var3.f()) {
            size = ((dg7Var3 != null ? dg7Var3.h.size() : 0) - 1) - size;
        }
        circleIndicator.c(size2, size);
        uo2 uo2Var11 = this.b1;
        js3.m(uo2Var11);
        uo2Var11.z.b(new jr0(i2, this));
        uo2 uo2Var12 = this.b1;
        js3.m(uo2Var12);
        ConstraintLayout constraintLayout2 = uo2Var12.y;
        js3.o(constraintLayout2, "rootLayout");
        return constraintLayout2;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDraggableFragment
    public final void M0(float f) {
        super.M0(f);
        uo2 uo2Var = this.b1;
        js3.m(uo2Var);
        float f2 = 1.0f - ((1.0f - f) * 4);
        uo2Var.v.setAlpha(Math.min(f2, 1.0f));
        uo2 uo2Var2 = this.b1;
        js3.m(uo2Var2);
        uo2Var2.w.setAlpha(Math.min(f2, 1.0f));
        uo2 uo2Var3 = this.b1;
        js3.m(uo2Var3);
        uo2Var3.x.setAlpha(Math.min(f2, 1.0f));
    }

    public final bv1 O0() {
        return (bv1) this.d1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDraggableFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.b1 = null;
    }
}
