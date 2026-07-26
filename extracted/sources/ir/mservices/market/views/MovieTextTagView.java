package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.x75;
import defpackage.y75;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieTextTagView extends Hilt_MovieTextTagView {
    public final x75 c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieTextTagView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final void setDividerVisibility(boolean z) {
        MyketTextView myketTextView = this.c.x;
        js3.o(myketTextView, "textDivider");
        myketTextView.setVisibility(z ? 0 : 8);
    }

    public final void setText(String str) {
        this.c.w.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieTextTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    public /* synthetic */ MovieTextTagView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieTextTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((y75) e()).getClass();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = x75.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        x75 x75Var = (x75) fa1.c(layoutInflaterFrom, js6.movie_text_tag_view, this, true);
        js3.o(x75Var, "inflate(...)");
        this.c = x75Var;
    }
}
