package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ir.mservices.market.appUsage.recycler.StorageUsageFixedHeaderData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class j68 extends qg5 {
    public final LayerDrawable A;
    public final lw8 B;
    public final View w;
    public final ru x;
    public h68 y;
    public final GradientDrawable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j68(View view, ru ruVar) {
        super(view);
        js3.p(view, "view");
        this.w = view;
        this.x = ruVar;
        int i = sj8.b().v;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(view.getResources().getDimension(pq6.space_8));
        gradientDrawable.setColor(i);
        this.z = gradientDrawable;
        int i2 = sj8.b().c;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(view.getResources().getDimension(pq6.space_8));
        gradientDrawable2.setColor(i2);
        ScaleDrawable scaleDrawable = new ScaleDrawable(gradientDrawable2, 3, 1.0f, 0.0f);
        scaleDrawable.setLevel(10000);
        this.A = new LayerDrawable(new ScaleDrawable[]{scaleDrawable});
        this.B = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof h68) {
            this.y = (h68) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final h68 x() {
        h68 h68Var = this.y;
        if (h68Var != null) {
            return h68Var;
        }
        js3.V("binding");
        throw null;
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void t(StorageUsageFixedHeaderData storageUsageFixedHeaderData) {
        Drawable drawable;
        js3.p(storageUsageFixedHeaderData, "data");
        f68 f68Var = storageUsageFixedHeaderData.a;
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_sort;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_12);
        drawableMutate.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        MyketTextView myketTextView = x().A;
        myketTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
        myketTextView.setText(view.getResources().getString(storageUsageFixedHeaderData.b.a));
        MyketTextView myketTextView2 = x().v;
        lw8 lw8Var = this.B;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        Resources resources2 = view.getResources();
        int i2 = rs6.apps_count;
        int i3 = f68Var.c;
        long j = f68Var.d;
        myketTextView2.setText(lw8.e(lw8Var, resources2.getString(i2, String.valueOf(i3))));
        myketTextView2.setVisibility(f68Var.c > 0 ? 0 : 8);
        ProgressBar progressBar = x().x;
        progressBar.setBackground(this.z);
        progressBar.setProgressDrawable(this.A);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(dimensionPixelSize2);
        marginLayoutParams.setMarginEnd(dimensionPixelSize2);
        ProgressBar progressBar2 = x().x;
        long j2 = f68Var.a;
        int i4 = (int) ((((long) 100) * j) / j2);
        if (i4 == 0) {
            i4 = 1;
        }
        progressBar2.setProgress(i4);
        MyketTextView myketTextView3 = x().C;
        Resources resources3 = view.getResources();
        int i5 = rs6.used_storage_text;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        String str = k68.e;
        Resources resources4 = view.getResources();
        js3.o(resources4, "getResources(...)");
        String strE = lw8.e(lw8Var, a77.e(resources4, j));
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        Resources resources5 = view.getResources();
        js3.o(resources5, "getResources(...)");
        myketTextView3.setText(resources3.getString(i5, strE, lw8.e(lw8Var, a77.e(resources5, j2))));
        FrameLayout frameLayout = x().z;
        js3.o(frameLayout, "sortClickable");
        qg5.v(frameLayout, this.x, this, storageUsageFixedHeaderData);
    }
}
