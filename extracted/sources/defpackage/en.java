package defpackage;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.view.View;
import android.view.autofill.AutofillId;
import android.window.OnBackInvokedDispatcher;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.ui.recycler.AppTagData;
import ir.mservices.market.app.detail.ui.recycler.b;
import ir.mservices.market.app.detail.ui.recycler.g;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.movie.data.webapi.TagDto;
import ir.mservices.market.pika.common.model.NearbyRepository;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en implements og5, yp2, pm0, fr1, gb8, qq5 {
    public static final en b = new en(15);
    public final /* synthetic */ int a;

    public /* synthetic */ en(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source b(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId c(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // defpackage.qq5
    public Object a() {
        switch (this.a) {
            case 28:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        return ((v72) obj).b().getClass().getSimpleName();
    }

    @Override // defpackage.pm0
    public void cancel() {
    }

    @Override // defpackage.fr1
    public double d(double d) {
        switch (this.a) {
            case 19:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 20:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 21:
                float[] fArr = pv0.a;
                return pv0.b(pv0.c, d);
            case 22:
                float[] fArr2 = pv0.a;
                return pv0.a(pv0.c, d);
            case 23:
                float[] fArr3 = pv0.a;
                return pv0.d(pv0.d, d);
            default:
                float[] fArr4 = pv0.a;
                return pv0.c(pv0.d, d);
        }
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        switch (this.a) {
            case 1:
                AppTagData appTagData = (AppTagData) obj;
                int i = AppDetailFragment.M1;
                js3.p(view, "view");
                js3.p((g) qg5Var, "<unused var>");
                js3.p(appTagData, "recyclerData");
                Context context = view.getContext();
                TagDto tagDto = appTagData.a;
                String action = tagDto.getAction();
                if (action != null) {
                    t61.v(action, "parse(...)", context, NearbyRepository.SERVICE_ID, null);
                }
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("app_detail_tag_" + tagDto.getAnalyticsName());
                clickEventBuilder.a();
                break;
            default:
                AppDownloadData appDownloadData = (AppDownloadData) obj;
                int i2 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((b) qg5Var, "<unused var>");
                js3.p(appDownloadData, "recyclerData");
                sb7.p("AppDetail", "App Incompatible Click", "Packagename: " + appDownloadData + ".packageName");
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("button_incompatible");
                clickEventBuilder2.a();
                break;
        }
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
    }
}
