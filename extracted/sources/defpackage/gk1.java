package defpackage;

import com.google.gson.reflect.TypeToken;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.detail.ui.Utm;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class gk1 extends o2 {
    public final Object g(String str, Object obj, Integer num, String str2, String str3, int i, float f, String str4, String str5, long j, Utm utm, String str6, String str7, long j2, long j3, ContinuationImpl continuationImpl) {
        LinkedHashMap linkedHashMapO = b.O(new Pair("packageName", str));
        LinkedHashMap linkedHashMapO2 = b.O(new Pair("mhw", String.valueOf(i)), new Pair("dp", String.valueOf(f)), new Pair("pref", str4), new Pair("currentSize", String.valueOf(j)), new Pair("showNotification", str7), new Pair("totalMemory", String.valueOf(j2)), new Pair("freeMemory", String.valueOf(j3)), new Pair("refId", str2));
        if (num != null) {
            linkedHashMapO2.put("currentVersionCode", String.valueOf(num.intValue()));
        }
        String str8 = str3.length() > 0 ? str3 : null;
        if (str8 != null) {
            linkedHashMapO2.put("data", str8);
        }
        if (str5 != null) {
            String str9 = str5.length() > 0 ? str5 : null;
            if (str9 != null) {
                linkedHashMapO2.put("q", str9);
            }
        }
        if (utm != null) {
            String str10 = utm.d;
            if (str10 != null) {
                if (str10.length() <= 0) {
                    str10 = null;
                }
                if (str10 != null) {
                    linkedHashMapO2.put("utm_campaign", str10);
                }
            }
            String str11 = utm.c;
            if (str11 != null) {
                if (str11.length() <= 0) {
                    str11 = null;
                }
                if (str11 != null) {
                    linkedHashMapO2.put("utm_content", str11);
                }
            }
            String str12 = utm.e;
            if (str12 != null) {
                if (str12.length() <= 0) {
                    str12 = null;
                }
                if (str12 != null) {
                    linkedHashMapO2.put("utm_medium", str12);
                }
            }
            String str13 = utm.a;
            if (str13 != null) {
                if (str13.length() <= 0) {
                    str13 = null;
                }
                if (str13 != null) {
                    linkedHashMapO2.put("utm_source", str13);
                }
            }
            String str14 = utm.b;
            if (str14 != null) {
                if (str14.length() <= 0) {
                    str14 = null;
                }
                if (str14 != null) {
                    linkedHashMapO2.put("utm_term", str14);
                }
            }
        }
        if (str6 != null) {
            String str15 = str6.length() > 0 ? str6 : null;
            if (str15 != null) {
                linkedHashMapO2.put("caller", str15);
            }
        }
        z57 z57VarCreateRequestUrl = createRequestUrl("v2/applications", "{packageName}", linkedHashMapO, getCommonQueryParam(linkedHashMapO2));
        Type type = new TypeToken<ApplicationFullDto>() { // from class: ir.mservices.market.app.detail.services.DetailService$getApplicationDetail$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.v(this, type, z57VarCreateRequestUrl, obj, continuationImpl, 504);
    }
}
