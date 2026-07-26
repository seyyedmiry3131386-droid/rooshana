package ir.mservices.market.download.common.data;

import defpackage.bs1;
import defpackage.dp2;
import defpackage.eq;
import defpackage.es1;
import defpackage.js3;
import ir.mservices.market.version2.download.DownloadTag;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AppDownloadInfo$title$1 extends FunctionReferenceImpl implements dp2 {
    public AppDownloadInfo$title$1(Object obj) {
        super(1, obj, eq.class, "getTitle", "getTitle(Lnene/downloadmanager/DownloadInfo;)Ljava/lang/String;", 0);
    }

    @Override // defpackage.dp2
    public final String invoke(bs1 bs1Var) {
        js3.p(bs1Var, "p0");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        String str = ((DownloadTag) obj).r;
        js3.o(str, "title");
        return str;
    }
}
