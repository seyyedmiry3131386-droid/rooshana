package ir.mservices.market.securityShield.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceScanData implements MyketRecyclerData, g32 {
    public static final int f = js6.holder_scan_device;
    public final v48 a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public String e;

    public /* synthetic */ DeviceScanData(int i, rv6 rv6Var, Integer num) {
        this(rv6Var, "", (i & 4) != 0 ? null : 0, (i & 8) != 0 ? null : num);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return f;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DeviceScanData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.securityShield.recycler.DeviceScanData");
        DeviceScanData deviceScanData = (DeviceScanData) obj;
        return js3.i(this.b, deviceScanData.b) && js3.i(this.c, deviceScanData.c) && js3.i(this.d, deviceScanData.d);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.c;
        return (iHashCode2 + (num2 != null ? num2.intValue() : 0)) * 31;
    }

    public DeviceScanData(v48 v48Var, String str, Integer num, Integer num2) {
        js3.p(v48Var, "progressPercentage");
        js3.p(str, "title");
        this.a = v48Var;
        this.b = str;
        this.c = num;
        this.d = num2;
        long j = is3.p + 1;
        is3.p = j;
        this.e = String.valueOf(j);
    }
}
