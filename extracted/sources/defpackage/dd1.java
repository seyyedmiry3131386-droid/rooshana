package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Priority;
import com.google.common.collect.ImmutableList;
import io.sentry.instrumentation.file.a;
import io.sentry.instrumentation.file.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd1 implements q94, co4, hs4, ob7, a {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd1(long j, d30 d30Var) {
        this.a = j;
        this.b = d30Var;
    }

    @Override // defpackage.ob7
    public Object apply(Object obj) {
        d30 d30Var = (d30) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        String str = d30Var.a;
        Priority priority = d30Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(gk6.a(priority))}) < 1) {
            contentValues.put("backend_name", d30Var.a);
            contentValues.put("priority", Integer.valueOf(gk6.a(priority)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.co4
    public void c(xf3 xf3Var, int i) {
        go4 go4Var = (go4) this.b;
        xf3Var.R(go4Var.c, i, this.a);
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() {
        d dVar = (d) this.b;
        return Long.valueOf(dVar.a.skip(this.a));
    }

    @Override // defpackage.hs4
    public Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        return xq4Var.r(hq4Var, ImmutableList.s((jp4) this.b), 0, this.a);
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ((ce) obj).k((be) this.b, this.a);
    }

    public /* synthetic */ dd1(long j, Object obj) {
        this.b = obj;
        this.a = j;
    }
}
