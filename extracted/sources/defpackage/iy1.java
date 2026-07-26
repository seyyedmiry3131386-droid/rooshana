package defpackage;

import ir.mservices.market.common.data.DynamicButtonDto;

/* JADX INFO: loaded from: classes3.dex */
public final class iy1 extends jy1 {
    public final DynamicButtonDto b;

    public iy1(DynamicButtonDto dynamicButtonDto) {
        super(dynamicButtonDto);
        this.b = dynamicButtonDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy1) && js3.i(this.b, ((iy1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Text(dynamicButtonDto=" + this.b + ")";
    }
}
