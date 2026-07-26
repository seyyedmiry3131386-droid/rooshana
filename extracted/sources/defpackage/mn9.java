package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mn9 implements zzlk {
    public final /* synthetic */ yo9 a;

    public mn9(yo9 yo9Var) {
        this.a = yo9Var;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) {
        yo9 yo9Var = this.a;
        yo9Var.c(new oo9(yo9Var, null, str, str2, bundle, true, true));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzb(String str, String str2, Bundle bundle, long j) {
        Long lValueOf = Long.valueOf(j);
        yo9 yo9Var = this.a;
        yo9Var.c(new oo9(yo9Var, lValueOf, str, str2, bundle, true, false));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zze(zzjp zzjpVar) {
        this.a.f(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzf(zzjq zzjqVar) {
        this.a.g(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzg(zzjq zzjqVar) {
        this.a.h(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        bn9 bn9Var = new bn9();
        yo9 yo9Var = this.a;
        yo9Var.c(new fo9(yo9Var, bn9Var, 3));
        return (String) bn9.m0(bn9Var.L(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        bn9 bn9Var = new bn9();
        yo9 yo9Var = this.a;
        yo9Var.c(new fo9(yo9Var, bn9Var, 4));
        return (String) bn9.m0(bn9Var.L(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        bn9 bn9Var = new bn9();
        yo9 yo9Var = this.a;
        yo9Var.c(new fo9(yo9Var, bn9Var, 1));
        return (String) bn9.m0(bn9Var.L(50L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        bn9 bn9Var = new bn9();
        yo9 yo9Var = this.a;
        yo9Var.c(new fo9(yo9Var, bn9Var, 0));
        return (String) bn9.m0(bn9Var.L(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.a.j();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        yo9 yo9Var = this.a;
        yo9Var.c(new xn9(yo9Var, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        yo9 yo9Var = this.a;
        yo9Var.c(new xn9(yo9Var, str, 2));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        yo9 yo9Var = this.a;
        yo9Var.c(new vn9(yo9Var, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) {
        yo9 yo9Var = this.a;
        yo9Var.c(new wn9(yo9Var, str, str2, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        return this.a.i(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        return this.a.b(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Object zzx(int i) {
        bn9 bn9Var = new bn9();
        yo9 yo9Var = this.a;
        yo9Var.c(new lo9(yo9Var, bn9Var, i));
        return bn9.m0(bn9Var.L(15000L), Object.class);
    }
}
