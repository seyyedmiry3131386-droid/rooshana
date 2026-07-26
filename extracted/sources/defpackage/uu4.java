package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class uu4 {
    public final String a;
    public final String b;
    public final Integer c;

    public uu4(String str, String str2, Integer num) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu4)) {
            return false;
        }
        uu4 uu4Var = (uu4) obj;
        return js3.i(this.a, uu4Var.a) && js3.i(this.b, uu4Var.b) && js3.i(this.c, uu4Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MessageBox(text=", this.a, ", iconUrl=", this.b, ", lineColor=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
