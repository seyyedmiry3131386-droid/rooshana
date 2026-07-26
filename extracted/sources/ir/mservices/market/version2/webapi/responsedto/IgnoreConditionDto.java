package ir.mservices.market.version2.webapi.responsedto;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class IgnoreConditionDto implements Serializable {

    @vo7("condition")
    private final String condition;

    public IgnoreConditionDto(String str) {
        this.condition = str;
    }

    public final String getCondition() {
        return this.condition;
    }
}
