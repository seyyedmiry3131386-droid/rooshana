package androidx.datastore.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import defpackage.dp2;
import defpackage.g51;
import defpackage.jr9;
import defpackage.tb1;
import defpackage.tx8;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {42}, m = "invokeSuspend", v = 1)
final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ androidx.datastore.migrations.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(androidx.datastore.migrations.a aVar, g51 g51Var) {
        super(1, g51Var);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Context context;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        this.a = 1;
        androidx.datastore.migrations.a aVar = this.b;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) aVar.e.getValue()).edit();
        Set set = aVar.f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) aVar.e.getValue()).getAll().isEmpty() && (context = aVar.c) != null && (str = aVar.d) != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                jr9.g(context, str);
            } else {
                File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                File file2 = new File(file.getPath() + ".bak");
                file.delete();
                file2.delete();
            }
        }
        if (set != null) {
            set.clear();
        }
        return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
