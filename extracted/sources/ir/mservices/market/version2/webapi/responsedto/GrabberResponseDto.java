package ir.mservices.market.version2.webapi.responsedto;

import defpackage.dw1;
import defpackage.vo7;
import defpackage.yd1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class GrabberResponseDto implements Serializable {

    @vo7("excludeMyket")
    private final Boolean excludeMyket;

    @vo7("intent")
    private final String intent;

    @vo7("targetPackage")
    private final String targetPackage;

    public GrabberResponseDto(String str, Boolean bool, String str2) {
        this.intent = str;
        this.excludeMyket = bool;
        this.targetPackage = str2;
    }

    public final Boolean getExcludeMyket() {
        return this.excludeMyket;
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public String toString() {
        String str = this.intent;
        Boolean bool = this.excludeMyket;
        String str2 = this.targetPackage;
        StringBuilder sb = new StringBuilder("GrabberResponseDto(intent=");
        sb.append(str);
        sb.append(", excludeMyket=");
        sb.append(bool);
        sb.append(", targetPackage=");
        return dw1.s(sb, str2, ")");
    }

    public /* synthetic */ GrabberResponseDto(String str, Boolean bool, String str2, int i, yd1 yd1Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Boolean.FALSE : bool, str2);
    }
}
