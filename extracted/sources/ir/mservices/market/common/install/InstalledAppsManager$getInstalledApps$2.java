package ir.mservices.market.common.install;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import defpackage.dp3;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rp3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.install.InstalledAppsManager$getInstalledApps$2", f = "InstalledAppsManager.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstalledAppsManager$getInstalledApps$2 extends SuspendLambda implements qp2 {
    public final /* synthetic */ a a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsManager$getInstalledApps$2(a aVar, boolean z, boolean z2, g51 g51Var) {
        super(2, g51Var);
        this.a = aVar;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InstalledAppsManager$getInstalledApps$2(this.a, this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstalledAppsManager$getInstalledApps$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        a aVar = this.a;
        dp3 dp3Var = aVar.b;
        List<PackageInfo> installedPackages = aVar.a.getPackageManager().getInstalledPackages(0);
        js3.o(installedPackages, "getInstalledPackages(...)");
        ArrayList arrayList = new ArrayList(wu0.V(installedPackages, 10));
        for (PackageInfo packageInfo : installedPackages) {
            String str = packageInfo.packageName;
            js3.o(str, "packageName");
            arrayList.add(new rp3(str, packageInfo.versionCode, dp3Var.F(packageInfo.packageName), packageInfo.firstInstallTime));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            rp3 rp3Var = (rp3) obj2;
            if (!this.b) {
                String str2 = rp3Var.a;
                dp3Var.getClass();
                ApplicationInfo applicationInfoL = dp3Var.l(dp3.y(str2));
                if (applicationInfoL == null || (applicationInfoL.flags & 129) != 1) {
                }
            }
            if (this.c || !dp3Var.F(rp3Var.a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
