package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ls0 {
    public final ArrayList a;
    public final ArrayList b;
    public final String c;

    public ls0(Context context) throws IOException {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new ArrayList();
        this.c = "";
        String string = context.getResources().getString(rs6.repetitive_city_title);
        js3.o(string, "getString(...)");
        this.c = string;
        String[] stringArray = context.getResources().getStringArray(mp6.repetitive_city);
        js3.o(stringArray, "getStringArray(...)");
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArray) {
            arrayList2.add(str);
        }
        this.b = arrayList2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("iran-city-list.txt"), "UTF-8"));
        try {
            Iterator it = ((u21) ry7.p(bufferedReader)).iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bufferedReader.close();
        } finally {
        }
    }
}
