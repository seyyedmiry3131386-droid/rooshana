package ir.mservices.market.version2.webapi.responsedto;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieIgnoreConditionDto extends IgnoreConditionDto implements Serializable {

    @vo7("percent")
    private final Integer percent;

    public MovieIgnoreConditionDto(String str, Integer num) {
        super(str);
        this.percent = num;
    }

    public final Integer getPercent() {
        return this.percent;
    }
}
