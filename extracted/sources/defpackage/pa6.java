package defpackage;

import android.view.View;
import com.bumptech.glide.a;
import ir.mservices.market.app.suggest.detail.recycler.PlayScreenshotData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public final class pa6 extends qg5 {
    public final og5 w;
    public j73 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa6(View view, ur4 ur4Var) {
        super(view);
        js3.p(ur4Var, "onClickListener");
        this.w = ur4Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        f57 f57VarH;
        PlayScreenshotData playScreenshotData = (PlayScreenshotData) myketRecyclerData;
        js3.p(playScreenshotData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.screenshot_height);
        view.getLayoutParams().width = -2;
        view.getLayoutParams().height = dimensionPixelSize;
        String thumbnailUrl = playScreenshotData.a.getThumbnailUrl();
        if (thumbnailUrl == null || f88.n0(thumbnailUrl)) {
            lw.g(null, "url is empty", null);
            thumbnailUrl = "empty_url";
        }
        try {
            f57VarH = a.f(view).q(new ne5(thumbnailUrl, null));
            js3.m(f57VarH);
        } catch (Exception unused) {
            f57VarH = t61.h(thumbnailUrl, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
        }
        f57 f57VarW = f57VarH.W(uv1.b());
        f57VarW.Q(new oa6(this, dimensionPixelSize, playScreenshotData), f57VarW);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof j73) {
            this.x = (j73) a79Var;
        } else {
            s7.m("Binding is not compatible!");
            throw null;
        }
    }
}
