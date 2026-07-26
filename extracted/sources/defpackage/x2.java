package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.accompanist.drawablepainter.DrawablePainter;
import io.sentry.b6;
import ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment;
import ir.mservices.market.app.detail.reivews.AppReviewsFragment;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.feedback.FeedbackTransactionFragment;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.gateway.GatewayItemData;
import ir.mservices.market.gateway.b;
import ir.mservices.market.gateway.c;
import ir.mservices.market.gateway.ui.GatewayItemAction;
import ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment;
import ir.myket.player.provider.AudioPlayerActivity;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import kotlin.Pair;
import okhttp3.internal.http2.ErrorCode;
import org.koin.androidx.scope.RetainedScopeActivity;
import org.koin.androidx.scope.ScopeActivity;
import org.koin.androidx.scope.ScopeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x2 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [lq2] */
    /* JADX WARN: Type inference failed for: r3v18, types: [lq2] */
    @Override // defpackage.bp2
    public final Object invoke() {
        int largeMemoryClass;
        final int i = 1;
        int i2 = 2;
        final int i3 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((y2) this.b).a.deleteBuilder().delete());
            case 1:
                return Float.valueOf(((Number) ((a) this.b).d()).floatValue());
            case 2:
                rf0.z((ph) this.b);
                return tx8.a;
            case 3:
                return ((ag8) this.b).K();
            case 4:
                AppBookmarkRecyclerListFragment appBookmarkRecyclerListFragment = (AppBookmarkRecyclerListFragment) this.b;
                int i4 = AppBookmarkRecyclerListFragment.j1;
                return appBookmarkRecyclerListFragment.r0();
            case 5:
                AppDetailRecommendationFragment appDetailRecommendationFragment = (AppDetailRecommendationFragment) this.b;
                int i5 = AppDetailRecommendationFragment.c1;
                return appDetailRecommendationFragment.r0();
            case 6:
                return AppDetailViewModel.appBarRecyclerData_delegate$lambda$0((AppDetailViewModel) this.b);
            case 7:
                AppReviewsFragment appReviewsFragment = (AppReviewsFragment) this.b;
                int i6 = AppReviewsFragment.o1;
                FragmentActivity fragmentActivityF = appReviewsFragment.F();
                if (fragmentActivityF == null) {
                    return null;
                }
                DetailToolbarView detailToolbarView = new DetailToolbarView(fragmentActivityF);
                detailToolbarView.setVisibility(8);
                detailToolbarView.setBackgroundColor(sj8.b().l);
                return detailToolbarView;
            case 8:
                return c26.K((Object[]) this.b);
            case 9:
                AudioPlayerActivity audioPlayerActivity = (AudioPlayerActivity) this.b;
                int i7 = AudioPlayerActivity.K;
                return gu9.t(audioPlayerActivity.getIntent().getExtras());
            case 10:
                return coil3.decode.a.b((coil3.decode.a) this.b);
            case 11:
                return (sy6) this.b;
            case 12:
                CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment = (CompleteReviewRecyclerListFragment) this.b;
                int i8 = CompleteReviewRecyclerListFragment.l1;
                return completeReviewRecyclerListFragment.r0();
            case 13:
                ScopeActivity scopeActivity = (ScopeActivity) this.b;
                mz3 mz3VarX = dy3.x(scopeActivity);
                String strQ = dt2.q(scopeActivity);
                mz3VarX.getClass();
                js3.p(strQ, "scopeId");
                vp7 vp7Var = mz3VarX.c;
                vp7Var.getClass();
                lf7 lf7Var = (lf7) ((ConcurrentHashMap) vp7Var.d).get(strQ);
                return lf7Var == null ? tt3.t(scopeActivity, scopeActivity, qh.a) : lf7Var;
            case 14:
                RetainedScopeActivity retainedScopeActivity = (RetainedScopeActivity) this.b;
                ps0 ps0VarA = g27.a(of7.class);
                u79 u79VarM = retainedScopeActivity.m();
                q79 q79VarH = retainedScopeActivity.h();
                ta5 ta5VarI = retainedScopeActivity.i();
                js3.p(q79VarH, "factory");
                o77 o77Var = new o77(u79VarM, q79VarH, ta5VarI);
                String strB = ps0VarA.b();
                if (strB == null) {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                of7 of7Var = (of7) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                if (of7Var.b == null) {
                    of7Var.b = mz3.c(dy3.x(retainedScopeActivity), dt2.q(retainedScopeActivity), dt2.r(retainedScopeActivity), null, qh.b, 4);
                }
                lf7 lf7Var2 = of7Var.b;
                js3.m(lf7Var2);
                return lf7Var2;
            case 15:
                return br9.B((Pair) this.b);
            case 16:
                return ((do3) this.b).d(":memory:");
            case 17:
                return ((x44) this.b).d();
            case 18:
                return new qh8((Orientation) this.b, 0.0f);
            case 19:
                ((mg8) this.b).close();
                return tx8.a;
            case 20:
                return new ek(i2, (DrawablePainter) this.b);
            case 21:
                c32 c32Var = (c32) this.b;
                if (!c32Var.f) {
                    c32Var.i.invoke();
                }
                return tx8.a;
            case 22:
                FeedbackTransactionFragment feedbackTransactionFragment = (FeedbackTransactionFragment) this.b;
                int i9 = FeedbackTransactionFragment.Z0;
                return feedbackTransactionFragment.r0();
            case 23:
                File file = (File) this.b;
                synchronized (sb2.d) {
                    sb2.c.remove(file.getAbsolutePath());
                }
                return tx8.a;
            case 24:
                return new aj2((v48) this.b);
            case 25:
                ScopeFragment scopeFragment = (ScopeFragment) this.b;
                mz3 mz3VarX2 = dy3.x(scopeFragment);
                String strQ2 = dt2.q(scopeFragment);
                mz3VarX2.getClass();
                js3.p(strQ2, "scopeId");
                vp7 vp7Var2 = mz3VarX2.c;
                vp7Var2.getClass();
                lf7 lf7VarT = (lf7) ((ConcurrentHashMap) vp7Var2.d).get(strQ2);
                if (lf7VarT == null) {
                    lf7VarT = tt3.t(scopeFragment, scopeFragment, qh.c);
                }
                av avVar = lf7VarT.e.a;
                FragmentActivity fragmentActivityF2 = scopeFragment.F();
                rh rhVar = fragmentActivityF2 instanceof rh ? (rh) fragmentActivityF2 : null;
                lf7 lf7VarB = rhVar != null ? rhVar.b() : null;
                if (lf7VarB != null) {
                    avVar.t("Link to parent activity scope: '" + lf7VarB.b + '\'');
                    lf7[] lf7VarArr = {lf7VarB};
                    if (lf7VarT.c) {
                        throw new IllegalStateException("Can't add scope link to a root scope");
                    }
                    lf7VarT.f.addAll(0, ew.X0(lf7VarArr));
                } else {
                    avVar.t("Fragment '" + scopeFragment + "' can't be linked to parent activity scope. No Parent Activity Scope found.");
                }
                return lf7VarT;
            case 26:
                qo2 qo2Var = (qo2) this.b;
                Context context = qo2Var.a;
                String str = qo2Var.b;
                ca7 ca7Var = new ca7(23, (boolean) (objArr == true ? 1 : 0));
                ca7Var.b = null;
                androidx.sqlite.db.framework.a aVar = new androidx.sqlite.db.framework.a(context, str, ca7Var, qo2Var.c);
                aVar.setWriteAheadLoggingEnabled(qo2Var.e);
                return aVar;
            case 27:
                final GatewayBottomDialogFragment gatewayBottomDialogFragment = (GatewayBottomDialogFragment) this.b;
                rq2 rq2Var = new rq2(((Number) gatewayBottomDialogFragment.W0().A.a.getValue()).intValue());
                rq2Var.l = new og5() { // from class: lq2
                    @Override // defpackage.og5
                    public final void m(View view, qg5 qg5Var, Object obj) {
                        int i10 = i3;
                        GatewayBottomDialogFragment gatewayBottomDialogFragment2 = gatewayBottomDialogFragment;
                        switch (i10) {
                            case 0:
                                GatewayItemData gatewayItemData = (GatewayItemData) obj;
                                js3.p(view, "<unused var>");
                                js3.p((b) qg5Var, "<unused var>");
                                js3.p(gatewayItemData, "recyclerData");
                                gatewayBottomDialogFragment2.W0().r(new GatewayItemAction.SelectAction(gatewayItemData.a));
                                break;
                            default:
                                GatewayItemData gatewayItemData2 = (GatewayItemData) obj;
                                js3.p(view, "<unused var>");
                                js3.p((c) qg5Var, "<unused var>");
                                js3.p(gatewayItemData2, "recyclerData");
                                gatewayBottomDialogFragment2.W0().r(new GatewayItemAction.SelectAction(gatewayItemData2.a));
                                break;
                        }
                    }
                };
                rq2Var.m = new og5() { // from class: lq2
                    @Override // defpackage.og5
                    public final void m(View view, qg5 qg5Var, Object obj) {
                        int i10 = i;
                        GatewayBottomDialogFragment gatewayBottomDialogFragment2 = gatewayBottomDialogFragment;
                        switch (i10) {
                            case 0:
                                GatewayItemData gatewayItemData = (GatewayItemData) obj;
                                js3.p(view, "<unused var>");
                                js3.p((b) qg5Var, "<unused var>");
                                js3.p(gatewayItemData, "recyclerData");
                                gatewayBottomDialogFragment2.W0().r(new GatewayItemAction.SelectAction(gatewayItemData.a));
                                break;
                            default:
                                GatewayItemData gatewayItemData2 = (GatewayItemData) obj;
                                js3.p(view, "<unused var>");
                                js3.p((c) qg5Var, "<unused var>");
                                js3.p(gatewayItemData2, "recyclerData");
                                gatewayBottomDialogFragment2.W0().r(new GatewayItemAction.SelectAction(gatewayItemData2.a));
                                break;
                        }
                    }
                };
                return rq2Var;
            case 28:
                ae3 ae3Var = (ae3) this.b;
                ae3Var.getClass();
                try {
                    ae3Var.w.y(2, 0, false);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.d;
                    ae3Var.b(errorCode, errorCode, e);
                }
                return tx8.a;
            default:
                Context context2 = (Context) ((on) this.b).a;
                double d = 0.2d;
                try {
                    Object systemService = ContextCompat.getSystemService(context2, ActivityManager.class);
                    js3.m(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                dc0 dc0Var = new dc0(11, (byte) 0);
                try {
                    Object systemService2 = ContextCompat.getSystemService(context2, ActivityManager.class);
                    js3.m(systemService2);
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                return new dw6(new fi1((long) (d * ((long) largeMemoryClass) * b6.MAX_EVENT_SIZE_BYTES), dc0Var), dc0Var);
        }
    }
}
