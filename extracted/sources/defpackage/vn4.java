package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn4 implements co4, ob7, nd8 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vn4(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    @Override // defpackage.ob7
    public Object apply(Object obj) {
        String str = (String) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((LogEventDropped$Reason) this.c).a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.a;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.co4
    public void c(xf3 xf3Var, int i) {
        xf3Var.n(((go4) this.b).c, i, ((jp4) this.c).c(true), this.a);
    }

    @Override // defpackage.nd8
    public Object execute() {
        v24 v24Var = (v24) this.b;
        d30 d30Var = (d30) this.c;
        i42 i42Var = (i42) v24Var.c;
        long jA = ((wt0) v24Var.g).a() + this.a;
        qb7 qb7Var = (qb7) i42Var;
        qb7Var.getClass();
        qb7Var.g(new dd1(jA, d30Var));
        return null;
    }
}
