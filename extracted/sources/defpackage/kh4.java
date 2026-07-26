package defpackage;

import com.google.protobuf.MapFieldLite;

/* JADX INFO: loaded from: classes3.dex */
public final class kh4 {
    public static MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteC = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteC.a) {
                mapFieldLiteC = mapFieldLiteC.c();
            }
            mapFieldLiteC.b();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteC.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteC;
    }
}
