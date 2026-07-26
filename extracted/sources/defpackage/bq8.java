package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzng;

/* JADX INFO: loaded from: classes.dex */
public final class bq8 implements v61, wt0, r46, qy1 {
    public static bq8 a;

    public static final zzng e(Object obj, Object obj2) {
        zzng zzngVarA = (zzng) obj;
        zzng zzngVar = (zzng) obj2;
        if (!zzngVar.isEmpty()) {
            if (!zzngVarA.a) {
                zzngVarA = zzngVarA.a();
            }
            zzngVarA.c();
            if (!zzngVar.isEmpty()) {
                zzngVarA.putAll(zzngVar);
            }
        }
        return zzngVarA;
    }

    @Override // defpackage.wt0
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.qy1
    public int b(Context context, String str, boolean z) {
        return sy1.d(context, str, z);
    }

    @Override // defpackage.qy1
    public int c(Context context, String str) {
        return sy1.a(context, str);
    }

    @Override // defpackage.r46
    public /* bridge */ /* synthetic */ Object d(f87 f87Var) {
        return null;
    }
}
