package defpackage;

import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class xq {
    public final ResultDTO a;
    public final boolean b;
    public final String c;
    public final DownloadDataModel d;

    public xq(ResultDTO resultDTO, boolean z, String str, DownloadDataModel downloadDataModel) {
        js3.p(str, "gatewayName");
        js3.p(downloadDataModel, "downloadDataModel");
        this.a = resultDTO;
        this.b = z;
        this.c = str;
        this.d = downloadDataModel;
    }
}
