package androidx.datastore.preferences;

import defpackage.qp2;
import defpackage.rp2;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final LinkedHashSet a = new LinkedHashSet();

    public static final rp2 a() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1(3, null);
    }

    public static final qp2 b(Set set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }
}
