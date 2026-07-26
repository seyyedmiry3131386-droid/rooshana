package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkConnectionInfo$MobileSubtype {
    public static final SparseArray a;
    public static final /* synthetic */ NetworkConnectionInfo$MobileSubtype[] b;

    /* JADX INFO: Fake field, exist only in values array */
    NetworkConnectionInfo$MobileSubtype EF0;

    static {
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = new NetworkConnectionInfo$MobileSubtype("UNKNOWN_MOBILE_SUBTYPE", 0);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype2 = new NetworkConnectionInfo$MobileSubtype("GPRS", 1);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype3 = new NetworkConnectionInfo$MobileSubtype("EDGE", 2);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype4 = new NetworkConnectionInfo$MobileSubtype("UMTS", 3);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype5 = new NetworkConnectionInfo$MobileSubtype("CDMA", 4);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype6 = new NetworkConnectionInfo$MobileSubtype("EVDO_0", 5);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype7 = new NetworkConnectionInfo$MobileSubtype("EVDO_A", 6);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype8 = new NetworkConnectionInfo$MobileSubtype("RTT", 7);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype9 = new NetworkConnectionInfo$MobileSubtype("HSDPA", 8);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype10 = new NetworkConnectionInfo$MobileSubtype("HSUPA", 9);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype11 = new NetworkConnectionInfo$MobileSubtype("HSPA", 10);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype12 = new NetworkConnectionInfo$MobileSubtype("IDEN", 11);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype13 = new NetworkConnectionInfo$MobileSubtype("EVDO_B", 12);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype14 = new NetworkConnectionInfo$MobileSubtype("LTE", 13);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype15 = new NetworkConnectionInfo$MobileSubtype("EHRPD", 14);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype16 = new NetworkConnectionInfo$MobileSubtype("HSPAP", 15);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype17 = new NetworkConnectionInfo$MobileSubtype("GSM", 16);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype18 = new NetworkConnectionInfo$MobileSubtype("TD_SCDMA", 17);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype19 = new NetworkConnectionInfo$MobileSubtype("IWLAN", 18);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype20 = new NetworkConnectionInfo$MobileSubtype("LTE_CA", 19);
        b = new NetworkConnectionInfo$MobileSubtype[]{networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype2, networkConnectionInfo$MobileSubtype3, networkConnectionInfo$MobileSubtype4, networkConnectionInfo$MobileSubtype5, networkConnectionInfo$MobileSubtype6, networkConnectionInfo$MobileSubtype7, networkConnectionInfo$MobileSubtype8, networkConnectionInfo$MobileSubtype9, networkConnectionInfo$MobileSubtype10, networkConnectionInfo$MobileSubtype11, networkConnectionInfo$MobileSubtype12, networkConnectionInfo$MobileSubtype13, networkConnectionInfo$MobileSubtype14, networkConnectionInfo$MobileSubtype15, networkConnectionInfo$MobileSubtype16, networkConnectionInfo$MobileSubtype17, networkConnectionInfo$MobileSubtype18, networkConnectionInfo$MobileSubtype19, networkConnectionInfo$MobileSubtype20, new NetworkConnectionInfo$MobileSubtype("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, networkConnectionInfo$MobileSubtype);
        sparseArray.put(1, networkConnectionInfo$MobileSubtype2);
        sparseArray.put(2, networkConnectionInfo$MobileSubtype3);
        sparseArray.put(3, networkConnectionInfo$MobileSubtype4);
        sparseArray.put(4, networkConnectionInfo$MobileSubtype5);
        sparseArray.put(5, networkConnectionInfo$MobileSubtype6);
        sparseArray.put(6, networkConnectionInfo$MobileSubtype7);
        sparseArray.put(7, networkConnectionInfo$MobileSubtype8);
        sparseArray.put(8, networkConnectionInfo$MobileSubtype9);
        sparseArray.put(9, networkConnectionInfo$MobileSubtype10);
        sparseArray.put(10, networkConnectionInfo$MobileSubtype11);
        sparseArray.put(11, networkConnectionInfo$MobileSubtype12);
        sparseArray.put(12, networkConnectionInfo$MobileSubtype13);
        sparseArray.put(13, networkConnectionInfo$MobileSubtype14);
        sparseArray.put(14, networkConnectionInfo$MobileSubtype15);
        sparseArray.put(15, networkConnectionInfo$MobileSubtype16);
        sparseArray.put(16, networkConnectionInfo$MobileSubtype17);
        sparseArray.put(17, networkConnectionInfo$MobileSubtype18);
        sparseArray.put(18, networkConnectionInfo$MobileSubtype19);
        sparseArray.put(19, networkConnectionInfo$MobileSubtype20);
    }

    public static NetworkConnectionInfo$MobileSubtype valueOf(String str) {
        return (NetworkConnectionInfo$MobileSubtype) Enum.valueOf(NetworkConnectionInfo$MobileSubtype.class, str);
    }

    public static NetworkConnectionInfo$MobileSubtype[] values() {
        return (NetworkConnectionInfo$MobileSubtype[]) b.clone();
    }
}
