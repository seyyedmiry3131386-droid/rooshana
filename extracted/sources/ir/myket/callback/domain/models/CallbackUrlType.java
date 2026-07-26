package ir.myket.callback.domain.models;

import defpackage.r22;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CallbackUrlType {
    public static final CallbackUrlType a;
    public static final CallbackUrlType b;
    public static final CallbackUrlType c;
    public static final CallbackUrlType d;
    public static final CallbackUrlType e;
    public static final CallbackUrlType f;
    public static final CallbackUrlType g;
    public static final CallbackUrlType h;
    public static final CallbackUrlType i;
    public static final CallbackUrlType j;
    public static final CallbackUrlType k;
    public static final CallbackUrlType l;
    public static final CallbackUrlType m;
    public static final /* synthetic */ CallbackUrlType[] n;
    public static final /* synthetic */ r22 o;

    static {
        CallbackUrlType callbackUrlType = new CallbackUrlType("MovieAd", 0);
        a = callbackUrlType;
        CallbackUrlType callbackUrlType2 = new CallbackUrlType("Ibex", 1);
        b = callbackUrlType2;
        CallbackUrlType callbackUrlType3 = new CallbackUrlType("Install", 2);
        c = callbackUrlType3;
        CallbackUrlType callbackUrlType4 = new CallbackUrlType("VideoShot", 3);
        d = callbackUrlType4;
        CallbackUrlType callbackUrlType5 = new CallbackUrlType("NotificationOpen", 4);
        e = callbackUrlType5;
        CallbackUrlType callbackUrlType6 = new CallbackUrlType("NotificationButton", 5);
        f = callbackUrlType6;
        CallbackUrlType callbackUrlType7 = new CallbackUrlType("NotificationDismiss", 6);
        g = callbackUrlType7;
        CallbackUrlType callbackUrlType8 = new CallbackUrlType("NotificationImpression", 7);
        h = callbackUrlType8;
        CallbackUrlType callbackUrlType9 = new CallbackUrlType("MovieDownload", 8);
        i = callbackUrlType9;
        CallbackUrlType callbackUrlType10 = new CallbackUrlType("Download", 9);
        j = callbackUrlType10;
        CallbackUrlType callbackUrlType11 = new CallbackUrlType("Detail", 10);
        k = callbackUrlType11;
        CallbackUrlType callbackUrlType12 = new CallbackUrlType(CommonDataKt.PLAYER_TYPE_REEL, 11);
        l = callbackUrlType12;
        CallbackUrlType callbackUrlType13 = new CallbackUrlType("Undefined", 12);
        m = callbackUrlType13;
        CallbackUrlType[] callbackUrlTypeArr = {callbackUrlType, callbackUrlType2, callbackUrlType3, callbackUrlType4, callbackUrlType5, callbackUrlType6, callbackUrlType7, callbackUrlType8, callbackUrlType9, callbackUrlType10, callbackUrlType11, callbackUrlType12, callbackUrlType13};
        n = callbackUrlTypeArr;
        o = a.a(callbackUrlTypeArr);
    }

    public static CallbackUrlType valueOf(String str) {
        return (CallbackUrlType) Enum.valueOf(CallbackUrlType.class, str);
    }

    public static CallbackUrlType[] values() {
        return (CallbackUrlType[]) n.clone();
    }
}
