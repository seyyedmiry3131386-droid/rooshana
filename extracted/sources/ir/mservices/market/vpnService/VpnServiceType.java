package ir.mservices.market.vpnService;

import defpackage.r22;
import defpackage.rs6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class VpnServiceType {
    public static final VpnServiceType b;
    public static final /* synthetic */ VpnServiceType[] c;
    public static final /* synthetic */ r22 d;
    public final int a;

    static {
        VpnServiceType vpnServiceType = new VpnServiceType("AD_GUARD", 0, rs6.ad_guard_service_is_active);
        b = vpnServiceType;
        VpnServiceType[] vpnServiceTypeArr = {vpnServiceType, new VpnServiceType("CHEETAH", 1, rs6.cheetah_service_is_active)};
        c = vpnServiceTypeArr;
        d = a.a(vpnServiceTypeArr);
    }

    public VpnServiceType(String str, int i, int i2) {
        this.a = i2;
    }

    public static VpnServiceType valueOf(String str) {
        return (VpnServiceType) Enum.valueOf(VpnServiceType.class, str);
    }

    public static VpnServiceType[] values() {
        return (VpnServiceType[]) c.clone();
    }
}
