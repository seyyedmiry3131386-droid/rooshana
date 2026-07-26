package ir.mservices.market.intro.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class IntroData implements MyketRecyclerData, g32 {
    public static final int e = js6.holder_intro_item;
    public final int a;
    public final int b;
    public final Integer c;
    public final int d;

    public IntroData(int i, int i2, Integer num, int i3) {
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = i3;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntroData)) {
            return false;
        }
        IntroData introData = (IntroData) obj;
        return this.a == introData.a && this.b == introData.b && js3.i(this.c, introData.c) && this.d == introData.d;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        Integer num = this.c;
        return ((i + (num != null ? num.intValue() : 0)) * 31) + this.d;
    }
}
