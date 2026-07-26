package defpackage;

import ir.mservices.market.common.data.DynamicButtonDto;

/* JADX INFO: loaded from: classes3.dex */
public final class fy1 extends jy1 {
    public final DynamicButtonDto b;
    public final dw3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy1(DynamicButtonDto dynamicButtonDto, dw3 dw3Var) {
        super(dynamicButtonDto);
        js3.p(dw3Var, "json");
        this.b = dynamicButtonDto;
        this.c = dw3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy1)) {
            return false;
        }
        fy1 fy1Var = (fy1) obj;
        return js3.i(this.b, fy1Var.b) && js3.i(this.c, fy1Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Animation(dynamicButtonDto=" + this.b + ", json=" + this.c + ")";
    }
}
