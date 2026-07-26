package com.microsoft.clarity.n;

import com.microsoft.clarity.models.AssetType;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.PayloadMetadata;
import com.microsoft.clarity.models.ingest.SerializedSessionPayload;
import com.microsoft.clarity.models.ingest.analytics.Metric;
import com.microsoft.clarity.models.ingest.analytics.MetricEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.repositories.ImageRepositoryAsset;
import com.microsoft.clarity.models.repositories.RepositoryAsset;
import com.microsoft.clarity.models.repositories.TypefaceRepositoryAsset;
import com.microsoft.clarity.models.repositories.WebRepositoryAsset;
import com.microsoft.clarity.p.h;
import com.microsoft.clarity.q.l;
import defpackage.br9;
import defpackage.ew;
import defpackage.f88;
import defpackage.js3;
import defpackage.ry7;
import defpackage.u21;
import defpackage.wu0;
import defpackage.zp0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements c {
    public static final List g = br9.C(AssetType.Image, AssetType.Typeface, AssetType.Web);
    public static final ConcurrentHashMap h = new ConcurrentHashMap();
    public final b a;
    public final com.microsoft.clarity.p.e b;
    public final com.microsoft.clarity.p.e c;
    public final com.microsoft.clarity.p.e d;
    public final com.microsoft.clarity.p.e e;
    public final com.microsoft.clarity.p.e f;

    public g(b bVar, com.microsoft.clarity.p.e eVar, com.microsoft.clarity.p.e eVar2, com.microsoft.clarity.p.e eVar3, com.microsoft.clarity.p.e eVar4, com.microsoft.clarity.p.e eVar5) {
        js3.p(bVar, "metadataRepository");
        js3.p(eVar, "frameStore");
        js3.p(eVar2, "analyticsStore");
        js3.p(eVar3, "imageStore");
        js3.p(eVar4, "typefaceStore");
        js3.p(eVar5, "webStore");
        this.a = bVar;
        this.b = eVar;
        this.c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    public static String b(PayloadMetadata payloadMetadata) {
        js3.p(payloadMetadata, "payloadMetadata");
        return payloadMetadata.getSessionId() + '/' + payloadMetadata.getPageNum() + "_" + payloadMetadata.getSequence() + "_" + payloadMetadata.getPageTimestamp() + "_" + payloadMetadata.getStart();
    }

    public final SerializedSessionPayload a(boolean z, PayloadMetadata payloadMetadata) throws IOException {
        js3.p(payloadMetadata, "payloadMetadata");
        ArrayList arrayListA = !z ? a(this.b, payloadMetadata) : new ArrayList();
        ArrayList arrayListA2 = a(this.c, payloadMetadata);
        if (payloadMetadata.getSequence() == 1) {
            arrayListA2.add(new MetricEvent(payloadMetadata.getPageTimestamp(), new ScreenMetadata("", "", 0), kotlin.collections.b.K(new Pair(Metric.Playback, Long.valueOf(!z ? 1L : 0L)))).serialize(payloadMetadata.getPageTimestamp()));
        }
        return new SerializedSessionPayload(arrayListA, arrayListA2, payloadMetadata.getPageNum(), payloadMetadata.getSequence(), payloadMetadata.getStart());
    }

    public final List a(String str, boolean z) {
        js3.p(str, "sessionId");
        ArrayList arrayListZ0 = kotlin.collections.a.z0(com.microsoft.clarity.p.f.a(this.c, str.concat("/"), 0L, 2), com.microsoft.clarity.p.f.a(this.b, str.concat("/"), 0L, 2));
        ArrayList arrayList = new ArrayList(wu0.V(arrayListZ0, 10));
        Iterator it = arrayListZ0.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getName());
        }
        List<String> listI0 = kotlin.collections.a.i0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : listI0) {
            js3.o(str2, "it");
            List listY0 = f88.y0(str2, new String[]{"_"}, 6);
            PayloadMetadata payloadMetadata = listY0.size() < 4 ? null : new PayloadMetadata(str, Integer.parseInt((String) listY0.get(0)), Integer.parseInt((String) listY0.get(1)), Long.parseLong((String) listY0.get(3)), Long.parseLong((String) listY0.get(2)), null, 32, null);
            if (payloadMetadata != null) {
                arrayList2.add(payloadMetadata);
            }
        }
        List listP0 = kotlin.collections.a.P0(arrayList2);
        if (!z) {
            return listP0;
        }
        PayloadMetadata payloadMetadata2 = (PayloadMetadata) h.get(str);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listP0) {
            PayloadMetadata payloadMetadata3 = (PayloadMetadata) obj;
            if (payloadMetadata2 == null || payloadMetadata3.getPageNum() < payloadMetadata2.getPageNum() || (payloadMetadata3.getPageNum() == payloadMetadata2.getPageNum() && payloadMetadata3.getSequence() < payloadMetadata2.getSequence())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public final void a(PayloadMetadata payloadMetadata) {
        js3.p(payloadMetadata, "payloadMetadata");
        LogLevel logLevel = l.a;
        l.b("Delete session payload " + payloadMetadata + '.');
        String strB = b(payloadMetadata);
        com.microsoft.clarity.p.e eVar = this.b;
        js3.p(strB, "filename");
        com.microsoft.clarity.p.f.a(eVar, strB, false, false, 6).delete();
        com.microsoft.clarity.p.f.a(this.c, strB, false, false, 6).delete();
    }

    public final List a(String str) {
        RepositoryAsset typefaceRepositoryAsset;
        js3.p(str, "sessionId");
        List<AssetType> list = g;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        for (AssetType assetType : list) {
            js3.p(assetType, "type");
            List listA = com.microsoft.clarity.p.f.a(a(assetType), str.concat("/"), 2);
            ArrayList arrayList2 = new ArrayList(wu0.V(listA, 10));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                String path = ((File) it.next()).getPath();
                js3.o(path, "file.path");
                String strD0 = f88.D0(path, str.concat("/"), path);
                int i = f.a[assetType.ordinal()];
                if (i == 1) {
                    typefaceRepositoryAsset = new TypefaceRepositoryAsset(strD0, ((com.microsoft.clarity.p.e) a(assetType)).a(a(str, strD0)));
                } else if (i == 2) {
                    typefaceRepositoryAsset = new ImageRepositoryAsset(strD0, ((com.microsoft.clarity.p.e) a(assetType)).a(a(str, strD0)));
                } else if (i != 3) {
                    typefaceRepositoryAsset = new RepositoryAsset(assetType, strD0, ((com.microsoft.clarity.p.e) a(assetType)).a(a(str, strD0)));
                } else {
                    String str2 = null;
                    typefaceRepositoryAsset = new WebRepositoryAsset(strD0, ((com.microsoft.clarity.p.e) a(assetType)).a(a(str, strD0)), str2, 4, null);
                }
                arrayList2.add(typefaceRepositoryAsset);
            }
            arrayList.add(arrayList2);
        }
        return wu0.W(arrayList);
    }

    public static long a(com.microsoft.clarity.p.e eVar, PayloadMetadata payloadMetadata, String str) {
        js3.p(eVar, "eventStore");
        js3.p(payloadMetadata, "payloadMetadata");
        js3.p(str, "serializedEvent");
        String strB = b(payloadMetadata);
        String strConcat = str.concat("\n");
        h hVar = h.APPEND;
        js3.p(strB, "filename");
        js3.p(strConcat, "content");
        js3.p(hVar, "mode");
        com.microsoft.clarity.p.c cVar = new com.microsoft.clarity.p.c(strConcat);
        File fileA = com.microsoft.clarity.p.f.a(eVar, strB, false, true, 2);
        cVar.invoke(new FileOutputStream(fileA, true));
        return fileA.length();
    }

    public static ArrayList a(com.microsoft.clarity.p.e eVar, PayloadMetadata payloadMetadata) throws IOException {
        js3.p(eVar, "store");
        js3.p(payloadMetadata, "payloadMetadata");
        int i = 0;
        File fileA = com.microsoft.clarity.p.f.a(eVar, b(payloadMetadata), false, false, 6);
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileA), zp0.a), 8192);
        try {
            for (String str : (u21) ry7.p(bufferedReader)) {
                int length = f88.J0(str).toString().length();
                i += length;
                if (i > 31457280) {
                    break;
                }
                if (length > 0) {
                    arrayList.add(str);
                }
            }
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public final com.microsoft.clarity.p.g a(AssetType assetType) {
        int i = f.a[assetType.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.d;
        }
        if (i == 3) {
            return this.f;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Unexpected asset type");
    }

    public static String a(String str, String str2) {
        js3.p(str, "sessionId");
        js3.p(str2, "filename");
        return ew.O0(62, String.valueOf(File.separatorChar), new String[]{str, str2});
    }
}
