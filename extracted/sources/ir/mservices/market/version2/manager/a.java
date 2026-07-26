package ir.mservices.market.version2.manager;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import defpackage.b56;
import defpackage.b7;
import defpackage.br9;
import defpackage.dp3;
import defpackage.ec9;
import defpackage.f88;
import defpackage.hh2;
import defpackage.ii;
import defpackage.js3;
import defpackage.lu7;
import defpackage.lw;
import defpackage.p40;
import defpackage.ps1;
import defpackage.t32;
import defpackage.wl2;
import defpackage.wq2;
import defpackage.wt;
import defpackage.xq;
import defpackage.yq;
import defpackage.zk8;
import defpackage.zq;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.fragments.dialog.AppPaymentDialogFragment;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Context a;
    public final ps1 b;
    public final wt c;
    public final dp3 d;
    public final lu7 e;
    public final ir.mservices.market.version2.manager.install.a f;
    public final b56 g;
    public final ec9 h;

    public a(Context context, ps1 ps1Var, wt wtVar, dp3 dp3Var, lu7 lu7Var, ir.mservices.market.version2.manager.install.a aVar, b56 b56Var, ec9 ec9Var, t32 t32Var) {
        js3.p(ps1Var, "downloadManager");
        js3.p(wtVar, "appUpdateRepository");
        js3.p(dp3Var, "installManager");
        js3.p(lu7Var, "sharedPreferencesProxy");
        js3.p(aVar, "installQueue");
        js3.p(b56Var, "permissionFactory");
        js3.p(ec9Var, "vpnUtils");
        js3.p(t32Var, "eventBus");
        this.a = context;
        this.b = ps1Var;
        this.c = wtVar;
        this.d = dp3Var;
        this.e = lu7Var;
        this.f = aVar;
        this.g = b56Var;
        this.h = ec9Var;
        t32Var.l(this, false);
    }

    public static void e(String str, String str2) {
        t32 t32VarB = t32.b();
        yq yqVar = new yq();
        yqVar.a = str;
        yqVar.b = str2;
        t32VarB.g(yqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.fragment.app.FragmentActivity r7, java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ir.mservices.market.version2.manager.AppManager$downloadApp$1
            if (r0 == 0) goto L13
            r0 = r9
            ir.mservices.market.version2.manager.AppManager$downloadApp$1 r0 = (ir.mservices.market.version2.manager.AppManager$downloadApp$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ir.mservices.market.version2.manager.AppManager$downloadApp$1 r0 = new ir.mservices.market.version2.manager.AppManager$downloadApp$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r7 = r0.c
            java.util.Iterator r8 = r0.b
            androidx.fragment.app.FragmentActivity r2 = r0.a
            kotlin.b.b(r9)
            r9 = r7
            r7 = r2
            goto L42
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.b.b(r9)
            r6.f()
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
        L42:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r8.next()
            ir.mservices.market.version2.download.DownloadDataModel r2 = (ir.mservices.market.version2.download.DownloadDataModel) r2
            ir.mservices.market.version2.manager.AppManager$StartFlowResult r2 = r6.h(r7, r2)
            ir.mservices.market.version2.manager.AppManager$StartFlowResult r4 = ir.mservices.market.version2.manager.AppManager$StartFlowResult.d
            if (r2 != r4) goto L57
            goto L68
        L57:
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.f = r3
            r4 = 10
            java.lang.Object r2 = kotlinx.coroutines.a.e(r4, r0)
            if (r2 != r1) goto L42
            return r1
        L68:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.a.a(androidx.fragment.app.FragmentActivity, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(FragmentActivity fragmentActivity, DownloadDataModel downloadDataModel, boolean z) {
        js3.p(downloadDataModel, "downloadDataModel");
        if (z) {
            g(fragmentActivity, br9.E(downloadDataModel));
            return;
        }
        f();
        if (this.e.b(lu7.A0, false) && this.h.a()) {
            t32.b().g(new zq(downloadDataModel));
        } else {
            g(fragmentActivity, br9.E(downloadDataModel));
        }
    }

    public final AppDownloadFlowStatus c(AppDownloadInfo appDownloadInfo) {
        return d(appDownloadInfo.getPackageName(), appDownloadInfo.getVersionCode(), false, appDownloadInfo.getForceUpdateDto());
    }

    public final AppDownloadFlowStatus d(String str, int i, boolean z, ForceUpdateDto forceUpdateDto) {
        js3.p(str, "packageName");
        if (z) {
            return AppDownloadFlowStatus.a;
        }
        ir.mservices.market.version2.manager.install.a aVar = this.f;
        aVar.getClass();
        if (aVar.f.containsKey(str)) {
            return AppDownloadFlowStatus.f;
        }
        dp3 dp3Var = this.d;
        Integer numP = dp3Var.p(str);
        boolean z2 = forceUpdateDto != null && js3.i(dp3Var.d(str, i, Long.valueOf(forceUpdateDto.getFileLength())), Boolean.TRUE);
        if (numP != null && (numP.intValue() > i || (numP.intValue() == i && !z2))) {
            return AppDownloadFlowStatus.g;
        }
        Integer numValueOf = Integer.valueOf(i);
        ps1 ps1Var = this.b;
        ps1Var.getClass();
        lw.c(str, null);
        AppDownloadInfo appDownloadInfoI = ps1Var.i(str, numValueOf);
        int status = appDownloadInfoI == null ? 190 : appDownloadInfoI.getStatus();
        boolean zD = ((AppUpdateRepositoryImpl) this.c).d(i, str);
        if (status == 100 || status == 110) {
            return AppDownloadFlowStatus.d;
        }
        AppDownloadFlowStatus appDownloadFlowStatus = AppDownloadFlowStatus.b;
        if (status != 120 && status != 130) {
            if (status == 140) {
                return AppDownloadFlowStatus.e;
            }
            if (status != 150 && status != 190) {
                lw.g(null, null, null);
                return appDownloadFlowStatus;
            }
        }
        return (zD || z2) ? AppDownloadFlowStatus.c : appDownloadFlowStatus;
    }

    public final void f() {
        Handler handler;
        lu7 lu7Var = this.e;
        String str = lu7.j;
        this.e.g(lu7Var.c(-1, str) + 1, str);
        lu7 lu7Var2 = this.e;
        Context context = this.a;
        if (!dp3.c(context)) {
            lu7Var2.g(1, str);
            return;
        }
        int i = lu7Var2.e(str).getInt(str, -1);
        if (ir.mservices.market.core.notification.a.d(context, "download") && ((long) i) % 2 == 0) {
            b7 b7Var = new b7(4, this);
            synchronized (zk8.class) {
                handler = zk8.a;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    zk8.a = handler;
                }
            }
            lw.f(null, null, handler.postDelayed(b7Var, 1500L));
        }
    }

    public final void g(FragmentActivity fragmentActivity, ArrayList arrayList) {
        Handler handler;
        if (arrayList.isEmpty()) {
            return;
        }
        DownloadDataModel downloadDataModel = (DownloadDataModel) arrayList.get(0);
        arrayList.remove(downloadDataModel);
        h(fragmentActivity, downloadDataModel);
        ii iiVar = new ii(this, fragmentActivity, arrayList, 1);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        lw.f(null, null, handler.postDelayed(iiVar, 10L));
    }

    public final AppManager$StartFlowResult h(FragmentActivity fragmentActivity, DownloadDataModel downloadDataModel) {
        long j = downloadDataModel.j;
        String str = downloadDataModel.a;
        ps1 ps1Var = this.b;
        AppDownloadInfo appDownloadInfoI = ps1Var.i(str, null);
        if (!wq2.l(j, appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
            if (fragmentActivity == null) {
                ps1Var.f(downloadDataModel);
                return AppManager$StartFlowResult.b;
            }
            e(downloadDataModel.g, downloadDataModel.h);
            return AppManager$StartFlowResult.d;
        }
        if (downloadDataModel.m) {
            ps1Var.f(downloadDataModel);
            return AppManager$StartFlowResult.b;
        }
        if (fragmentActivity == null) {
            return AppManager$StartFlowResult.a;
        }
        lw.d("startDownloadFlow() with null activity, this state is not valid!", null, fragmentActivity);
        androidx.fragment.app.d dVarG = fragmentActivity.L().G("AppPayment");
        if (dVarG != null) {
            ((AppPaymentDialogFragment) dVarG).G0(downloadDataModel, false);
        } else {
            AppPaymentDialogFragment appPaymentDialogFragment = new AppPaymentDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("download_data_model", downloadDataModel);
            appPaymentDialogFragment.u0(bundle);
            try {
                wl2 wl2VarL = fragmentActivity.L();
                wl2VarL.getClass();
                p40 p40Var = new p40(wl2VarL);
                p40Var.h(0, appPaymentDialogFragment, "AppPayment", 1);
                p40Var.f(false, true);
            } catch (Exception unused) {
            }
        }
        return AppManager$StartFlowResult.c;
    }

    public final void onEvent(xq xqVar) {
        js3.p(xqVar, "successfulFinish");
        ResultDTO resultDTO = xqVar.a;
        DownloadDataModel downloadDataModel = xqVar.d;
        lw.d(null, null, downloadDataModel);
        String str = downloadDataModel.g;
        String str2 = downloadDataModel.a;
        ps1 ps1Var = this.b;
        if (ps1Var.l(str2) == 190) {
            String translatedMessage = resultDTO.getTranslatedMessage();
            if (translatedMessage == null || f88.n0(translatedMessage)) {
                lw.g(null, null, null);
            } else {
                hh2 hh2Var = new hh2(this.a, resultDTO.getTranslatedMessage());
                hh2Var.G();
                hh2.H(hh2Var);
            }
        }
        ps1Var.f(downloadDataModel);
    }
}
