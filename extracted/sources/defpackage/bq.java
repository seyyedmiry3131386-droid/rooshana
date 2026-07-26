package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bq extends qg5 {
    public final int w;
    public og5 x;
    public pm y;

    public bq(int i, View view) {
        super(view);
        this.w = i;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppNestedData appNestedData = (AppNestedData) myketRecyclerData;
        js3.p(appNestedData, "applicationData");
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.w;
        layoutParams.width = i;
        int dimensionPixelSize = i - view.getResources().getDimensionPixelSize(pq6.item_space);
        int iE = t61.e(view.getResources(), pq6.horizontal_space_inner, 2, dimensionPixelSize);
        pm pmVar = this.y;
        if (pmVar == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = pmVar.x;
        MyketTextView myketTextView = pmVar.y;
        myketTextView.getLayoutParams().width = dimensionPixelSize;
        myketTextView.setLines(appNestedData.g);
        ApplicationDTO applicationDTO = appNestedData.a;
        myketTextView.setText(applicationDTO != null ? applicationDTO.getTitle() : null);
        myketTextView.setTextColor(sj8.b().m);
        myketTextView.setPaddingRelative(view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner), 0, view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner), view.getResources().getDimensionPixelSize(pq6.space_4));
        ViewGroup.LayoutParams layoutParams2 = appIconView.getLayoutParams();
        layoutParams2.width = iE;
        layoutParams2.height = iE;
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, applicationDTO != null ? applicationDTO.getIconPath() : null, null, false, 6, null);
        String strO = dw1.o("image_", applicationDTO != null ? applicationDTO.getPackageName() : null, "_", appNestedData.b);
        WeakHashMap weakHashMap = q69.a;
        h69.n(appIconView, strO);
        FrameLayout frameLayout = pmVar.v;
        js3.o(frameLayout, "clickableLayout");
        qg5.v(frameLayout, this.x, this, appNestedData);
        if (appNestedData.h) {
            return;
        }
        appIconView.setAlpha(0.2f);
        appIconView.animate().alpha(1.0f).setDuration(350L).start();
        myketTextView.setAlpha(0.2f);
        myketTextView.animate().alpha(1.0f).setDuration(350L).start();
        appNestedData.h = true;
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof pm) {
            this.y = (pm) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final ImageView x() {
        pm pmVar = this.y;
        if (pmVar == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = pmVar.x;
        js3.o(appIconView, "icon");
        return appIconView;
    }
}
