package com.microsoft.clarity.g;

import com.microsoft.clarity.models.telemetry.AggregatedMetric;
import defpackage.bp2;
import defpackage.js3;
import defpackage.m88;
import defpackage.tx8;
import defpackage.wu0;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends Lambda implements bp2 {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, ArrayList arrayList) {
        super(0);
        this.a = h0Var;
        this.b = arrayList;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        String str;
        h0 h0Var = this.a;
        com.microsoft.clarity.o.i iVar = h0Var.c;
        String str2 = h0Var.a;
        ArrayList arrayList = this.b;
        iVar.getClass();
        js3.p(str2, "projectId");
        js3.p(arrayList, "metrics");
        if (iVar.a == null) {
            str = null;
        } else {
            URL url = new URL(iVar.a);
            str = url.getProtocol() + "://" + url.getHost() + '/' + m88.X("report/project/{pid}/metrics", "{pid}", str2);
        }
        if (str != null) {
            ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AggregatedMetric) it.next()).toJsonObject());
            }
            String string = new JSONArray((Collection) arrayList2).toString();
            js3.o(string, "JSONArray(metrics.map { …sonObject() }).toString()");
            com.microsoft.clarity.q.v.a(new com.microsoft.clarity.o.h(str, string));
        }
        return tx8.a;
    }
}
