package defpackage;

import com.google.android.gms.measurement.internal.zzjo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class pm9 {
    public static final ImmutableList a;
    public static final ImmutableList b;
    public static final ImmutableList c;

    static {
        ImmutableSet.s("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
        mj3 mj3Var = ImmutableList.b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        tv8.f(7, objArr);
        a = ImmutableList.l(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        tv8.f(3, objArr2);
        b = ImmutableList.l(3, objArr2);
        c = ImmutableList.t("_r", "_dbg");
        lj3 lj3Var = new lj3(4);
        lj3Var.P(zzjo.zza);
        lj3Var.P(zzjo.zzb);
        lj3Var.S();
        ImmutableList.t("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
