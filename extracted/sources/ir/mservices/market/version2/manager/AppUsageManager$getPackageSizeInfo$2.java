package ir.mservices.market.version2.manager;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.core.content.ContextCompat;
import defpackage.cu;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.lg3;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ws;
import java.lang.reflect.Method;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.AppUsageManager$getPackageSizeInfo$2", f = "AppUsageManager.kt", l = {189}, m = "invokeSuspend", v = 1)
final class AppUsageManager$getPackageSizeInfo$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ PackageInfo b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUsageManager$getPackageSizeInfo$2(PackageInfo packageInfo, Context context, g51 g51Var) {
        super(2, g51Var);
        this.b = packageInfo;
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppUsageManager$getPackageSizeInfo$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppUsageManager$getPackageSizeInfo$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StorageStatsManager storageStatsManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        this.a = 1;
        om0 om0Var = new om0(1, ok4.I(this));
        om0Var.v();
        PackageInfo packageInfo = this.b;
        String str = packageInfo.packageName;
        js3.o(str, "packageName");
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.c;
        if (i2 >= 26) {
            try {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                StorageStats storageStatsQueryStatsForUid = null;
                if (applicationInfo != null && (storageStatsManager = (StorageStatsManager) ContextCompat.getSystemService(context, StorageStatsManager.class)) != null) {
                    storageStatsQueryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
                }
                if (storageStatsQueryStatsForUid != null) {
                    om0Var.resumeWith(new ws(storageStatsQueryStatsForUid.getAppBytes(), storageStatsQueryStatsForUid.getCacheBytes(), storageStatsQueryStatsForUid.getDataBytes()));
                } else {
                    om0Var.resumeWith(ws.e);
                }
            } catch (Exception e) {
                e.getMessage();
                om0Var.resumeWith(ws.e);
            }
        } else {
            try {
                Method method = context.getPackageManager().getClass().getMethod("getPackageSizeInfo", String.class, lg3.class);
                js3.o(method, "getMethod(...)");
                method.invoke(context.getPackageManager(), str, new cu(om0Var));
            } catch (Exception e2) {
                e2.getMessage();
                om0Var.resumeWith(ws.e);
            }
        }
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.a;
        return objU == coroutineSingletons ? coroutineSingletons : objU;
    }
}
