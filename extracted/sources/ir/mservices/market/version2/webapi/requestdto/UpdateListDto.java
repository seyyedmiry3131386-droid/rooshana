package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class UpdateListDto implements RequestDTO {
    private boolean d = false;
    private String i;
    private String p;
    private long s;
    private int v;

    public UpdateListDto(String str, int i, long j, String str2) {
        this.p = str;
        this.v = i;
        this.s = j;
        this.i = str2;
    }

    public String getPackageInstaller() {
        return this.i;
    }

    public String getPackageName() {
        return this.p;
    }

    public int getVersionCode() {
        return this.v;
    }

    public void setDisabled(boolean z) {
        this.d = z;
    }
}
