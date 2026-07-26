package ir.mservices.market.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.b77;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.q39;
import defpackage.rz8;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateRatingView extends ConstraintLayout {
    public final rz8 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRatingView(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = rz8.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        rz8 rz8Var = (rz8) a79.f0(layoutInflaterFrom, js6.update_rate, this, true, null);
        js3.o(rz8Var, "inflate(...)");
        this.q = rz8Var;
        Resources resources = context.getResources();
        js3.o(resources, "getResources(...)");
        int i2 = yq6.ic_edit;
        try {
            drawable = q39.a(resources, i2, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i2, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        rz8Var.w.setStarStyle(sj8.b().c, MyketRatingBar.f, false, getResources().getDimensionPixelSize(pq6.space_2));
        rz8Var.v.setIcon(drawable);
    }

    public final void setData(ApplicationStateDto applicationStateDto) {
        String commentState = applicationStateDto != null ? applicationStateDto.getCommentState() : null;
        ConstraintLayout constraintLayout = this.q.x;
        js3.o(constraintLayout, "reviewContent");
        constraintLayout.setVisibility(js3.i(commentState, ApplicationStateDto.STATE_NO_COMMENT) ? 0 : 8);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.q.x.setPadding(i, i2, i3, i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpdateRatingView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
