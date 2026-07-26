package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkConnectionInfo$NetworkType {
    public static final SparseArray a;
    public static final /* synthetic */ NetworkConnectionInfo$NetworkType[] b;

    /* JADX INFO: Fake field, exist only in values array */
    NetworkConnectionInfo$NetworkType EF0;

    static {
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = new NetworkConnectionInfo$NetworkType("MOBILE", 0);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType2 = new NetworkConnectionInfo$NetworkType("WIFI", 1);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType3 = new NetworkConnectionInfo$NetworkType("MOBILE_MMS", 2);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType4 = new NetworkConnectionInfo$NetworkType("MOBILE_SUPL", 3);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType5 = new NetworkConnectionInfo$NetworkType("MOBILE_DUN", 4);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType6 = new NetworkConnectionInfo$NetworkType("MOBILE_HIPRI", 5);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType7 = new NetworkConnectionInfo$NetworkType("WIMAX", 6);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType8 = new NetworkConnectionInfo$NetworkType("BLUETOOTH", 7);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType9 = new NetworkConnectionInfo$NetworkType("DUMMY", 8);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType10 = new NetworkConnectionInfo$NetworkType("ETHERNET", 9);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType11 = new NetworkConnectionInfo$NetworkType("MOBILE_FOTA", 10);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType12 = new NetworkConnectionInfo$NetworkType("MOBILE_IMS", 11);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType13 = new NetworkConnectionInfo$NetworkType("MOBILE_CBS", 12);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType14 = new NetworkConnectionInfo$NetworkType("WIFI_P2P", 13);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType15 = new NetworkConnectionInfo$NetworkType("MOBILE_IA", 14);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType16 = new NetworkConnectionInfo$NetworkType("MOBILE_EMERGENCY", 15);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType17 = new NetworkConnectionInfo$NetworkType("PROXY", 16);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType18 = new NetworkConnectionInfo$NetworkType("VPN", 17);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType19 = new NetworkConnectionInfo$NetworkType("NONE", 18);
        b = new NetworkConnectionInfo$NetworkType[]{networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType2, networkConnectionInfo$NetworkType3, networkConnectionInfo$NetworkType4, networkConnectionInfo$NetworkType5, networkConnectionInfo$NetworkType6, networkConnectionInfo$NetworkType7, networkConnectionInfo$NetworkType8, networkConnectionInfo$NetworkType9, networkConnectionInfo$NetworkType10, networkConnectionInfo$NetworkType11, networkConnectionInfo$NetworkType12, networkConnectionInfo$NetworkType13, networkConnectionInfo$NetworkType14, networkConnectionInfo$NetworkType15, networkConnectionInfo$NetworkType16, networkConnectionInfo$NetworkType17, networkConnectionInfo$NetworkType18, networkConnectionInfo$NetworkType19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, networkConnectionInfo$NetworkType);
        sparseArray.put(1, networkConnectionInfo$NetworkType2);
        sparseArray.put(2, networkConnectionInfo$NetworkType3);
        sparseArray.put(3, networkConnectionInfo$NetworkType4);
        sparseArray.put(4, networkConnectionInfo$NetworkType5);
        sparseArray.put(5, networkConnectionInfo$NetworkType6);
        sparseArray.put(6, networkConnectionInfo$NetworkType7);
        sparseArray.put(7, networkConnectionInfo$NetworkType8);
        sparseArray.put(8, networkConnectionInfo$NetworkType9);
        sparseArray.put(9, networkConnectionInfo$NetworkType10);
        sparseArray.put(10, networkConnectionInfo$NetworkType11);
        sparseArray.put(11, networkConnectionInfo$NetworkType12);
        sparseArray.put(12, networkConnectionInfo$NetworkType13);
        sparseArray.put(13, networkConnectionInfo$NetworkType14);
        sparseArray.put(14, networkConnectionInfo$NetworkType15);
        sparseArray.put(15, networkConnectionInfo$NetworkType16);
        sparseArray.put(16, networkConnectionInfo$NetworkType17);
        sparseArray.put(17, networkConnectionInfo$NetworkType18);
        sparseArray.put(-1, networkConnectionInfo$NetworkType19);
    }

    public static NetworkConnectionInfo$NetworkType valueOf(String str) {
        return (NetworkConnectionInfo$NetworkType) Enum.valueOf(NetworkConnectionInfo$NetworkType.class, str);
    }

    public static NetworkConnectionInfo$NetworkType[] values() {
        return (NetworkConnectionInfo$NetworkType[]) b.clone();
    }
}
