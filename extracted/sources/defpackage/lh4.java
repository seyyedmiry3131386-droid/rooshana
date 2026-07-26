package defpackage;

import androidx.datastore.preferences.protobuf.MapFieldLite;

/* JADX INFO: loaded from: classes.dex */
public final class lh4 {
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
