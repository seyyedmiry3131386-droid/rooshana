package ir.mservices.market.app.detail.ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.FragmentActivity;
import defpackage.dp2;
import defpackage.dp3;
import defpackage.f88;
import defpackage.g51;
import defpackage.hp;
import defpackage.js3;
import defpackage.js8;
import defpackage.m91;
import defpackage.o4;
import defpackage.qp2;
import defpackage.rq4;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$3", f = "AppDetailFragment.kt", l = {415}, m = "invokeSuspend", v = 1)
final class AppDetailFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppDetailFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$3$1", f = "AppDetailFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ AppDetailFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppDetailFragment appDetailFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = appDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ApplicationFullDto) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zQ;
            ApplicationFullDto applicationFullDto = (ApplicationFullDto) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            AppDetailFragment appDetailFragment = this.b;
            MenuItem menuItem = appDetailFragment.C1;
            if (menuItem != null) {
                menuItem.setVisible(appDetailFragment.Z1(applicationFullDto.getPackageName()));
            }
            MenuItem menuItem2 = appDetailFragment.A1;
            if (menuItem2 != null) {
                rq4.O(menuItem2, true, appDetailFragment.z1, appDetailFragment.y1);
            }
            MenuItem menuItem3 = appDetailFragment.B1;
            if (menuItem3 != null) {
                rq4.O(menuItem3, true, appDetailFragment.z1, appDetailFragment.y1);
            }
            MenuItem menuItem4 = appDetailFragment.A1;
            if (menuItem4 != null) {
                menuItem4.setEnabled(true);
            }
            appDetailFragment.l2(applicationFullDto.isBookmarked());
            DetailToolbarView detailToolbarView = appDetailFragment.F1;
            if (detailToolbarView != null) {
                detailToolbarView.setToolbarData(new ToolbarData(applicationFullDto, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()));
                detailToolbarView.setDownloadRef("detail");
                detailToolbarView.setAnalyticsName("toolbar");
            }
            FragmentActivity fragmentActivityF = appDetailFragment.F();
            LaunchContentActivity launchContentActivity = fragmentActivityF instanceof LaunchContentActivity ? (LaunchContentActivity) fragmentActivityF : null;
            if (launchContentActivity != null) {
                launchContentActivity.v0(true, appDetailFragment, Boolean.TRUE);
            }
            AppDownloadFlowStatus appDownloadFlowStatusD = appDetailFragment.S1().d(applicationFullDto.getPackageName(), applicationFullDto.getVersion().getCode(), applicationFullDto.getVersion().isIncompatible(), applicationFullDto.getForceUpdate());
            hp hpVar = appDetailFragment.u1;
            if (hpVar == null) {
                js3.V("navArgs");
                throw null;
            }
            String str = hpVar.l;
            if (str != null && !f88.n0(str) && appDownloadFlowStatusD == AppDownloadFlowStatus.g) {
                FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                hp hpVar2 = appDetailFragment.u1;
                if (hpVar2 == null) {
                    js3.V("navArgs");
                    throw null;
                }
                String str2 = hpVar2.l;
                String packageName = applicationFullDto.getPackageName();
                if (str2 != null) {
                    Uri uri = Uri.parse(str2);
                    js3.o(uri, "parse(...)");
                    zQ = js8.q(fragmentActivityF2, uri, packageName, null);
                } else {
                    zQ = false;
                }
                if (!zQ) {
                    dp3.M(applicationFullDto.getPackageName());
                }
                Bundle bundle = appDetailFragment.g;
                if (bundle != null) {
                    bundle.putString("deepLink", null);
                }
                Bundle bundle2 = appDetailFragment.g;
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                appDetailFragment.u1 = m91.m(bundle2);
            }
            hp hpVar3 = appDetailFragment.u1;
            if (hpVar3 == null) {
                js3.V("navArgs");
                throw null;
            }
            if (hpVar3.b) {
                appDetailFragment.j2();
                Bundle bundle3 = appDetailFragment.g;
                if (bundle3 != null) {
                    bundle3.putBoolean("isStartDownload", false);
                }
                Bundle bundle4 = appDetailFragment.g;
                if (bundle4 == null) {
                    bundle4 = new Bundle();
                }
                appDetailFragment.u1 = m91.m(bundle4);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailFragment$onViewCreated$3(AppDetailFragment appDetailFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppDetailFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppDetailFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = AppDetailFragment.M1;
            AppDetailFragment appDetailFragment = this.b;
            o4 o4Var = new o4(appDetailFragment.R1().Q, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(appDetailFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
