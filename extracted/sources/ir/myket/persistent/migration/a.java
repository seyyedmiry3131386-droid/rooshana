package ir.myket.persistent.migration;

import android.content.Context;
import defpackage.br9;
import defpackage.js3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final List a(Context context) {
        js3.p(context, "context");
        return br9.B(new androidx.datastore.migrations.a(context, "MyketSharedPref", new MyketDataStoreMigrationKt$getMigrationsList$1(2, null), new MyketDataStoreMigrationKt$getMigrationsList$2(3, null)));
    }
}
