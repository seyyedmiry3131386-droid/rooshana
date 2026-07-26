package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;

/* JADX INFO: loaded from: classes3.dex */
public final class xr1 implements nr1 {
    public static final String f = rk1.a("DownloadEventsLogger");
    public Context a;
    public ee b;
    public wt c;
    public final ps1 d;
    public final wr1 e = new wr1(this);

    public xr1(ps1 ps1Var) {
        this.d = ps1Var;
        ps1Var.u(this);
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        String str;
        boolean zP = this.d.p();
        wr1 wr1Var = this.e;
        if (zP) {
            if (!wr1Var.a) {
                wr1Var.a();
                ContextCompat.registerReceiver(wr1Var.d.a, wr1Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
                wr1Var.a = true;
            }
        } else if (wr1Var.a) {
            wr1Var.d.a.unregisterReceiver(wr1Var);
            wr1Var.a = false;
        }
        if (i == 250) {
            str = "Download added to Nene";
        } else if (i == 251) {
            str = "Download state changed";
        } else {
            if (i != 252) {
                throw new RuntimeException(rm7.n(i, "Download info change type is not valid: "));
            }
            str = "Download removed from Nene";
        }
        String strQ = eq.q(es1Var);
        int iU = eq.u(es1Var);
        int iO = eq.o(es1Var);
        StringBuilder sb = new StringBuilder(32);
        sb.append("app:");
        sb.append(strQ);
        sb.append('(');
        sb.append(iU);
        sb.append("), status:");
        sb.append(dh5.a(es1Var.g));
        sb.append(", size:");
        sb.append(es1Var.i);
        sb.append('/');
        sb.append(es1Var.h);
        if (iO != 10) {
            sb.append(", file_type:");
            if (iO == 20) {
                sb.append("data_main");
            } else if (iO == 30) {
                sb.append("data_patch");
            } else {
                if (iO != 40) {
                    throw new RuntimeException(rm7.n(iO, "Download file type is not valid: "));
                }
                sb.append("split_");
                sb.append(eq.t(es1Var));
            }
        }
        if (es1Var.g == 102) {
            sb.append(", url:");
            sb.append(es1Var.b);
        }
        sb7.p(f, str, sb.toString());
        if (eq.o(es1Var) != 10) {
            return;
        }
        String strQ2 = eq.q(es1Var);
        Bundle bundle = new Bundle();
        bundle.putString("package_name", strQ2);
        if (i == 252) {
            this.b.a(bundle, "download_remove");
            return;
        }
        if (i == 250) {
            boolean zD = ((AppUpdateRepositoryImpl) this.c).d(eq.u(es1Var), strQ2);
            bundle.putBoolean(AppStatusDto.Type.UPDATE, zD);
            this.b.a(bundle, "download_add");
            if (zD) {
                this.b.a(bundle, "download_add_update");
            } else {
                this.b.a(bundle, "download_add_fresh");
            }
        }
        int i2 = es1Var.f;
        if (i2 == 100) {
            if (es1Var.g == 101) {
                boolean z = es1Var.h < 0;
                bundle.putBoolean("new", z);
                this.b.a(bundle, "download_start");
                if (z) {
                    this.b.a(null, "download_start_new");
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 110) {
            this.b.a(bundle, "download_wait");
            return;
        }
        if (i2 == 120) {
            this.b.a(bundle, "download_pause");
            return;
        }
        if (i2 == 130) {
            bundle.putString("reason", dh5.a(es1Var.g));
            this.b.a(bundle, "download_fail");
        } else if (i2 == 140) {
            this.b.a(bundle, "download_finish");
        } else if (i2 != 150) {
            lw.g(null, "Download status is not valid", Integer.valueOf(i2));
        } else {
            this.b.a(bundle, "download_reset");
        }
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
    }
}
