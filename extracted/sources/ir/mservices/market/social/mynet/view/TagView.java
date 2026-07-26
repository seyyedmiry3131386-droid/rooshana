package ir.mservices.market.social.mynet.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.e19;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw8;
import defpackage.sj8;
import defpackage.te8;
import defpackage.u91;
import ir.mservices.market.social.profile.data.TagItem;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class TagView extends Hilt_TagView {
    public final e19 c;
    public lw8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.d = (lw8) ((u91) ((te8) e())).a.E.get();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = e19.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        e19 e19Var = (e19) fa1.c(layoutInflaterFrom, js6.user_info_tag_view, this, true);
        js3.o(e19Var, "inflate(...)");
        this.c = e19Var;
        setGravity(16);
        setLayoutDirection(3);
        setOrientation(0);
    }

    public final lw8 getUiUtils() {
        lw8 lw8Var = this.d;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public final void setData(TagItem tagItem, Integer num) {
        js3.p(tagItem, "data");
        e19 e19Var = this.c;
        MyketTextView myketTextView = e19Var.w;
        ImageView imageView = e19Var.v;
        myketTextView.setText(lw8.e(getUiUtils(), tagItem.getText()));
        if (num != null) {
            imageView.setImageResource(num.intValue());
            imageView.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void setTagSize(float f) {
        this.c.w.setTextSize(0, f);
    }

    public final void setUiUtils(lw8 lw8Var) {
        js3.p(lw8Var, "<set-?>");
        this.d = lw8Var;
    }
}
