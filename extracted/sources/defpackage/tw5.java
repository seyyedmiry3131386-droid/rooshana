package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.streamers.recycler.OtherStreamersMoreData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class tw5 extends qg5 {
    public final og5 w;
    public h43 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw5(View view, f78 f78Var) {
        super(view);
        js3.p(f78Var, "onStreamerMoreClickListener");
        this.w = f78Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        OtherStreamersMoreData otherStreamersMoreData = (OtherStreamersMoreData) myketRecyclerData;
        js3.p(otherStreamersMoreData, "data");
        boolean z = otherStreamersMoreData.a;
        h43 h43Var = this.x;
        if (h43Var == null) {
            js3.V("binding");
            throw null;
        }
        SmallBoldTextButton smallBoldTextButton = h43Var.x;
        smallBoldTextButton.setPrimaryColor(sj8.b().c);
        smallBoldTextButton.setTextColor(sj8.b().c);
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_end;
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
        smallBoldTextButton.setSmallIcon(drawable);
        smallBoldTextButton.setVisibility(!z ? 0 : 8);
        h43 h43Var2 = this.x;
        if (h43Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = h43Var2.w;
        myketTextView.setText(view.getResources().getString(rs6.other_streamers));
        myketTextView.setTextColor(sj8.b().m);
        if (z) {
            return;
        }
        h43 h43Var3 = this.x;
        if (h43Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = h43Var3.v;
        js3.o(constraintLayout, "headerRow");
        qg5.v(constraintLayout, this.w, this, otherStreamersMoreData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof h43) {
            this.x = (h43) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
