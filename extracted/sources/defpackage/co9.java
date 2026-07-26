package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzhu;
import io.sentry.android.core.t0;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class co9 extends po9 {
    public final /* synthetic */ int e = 4;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co9(b92 b92Var, Activity activity2, bn9 bn9Var) {
        super((yo9) b92Var.b, true);
        this.h = activity2;
        this.f = bn9Var;
        this.g = b92Var;
    }

    @Override // defpackage.po9
    public final void a() {
        en9 en9VarAsInterface;
        Bundle bundle;
        switch (this.e) {
            case 0:
                try {
                    Context context = (Context) this.h;
                    rq4.n(context);
                    String strZza = zzhu.zza(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strZza)) {
                        strZza = zzhu.zza(context);
                    }
                    Boolean boolZzc = zzhu.zzc("google_analytics_force_disable_updates", resources, strZza);
                    yo9 yo9Var = (yo9) this.g;
                    boolean z = boolZzc == null || !boolZzc.booleanValue();
                    yo9Var.getClass();
                    try {
                        en9VarAsInterface = dn9.asInterface(sy1.c(context, z ? sy1.c : sy1.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule$LoadingException e) {
                        yo9Var.d(e, true, false);
                        en9VarAsInterface = null;
                    }
                    yo9Var.g = en9VarAsInterface;
                    if (yo9Var.g != null) {
                        int iA = sy1.a(context, ModuleDescriptor.MODULE_ID);
                        zzdd zzddVar = new zzdd(133005L, Math.max(iA, r7), Boolean.TRUE.equals(boolZzc) || sy1.d(context, ModuleDescriptor.MODULE_ID, false) < iA, (Bundle) this.f, zzhu.zza(context));
                        en9 en9Var = yo9Var.g;
                        rq4.n(en9Var);
                        en9Var.initialize(new dr5(context), zzddVar, this.a);
                    } else {
                        t0.m("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((yo9) this.g).d(e2, true, false);
                    return;
                }
                break;
            case 1:
                en9 en9Var2 = ((yo9) this.g).g;
                rq4.n(en9Var2);
                en9Var2.performAction((Bundle) this.f, (bn9) this.h, this.a);
                break;
            case 2:
                en9 en9Var3 = ((yo9) this.g).g;
                rq4.n(en9Var3);
                en9Var3.getMaxUserProperties((String) this.h, (bn9) this.f);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.f;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                en9 en9Var4 = ((yo9) ((b92) this.g).b).g;
                rq4.n(en9Var4);
                en9Var4.onActivityCreatedByScionActivityInfo(zzdf.u((Activity) this.h), bundle, this.b);
                break;
            default:
                en9 en9Var5 = ((yo9) ((b92) this.g).b).g;
                rq4.n(en9Var5);
                en9Var5.onActivitySaveInstanceStateByScionActivityInfo(zzdf.u((Activity) this.h), (bn9) this.f, this.b);
                break;
        }
    }

    @Override // defpackage.po9
    public void b() {
        switch (this.e) {
            case 1:
                ((bn9) this.h).I(null);
                break;
            case 2:
                ((bn9) this.f).I(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co9(b92 b92Var, Bundle bundle, Activity activity2) {
        super((yo9) b92Var.b, true);
        this.f = bundle;
        this.h = activity2;
        this.g = b92Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co9(yo9 yo9Var, Context context, Bundle bundle) {
        super(yo9Var, true);
        this.h = context;
        this.f = bundle;
        this.g = yo9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co9(yo9 yo9Var, Bundle bundle, bn9 bn9Var) {
        super(yo9Var, true);
        this.f = bundle;
        this.h = bn9Var;
        Objects.requireNonNull(yo9Var);
        this.g = yo9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co9(yo9 yo9Var, String str, bn9 bn9Var) {
        super(yo9Var, true);
        this.h = str;
        this.f = bn9Var;
        Objects.requireNonNull(yo9Var);
        this.g = yo9Var;
    }
}
