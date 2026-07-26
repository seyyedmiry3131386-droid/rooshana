package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.j0;
import defpackage.av9;
import j$.util.Objects;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends zzab {
    final /* synthetic */ zzad zza;
    private final e zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzad zzadVar, String str, int i, e eVar) {
        super(str, i);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = eVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int zza() {
        return this.zzh.q();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l, Long l2, j0 j0Var, boolean z) {
        av9.a();
        zzic zzicVar = this.zza.zzu;
        boolean zZzp = zzicVar.zzc().zzp(this.zzb, zzfy.zzaD);
        e eVar = this.zzh;
        boolean zT = eVar.t();
        boolean zU = eVar.u();
        boolean zW = eVar.w();
        Object[] objArr = zT || zU || zW;
        Boolean boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        if (z && objArr != true) {
            zzicVar.zzaV().zzk().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), eVar.p() ? Integer.valueOf(eVar.q()) : null);
            return true;
        }
        c cVarS = eVar.s();
        boolean zU2 = cVarS.u();
        if (j0Var.u()) {
            if (cVarS.r()) {
                boolZze = zzab.zze(zzab.zzg(j0Var.v(), cVarS.s()), zU2);
            } else {
                zzicVar.zzaV().zze().zzb("No number filter for long property. property", zzicVar.zzl().zzc(j0Var.r()));
            }
        } else if (j0Var.y()) {
            if (cVarS.r()) {
                boolZze = zzab.zze(zzab.zzh(j0Var.z(), cVarS.s()), zU2);
            } else {
                zzicVar.zzaV().zze().zzb("No number filter for double property. property", zzicVar.zzl().zzc(j0Var.r()));
            }
        } else if (!j0Var.s()) {
            zzicVar.zzaV().zze().zzb("User property has no value, property", zzicVar.zzl().zzc(j0Var.r()));
        } else if (cVarS.p()) {
            boolZze = zzab.zze(zzab.zzf(j0Var.t(), cVarS.q(), zzicVar.zzaV()), zU2);
        } else if (!cVarS.r()) {
            zzicVar.zzaV().zze().zzb("No string or number filter defined. property", zzicVar.zzl().zzc(j0Var.r()));
        } else if (zzpk.zzm(j0Var.t())) {
            boolZze = zzab.zze(zzab.zzi(j0Var.t(), cVarS.s()), zU2);
        } else {
            zzicVar.zzaV().zze().zzc("Invalid user property value for Numeric number filter. property, value", zzicVar.zzl().zzc(j0Var.r()), j0Var.t());
        }
        zzicVar.zzaV().zzk().zzb("Property filter result", boolZze == null ? Ssh2PublicKeyAlgorithmName.NULL : boolZze);
        if (boolZze == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (!zW || boolZze.booleanValue()) {
            if (!z || eVar.t()) {
                this.zze = boolZze;
            }
            if (boolZze.booleanValue() && objArr != false && j0Var.p()) {
                long jQ = j0Var.q();
                if (l != null) {
                    jQ = l.longValue();
                }
                if (zZzp && eVar.t() && !eVar.u() && l2 != null) {
                    jQ = l2.longValue();
                }
                if (eVar.u()) {
                    this.zzg = Long.valueOf(jQ);
                    return true;
                }
                this.zzf = Long.valueOf(jQ);
            }
        }
        return true;
    }
}
