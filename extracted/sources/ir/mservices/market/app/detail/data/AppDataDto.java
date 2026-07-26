package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDataDto implements Serializable {

    @vo7("hasMain")
    private final Boolean hasMain;

    @vo7("hasPatch")
    private final Boolean hasPatch;

    public AppDataDto(Boolean bool, Boolean bool2) {
        this.hasMain = bool;
        this.hasPatch = bool2;
    }

    public final Boolean getHasMain() {
        return this.hasMain;
    }

    public final Boolean getHasPatch() {
        return this.hasPatch;
    }
}
