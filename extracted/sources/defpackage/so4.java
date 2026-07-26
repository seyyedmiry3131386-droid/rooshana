package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class so4 extends Binder implements qf3 {
    public final WeakReference n;

    public so4(go4 go4Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.n = new WeakReference(go4Var);
    }

    public static qf3 L(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof qf3)) {
            return (qf3) iInterfaceQueryLocalInterface;
        }
        pf3 pf3Var = new pf3();
        pf3Var.n = iBinder;
        return pf3Var;
    }

    @Override // defpackage.qf3
    public final void B(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iN0 = n0();
            if (iN0 == -1) {
                return;
            }
            try {
                m0(new j2(he6.o(iN0, bundle), new fe6(bundle2.getBoolean(fe6.d, false), bundle2.getBoolean(fe6.e, false)), 27));
            } catch (RuntimeException e) {
                wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // defpackage.qf3
    public final void E(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            o0(i, q54.a(bundle));
        } catch (RuntimeException e) {
            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // defpackage.qf3
    public final void b() {
        m0(new vj3(20));
    }

    @Override // defpackage.qf3
    public final void d(int i) {
        m0(new vj3(19));
    }

    @Override // defpackage.qf3
    public final void e0(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(fe6.d, z);
        bundle2.putBoolean(fe6.e, true);
        B(i, bundle, bundle2);
    }

    @Override // defpackage.qf3
    public final void g(int i, PendingIntent pendingIntent) {
        m0(new qo4(i, pendingIntent));
    }

    @Override // defpackage.qf3
    public final void k0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            o0(i, bq7.a(bundle));
        } catch (RuntimeException e) {
            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final void m0(ro4 ro4Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            go4 go4Var = (go4) this.n.get();
            if (go4Var == null) {
                return;
            }
            j29.a0(go4Var.a.e, new lo4(go4Var, ro4Var, 1));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final int n0() {
        eq7 eq7Var;
        go4 go4Var = (go4) this.n.get();
        if (go4Var == null || (eq7Var = go4Var.m) == null) {
            return -1;
        }
        return eq7Var.a.e();
    }

    public final void o0(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            go4 go4Var = (go4) this.n.get();
            if (go4Var == null) {
                return;
            }
            go4Var.b.e(i, obj);
            go4Var.a.j0(new zl(i, 5, go4Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        String str;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            parcel.readInt();
            String string = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle = (Bundle) ub1.l(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string)) {
                wn5.k0("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            } else if (i3 < 0) {
                str = "onChildrenChanged(): Ignoring negative itemCount: ";
                o40.E(i3, str, "MediaControllerStub");
            } else if (bundle == null) {
                m0(new vj3(21));
            } else {
                try {
                    mp4.a(bundle);
                    m0(new vj3(21));
                } catch (RuntimeException e) {
                    wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                }
            }
        } else if (i != 4002) {
            switch (i) {
                case 3001:
                    q(parcel.readInt(), (Bundle) ub1.l(parcel, Bundle.CREATOR));
                    return true;
                case 3002:
                    k0(parcel.readInt(), (Bundle) ub1.l(parcel, Bundle.CREATOR));
                    return true;
                case 3003:
                    E(parcel.readInt(), (Bundle) ub1.l(parcel, Bundle.CREATOR));
                    return true;
                case 3004:
                    int i4 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList != null) {
                        try {
                            int iN0 = n0();
                            if (iN0 != -1) {
                                lj3 lj3VarM = ImmutableList.m();
                                for (int i5 = 0; i5 < arrayListCreateTypedArrayList.size(); i5++) {
                                    Bundle bundle2 = (Bundle) arrayListCreateTypedArrayList.get(i5);
                                    bundle2.getClass();
                                    lj3VarM.O(cw0.d(iN0, bundle2));
                                }
                                m0(new p52(i4, 4, (List) lj3VarM.S()));
                            }
                        } catch (RuntimeException e2) {
                            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e2);
                        }
                    }
                    break;
                case 3005:
                    int i6 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    y(i6, (Bundle) ub1.l(parcel, creator), (Bundle) ub1.l(parcel, creator));
                    return true;
                case 3006:
                    parcel.readInt();
                    b();
                    return true;
                case 3007:
                    e0(parcel.readInt(), (Bundle) ub1.l(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3008:
                    w(parcel.readInt(), (Bundle) ub1.l(parcel, Bundle.CREATOR));
                    return true;
                case 3009:
                    t(parcel.readInt(), (Bundle) ub1.l(parcel, Bundle.CREATOR));
                    return true;
                case 3010:
                    parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) ub1.l(parcel, creator2);
                    Bundle bundle4 = (Bundle) ub1.l(parcel, creator2);
                    if (bundle3 != null && bundle4 != null) {
                        try {
                            try {
                                m0(new j2(xp7.a(bundle3), cb6.b(bundle4), 28));
                            } catch (RuntimeException e3) {
                                wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e3);
                            }
                        } catch (RuntimeException e4) {
                            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e4);
                        }
                    }
                    break;
                case 3011:
                    d(parcel.readInt());
                    return true;
                case 3012:
                    parcel.readInt();
                    Bundle bundle5 = (Bundle) ub1.l(parcel, Bundle.CREATOR);
                    if (bundle5 == null) {
                        wn5.k0("MediaControllerStub", "Ignoring null Bundle for extras");
                        return true;
                    }
                    m0(new qs3(5, bundle5));
                    return true;
                case 3013:
                    int i7 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    B(i7, (Bundle) ub1.l(parcel, creator3), (Bundle) ub1.l(parcel, creator3));
                    return true;
                case 3014:
                    g(parcel.readInt(), (PendingIntent) ub1.l(parcel, PendingIntent.CREATOR));
                    return true;
                case 3015:
                    try {
                        m0(new vj3(parcel.readInt(), yp7.a((Bundle) ub1.l(parcel, Bundle.CREATOR))));
                    } catch (RuntimeException e5) {
                        wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e5);
                    }
                    break;
                case 3016:
                    int i8 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList2 != null) {
                        try {
                            int iN02 = n0();
                            if (iN02 != -1) {
                                lj3 lj3VarM2 = ImmutableList.m();
                                for (int i9 = 0; i9 < arrayListCreateTypedArrayList2.size(); i9++) {
                                    Bundle bundle6 = (Bundle) arrayListCreateTypedArrayList2.get(i9);
                                    bundle6.getClass();
                                    lj3VarM2.O(cw0.d(iN02, bundle6));
                                }
                                m0(new p52(i8, 3, (List) lj3VarM2.S()));
                            }
                        } catch (RuntimeException e6) {
                            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e6);
                        }
                    }
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel.readInt();
            String string2 = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle7 = (Bundle) ub1.l(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string2)) {
                wn5.k0("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            } else if (i3 < 0) {
                str = "onSearchResultChanged(): Ignoring negative itemCount: ";
                o40.E(i3, str, "MediaControllerStub");
            } else if (bundle7 == null) {
                m0(new vj3(21));
            } else {
                try {
                    mp4.a(bundle7);
                    m0(new vj3(21));
                } catch (RuntimeException e7) {
                    wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e7);
                }
            }
        }
        return true;
    }

    @Override // defpackage.qf3
    public final void q(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m0(new qs3(6, a21.a(bundle)));
        } catch (RuntimeException e) {
            wn5.l0("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            b();
        }
    }

    @Override // defpackage.qf3
    public final void t(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m0(new po4(cb6.b(bundle)));
        } catch (RuntimeException e) {
            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // defpackage.qf3
    public final void w(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m0(new qs3(4, aq7.b(bundle)));
        } catch (RuntimeException e) {
            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // defpackage.qf3
    public final void y(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            wn5.k0("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            m0(new p52(i, wp7.a(bundle), bundle2));
        } catch (RuntimeException e) {
            wn5.l0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
