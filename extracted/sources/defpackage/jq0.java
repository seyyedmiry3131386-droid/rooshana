package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import ir.mservices.market.app.detail.developer.ui.DeveloperViewModel;
import ir.mservices.market.app.detail.update.InAppUpdateActivityViewModel;
import ir.mservices.market.app.detail.update.InAppUpdateViewModel;
import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.download.DownloadContentViewModel;
import ir.mservices.market.download.app.DownloadViewModel;
import ir.mservices.market.feedback.FeedbackTransactionViewModel;
import ir.mservices.market.feedback.FeedbackViewModel;
import ir.mservices.market.gateway.ui.GatewayListViewModel;
import ir.mservices.market.movie.download.quality.DownloadQualityViewModel;
import ir.mservices.market.movie.ui.ibex.IbexViewModel;
import ir.mservices.market.myAccount.inbox.InboxViewModel;
import ir.mservices.market.myReview.complete.CompleteReviewViewModel;
import ir.mservices.market.myReview.incomplete.InCompleteReviewViewModel;
import ir.mservices.market.myReview.incomplete.model.b;
import ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.serverUrl.downloadserver.a;
import ir.mservices.market.version2.model.BindHistoryModel;
import ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jq0 implements on6 {
    public static fw0 a() {
        return new fw0();
    }

    public static if1 b(t32 t32Var) {
        if1 if1Var = new if1();
        t32Var.l(if1Var, false);
        return if1Var;
    }

    public static fk1 c() {
        return new fk1();
    }

    public static ps1 d(t32 t32Var, qs1 qs1Var, wl5 wl5Var, a aVar, Context context, pr7 pr7Var) {
        return new ps1(t32Var, qs1Var, wl5Var, aVar, context, pr7Var);
    }

    public static fh2 e() {
        return new fh2();
    }

    public static zo3 f() {
        return new zo3();
    }

    public static DeveloperViewModel g(ol1 ol1Var, ir.mservices.market.version2.manager.install.a aVar, yl5 yl5Var, jd7 jd7Var) {
        return new DeveloperViewModel(ol1Var, aVar, yl5Var, jd7Var);
    }

    public static InAppUpdateActivityViewModel h(wt wtVar, ir.mservices.market.app.update.common.modal.a aVar, dp3 dp3Var, on onVar) {
        return new InAppUpdateActivityViewModel(wtVar, aVar, dp3Var, onVar);
    }

    public static InAppUpdateViewModel i(jd7 jd7Var, ir.mservices.market.version2.manager.a aVar, gv gvVar, ps1 ps1Var, dp3 dp3Var, yl5 yl5Var) {
        return new InAppUpdateViewModel(jd7Var, aVar, gvVar, ps1Var, dp3Var, yl5Var);
    }

    public static HomeViewModel j(dv2 dv2Var, yl5 yl5Var, ir.mservices.market.version2.manager.install.a aVar, vp7 vp7Var, hl5 hl5Var, wv8 wv8Var, t15 t15Var, vr2 vr2Var, vr2 vr2Var2, k45 k45Var, ut4 ut4Var) {
        return new HomeViewModel(dv2Var, yl5Var, aVar, vp7Var, hl5Var, wv8Var, t15Var, vr2Var, vr2Var2, k45Var, ut4Var);
    }

    public static DownloadContentViewModel k(jd7 jd7Var, n25 n25Var) {
        return new DownloadContentViewModel(jd7Var, n25Var);
    }

    public static DownloadViewModel l(yl5 yl5Var, ir.mservices.market.download.app.model.a aVar, ps1 ps1Var, ir.mservices.market.version2.manager.install.a aVar2, wv8 wv8Var) {
        return new DownloadViewModel(yl5Var, aVar, ps1Var, aVar2, wv8Var);
    }

    public static FeedbackTransactionViewModel m(ck4 ck4Var) {
        return new FeedbackTransactionViewModel(ck4Var);
    }

    public static FeedbackViewModel n(jd7 jd7Var, qq4 qq4Var, lw8 lw8Var, qu2 qu2Var, c5 c5Var, fw4 fw4Var) {
        return new FeedbackViewModel(jd7Var, qq4Var, lw8Var, qu2Var, c5Var, fw4Var);
    }

    public static GatewayListViewModel o(av avVar, jd7 jd7Var) {
        return new GatewayListViewModel(avVar, jd7Var);
    }

    public static DownloadQualityViewModel p(jd7 jd7Var, n25 n25Var) {
        return new DownloadQualityViewModel(jd7Var, n25Var);
    }

    public static IbexViewModel q(jd7 jd7Var) {
        return new IbexViewModel(jd7Var);
    }

    public static InboxViewModel r(ir.mservices.market.myAccount.inbox.model.a aVar, lw8 lw8Var) {
        return new InboxViewModel(aVar, lw8Var);
    }

    public static CompleteReviewViewModel s(c5 c5Var, vr2 vr2Var, qm5 qm5Var) {
        return new CompleteReviewViewModel(c5Var, vr2Var, qm5Var);
    }

    public static InCompleteReviewViewModel t(c5 c5Var, dx4 dx4Var, vr2 vr2Var, qm5 qm5Var, b bVar) {
        return new InCompleteReviewViewModel(c5Var, dx4Var, vr2Var, qm5Var, bVar);
    }

    public static FontStyleViewModel u(gv gvVar) {
        return new FontStyleViewModel(gvVar);
    }

    public static CheetahViewModel v(vp7 vp7Var, vl8 vl8Var, lw8 lw8Var, jd7 jd7Var) {
        return new CheetahViewModel(vp7Var, vl8Var, lw8Var, jd7Var);
    }

    public static qb0 w(cv cvVar, jb1 jb1Var) {
        cvVar.getClass();
        js3.p(jb1Var, "databaseHelper");
        return new qb0(jb1Var.getDao(BindHistoryModel.class));
    }

    public static xl5 x(fv fvVar, Context context, k25 k25Var, ir.mservices.market.movie.download.core.a aVar, qs1 qs1Var) {
        fvVar.getClass();
        js3.p(k25Var, "preProcess");
        js3.p(aVar, "postProcess");
        js3.p(qs1Var, "downloadOnGoingNotification");
        return new xl5(context, "MovieNeneDatabase", 1, 1, k25Var, aVar, qs1Var, null);
    }

    public static af7 y(cv cvVar, t32 t32Var) {
        cvVar.getClass();
        js3.p(t32Var, "eventBus");
        af7 af7Var = new af7();
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        af7Var.a = w91Var.a.a;
        af7Var.b = (ps1) w91Var.w.get();
        af7Var.c = (pr7) w91Var.s.get();
        af7Var.d = (d04) w91Var.p.get();
        af7Var.e = (ir.mservices.market.version2.manager.a) w91Var.D.get();
        af7Var.f = (AlarmManager) w91Var.d0.get();
        af7Var.g = w91Var.I0();
        af7Var.h = (wt) w91Var.z.get();
        t32Var.l(af7Var, false);
        return af7Var;
    }
}
