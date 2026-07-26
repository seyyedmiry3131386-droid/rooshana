package defpackage;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.common.b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n03 extends o03 {
    public static final n03 l;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final b h;
    public final List i;
    public final Map j;
    public final List k;

    static {
        List list = Collections.EMPTY_LIST;
        l = new n03("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public n03(String str, List list, List list2, List list3, List list4, List list5, List list6, b bVar, List list7, boolean z, Map map, List list8) {
        super(list, str, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((m03) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = DesugarCollections.unmodifiableList(list2);
        DesugarCollections.unmodifiableList(list3);
        this.f = DesugarCollections.unmodifiableList(list4);
        this.g = DesugarCollections.unmodifiableList(list5);
        DesugarCollections.unmodifiableList(list6);
        this.h = bVar;
        this.i = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.j = DesugarCollections.unmodifiableMap(map);
        this.k = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((l03) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i3);
                    if (streamKey.b == i && streamKey.c == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.o03
    public final Object a(List list) {
        ArrayList arrayListC = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new n03(this.a, this.b, arrayListC, list2, c(1, this.f, list), c(2, this.g, list), list2, this.h, this.i, this.c, this.j, this.k);
    }
}
