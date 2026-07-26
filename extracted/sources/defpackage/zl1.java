package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.securityShield.recycler.DeviceScanTipData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zl1 extends qg5 {
    public final og5 w;
    public c83 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl1(View view, el7 el7Var) {
        super(view);
        js3.p(el7Var, "onMoreClickListener");
        this.w = el7Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        DeviceScanTipData deviceScanTipData = (DeviceScanTipData) myketRecyclerData;
        js3.p(deviceScanTipData, "data");
        c83 c83Var = this.x;
        if (c83Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = c83Var.y;
        View view = this.a;
        myketTextView.setText(view.getResources().getString(rs6.device_scan_desc));
        c83 c83Var2 = this.x;
        if (c83Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = c83Var2.w;
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), yq6.ic_empty_info);
        int i = sj8.b().n;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
        imageView.setImageDrawable(drawable);
        c83 c83Var3 = this.x;
        if (c83Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = c83Var3.x;
        js3.o(myketTextView2, "moreInfo");
        qg5.v(myketTextView2, this.w, this, deviceScanTipData);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_12);
        c83 c83Var4 = this.x;
        if (c83Var4 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = c83Var4.v;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.e = dimensionPixelSize;
        ea7Var.b();
        ea7Var.g = dimensionPixelSize;
        ea7Var.b();
        ea7Var.f = dimensionPixelSize;
        ea7Var.b();
        ea7Var.d = dimensionPixelSize;
        ea7Var.b();
        ea7Var.i = sj8.b().t;
        ea7Var.b = sj8.b().t;
        constraintLayout.setBackground(ea7Var.a());
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof c83) {
            this.x = (c83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
