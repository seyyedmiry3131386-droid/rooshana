package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.internal.nearby.zzka;
import com.google.android.gms.internal.nearby.zzlo;
import com.google.android.gms.internal.nearby.zzlq;
import com.google.android.gms.internal.nearby.zzls;
import com.google.android.gms.internal.nearby.zzlw;
import com.google.android.gms.internal.nearby.zzly;
import com.google.android.gms.internal.nearby.zzmc;
import com.google.android.gms.internal.nearby.zzme;
import com.google.android.gms.internal.nearby.zzmi;
import com.google.android.gms.internal.nearby.zzmk;
import com.google.android.gms.internal.nearby.zzmo;
import com.google.android.gms.internal.nearby.zzms;
import com.google.android.gms.internal.nearby.zzmw;
import com.google.android.gms.internal.nearby.zzna;
import com.google.android.gms.internal.nearby.zzne;
import com.google.android.gms.internal.nearby.zzni;
import com.google.android.gms.internal.nearby.zznm;
import com.google.android.gms.internal.nearby.zznr;
import com.google.android.gms.internal.nearby.zzox;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.zzo;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ds9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ds9(int i) {
        this.a = i;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        int i2 = getServiceRequest.a;
        uy6.I(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.c;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(i4);
        uy6.D(parcel, 4, getServiceRequest.d, false);
        uy6.y(parcel, 5, getServiceRequest.e);
        uy6.G(parcel, 6, getServiceRequest.f, i);
        uy6.v(parcel, 7, getServiceRequest.g);
        uy6.C(parcel, 8, getServiceRequest.h, i, false);
        uy6.G(parcel, 10, getServiceRequest.i, i);
        uy6.G(parcel, 11, getServiceRequest.j, i);
        boolean z = getServiceRequest.k;
        uy6.I(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.l;
        uy6.I(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.m;
        uy6.I(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uy6.D(parcel, 15, getServiceRequest.n, false);
        uy6.K(iJ, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        xr9 xr9Var;
        switch (this.a) {
            case 0:
                int iJ = cc7.J(parcel);
                zzox zzoxVar = null;
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        cc7.E(i, parcel);
                    } else {
                        zzoxVar = (zzox) cc7.j(parcel, i, zzox.CREATOR);
                    }
                }
                cc7.p(iJ, parcel);
                zzlo zzloVar = new zzlo();
                zzloVar.a = zzoxVar;
                return zzloVar;
            case 1:
                int iJ2 = cc7.J(parcel);
                zzox zzoxVar2 = null;
                zzmk zzmkVar = null;
                while (parcel.dataPosition() < iJ2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        zzoxVar2 = (zzox) cc7.j(parcel, i2, zzox.CREATOR);
                    } else if (c != 2) {
                        cc7.E(i2, parcel);
                    } else {
                        zzmkVar = (zzmk) cc7.j(parcel, i2, zzmk.CREATOR);
                    }
                }
                cc7.p(iJ2, parcel);
                zzlq zzlqVar = new zzlq();
                zzlqVar.a = zzoxVar2;
                zzlqVar.b = zzmkVar;
                return zzlqVar;
            case 2:
                int iJ3 = cc7.J(parcel);
                int iY = 0;
                zzox zzoxVar3 = null;
                while (parcel.dataPosition() < iJ3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        zzoxVar3 = (zzox) cc7.j(parcel, i3, zzox.CREATOR);
                    } else if (c2 != 2) {
                        cc7.E(i3, parcel);
                    } else {
                        iY = cc7.y(i3, parcel);
                    }
                }
                cc7.p(iJ3, parcel);
                zzls zzlsVar = new zzls();
                zzlsVar.a = zzoxVar3;
                zzlsVar.b = iY;
                return zzlsVar;
            case 3:
                int iJ4 = cc7.J(parcel);
                int iY2 = 0;
                int iY3 = 0;
                int iY4 = 0;
                while (parcel.dataPosition() < iJ4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iY2 = cc7.y(i4, parcel);
                    } else if (c3 == 2) {
                        iY3 = cc7.y(i4, parcel);
                    } else if (c3 != 3) {
                        cc7.E(i4, parcel);
                    } else {
                        iY4 = cc7.y(i4, parcel);
                    }
                }
                cc7.p(iJ4, parcel);
                zzlw zzlwVar = new zzlw();
                zzlwVar.a = iY2;
                zzlwVar.b = iY3;
                zzlwVar.c = iY4;
                return zzlwVar;
            case 4:
                int iJ5 = cc7.J(parcel);
                boolean zU = false;
                int iY5 = 0;
                int iY6 = 0;
                boolean zU2 = false;
                boolean zU3 = false;
                int[] iArrI = null;
                int[] iArrI2 = null;
                int[] iArrI3 = null;
                int[] iArrI4 = null;
                int[] iArrI5 = null;
                float fW = 0.0f;
                boolean zU4 = false;
                boolean zU5 = false;
                while (parcel.dataPosition() < iJ5) {
                    int i5 = parcel.readInt();
                    boolean z = zU3;
                    switch ((char) i5) {
                        case 1:
                            zU = cc7.u(i5, parcel);
                            break;
                        case 2:
                            zU4 = cc7.u(i5, parcel);
                            break;
                        case 3:
                            zU5 = cc7.u(i5, parcel);
                            break;
                        case 4:
                            iY5 = cc7.y(i5, parcel);
                            break;
                        case 5:
                            iY6 = cc7.y(i5, parcel);
                            break;
                        case 6:
                            iArrI = cc7.i(i5, parcel);
                            break;
                        case 7:
                            iArrI2 = cc7.i(i5, parcel);
                            break;
                        case '\b':
                            fW = cc7.w(i5, parcel);
                            break;
                        case '\t':
                            iArrI3 = cc7.i(i5, parcel);
                            break;
                        case '\n':
                            iArrI4 = cc7.i(i5, parcel);
                            break;
                        case 11:
                            iArrI5 = cc7.i(i5, parcel);
                            break;
                        case '\f':
                            zU2 = cc7.u(i5, parcel);
                            break;
                        case '\r':
                            zU3 = cc7.u(i5, parcel);
                            continue;
                        default:
                            cc7.E(i5, parcel);
                            break;
                    }
                    zU3 = z;
                }
                cc7.p(iJ5, parcel);
                zzly zzlyVar = new zzly();
                zzlyVar.a = zU;
                zzlyVar.b = zU4;
                zzlyVar.c = zU5;
                zzlyVar.d = iY5;
                zzlyVar.e = iY6;
                zzlyVar.f = iArrI;
                zzlyVar.g = iArrI2;
                zzlyVar.h = fW;
                zzlyVar.i = iArrI3;
                zzlyVar.j = iArrI4;
                zzlyVar.k = iArrI5;
                zzlyVar.l = zU2;
                zzlyVar.m = zU3;
                return zzlyVar;
            case 5:
                int iJ6 = cc7.J(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = GetServiceRequest.o;
                String strK = null;
                IBinder iBinderX = null;
                Account account = null;
                String strK2 = null;
                int iY7 = 0;
                int iY8 = 0;
                int iY9 = 0;
                boolean zU6 = false;
                int iY10 = 0;
                boolean zU7 = false;
                Feature[] featureArr = GetServiceRequest.p;
                Feature[] featureArr2 = featureArr;
                while (parcel.dataPosition() < iJ6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iY7 = cc7.y(i6, parcel);
                            break;
                        case 2:
                            iY8 = cc7.y(i6, parcel);
                            break;
                        case 3:
                            iY9 = cc7.y(i6, parcel);
                            break;
                        case 4:
                            strK = cc7.k(i6, parcel);
                            break;
                        case 5:
                            iBinderX = cc7.x(i6, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) cc7.n(parcel, i6, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = cc7.g(i6, parcel);
                            break;
                        case '\b':
                            account = (Account) cc7.j(parcel, i6, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            cc7.E(i6, parcel);
                            break;
                        case '\n':
                            featureArr = (Feature[]) cc7.n(parcel, i6, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr2 = (Feature[]) cc7.n(parcel, i6, Feature.CREATOR);
                            break;
                        case '\f':
                            zU6 = cc7.u(i6, parcel);
                            break;
                        case '\r':
                            iY10 = cc7.y(i6, parcel);
                            break;
                        case 14:
                            zU7 = cc7.u(i6, parcel);
                            break;
                        case 15:
                            strK2 = cc7.k(i6, parcel);
                            break;
                    }
                }
                cc7.p(iJ6, parcel);
                return new GetServiceRequest(iY7, iY8, iY9, strK, iBinderX, scopeArr, bundle, account, featureArr, featureArr2, zU6, iY10, zU7, strK2);
            case 6:
                int iJ7 = cc7.J(parcel);
                String strK3 = null;
                Boolean boolValueOf = null;
                String strK4 = null;
                String strK5 = null;
                while (parcel.dataPosition() < iJ7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 2) {
                        strK3 = cc7.k(i7, parcel);
                    } else if (c4 == 3) {
                        int iC = cc7.C(i7, parcel);
                        if (iC == 0) {
                            boolValueOf = null;
                        } else {
                            cc7.M(parcel, iC, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c4 == 4) {
                        strK4 = cc7.k(i7, parcel);
                    } else if (c4 != 5) {
                        cc7.E(i7, parcel);
                    } else {
                        strK5 = cc7.k(i7, parcel);
                    }
                }
                cc7.p(iJ7, parcel);
                return new AuthenticatorSelectionCriteria(strK3, strK4, strK5, boolValueOf);
            case 7:
                int iJ8 = cc7.J(parcel);
                String strK6 = null;
                Long lB = null;
                ArrayList arrayListM = null;
                String strK7 = null;
                int iY11 = 0;
                boolean zU8 = false;
                boolean zU9 = false;
                while (parcel.dataPosition() < iJ8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iY11 = cc7.y(i8, parcel);
                            break;
                        case 2:
                            strK6 = cc7.k(i8, parcel);
                            break;
                        case 3:
                            lB = cc7.B(i8, parcel);
                            break;
                        case 4:
                            zU8 = cc7.u(i8, parcel);
                            break;
                        case 5:
                            zU9 = cc7.u(i8, parcel);
                            break;
                        case 6:
                            arrayListM = cc7.m(i8, parcel);
                            break;
                        case 7:
                            strK7 = cc7.k(i8, parcel);
                            break;
                        default:
                            cc7.E(i8, parcel);
                            break;
                    }
                }
                cc7.p(iJ8, parcel);
                return new TokenData(iY11, strK6, lB, zU8, zU9, arrayListM, strK7);
            case 8:
                int iJ9 = cc7.J(parcel);
                zzni zzniVar = null;
                int iY12 = 0;
                byte[] bArrH = null;
                while (parcel.dataPosition() < iJ9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        zzniVar = (zzni) cc7.j(parcel, i9, zzni.CREATOR);
                    } else if (c5 == 2) {
                        iY12 = cc7.y(i9, parcel);
                    } else if (c5 != 3) {
                        cc7.E(i9, parcel);
                    } else {
                        bArrH = cc7.h(i9, parcel);
                    }
                }
                cc7.p(iJ9, parcel);
                zzmc zzmcVar = new zzmc();
                zzmcVar.a = zzniVar;
                zzmcVar.b = iY12;
                zzmcVar.c = bArrH;
                return zzmcVar;
            case 9:
                int iJ10 = cc7.J(parcel);
                float fW2 = 0.0f;
                int iY13 = 0;
                while (parcel.dataPosition() < iJ10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        iY13 = cc7.y(i10, parcel);
                    } else if (c6 != 2) {
                        cc7.E(i10, parcel);
                    } else {
                        fW2 = cc7.w(i10, parcel);
                    }
                }
                cc7.p(iJ10, parcel);
                zzme zzmeVar = new zzme();
                zzmeVar.a = iY13;
                zzmeVar.b = fW2;
                return zzmeVar;
            case 10:
                int iJ11 = cc7.J(parcel);
                int iY14 = 0;
                int iY15 = 0;
                int iY16 = 0;
                int iY17 = 0;
                int iY18 = 0;
                boolean zU10 = false;
                byte[] bArrH2 = null;
                zznr zznrVar = null;
                zzox[] zzoxVarArr = null;
                byte[] bArrH3 = null;
                zzox zzoxVar4 = null;
                zzlw zzlwVar2 = null;
                int iY19 = 0;
                while (parcel.dataPosition() < iJ11) {
                    int i11 = parcel.readInt();
                    boolean z2 = zU10;
                    switch ((char) i11) {
                        case 1:
                            iY14 = cc7.y(i11, parcel);
                            break;
                        case 2:
                            iY19 = cc7.y(i11, parcel);
                            break;
                        case 3:
                            bArrH2 = cc7.h(i11, parcel);
                            break;
                        case 4:
                            zznrVar = (zznr) cc7.j(parcel, i11, zznr.CREATOR);
                            break;
                        case 5:
                            iY15 = cc7.y(i11, parcel);
                            break;
                        case 6:
                            zzoxVarArr = (zzox[]) cc7.n(parcel, i11, zzox.CREATOR);
                            break;
                        case 7:
                            iY16 = cc7.y(i11, parcel);
                            break;
                        case '\b':
                            bArrH3 = cc7.h(i11, parcel);
                            break;
                        case '\t':
                            zzoxVar4 = (zzox) cc7.j(parcel, i11, zzox.CREATOR);
                            break;
                        case '\n':
                            zzlwVar2 = (zzlw) cc7.j(parcel, i11, zzlw.CREATOR);
                            break;
                        case 11:
                            iY17 = cc7.y(i11, parcel);
                            break;
                        case '\f':
                            iY18 = cc7.y(i11, parcel);
                            break;
                        case '\r':
                            zU10 = cc7.u(i11, parcel);
                            continue;
                        default:
                            cc7.E(i11, parcel);
                            break;
                    }
                    zU10 = z2;
                }
                cc7.p(iJ11, parcel);
                zzmi zzmiVar = new zzmi();
                zzmiVar.a = iY14;
                zzmiVar.b = iY19;
                zzmiVar.c = bArrH2;
                zzmiVar.d = zznrVar;
                zzmiVar.e = iY15;
                zzmiVar.f = zzoxVarArr;
                zzmiVar.g = iY16;
                zzmiVar.h = bArrH3;
                zzmiVar.i = zzoxVar4;
                zzmiVar.j = zzlwVar2;
                zzmiVar.k = iY17;
                zzmiVar.l = iY18;
                zzmiVar.m = zU10;
                return zzmiVar;
            case 11:
                int iJ12 = cc7.J(parcel);
                zzme zzmeVar2 = null;
                zzme zzmeVar3 = null;
                zzme zzmeVar4 = null;
                zzka zzkaVar = null;
                int iY20 = -128;
                long jA = 0;
                while (parcel.dataPosition() < iJ12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            zzmeVar2 = (zzme) cc7.j(parcel, i12, zzme.CREATOR);
                            break;
                        case 2:
                            zzmeVar3 = (zzme) cc7.j(parcel, i12, zzme.CREATOR);
                            break;
                        case 3:
                            zzmeVar4 = (zzme) cc7.j(parcel, i12, zzme.CREATOR);
                            break;
                        case 4:
                            jA = cc7.A(i12, parcel);
                            break;
                        case 5:
                            iY20 = cc7.y(i12, parcel);
                            break;
                        case 6:
                            zzkaVar = (zzka) cc7.j(parcel, i12, zzka.CREATOR);
                            break;
                        default:
                            cc7.E(i12, parcel);
                            break;
                    }
                }
                cc7.p(iJ12, parcel);
                return new zzmk(zzmeVar2, zzmeVar3, zzmeVar4, jA, iY20, zzkaVar);
            case 12:
                int iJ13 = cc7.J(parcel);
                xr9 xr9Var2 = null;
                IBinder iBinderX2 = null;
                zzlw zzlwVar3 = null;
                while (parcel.dataPosition() < iJ13) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        iBinderX2 = cc7.x(i13, parcel);
                    } else if (c7 != 2) {
                        cc7.E(i13, parcel);
                    } else {
                        zzlwVar3 = (zzlw) cc7.j(parcel, i13, zzlw.CREATOR);
                    }
                }
                cc7.p(iJ13, parcel);
                if (iBinderX2 != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderX2.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
                    xr9Var2 = iInterfaceQueryLocalInterface instanceof xr9 ? (xr9) iInterfaceQueryLocalInterface : new xr9(iBinderX2);
                }
                zzmo zzmoVar = new zzmo();
                zzmoVar.a = xr9Var2;
                zzmoVar.b = zzlwVar3;
                return zzmoVar;
            case 13:
                int iJ14 = cc7.J(parcel);
                int iY21 = 0;
                xr9 xr9Var3 = null;
                IBinder iBinderX3 = null;
                while (parcel.dataPosition() < iJ14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        iBinderX3 = cc7.x(i14, parcel);
                    } else if (c8 != 2) {
                        cc7.E(i14, parcel);
                    } else {
                        iY21 = cc7.y(i14, parcel);
                    }
                }
                cc7.p(iJ14, parcel);
                if (iBinderX3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderX3.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
                    xr9Var3 = iInterfaceQueryLocalInterface2 instanceof xr9 ? (xr9) iInterfaceQueryLocalInterface2 : new xr9(iBinderX3);
                }
                zzms zzmsVar = new zzms();
                zzmsVar.a = xr9Var3;
                zzmsVar.b = iY21;
                return zzmsVar;
            case 14:
                int iJ15 = cc7.J(parcel);
                xr9 xr9Var4 = null;
                IBinder iBinderX4 = null;
                zzni zzniVar2 = null;
                while (parcel.dataPosition() < iJ15) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        iBinderX4 = cc7.x(i15, parcel);
                    } else if (c9 != 2) {
                        cc7.E(i15, parcel);
                    } else {
                        zzniVar2 = (zzni) cc7.j(parcel, i15, zzni.CREATOR);
                    }
                }
                cc7.p(iJ15, parcel);
                if (iBinderX4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderX4.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
                    xr9Var4 = iInterfaceQueryLocalInterface3 instanceof xr9 ? (xr9) iInterfaceQueryLocalInterface3 : new xr9(iBinderX4);
                }
                zzmw zzmwVar = new zzmw();
                zzmwVar.a = xr9Var4;
                zzmwVar.b = zzniVar2;
                return zzmwVar;
            case 15:
                int iJ16 = cc7.J(parcel);
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
                Uri uri = null;
                byte[] bArrH4 = null;
                while (parcel.dataPosition() < iJ16) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 2) {
                        publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) cc7.j(parcel, i16, PublicKeyCredentialCreationOptions.CREATOR);
                    } else if (c10 == 3) {
                        uri = (Uri) cc7.j(parcel, i16, Uri.CREATOR);
                    } else if (c10 != 4) {
                        cc7.E(i16, parcel);
                    } else {
                        bArrH4 = cc7.h(i16, parcel);
                    }
                }
                cc7.p(iJ16, parcel);
                return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArrH4);
            case 16:
                int iJ17 = cc7.J(parcel);
                boolean zU11 = true;
                boolean zU12 = true;
                boolean zU13 = true;
                boolean zU14 = true;
                boolean zU15 = true;
                boolean zU16 = true;
                boolean zU17 = true;
                int iY22 = 0;
                boolean zU18 = false;
                boolean zU19 = false;
                boolean zU20 = false;
                int iY23 = 0;
                int iY24 = 0;
                long jA2 = 0;
                byte[] bArrH5 = null;
                int[] iArrI6 = null;
                int[] iArrI7 = null;
                byte[] bArrH6 = null;
                Strategy strategy = null;
                boolean zU21 = true;
                boolean zU22 = true;
                boolean zU23 = true;
                boolean zU24 = true;
                while (parcel.dataPosition() < iJ17) {
                    int i17 = parcel.readInt();
                    int i18 = iY22;
                    switch ((char) i17) {
                        case 1:
                            zU18 = cc7.u(i17, parcel);
                            break;
                        case 2:
                            zU11 = cc7.u(i17, parcel);
                            break;
                        case 3:
                            zU21 = cc7.u(i17, parcel);
                            break;
                        case 4:
                            zU22 = cc7.u(i17, parcel);
                            break;
                        case 5:
                            zU23 = cc7.u(i17, parcel);
                            break;
                        case 6:
                            zU24 = cc7.u(i17, parcel);
                            break;
                        case 7:
                            zU12 = cc7.u(i17, parcel);
                            break;
                        case '\b':
                            zU13 = cc7.u(i17, parcel);
                            break;
                        case '\t':
                            bArrH5 = cc7.h(i17, parcel);
                            break;
                        case '\n':
                            zU19 = cc7.u(i17, parcel);
                            break;
                        case 11:
                            zU14 = cc7.u(i17, parcel);
                            break;
                        case '\f':
                            zU15 = cc7.u(i17, parcel);
                            break;
                        case '\r':
                            iY22 = cc7.y(i17, parcel);
                            continue;
                        case 14:
                            iY24 = cc7.y(i17, parcel);
                            break;
                        case 15:
                            iArrI6 = cc7.i(i17, parcel);
                            break;
                        case 16:
                            iArrI7 = cc7.i(i17, parcel);
                            break;
                        case 17:
                            bArrH6 = cc7.h(i17, parcel);
                            break;
                        case 18:
                            strategy = (Strategy) cc7.j(parcel, i17, Strategy.CREATOR);
                            break;
                        case 19:
                            iY23 = cc7.y(i17, parcel);
                            break;
                        case 20:
                            jA2 = cc7.A(i17, parcel);
                            break;
                        case 21:
                            zU20 = cc7.u(i17, parcel);
                            break;
                        case 22:
                            zU17 = cc7.u(i17, parcel);
                            break;
                        case 23:
                            zU16 = cc7.u(i17, parcel);
                            break;
                        default:
                            cc7.E(i17, parcel);
                            break;
                    }
                    iY22 = i18;
                }
                int i19 = iY22;
                cc7.p(iJ17, parcel);
                ConnectionOptions connectionOptions = new ConnectionOptions();
                connectionOptions.a = zU18;
                connectionOptions.b = zU11;
                connectionOptions.c = zU21;
                connectionOptions.d = zU22;
                connectionOptions.e = zU23;
                connectionOptions.f = zU24;
                connectionOptions.g = zU12;
                connectionOptions.h = zU13;
                connectionOptions.i = bArrH5;
                connectionOptions.j = zU19;
                connectionOptions.k = zU14;
                connectionOptions.l = zU15;
                connectionOptions.m = i19;
                connectionOptions.n = iY24;
                connectionOptions.o = iArrI6;
                connectionOptions.p = iArrI7;
                connectionOptions.q = bArrH6;
                connectionOptions.r = strategy;
                connectionOptions.s = iY23;
                connectionOptions.t = jA2;
                connectionOptions.u = zU20;
                connectionOptions.v = zU17;
                connectionOptions.w = zU16;
                return connectionOptions;
            case 17:
                int iJ18 = cc7.J(parcel);
                ur9 ur9Var = null;
                IBinder iBinderX5 = null;
                zzmi zzmiVar2 = null;
                IBinder iBinderX6 = null;
                while (parcel.dataPosition() < iJ18) {
                    int i20 = parcel.readInt();
                    char c11 = (char) i20;
                    if (c11 == 1) {
                        iBinderX5 = cc7.x(i20, parcel);
                    } else if (c11 == 2) {
                        zzmiVar2 = (zzmi) cc7.j(parcel, i20, zzmi.CREATOR);
                    } else if (c11 != 3) {
                        cc7.E(i20, parcel);
                    } else {
                        iBinderX6 = cc7.x(i20, parcel);
                    }
                }
                cc7.p(iJ18, parcel);
                if (iBinderX5 == null) {
                    xr9Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = iBinderX5.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
                    xr9Var = iInterfaceQueryLocalInterface4 instanceof xr9 ? (xr9) iInterfaceQueryLocalInterface4 : new xr9(iBinderX5);
                }
                if (iBinderX6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = iBinderX6.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
                    ur9Var = iInterfaceQueryLocalInterface5 instanceof ur9 ? (ur9) iInterfaceQueryLocalInterface5 : new ur9(iBinderX6, "com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback", 3);
                }
                zzna zznaVar = new zzna();
                zznaVar.a = xr9Var;
                zznaVar.b = zzmiVar2;
                zznaVar.c = ur9Var;
                return zznaVar;
            case 18:
                int iJ19 = cc7.J(parcel);
                xr9 xr9Var5 = null;
                IBinder iBinderX7 = null;
                while (parcel.dataPosition() < iJ19) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        cc7.E(i21, parcel);
                    } else {
                        iBinderX7 = cc7.x(i21, parcel);
                    }
                }
                cc7.p(iJ19, parcel);
                if (iBinderX7 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = iBinderX7.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
                    xr9Var5 = iInterfaceQueryLocalInterface6 instanceof xr9 ? (xr9) iInterfaceQueryLocalInterface6 : new xr9(iBinderX7);
                }
                zzne zzneVar = new zzne();
                zzneVar.a = xr9Var5;
                return zzneVar;
            case 19:
                int iJ20 = cc7.J(parcel);
                int iY25 = 0;
                byte[] bArrH7 = null;
                while (parcel.dataPosition() < iJ20) {
                    int i22 = parcel.readInt();
                    char c12 = (char) i22;
                    if (c12 == 1) {
                        bArrH7 = cc7.h(i22, parcel);
                    } else if (c12 != 2) {
                        cc7.E(i22, parcel);
                    } else {
                        iY25 = cc7.y(i22, parcel);
                    }
                }
                cc7.p(iJ20, parcel);
                zzni zzniVar3 = new zzni();
                zzniVar3.a = bArrH7;
                zzniVar3.b = iY25;
                return zzniVar3;
            case 20:
                int iJ21 = cc7.J(parcel);
                bs9 bs9Var = null;
                IBinder iBinderX8 = null;
                while (parcel.dataPosition() < iJ21) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        cc7.E(i23, parcel);
                    } else {
                        iBinderX8 = cc7.x(i23, parcel);
                    }
                }
                cc7.p(iJ21, parcel);
                if (iBinderX8 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = iBinderX8.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAvailabilityObserver");
                    bs9Var = iInterfaceQueryLocalInterface7 instanceof bs9 ? (bs9) iInterfaceQueryLocalInterface7 : new bs9(iBinderX8, "com.google.android.gms.nearby.uwb.internal.IUwbAvailabilityObserver", 3);
                }
                zznm zznmVar = new zznm();
                zznmVar.a = bs9Var;
                return zznmVar;
            case 21:
                int iJ22 = cc7.J(parcel);
                int iY26 = 0;
                int iY27 = 0;
                int iY28 = 0;
                while (parcel.dataPosition() < iJ22) {
                    int i24 = parcel.readInt();
                    char c13 = (char) i24;
                    if (c13 == 1) {
                        iY26 = cc7.y(i24, parcel);
                    } else if (c13 == 2) {
                        iY27 = cc7.y(i24, parcel);
                    } else if (c13 != 3) {
                        cc7.E(i24, parcel);
                    } else {
                        iY28 = cc7.y(i24, parcel);
                    }
                }
                cc7.p(iJ22, parcel);
                zznr zznrVar2 = new zznr();
                zznrVar2.a = iY26;
                zznrVar2.b = iY27;
                zznrVar2.c = iY28;
                return zznrVar2;
            case 22:
                int iJ23 = cc7.J(parcel);
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
                Uri uri2 = null;
                byte[] bArrH8 = null;
                while (parcel.dataPosition() < iJ23) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 2) {
                        publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) cc7.j(parcel, i25, PublicKeyCredentialRequestOptions.CREATOR);
                    } else if (c14 == 3) {
                        uri2 = (Uri) cc7.j(parcel, i25, Uri.CREATOR);
                    } else if (c14 != 4) {
                        cc7.E(i25, parcel);
                    } else {
                        bArrH8 = cc7.h(i25, parcel);
                    }
                }
                cc7.p(iJ23, parcel);
                return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri2, bArrH8);
            case 23:
                int iJ24 = cc7.J(parcel);
                zzni zzniVar4 = null;
                while (parcel.dataPosition() < iJ24) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        cc7.E(i26, parcel);
                    } else {
                        zzniVar4 = (zzni) cc7.j(parcel, i26, zzni.CREATOR);
                    }
                }
                cc7.p(iJ24, parcel);
                zzox zzoxVar5 = new zzox();
                zzoxVar5.a = zzniVar4;
                return zzoxVar5;
            case 24:
                int iJ25 = cc7.J(parcel);
                int iY29 = 0;
                String strK8 = null;
                byte[] bArrH9 = null;
                byte[] bArrH10 = null;
                byte[] bArrH11 = null;
                while (parcel.dataPosition() < iJ25) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 1) {
                        strK8 = cc7.k(i27, parcel);
                    } else if (c15 == 2) {
                        bArrH9 = cc7.h(i27, parcel);
                    } else if (c15 == 3) {
                        bArrH10 = cc7.h(i27, parcel);
                    } else if (c15 == 4) {
                        bArrH11 = cc7.h(i27, parcel);
                    } else if (c15 != 5) {
                        cc7.E(i27, parcel);
                    } else {
                        iY29 = cc7.y(i27, parcel);
                    }
                }
                cc7.p(iJ25, parcel);
                return new zzo(strK8, bArrH9, bArrH10, bArrH11, iY29);
            case 25:
                int iJ26 = cc7.J(parcel);
                HashSet hashSet = new HashSet();
                int iY30 = 0;
                ArrayList arrayListO = null;
                zzs zzsVar = null;
                int iY31 = 0;
                while (parcel.dataPosition() < iJ26) {
                    int i28 = parcel.readInt();
                    char c16 = (char) i28;
                    if (c16 == 1) {
                        iY30 = cc7.y(i28, parcel);
                        hashSet.add(1);
                    } else if (c16 == 2) {
                        arrayListO = cc7.o(parcel, i28, zzu.CREATOR);
                        hashSet.add(2);
                    } else if (c16 == 3) {
                        iY31 = cc7.y(i28, parcel);
                        hashSet.add(3);
                    } else if (c16 != 4) {
                        cc7.E(i28, parcel);
                    } else {
                        zzsVar = (zzs) cc7.j(parcel, i28, zzs.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == iJ26) {
                    return new com.google.android.gms.auth.api.accounttransfer.zzo(hashSet, iY30, arrayListO, iY31, zzsVar);
                }
                throw new SafeParcelReader$ParseException(rm7.n(iJ26, "Overread allowed size end="), parcel);
            case 26:
                int iJ27 = cc7.J(parcel);
                boolean zU25 = false;
                boolean zU26 = false;
                boolean zU27 = false;
                boolean zU28 = false;
                boolean zU29 = false;
                String strK9 = null;
                IBinder iBinderX9 = null;
                while (parcel.dataPosition() < iJ27) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            strK9 = cc7.k(i29, parcel);
                            break;
                        case 2:
                            zU25 = cc7.u(i29, parcel);
                            break;
                        case 3:
                            zU26 = cc7.u(i29, parcel);
                            break;
                        case 4:
                            iBinderX9 = cc7.x(i29, parcel);
                            break;
                        case 5:
                            zU27 = cc7.u(i29, parcel);
                            break;
                        case 6:
                            zU28 = cc7.u(i29, parcel);
                            break;
                        case 7:
                        default:
                            cc7.E(i29, parcel);
                            break;
                        case '\b':
                            zU29 = cc7.u(i29, parcel);
                            break;
                    }
                }
                cc7.p(iJ27, parcel);
                return new zzp(strK9, zU25, zU26, iBinderX9, zU27, zU28, zU29);
            case 27:
                int iJ28 = cc7.J(parcel);
                byte[] bArrH12 = null;
                byte[] bArrH13 = null;
                byte[] bArrH14 = null;
                long jA3 = 0;
                while (parcel.dataPosition() < iJ28) {
                    int i30 = parcel.readInt();
                    char c17 = (char) i30;
                    if (c17 == 1) {
                        jA3 = cc7.A(i30, parcel);
                    } else if (c17 == 2) {
                        bArrH12 = cc7.h(i30, parcel);
                    } else if (c17 == 3) {
                        bArrH13 = cc7.h(i30, parcel);
                    } else if (c17 != 4) {
                        cc7.E(i30, parcel);
                    } else {
                        bArrH14 = cc7.h(i30, parcel);
                    }
                }
                cc7.p(iJ28, parcel);
                return new zzq(jA3, bArrH12, bArrH13, bArrH14);
            case 28:
                int iJ29 = cc7.J(parcel);
                long jA4 = -1;
                int iY32 = 0;
                int iY33 = 0;
                boolean zU30 = false;
                String strK10 = null;
                while (parcel.dataPosition() < iJ29) {
                    int i31 = parcel.readInt();
                    char c18 = (char) i31;
                    if (c18 == 1) {
                        zU30 = cc7.u(i31, parcel);
                    } else if (c18 == 2) {
                        strK10 = cc7.k(i31, parcel);
                    } else if (c18 == 3) {
                        iY32 = cc7.y(i31, parcel);
                    } else if (c18 == 4) {
                        iY33 = cc7.y(i31, parcel);
                    } else if (c18 != 5) {
                        cc7.E(i31, parcel);
                    } else {
                        jA4 = cc7.A(i31, parcel);
                    }
                }
                cc7.p(iJ29, parcel);
                return new zzr(iY32, iY33, jA4, strK10, zU30);
            default:
                int iJ30 = cc7.J(parcel);
                ArrayList arrayListO2 = null;
                while (parcel.dataPosition() < iJ30) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        cc7.E(i32, parcel);
                    } else {
                        arrayListO2 = cc7.o(parcel, i32, zzq.CREATOR);
                    }
                }
                cc7.p(iJ30, parcel);
                return new com.google.android.gms.fido.fido2.api.common.zzs(arrayListO2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zzlo[i];
            case 1:
                return new zzlq[i];
            case 2:
                return new zzls[i];
            case 3:
                return new zzlw[i];
            case 4:
                return new zzly[i];
            case 5:
                return new GetServiceRequest[i];
            case 6:
                return new AuthenticatorSelectionCriteria[i];
            case 7:
                return new TokenData[i];
            case 8:
                return new zzmc[i];
            case 9:
                return new zzme[i];
            case 10:
                return new zzmi[i];
            case 11:
                return new zzmk[i];
            case 12:
                return new zzmo[i];
            case 13:
                return new zzms[i];
            case 14:
                return new zzmw[i];
            case 15:
                return new BrowserPublicKeyCredentialCreationOptions[i];
            case 16:
                return new ConnectionOptions[i];
            case 17:
                return new zzna[i];
            case 18:
                return new zzne[i];
            case 19:
                return new zzni[i];
            case 20:
                return new zznm[i];
            case 21:
                return new zznr[i];
            case 22:
                return new BrowserPublicKeyCredentialRequestOptions[i];
            case 23:
                return new zzox[i];
            case 24:
                return new zzo[i];
            case 25:
                return new com.google.android.gms.auth.api.accounttransfer.zzo[i];
            case 26:
                return new zzp[i];
            case 27:
                return new zzq[i];
            case 28:
                return new zzr[i];
            default:
                return new com.google.android.gms.fido.fido2.api.common.zzs[i];
        }
    }
}
