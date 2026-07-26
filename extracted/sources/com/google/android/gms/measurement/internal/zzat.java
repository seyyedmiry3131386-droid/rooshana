package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.lq9;
import defpackage.rq4;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzat {
    final /* synthetic */ zzav zza;
    private final String zzb;
    private long zzc;

    public zzat(zzav zzavVar, String str) {
        Objects.requireNonNull(zzavVar);
        this.zza = zzavVar;
        rq4.k(str);
        this.zzb = str;
        this.zzc = -1L;
    }

    public final List zza() {
        List list;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.zza.zze().query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.zzb, String.valueOf(this.zzc)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.zzc) {
                            this.zzc = j;
                        }
                        try {
                            lq9 lq9Var = (lq9) zzpk.zzw(z.z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            lq9Var.o(string);
                            long j3 = cursorQuery.getLong(2);
                            lq9Var.b();
                            ((z) lq9Var.b).G(j3);
                            arrayList.add(new zzas(j, j2, z, (z) lq9Var.e()));
                        } catch (IOException e) {
                            this.zza.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(this.zzb), e);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    list = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                this.zza.zzu.zzaV().zzb().zzc("Data loss. Error querying raw events batch. appId", zzgu.zzl(this.zzb), e2);
                list = arrayList;
            }
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public zzat(zzav zzavVar, String str, long j) {
        Objects.requireNonNull(zzavVar);
        this.zza = zzavVar;
        rq4.k(str);
        this.zzb = str;
        this.zzc = zzavVar.zzah("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }
}
