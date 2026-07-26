package defpackage;

import android.view.View;
import androidx.compose.foundation.gestures.q;
import ir.mservices.market.app.common.recycler.FilteredAppNestedData;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.app.update.UpdateViewModel;
import ir.mservices.market.app.url.UrlViewModel;
import ir.mservices.market.app.url.recycler.AppReviewData;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.model.SubmitCommentRepository$getCommentFlow$$inlined$transform$1;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.filter.a;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nr8 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nr8(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        u79 u79Var;
        switch (this.a) {
            case 0:
                jr8 jr8Var = (jr8) this.b;
                jr8 jr8Var2 = (jr8) this.c;
                jr8Var.j.add(jr8Var2);
                return new qf(jr8Var, jr8Var2, 8);
            case 1:
                return new qf((jr8) this.b, (zq8) this.c, 9);
            case 2:
                jr8 jr8Var3 = (jr8) this.b;
                fr8 fr8Var = (fr8) this.c;
                jr8Var3.i.add(fr8Var);
                return new qf(jr8Var3, fr8Var, 10);
            case 3:
                rn6 rn6Var = (rn6) this.b;
                nv8 nv8Var = (nv8) this.c;
                qv8 qv8Var = (qv8) obj;
                synchronized (((rl3) rn6Var.b)) {
                    try {
                        if (qv8Var.b()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return tx8.a;
            case 4:
                q qVar = (q) this.b;
                dp2 dp2Var = (dp2) this.c;
                ((Long) obj).longValue();
                float f = qVar.e;
                qVar.e = 0.0f;
                dp2Var.invoke(Float.valueOf(f));
                return tx8.a;
            case 5:
                return UpdateViewModel.getExtensionApps$lambda$0((ExtensionPointDto) this.b, (UpdateViewModel) this.c, (HomeExtensionAppsDto) obj);
            case 6:
                UrlViewModel urlViewModel = (UrlViewModel) this.b;
                bz6 bz6Var = (bz6) this.c;
                HomeExtensionAppsDto homeExtensionAppsDto = (HomeExtensionAppsDto) obj;
                if (urlViewModel.z.d.equalsIgnoreCase("Apps")) {
                    Filter filterA = bz6Var.b;
                    if (filterA == null) {
                        filterA = a.a(homeExtensionAppsDto.getIgnoreConditions());
                    }
                    bz6Var.b = filterA;
                    List<ApplicationDTO> apps = homeExtensionAppsDto.getApps();
                    arrayList = new ArrayList(wu0.V(apps, 10));
                    for (ApplicationDTO applicationDTO : apps) {
                        yl5 yl5Var = urlViewModel.t;
                        String packageName = applicationDTO.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        arrayList.add(new RecyclerItem(new FilteredAppNestedData(applicationDTO, "", true, yl5Var.a(packageName), urlViewModel.u.b, false, 96, 0)));
                    }
                } else {
                    List<ApplicationDTO> apps2 = homeExtensionAppsDto.getApps();
                    arrayList = new ArrayList(wu0.V(apps2, 10));
                    for (ApplicationDTO applicationDTO2 : apps2) {
                        InCompleteReviewDto inCompleteReviewDto = new InCompleteReviewDto();
                        inCompleteReviewDto.setPackageName(applicationDTO2.getPackageName());
                        inCompleteReviewDto.setTitle(applicationDTO2.getTitle());
                        inCompleteReviewDto.setCategoryName(applicationDTO2.getCategoryName());
                        inCompleteReviewDto.setIconPath(applicationDTO2.getIconPath());
                        long j = is3.p + 1;
                        is3.p = j;
                        String strValueOf = String.valueOf(j);
                        String title = applicationDTO2.getTitle();
                        js3.o(title, "getTitle(...)");
                        String packageName2 = applicationDTO2.getPackageName();
                        js3.o(packageName2, "getPackageName(...)");
                        ir.mservices.market.common.model.a aVar = urlViewModel.v.g;
                        arrayList.add(new RecyclerItem(new AppReviewData(strValueOf, inCompleteReviewDto, title, new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, packageName2, aVar)), new vb7(new SubmitCommentRepository$getCommentFlow$$inlined$transform$1(urlViewModel.w.g.f, null, applicationDTO2.getPackageName())))));
                    }
                }
                return arrayList;
            case 7:
                bp2 bp2Var = (bp2) this.b;
                u79 u79Var2 = (u79) this.c;
                if (((Boolean) bp2Var.invoke()).booleanValue() && (u79Var = (u79) z17.b(u79Var2).b.remove(obj)) != null) {
                    u79Var.a();
                }
                return tx8.a;
            default:
                rf9 rf9Var = (rf9) this.b;
                View view = (View) this.c;
                rf9Var.a(view);
                return new qf(rf9Var, view, 11);
        }
    }
}
