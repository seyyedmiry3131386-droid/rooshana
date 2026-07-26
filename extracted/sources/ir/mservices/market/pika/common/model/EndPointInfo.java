package ir.mservices.market.pika.common.model;

import defpackage.js3;
import defpackage.vo1;

/* JADX INFO: loaded from: classes3.dex */
public final class EndPointInfo {
    private final String endPintId;
    private final vo1 info;

    public EndPointInfo(String str, vo1 vo1Var) {
        js3.p(str, "endPintId");
        js3.p(vo1Var, "info");
        this.endPintId = str;
        this.info = vo1Var;
    }

    public static /* synthetic */ EndPointInfo copy$default(EndPointInfo endPointInfo, String str, vo1 vo1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endPointInfo.endPintId;
        }
        if ((i & 2) != 0) {
            vo1Var = endPointInfo.info;
        }
        return endPointInfo.copy(str, vo1Var);
    }

    public final String component1() {
        return this.endPintId;
    }

    public final vo1 component2() {
        return this.info;
    }

    public final EndPointInfo copy(String str, vo1 vo1Var) {
        js3.p(str, "endPintId");
        js3.p(vo1Var, "info");
        return new EndPointInfo(str, vo1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndPointInfo)) {
            return false;
        }
        EndPointInfo endPointInfo = (EndPointInfo) obj;
        return js3.i(this.endPintId, endPointInfo.endPintId) && js3.i(this.info, endPointInfo.info);
    }

    public final String getEndPintId() {
        return this.endPintId;
    }

    public final vo1 getInfo() {
        return this.info;
    }

    public int hashCode() {
        return this.info.hashCode() + (this.endPintId.hashCode() * 31);
    }

    public String toString() {
        return "EndPointInfo(endPintId=" + this.endPintId + ", info=" + this.info + ")";
    }
}
