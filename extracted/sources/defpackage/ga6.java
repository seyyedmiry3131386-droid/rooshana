package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import ir.mservices.market.app.detail.data.CategorySummaryDto;
import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import ir.mservices.market.app.suggest.detail.recycler.PlayAppInfoData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.AppSummeryView;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ga6 extends qg5 {
    public final og5 w;
    public final lw8 x;
    public c73 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga6(View view, ia6 ia6Var) {
        super(view);
        js3.p(ia6Var, "onCategoryClickListener");
        this.w = ia6Var;
        this.x = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        String strF;
        Drawable drawable;
        PlayAppInfoData playAppInfoData = (PlayAppInfoData) myketRecyclerData;
        js3.p(playAppInfoData, "data");
        String str = playAppInfoData.a;
        CategorySummaryDto categorySummaryDto = playAppInfoData.e;
        DownloadSummaryDto downloadSummaryDto = playAppInfoData.f;
        AppSummeryView appSummeryView = x().z;
        View view = this.a;
        appSummeryView.setBottomText(view.getResources().getString(rs6.install_app));
        DownloadSummaryDto downloadSummaryDto2 = playAppInfoData.d;
        appSummeryView.setVisibility(downloadSummaryDto2 != null ? 0 : 8);
        appSummeryView.setTopText((downloadSummaryDto2 != null ? downloadSummaryDto2.getCount() : null) + " " + (downloadSummaryDto2 != null ? downloadSummaryDto2.getUnitText() : null));
        AppSummeryView appSummeryView2 = x().B;
        js3.m(appSummeryView2);
        boolean z = downloadSummaryDto != null;
        View view2 = x().x;
        js3.o(view2, "divider2");
        view2.setVisibility(z ? 0 : 8);
        appSummeryView2.setVisibility(z ? 0 : 8);
        appSummeryView2.setBottomText(view.getResources().getString(rs6.size_detail));
        appSummeryView2.setTopText((downloadSummaryDto != null ? downloadSummaryDto.getCount() : null) + " " + (downloadSummaryDto != null ? downloadSummaryDto.getUnitText() : null));
        AppSummeryView appSummeryView3 = x().v;
        js3.m(appSummeryView3);
        boolean z2 = categorySummaryDto != null;
        View view3 = x().y;
        js3.o(view3, "divider3");
        view3.setVisibility(z2 ? 0 : 8);
        appSummeryView3.setVisibility(z2 ? 0 : 8);
        appSummeryView3.setBottomText(view.getResources().getString(rs6.category));
        appSummeryView3.setTopText(categorySummaryDto != null ? categorySummaryDto.getTitle() : null);
        qg5.v(appSummeryView3, this.w, this, playAppInfoData);
        AppSummeryView appSummeryView4 = x().A;
        js3.m(appSummeryView4);
        boolean zN0 = f88.n0(str);
        View view4 = x().w;
        js3.o(view4, "divider1");
        view4.setVisibility(!zN0 ? 0 : 8);
        appSummeryView4.setVisibility(zN0 ? 8 : 0);
        appSummeryView4.setBottomText(str);
        float f = playAppInfoData.b;
        if (f >= 0.5d) {
            lw8 lw8Var = this.x;
            if (lw8Var == null) {
                js3.V("uiUtils");
                throw null;
            }
            strF = lw8Var.f(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
        } else {
            strF = "-";
        }
        appSummeryView4.setTopText(strF);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_star_fill;
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
        appSummeryView4.setTopImage(drawable);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof c73) {
            this.y = (c73) a79Var;
        } else {
            lw.g(null, "binding is not incompatible", null);
        }
    }

    public final c73 x() {
        c73 c73Var = this.y;
        if (c73Var != null) {
            return c73Var;
        }
        js3.V("binding");
        throw null;
    }
}
