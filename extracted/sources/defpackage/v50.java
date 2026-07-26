package defpackage;

import android.view.View;
import ir.mservices.market.app.search.result.ui.recycler.BaseSearchScreenshotData;
import ir.mservices.market.app.search.result.ui.recycler.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v50 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ BaseSearchScreenshotData c;

    public /* synthetic */ v50(b bVar, BaseSearchScreenshotData baseSearchScreenshotData, int i) {
        this.a = i;
        this.b = bVar;
        this.c = baseSearchScreenshotData;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                b bVar = this.b;
                og5 og5Var = bVar.x;
                View view = bVar.a;
                js3.o(view, "itemView");
                og5Var.m(view, bVar, this.c);
                break;
            default:
                dw1.y("search_scr_video");
                k50 k50Var = this.b.H;
                if (k50Var == null) {
                    js3.V("barnamehAnalytics");
                    throw null;
                }
                String packageName = this.c.c.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                k50Var.a.b("detail_video", "package_name", packageName);
                break;
                break;
        }
        return tx8.a;
    }
}
