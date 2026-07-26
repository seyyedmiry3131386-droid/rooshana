package androidx.room;

import android.content.Context;
import defpackage.g27;
import defpackage.ps0;
import defpackage.qa;
import defpackage.t15;
import ir.myket.persistent.db.MyketDatabase;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Context b;
    public qa f;
    public qa g;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final RoomDatabase$JournalMode h = RoomDatabase$JournalMode.a;
    public final long i = -1;
    public final t15 j = new t15(10);
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final ArrayList m = new ArrayList();
    public final boolean n = true;
    public final boolean o = true;
    public final ps0 a = g27.a(MyketDatabase.class);
    public final String c = "myket_database";

    public c(Context context) {
        this.b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0217, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.room.d a() {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c.a():androidx.room.d");
    }
}
