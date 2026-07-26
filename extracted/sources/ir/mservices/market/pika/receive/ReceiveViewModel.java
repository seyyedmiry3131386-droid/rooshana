package ir.mservices.market.pika.receive;

import defpackage.ap3;
import defpackage.bt2;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pv6;
import defpackage.rv6;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.receive.model.b;
import ir.mservices.market.viewModel.c;
import java.util.ArrayList;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ReceiveViewModel extends c {
    public final pv6 A;
    public final ArrayList B;
    public boolean C;
    public final ArrayList D;
    public final l E;
    public final rv6 F;
    public final NearbyRepository t;
    public final b u;
    public final ir.mservices.market.pika.receive.model.a v;
    public final ir.mservices.market.core.notification.a w;
    public final ArrayList x;
    public int y;
    public final i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveViewModel(NearbyRepository nearbyRepository, b bVar, ir.mservices.market.pika.receive.model.a aVar, ir.mservices.market.core.notification.a aVar2) {
        super(true);
        js3.p(nearbyRepository, "nearbyRepository");
        js3.p(bVar, "saveFileRepository");
        js3.p(aVar2, "notificationController");
        this.t = nearbyRepository;
        this.u = bVar;
        this.v = aVar;
        this.w = aVar2;
        this.x = new ArrayList();
        i iVarE = vy2.e(0, 7, null);
        this.z = iVarE;
        this.A = new pv6(iVarE);
        this.B = new ArrayList();
        this.D = new ArrayList();
        l lVarB = ja1.b(null);
        this.E = lVarB;
        this.F = new rv6(lVarB);
        bt2.G(y97.G(this), null, null, new ReceiveViewModel$initConnectionFlow$1(this, null), 3);
        bt2.G(y97.G(this), null, null, new ReceiveViewModel$initSessionCollector$1(this, null), 3);
        bt2.G(y97.G(this), null, null, new ReceiveViewModel$initSucceedFlow$1(this, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new ReceiveViewModel$doRequest$1(this, null), 3);
    }

    public final void r() {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            return;
        }
        ap3 ap3Var = (ap3) arrayList.get(0);
        boolean z = ap3Var.a;
        String str = ap3Var.c;
        long j = ap3Var.b;
        if (z) {
            s(j, str);
        } else {
            u(j, str);
        }
        arrayList.remove(0);
    }

    public final void s(long j, String str) {
        js3.p(str, "packageName");
        if (this.C) {
            this.v.c(j, str);
            this.B.add(new ap3(j, str, true));
        } else {
            String str2 = (String) this.u.c.get(Long.valueOf(j));
            if (str2 != null) {
                bt2.G(y97.G(this), null, null, new ReceiveViewModel$installAppWithPackageInstaller$1$1(this, j, str, str2, null), 3);
                this.C = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.lang.String r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.receive.ReceiveViewModel.t(java.lang.String, int, int):void");
    }

    public final void u(long j, String str) {
        js3.p(str, "packageName");
        if (this.C) {
            this.v.c(j, str);
            this.B.add(new ap3(j, str, false));
        } else {
            String str2 = (String) this.u.c.get(Long.valueOf(j));
            if (str2 != null) {
                bt2.G(y97.G(this), null, null, new ReceiveViewModel$installSplitApp$1$1(this, j, str, str2, null), 3);
                this.C = true;
            }
        }
    }
}
