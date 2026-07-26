package ir.mservices.market.download.common.data;

import defpackage.bs1;
import defpackage.dp2;
import defpackage.eq;
import defpackage.js3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AppDownloadInfo$forceUpdate$1 extends FunctionReferenceImpl implements dp2 {
    public AppDownloadInfo$forceUpdate$1(Object obj) {
        super(1, obj, eq.class, "getForceUpdate", "getForceUpdate(Lnene/downloadmanager/DownloadInfo;)Z", 0);
    }

    @Override // defpackage.dp2
    public final Boolean invoke(bs1 bs1Var) {
        js3.p(bs1Var, "p0");
        return Boolean.valueOf(eq.p(bs1Var));
    }
}
