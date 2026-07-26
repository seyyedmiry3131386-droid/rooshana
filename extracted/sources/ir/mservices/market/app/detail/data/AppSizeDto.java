package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppSizeDto implements Serializable {

    @vo7("actual")
    private final String actual;

    @vo7("diff")
    private final String diff;

    @vo7("diffChecksum")
    private final String diffChecksum;

    @vo7("length")
    private final long length;

    public AppSizeDto(long j, String str, String str2, String str3) {
        js3.p(str2, "actual");
        this.length = j;
        this.diff = str;
        this.actual = str2;
        this.diffChecksum = str3;
    }

    public final String getActual() {
        return this.actual;
    }

    public final String getDiff() {
        return this.diff;
    }

    public final String getDiffChecksum() {
        return this.diffChecksum;
    }

    public final long getLength() {
        return this.length;
    }
}
