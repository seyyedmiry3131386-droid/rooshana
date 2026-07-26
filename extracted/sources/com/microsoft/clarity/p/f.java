package com.microsoft.clarity.p;

import defpackage.ew;
import defpackage.gq1;
import defpackage.js3;
import defpackage.mo7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.io.FileWalkDirection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static File a(g gVar, String str, boolean z, boolean z2, int i) {
        File parentFile;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        e eVar = (e) gVar;
        eVar.getClass();
        js3.p(str, "filename");
        File file = new File(eVar.a(str));
        if ((z || z2) && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (z2) {
            file.createNewFile();
        }
        return file;
    }

    public static List a(e eVar, String str, long j, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        js3.p(str, "prefix");
        File[] fileArrListFiles = new File(ew.O0(62, String.valueOf(File.separatorChar), new String[]{eVar.a, str})).listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.lastModified() > j) {
                    arrayList.add(file);
                }
            }
            List listP0 = kotlin.collections.a.P0(arrayList);
            if (listP0 != null) {
                return listP0;
            }
        }
        return EmptyList.a;
    }

    public static List a(g gVar, String str, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        e eVar = (e) gVar;
        eVar.getClass();
        js3.p(str, "prefix");
        return mo7.w(mo7.r(new gq1(new File(ew.O0(62, String.valueOf(File.separatorChar), new String[]{eVar.a, str})), FileWalkDirection.a), new b(false)));
    }
}
