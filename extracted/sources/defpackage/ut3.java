package defpackage;

import android.content.Context;
import android.os.Process;
import androidx.datastore.core.CorruptionException;
import com.google.firebase.datastorage.a;
import io.sentry.android.core.t0;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ut3 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ ut3(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                CorruptionException corruptionException = (CorruptionException) obj;
                js3.p(corruptionException, "ex");
                t0.n(g27.a(a.class).d(), "CorruptionException in " + this.b.a + " DataStore running in process " + Process.myPid(), corruptionException);
                return new pb5(true);
            default:
                Context context = (Context) obj;
                js3.p(context, "it");
                String str = this.b.a;
                LinkedHashSet linkedHashSet = androidx.datastore.preferences.a.a;
                js3.p(str, "sharedPreferencesName");
                js3.p(linkedHashSet, "keysToMigrate");
                return br9.B(new androidx.datastore.migrations.a(context, str, androidx.datastore.preferences.a.b(linkedHashSet), androidx.datastore.preferences.a.a()));
        }
    }
}
