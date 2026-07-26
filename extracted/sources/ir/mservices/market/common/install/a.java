package ir.mservices.market.common.install;

import android.content.Context;
import defpackage.bt2;
import defpackage.dp3;
import defpackage.js3;
import defpackage.kf1;
import defpackage.ug1;
import defpackage.up1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Context a;
    public final dp3 b;

    public a(Context context, dp3 dp3Var) {
        js3.p(dp3Var, "installManager");
        this.a = context;
        this.b = dp3Var;
    }

    public final Object a(boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ug1 ug1Var = up1.a;
        return bt2.Z(kf1.c, new InstalledAppsManager$getInstalledApps$2(this, z2, z, null), continuationImpl);
    }
}
