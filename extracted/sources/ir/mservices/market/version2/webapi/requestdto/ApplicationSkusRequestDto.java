package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationSkusRequestDto implements Serializable, RequestDTO {

    @vo7("allSkus")
    private final Boolean allSkus;

    @vo7("skus")
    private final List<String> skus;

    @vo7("type")
    private final String type;

    public ApplicationSkusRequestDto(List<String> list, String str, Boolean bool) {
        js3.p(list, "skus");
        js3.p(str, "type");
        this.skus = list;
        this.type = str;
        this.allSkus = bool;
    }

    public final Boolean getAllSkus() {
        return this.allSkus;
    }

    public final List<String> getSkus() {
        return this.skus;
    }

    public final String getType() {
        return this.type;
    }

    public /* synthetic */ ApplicationSkusRequestDto(List list, String str, Boolean bool, int i, yd1 yd1Var) {
        this(list, str, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}
