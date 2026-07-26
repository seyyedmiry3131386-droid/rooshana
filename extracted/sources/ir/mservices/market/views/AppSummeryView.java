package ir.mservices.market.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.sj8;
import defpackage.ut;
import defpackage.uy6;

/* JADX INFO: loaded from: classes3.dex */
public final class AppSummeryView extends ConstraintLayout {
    public final ut q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSummeryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = ut.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ut utVar = (ut) a79.f0(layoutInflaterFrom, js6.app_summery_view, this, true, null);
        js3.o(utVar, "inflate(...)");
        this.q = utVar;
        uy6.m(sj8.b().O.c, this);
    }

    public final void setBottomText(String str) {
        this.q.v.setText(str);
    }

    public final void setFullImage(Drawable drawable) {
        js3.p(drawable, "fullImage");
        ImageView imageView = this.q.w;
        imageView.setVisibility(0);
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().m, PorterDuff.Mode.SRC_ATOP));
        imageView.setImageDrawable(drawableMutate);
    }

    public final void setTopImage(Drawable drawable) {
        js3.p(drawable, "topImage");
        ImageView imageView = this.q.x;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable.mutate());
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(sj8.b().m, PorterDuff.Mode.SRC_ATOP));
        }
    }

    public final void setTopText(String str) {
        this.q.y.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppSummeryView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
