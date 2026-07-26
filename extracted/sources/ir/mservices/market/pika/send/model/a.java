package ir.mservices.market.pika.send.model;

import android.content.Context;
import defpackage.br9;
import defpackage.bt2;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.k68;
import defpackage.kf1;
import defpackage.m88;
import defpackage.ug1;
import defpackage.up1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Context a;
    public final List b;

    public a(Context context, k68 k68Var) {
        js3.p(k68Var, "storageUtils");
        this.a = context;
        this.b = br9.C("mips", "mips64", "x86", "x86_64", "arm64-v8a", "armeabi", "armeabi-v7a");
    }

    public static final ArrayList a(a aVar, String str) throws IOException {
        int iQ0;
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(str);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            js3.o(enumerationEntries, "entries(...)");
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                js3.o(zipEntryNextElement, "nextElement(...)");
                ZipEntry zipEntry = zipEntryNextElement;
                if (!zipEntry.isDirectory()) {
                    String name = zipEntry.getName();
                    if (name.length() >= 14) {
                        if (m88.S(name, ".so", false) && (iQ0 = f88.q0(name, '/', 0, 6)) >= 0 && m88.V(name, "lib", false, iQ0 + 1, 0, 3)) {
                            String strSubstring = name.substring(0, iQ0);
                            js3.o(strSubstring, "substring(...)");
                            String strSubstring2 = name.substring(f88.q0(strSubstring, '/', 0, 6) + 1, iQ0);
                            js3.o(strSubstring2, "substring(...)");
                            List list = aVar.b;
                            if (!(list != null) || !list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (strSubstring2.equals((String) it.next())) {
                                        arrayList.add(strSubstring2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            zipFile.close();
            return arrayList;
        } finally {
        }
    }

    public final Object b(String[] strArr, String str, String str2, boolean z, g51 g51Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.a = new ArrayList();
        ug1 ug1Var = up1.a;
        return bt2.Z(kf1.c, new CloneAppRepositoryImpl$cloneApp$2(z, str2, strArr, ref$ObjectRef, str, this, null), g51Var);
    }
}
