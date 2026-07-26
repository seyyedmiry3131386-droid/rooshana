package com.microsoft.clarity.o;

import android.content.Context;
import android.net.Uri;
import com.microsoft.clarity.g.L;
import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.models.AssetType;
import com.microsoft.clarity.models.SessionMetadata;
import com.microsoft.clarity.models.ingest.AssetCheck;
import com.microsoft.clarity.models.ingest.CollectRequest;
import com.microsoft.clarity.models.ingest.Envelope;
import com.microsoft.clarity.models.ingest.PayloadUploadResponse;
import com.microsoft.clarity.models.ingest.SerializedSessionPayload;
import com.microsoft.clarity.models.repositories.ImageRepositoryAsset;
import com.microsoft.clarity.models.repositories.RepositoryAsset;
import com.microsoft.clarity.models.repositories.WebRepositoryAsset;
import com.microsoft.clarity.q.k;
import defpackage.dp2;
import defpackage.js3;
import defpackage.wu0;
import defpackage.zp0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a {
    public final Context a;
    public final h0 b;
    public final L c;

    public f(Context context, h0 h0Var, L l) {
        js3.p(context, "context");
        js3.p(h0Var, "telemetryTracker");
        this.a = context;
        this.b = h0Var;
        this.c = l;
    }

    public final PayloadUploadResponse a(SessionMetadata sessionMetadata, SerializedSessionPayload serializedSessionPayload) {
        js3.p(sessionMetadata, "sessionMetadata");
        js3.p(serializedSessionPayload, "serializedSessionPayload");
        String string = Uri.parse(sessionMetadata.getIngestUrl()).buildUpon().appendPath("collect").build().toString();
        js3.o(string, "parse(ingestUrl)\n       …)\n            .toString()");
        String botDetectionToken = sessionMetadata.getBotDetectionToken();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("Content-Type", "application/json"));
        linkedHashMapO.put("Accept", "application/x-clarity-gzip");
        linkedHashMapO.put("Accept-Encoding", "gzip, deflate, br");
        String packageName = this.a.getPackageName();
        js3.o(packageName, "context.packageName");
        linkedHashMapO.put("ApplicationPackage", packageName);
        if (botDetectionToken != null) {
            linkedHashMapO.put("X-Clarity-DTRS", botDetectionToken);
        }
        HttpURLConnection httpURLConnectionA = k.a(string, "POST", linkedHashMapO);
        try {
            long jA = k.a(httpURLConnectionA, true, (dp2) new e(new CollectRequest(new Envelope(sessionMetadata, serializedSessionPayload.getPageNum(), serializedSessionPayload.getSequence(), serializedSessionPayload.getStart(), serializedSessionPayload.getDuration()), serializedSessionPayload.getEvents(), serializedSessionPayload.getFrames())));
            httpURLConnectionA.connect();
            PayloadUploadResponse payloadUploadResponseCreate = PayloadUploadResponse.Companion.create(httpURLConnectionA.getResponseCode(), k.a(httpURLConnectionA));
            if (payloadUploadResponseCreate.getSuccessful()) {
                a("Clarity_UploadSessionSegmentBytes", jA);
                L l = this.c;
                if (l != null) {
                    l.a(jA);
                }
            }
            httpURLConnectionA.disconnect();
            return payloadUploadResponseCreate;
        } catch (Throwable th) {
            httpURLConnectionA.disconnect();
            throw th;
        }
    }

    public final boolean a(SessionMetadata sessionMetadata, RepositoryAsset repositoryAsset) throws IOException {
        String string;
        String str;
        js3.p(sessionMetadata, "sessionMetadata");
        js3.p(repositoryAsset, "asset");
        boolean z = true;
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("Content-Type", "application/octet-stream"));
        if (!(repositoryAsset instanceof WebRepositoryAsset)) {
            Uri.Builder builderAppendPath = Uri.parse(sessionMetadata.getIngestUrl()).buildUpon().appendPath(sessionMetadata.getProjectId()).appendPath("upload-asset").appendPath(repositoryAsset.getId()).appendPath(String.valueOf(repositoryAsset.getType().ordinal()));
            if (repositoryAsset instanceof ImageRepositoryAsset) {
                ImageRepositoryAsset imageRepositoryAsset = (ImageRepositoryAsset) repositoryAsset;
                builderAppendPath.appendQueryParameter("width", Long.toString(((long) imageRepositoryAsset.getSize().m20getWidthpVg5ArA()) & 4294967295L, 10)).appendQueryParameter("height", Long.toString(4294967295L & ((long) imageRepositoryAsset.getSize().m19getHeightpVg5ArA()), 10));
            }
            string = builderAppendPath.build().toString();
            js3.o(string, "uri\n            .build()\n            .toString()");
            linkedHashMapO.put("Content-Hash", repositoryAsset.getId());
            str = "Clarity_UploadAssetBytes";
        } else {
            string = Uri.parse(sessionMetadata.getIngestUrl()).buildUpon().appendPath(sessionMetadata.getProjectId()).appendPath("upload-web-asset").appendPath(((WebRepositoryAsset) repositoryAsset).getVersion()).build().toString();
            js3.o(string, "parse(sessionMetadata.in…)\n            .toString()");
            linkedHashMapO.put("Content-Path", repositoryAsset.getId());
            str = "Clarity_UploadWebAssetBytes";
        }
        HttpURLConnection httpURLConnectionA = k.a(string, "POST", linkedHashMapO);
        try {
            if (repositoryAsset.getType() != AssetType.Typeface) {
                z = false;
            }
            long jA = k.a(httpURLConnectionA, z, new d(repositoryAsset));
            httpURLConnectionA.connect();
            boolean zB = k.b(httpURLConnectionA);
            if (zB) {
                a(str, jA);
                L l = this.c;
                if (l != null) {
                    l.a(jA);
                }
            }
            return zB;
        } finally {
            httpURLConnectionA.disconnect();
        }
    }

    public final Map a(SessionMetadata sessionMetadata, ArrayList arrayList) throws IOException {
        js3.p(sessionMetadata, "sessionMetadata");
        js3.p(arrayList, "assets");
        if (arrayList.isEmpty()) {
            return kotlin.collections.b.I();
        }
        String string = Uri.parse(sessionMetadata.getIngestUrl()).buildUpon().appendPath(sessionMetadata.getProjectId()).appendPath("check-asset").build().toString();
        js3.o(string, "parse(ingestUrl)\n       …)\n            .toString()");
        HttpURLConnection httpURLConnectionA = k.a(string, "POST", kotlin.collections.b.M(new Pair("Content-Type", "application/json")));
        try {
            ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AssetCheck) it.next()).toJsonObject());
            }
            String string2 = new JSONArray((Collection) arrayList2).toString();
            js3.o(string2, "JSONArray(assets.map { i…sonObject() }).toString()");
            byte[] bytes = string2.getBytes(zp0.a);
            js3.o(bytes, "this as java.lang.String).getBytes(charset)");
            long length = bytes.length;
            js3.p(httpURLConnectionA, "urlConnection");
            k.a(httpURLConnectionA, false, (dp2) new com.microsoft.clarity.q.i(bytes));
            httpURLConnectionA.connect();
            String strA = k.a(httpURLConnectionA);
            long length2 = length + ((long) strA.length());
            if (k.b(httpURLConnectionA)) {
                a("Clarity_CheckAssetBytes", length2);
                L l = this.c;
                if (l != null) {
                    l.a(length2);
                }
            }
            JSONObject jSONObject = new JSONObject(strA);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            js3.o(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                js3.o(next, "key");
                Object obj = jSONObject.get(next);
                js3.o(obj, "jsonObject.get(key)");
                linkedHashMap.put(next, obj);
            }
            httpURLConnectionA.disconnect();
            return linkedHashMap;
        } catch (Throwable th) {
            httpURLConnectionA.disconnect();
            throw th;
        }
    }

    public final void a(String str, double d) {
        try {
            new c(str, d, this).invoke();
        } catch (Exception unused) {
        }
    }
}
