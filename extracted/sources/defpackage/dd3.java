package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dd3 {
    public static final ox2[] a;
    public static final Map b;

    static {
        ox2 ox2Var = new ox2(ox2.i, "");
        ByteString byteString = ox2.f;
        ox2 ox2Var2 = new ox2(byteString, "GET");
        ox2 ox2Var3 = new ox2(byteString, "POST");
        ByteString byteString2 = ox2.g;
        ox2 ox2Var4 = new ox2(byteString2, "/");
        ox2 ox2Var5 = new ox2(byteString2, "/index.html");
        ByteString byteString3 = ox2.h;
        ox2 ox2Var6 = new ox2(byteString3, "http");
        ox2 ox2Var7 = new ox2(byteString3, "https");
        ByteString byteString4 = ox2.e;
        ox2[] ox2VarArr = {ox2Var, ox2Var2, ox2Var3, ox2Var4, ox2Var5, ox2Var6, ox2Var7, new ox2(byteString4, "200"), new ox2(byteString4, "204"), new ox2(byteString4, "206"), new ox2(byteString4, "304"), new ox2(byteString4, "400"), new ox2(byteString4, "404"), new ox2(byteString4, "500"), new ox2("accept-charset", ""), new ox2("accept-encoding", "gzip, deflate"), new ox2("accept-language", ""), new ox2("accept-ranges", ""), new ox2("accept", ""), new ox2("access-control-allow-origin", ""), new ox2("age", ""), new ox2("allow", ""), new ox2("authorization", ""), new ox2("cache-control", ""), new ox2("content-disposition", ""), new ox2("content-encoding", ""), new ox2("content-language", ""), new ox2("content-length", ""), new ox2("content-location", ""), new ox2("content-range", ""), new ox2("content-type", ""), new ox2("cookie", ""), new ox2("date", ""), new ox2("etag", ""), new ox2("expect", ""), new ox2("expires", ""), new ox2("from", ""), new ox2("host", ""), new ox2("if-match", ""), new ox2("if-modified-since", ""), new ox2("if-none-match", ""), new ox2("if-range", ""), new ox2("if-unmodified-since", ""), new ox2("last-modified", ""), new ox2(CommonDataKt.AD_LINK, ""), new ox2("location", ""), new ox2("max-forwards", ""), new ox2("proxy-authenticate", ""), new ox2("proxy-authorization", ""), new ox2("range", ""), new ox2("referer", ""), new ox2("refresh", ""), new ox2("retry-after", ""), new ox2("server", ""), new ox2("set-cookie", ""), new ox2("strict-transport-security", ""), new ox2("transfer-encoding", ""), new ox2("user-agent", ""), new ox2("vary", ""), new ox2("via", ""), new ox2("www-authenticate", "")};
        a = ox2VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(ox2VarArr[i].a)) {
                linkedHashMap.put(ox2VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        js3.o(mapUnmodifiableMap, "unmodifiableMap(...)");
        b = mapUnmodifiableMap;
    }

    public static void a(ByteString byteString) {
        js3.p(byteString, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int iE = byteString.e();
        for (int i = 0; i < iE; i++) {
            byte bJ = byteString.j(i);
            if (65 <= bJ && bJ < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.s()));
            }
        }
    }
}
