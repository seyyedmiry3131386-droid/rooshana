package ir.mservices.market.pika.connect;

import android.os.Parcelable;
import defpackage.bt2;
import defpackage.d9;
import defpackage.dp0;
import defpackage.dt2;
import defpackage.fu0;
import defpackage.gf2;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.p76;
import defpackage.rv6;
import defpackage.uq3;
import defpackage.xt3;
import defpackage.y97;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.connect.ConnectionType;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaConnectViewModel extends c {
    public final gf2 A;
    public final NearbyRepository t;
    public final p76 u;
    public final l v;
    public final rv6 w;
    public xt3 x;
    public final a y;
    public final dp0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaConnectViewModel(jd7 jd7Var, NearbyRepository nearbyRepository) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(nearbyRepository, "nearbyRepository");
        this.t = nearbyRepository;
        if (!jd7Var.a("connectionType")) {
            throw new IllegalArgumentException("Required argument \"connectionType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ConnectionType.class) && !Serializable.class.isAssignableFrom(ConnectionType.class)) {
            throw new UnsupportedOperationException(ConnectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ConnectionType connectionType = (ConnectionType) jd7Var.b("connectionType");
        if (connectionType == null) {
            throw new IllegalArgumentException("Argument \"connectionType\" is marked as non-null but was passed a null value");
        }
        this.u = new p76(connectionType);
        l lVarB = ja1.b("");
        this.v = lVarB;
        this.w = new rv6(lVarB);
        a aVarB = dt2.b(0, 7, null);
        this.y = aVarB;
        this.z = new dp0(aVarB, false);
        this.A = new gf2(new d9(3, kotlin.collections.a.e0(new uq3(0, 60, 1))), new PikaConnectViewModel$timeOutTimer$1(2, null), 4);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        ConnectionType connectionType = this.u.a;
        boolean z = connectionType instanceof ConnectionType.Advertise;
        NearbyRepository nearbyRepository = this.t;
        if (z) {
            nearbyRepository.stopAdvertising();
        } else if (connectionType instanceof ConnectionType.Discover) {
            nearbyRepository.stopDiscovery();
        }
        xt3 xt3Var = this.x;
        if (xt3Var != null) {
            xt3Var.g(null);
        }
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        ConnectionType connectionType = this.u.a;
        boolean z = connectionType instanceof ConnectionType.Advertise;
        NearbyRepository nearbyRepository = this.t;
        if (z) {
            r();
            nearbyRepository.startAdvertising();
        } else if (connectionType instanceof ConnectionType.Discover) {
            r();
            nearbyRepository.startDiscovering();
        }
    }

    public final void r() {
        xt3 xt3Var = this.x;
        if (xt3Var != null) {
            xt3Var.g(null);
        }
        fu0 fu0VarG = y97.G(this);
        xt3 xt3VarA = kotlinx.coroutines.a.a();
        this.x = xt3VarA;
        bt2.G(fu0VarG, xt3VarA, null, new PikaConnectViewModel$startTimeOutFlow$2(this, null), 2);
    }
}
