package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.Claim;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class th9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ th9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iJ = cc7.J(parcel);
                ArrayList arrayListO = null;
                int iY = 0;
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iY = cc7.y(i, parcel);
                    } else if (c != 2) {
                        cc7.E(i, parcel);
                    } else {
                        arrayListO = cc7.o(parcel, i, MethodInvocation.CREATOR);
                    }
                }
                cc7.p(iJ, parcel);
                return new TelemetryData(iY, arrayListO);
            case 1:
                int iJ2 = cc7.J(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iJ2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        cc7.E(i2, parcel);
                    } else {
                        pendingIntent = (PendingIntent) cc7.j(parcel, i2, PendingIntent.CREATOR);
                    }
                }
                cc7.p(iJ2, parcel);
                return new ModuleInstallIntentResponse(pendingIntent);
            case 2:
                int iJ3 = cc7.J(parcel);
                StringToIntConverter stringToIntConverter = null;
                int iY2 = 0;
                while (parcel.dataPosition() < iJ3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        iY2 = cc7.y(i3, parcel);
                    } else if (c2 != 2) {
                        cc7.E(i3, parcel);
                    } else {
                        stringToIntConverter = (StringToIntConverter) cc7.j(parcel, i3, StringToIntConverter.CREATOR);
                    }
                }
                cc7.p(iJ3, parcel);
                return new zaa(iY2, stringToIntConverter);
            case 3:
                int iJ4 = cc7.J(parcel);
                Intent intent = null;
                int iY3 = 0;
                int iY4 = 0;
                while (parcel.dataPosition() < iJ4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iY3 = cc7.y(i4, parcel);
                    } else if (c3 == 2) {
                        iY4 = cc7.y(i4, parcel);
                    } else if (c3 != 3) {
                        cc7.E(i4, parcel);
                    } else {
                        intent = (Intent) cc7.j(parcel, i4, Intent.CREATOR);
                    }
                }
                cc7.p(iJ4, parcel);
                return new com.google.android.gms.signin.internal.zaa(iY3, iY4, intent);
            case 4:
                int iJ5 = cc7.J(parcel);
                String strK = null;
                String strK2 = null;
                String strK3 = null;
                String strK4 = null;
                Uri uri = null;
                String strK5 = null;
                String strK6 = null;
                ArrayList arrayListO2 = null;
                String strK7 = null;
                String strK8 = null;
                long jA = 0;
                while (parcel.dataPosition() < iJ5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            strK = cc7.k(i5, parcel);
                            break;
                        case 3:
                            strK2 = cc7.k(i5, parcel);
                            break;
                        case 4:
                            strK3 = cc7.k(i5, parcel);
                            break;
                        case 5:
                            strK4 = cc7.k(i5, parcel);
                            break;
                        case 6:
                            uri = (Uri) cc7.j(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strK5 = cc7.k(i5, parcel);
                            break;
                        case '\b':
                            jA = cc7.A(i5, parcel);
                            break;
                        case '\t':
                            strK6 = cc7.k(i5, parcel);
                            break;
                        case '\n':
                            arrayListO2 = cc7.o(parcel, i5, Scope.CREATOR);
                            break;
                        case 11:
                            strK7 = cc7.k(i5, parcel);
                            break;
                        case '\f':
                            strK8 = cc7.k(i5, parcel);
                            break;
                        default:
                            cc7.E(i5, parcel);
                            break;
                    }
                }
                cc7.p(iJ5, parcel);
                return new GoogleSignInAccount(strK, strK2, strK3, strK4, uri, strK5, jA, strK6, arrayListO2, strK7, strK8);
            case 5:
                int iJ6 = cc7.J(parcel);
                int iY5 = 0;
                int iY6 = 0;
                boolean zU = false;
                long jA2 = 0;
                String strK9 = null;
                while (parcel.dataPosition() < iJ6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        iY5 = cc7.y(i6, parcel);
                    } else if (c4 == 2) {
                        strK9 = cc7.k(i6, parcel);
                    } else if (c4 == 3) {
                        jA2 = cc7.A(i6, parcel);
                    } else if (c4 == 4) {
                        iY6 = cc7.y(i6, parcel);
                    } else if (c4 != 5) {
                        cc7.E(i6, parcel);
                    } else {
                        zU = cc7.u(i6, parcel);
                    }
                }
                cc7.p(iJ6, parcel);
                return new zab(iY5, iY6, jA2, strK9, zU);
            case 6:
                int iJ7 = cc7.J(parcel);
                int iY7 = 0;
                boolean zU2 = false;
                while (parcel.dataPosition() < iJ7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iY7 = cc7.y(i7, parcel);
                    } else if (c5 != 2) {
                        cc7.E(i7, parcel);
                    } else {
                        zU2 = cc7.u(i7, parcel);
                    }
                }
                cc7.p(iJ7, parcel);
                return new ModuleInstallResponse(iY7, zU2);
            case 7:
                int iJ8 = cc7.J(parcel);
                ArrayList arrayListO3 = null;
                String strK10 = null;
                boolean zU3 = false;
                String strK11 = null;
                while (parcel.dataPosition() < iJ8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        arrayListO3 = cc7.o(parcel, i8, Feature.CREATOR);
                    } else if (c6 == 2) {
                        zU3 = cc7.u(i8, parcel);
                    } else if (c6 == 3) {
                        strK11 = cc7.k(i8, parcel);
                    } else if (c6 != 4) {
                        cc7.E(i8, parcel);
                    } else {
                        strK10 = cc7.k(i8, parcel);
                    }
                }
                cc7.p(iJ8, parcel);
                return new ApiFeatureRequest(arrayListO3, zU3, strK11, strK10);
            case 8:
                int iJ9 = cc7.J(parcel);
                String[] strArrL = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleG = null;
                int iY8 = 0;
                int iY9 = 0;
                while (parcel.dataPosition() < iJ9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        strArrL = cc7.l(i9, parcel);
                    } else if (c7 == 2) {
                        cursorWindowArr = (CursorWindow[]) cc7.n(parcel, i9, CursorWindow.CREATOR);
                    } else if (c7 == 3) {
                        iY9 = cc7.y(i9, parcel);
                    } else if (c7 == 4) {
                        bundleG = cc7.g(i9, parcel);
                    } else if (c7 != 1000) {
                        cc7.E(i9, parcel);
                    } else {
                        iY8 = cc7.y(i9, parcel);
                    }
                }
                cc7.p(iJ9, parcel);
                DataHolder dataHolder = new DataHolder(iY8, strArrL, cursorWindowArr, iY9, bundleG);
                dataHolder.c = new Bundle();
                int i10 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i10 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i11 = 0; i11 < cursorWindowArr2.length; i11++) {
                            dataHolder.g[i11] = numRows;
                            numRows += cursorWindowArr2[i11].getNumRows() - (numRows - cursorWindowArr2[i11].getStartPosition());
                        }
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr[i10], i10);
                    i10++;
                }
                break;
            case 9:
                int iJ10 = cc7.J(parcel);
                int iY10 = 0;
                int iY11 = 0;
                int iY12 = 0;
                Long lB = null;
                Long lB2 = null;
                while (parcel.dataPosition() < iJ10) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        iY10 = cc7.y(i12, parcel);
                    } else if (c8 == 2) {
                        iY11 = cc7.y(i12, parcel);
                    } else if (c8 == 3) {
                        lB = cc7.B(i12, parcel);
                    } else if (c8 == 4) {
                        lB2 = cc7.B(i12, parcel);
                    } else if (c8 != 5) {
                        cc7.E(i12, parcel);
                    } else {
                        iY12 = cc7.y(i12, parcel);
                    }
                }
                cc7.p(iJ10, parcel);
                return new ModuleInstallStatusUpdate(iY10, iY11, lB, lB2, iY12);
            case 10:
                int iJ11 = cc7.J(parcel);
                ArrayList arrayListO4 = null;
                int iY13 = 0;
                while (parcel.dataPosition() < iJ11) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iY13 = cc7.y(i13, parcel);
                    } else if (c9 != 2) {
                        cc7.E(i13, parcel);
                    } else {
                        arrayListO4 = cc7.o(parcel, i13, zac.CREATOR);
                    }
                }
                cc7.p(iJ11, parcel);
                return new StringToIntConverter(iY13, arrayListO4);
            case 11:
                int iJ12 = cc7.J(parcel);
                ArrayList arrayListO5 = null;
                ArrayList arrayListO6 = null;
                Account account = null;
                String strK12 = null;
                String strK13 = null;
                String strK14 = null;
                int iY14 = 0;
                boolean zU4 = false;
                boolean zU5 = false;
                boolean zU6 = false;
                while (parcel.dataPosition() < iJ12) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iY14 = cc7.y(i14, parcel);
                            break;
                        case 2:
                            arrayListO6 = cc7.o(parcel, i14, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) cc7.j(parcel, i14, Account.CREATOR);
                            break;
                        case 4:
                            zU4 = cc7.u(i14, parcel);
                            break;
                        case 5:
                            zU5 = cc7.u(i14, parcel);
                            break;
                        case 6:
                            zU6 = cc7.u(i14, parcel);
                            break;
                        case 7:
                            strK12 = cc7.k(i14, parcel);
                            break;
                        case '\b':
                            strK13 = cc7.k(i14, parcel);
                            break;
                        case '\t':
                            arrayListO5 = cc7.o(parcel, i14, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            strK14 = cc7.k(i14, parcel);
                            break;
                        default:
                            cc7.E(i14, parcel);
                            break;
                    }
                }
                cc7.p(iJ12, parcel);
                return new GoogleSignInOptions(iY14, arrayListO6, account, zU4, zU5, zU6, strK12, strK13, GoogleSignInOptions.U(arrayListO5), strK14);
            case 12:
                int iJ13 = cc7.J(parcel);
                int iY15 = 0;
                String strK15 = null;
                int iY16 = 0;
                while (parcel.dataPosition() < iJ13) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iY15 = cc7.y(i15, parcel);
                    } else if (c10 == 2) {
                        strK15 = cc7.k(i15, parcel);
                    } else if (c10 != 3) {
                        cc7.E(i15, parcel);
                    } else {
                        iY16 = cc7.y(i15, parcel);
                    }
                }
                cc7.p(iJ13, parcel);
                return new zac(strK15, iY15, iY16);
            case 13:
                int iJ14 = cc7.J(parcel);
                int iY17 = 0;
                int iY18 = 0;
                Uri uri2 = null;
                int iY19 = 0;
                while (parcel.dataPosition() < iJ14) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        iY17 = cc7.y(i16, parcel);
                    } else if (c11 == 2) {
                        uri2 = (Uri) cc7.j(parcel, i16, Uri.CREATOR);
                    } else if (c11 == 3) {
                        iY19 = cc7.y(i16, parcel);
                    } else if (c11 != 4) {
                        cc7.E(i16, parcel);
                    } else {
                        iY18 = cc7.y(i16, parcel);
                    }
                }
                cc7.p(iJ14, parcel);
                return new WebImage(iY17, uri2, iY19, iY18);
            case 14:
                int iJ15 = cc7.J(parcel);
                ArrayList arrayListM = null;
                String strK16 = null;
                while (parcel.dataPosition() < iJ15) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        arrayListM = cc7.m(i17, parcel);
                    } else if (c12 != 2) {
                        cc7.E(i17, parcel);
                    } else {
                        strK16 = cc7.k(i17, parcel);
                    }
                }
                cc7.p(iJ15, parcel);
                return new zag(strK16, arrayListM);
            case 15:
                int iJ16 = cc7.J(parcel);
                zaw zawVar = null;
                int iY20 = 0;
                while (parcel.dataPosition() < iJ16) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        iY20 = cc7.y(i18, parcel);
                    } else if (c13 != 2) {
                        cc7.E(i18, parcel);
                    } else {
                        zawVar = (zaw) cc7.j(parcel, i18, zaw.CREATOR);
                    }
                }
                cc7.p(iJ16, parcel);
                return new zai(iY20, zawVar);
            case 16:
                int iJ17 = cc7.J(parcel);
                String strK17 = null;
                int iY21 = 0;
                FastJsonResponse$Field fastJsonResponse$Field = null;
                while (parcel.dataPosition() < iJ17) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        iY21 = cc7.y(i19, parcel);
                    } else if (c14 == 2) {
                        strK17 = cc7.k(i19, parcel);
                    } else if (c14 != 3) {
                        cc7.E(i19, parcel);
                    } else {
                        fastJsonResponse$Field = (FastJsonResponse$Field) cc7.j(parcel, i19, FastJsonResponse$Field.CREATOR);
                    }
                }
                cc7.p(iJ17, parcel);
                return new zam(iY21, strK17, fastJsonResponse$Field);
            case 17:
                int iJ18 = cc7.J(parcel);
                ConnectionResult connectionResult = null;
                int iY22 = 0;
                zay zayVar = null;
                while (parcel.dataPosition() < iJ18) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        iY22 = cc7.y(i20, parcel);
                    } else if (c15 == 2) {
                        connectionResult = (ConnectionResult) cc7.j(parcel, i20, ConnectionResult.CREATOR);
                    } else if (c15 != 3) {
                        cc7.E(i20, parcel);
                    } else {
                        zayVar = (zay) cc7.j(parcel, i20, zay.CREATOR);
                    }
                }
                cc7.p(iJ18, parcel);
                return new zak(iY22, connectionResult, zayVar);
            case 18:
                int iJ19 = cc7.J(parcel);
                ArrayList arrayListO7 = null;
                int iY23 = 0;
                String strK18 = null;
                while (parcel.dataPosition() < iJ19) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 1) {
                        iY23 = cc7.y(i21, parcel);
                    } else if (c16 == 2) {
                        arrayListO7 = cc7.o(parcel, i21, zal.CREATOR);
                    } else if (c16 != 3) {
                        cc7.E(i21, parcel);
                    } else {
                        strK18 = cc7.k(i21, parcel);
                    }
                }
                cc7.p(iJ19, parcel);
                return new zan(iY23, strK18, arrayListO7);
            case 19:
                int iJ20 = cc7.J(parcel);
                String strK19 = null;
                int iY24 = 0;
                ArrayList arrayListO8 = null;
                while (parcel.dataPosition() < iJ20) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 1) {
                        iY24 = cc7.y(i22, parcel);
                    } else if (c17 == 2) {
                        strK19 = cc7.k(i22, parcel);
                    } else if (c17 != 3) {
                        cc7.E(i22, parcel);
                    } else {
                        arrayListO8 = cc7.o(parcel, i22, zam.CREATOR);
                    }
                }
                cc7.p(iJ20, parcel);
                return new zal(iY24, strK19, arrayListO8);
            case 20:
                int iJ21 = cc7.J(parcel);
                int iY25 = -1;
                int iY26 = 0;
                int iY27 = 0;
                int iY28 = 0;
                int iY29 = 0;
                String strK20 = null;
                String strK21 = null;
                long jA3 = 0;
                long jA4 = 0;
                while (parcel.dataPosition() < iJ21) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iY26 = cc7.y(i23, parcel);
                            break;
                        case 2:
                            iY27 = cc7.y(i23, parcel);
                            break;
                        case 3:
                            iY28 = cc7.y(i23, parcel);
                            break;
                        case 4:
                            jA3 = cc7.A(i23, parcel);
                            break;
                        case 5:
                            jA4 = cc7.A(i23, parcel);
                            break;
                        case 6:
                            strK20 = cc7.k(i23, parcel);
                            break;
                        case 7:
                            strK21 = cc7.k(i23, parcel);
                            break;
                        case '\b':
                            iY29 = cc7.y(i23, parcel);
                            break;
                        case '\t':
                            iY25 = cc7.y(i23, parcel);
                            break;
                        default:
                            cc7.E(i23, parcel);
                            break;
                    }
                }
                cc7.p(iJ21, parcel);
                return new MethodInvocation(iY26, iY27, iY28, jA3, jA4, strK20, strK21, iY29, iY25);
            case 21:
                int iJ22 = cc7.J(parcel);
                int iY30 = 0;
                Parcel parcel2 = null;
                zan zanVar = null;
                while (parcel.dataPosition() < iJ22) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 1) {
                        iY30 = cc7.y(i24, parcel);
                    } else if (c18 == 2) {
                        int iC = cc7.C(i24, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iC == 0) {
                            parcel2 = null;
                        } else {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(parcel, iDataPosition, iC);
                            parcel.setDataPosition(iDataPosition + iC);
                            parcel2 = parcelObtain;
                        }
                    } else if (c18 != 3) {
                        cc7.E(i24, parcel);
                    } else {
                        zanVar = (zan) cc7.j(parcel, i24, zan.CREATOR);
                    }
                }
                cc7.p(iJ22, parcel);
                return new SafeParcelResponse(iY30, parcel2, zanVar);
            case 22:
                int iJ23 = cc7.J(parcel);
                Account account2 = null;
                int iY31 = 0;
                int iY32 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iJ23) {
                    int i25 = parcel.readInt();
                    char c19 = (char) i25;
                    if (c19 == 1) {
                        iY31 = cc7.y(i25, parcel);
                    } else if (c19 == 2) {
                        account2 = (Account) cc7.j(parcel, i25, Account.CREATOR);
                    } else if (c19 == 3) {
                        iY32 = cc7.y(i25, parcel);
                    } else if (c19 != 4) {
                        cc7.E(i25, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) cc7.j(parcel, i25, GoogleSignInAccount.CREATOR);
                    }
                }
                cc7.p(iJ23, parcel);
                return new zaw(iY31, account2, iY32, googleSignInAccount);
            case 23:
                int iJ24 = cc7.J(parcel);
                int iY33 = 0;
                boolean zU7 = false;
                boolean zU8 = false;
                IBinder iBinderX = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < iJ24) {
                    int i26 = parcel.readInt();
                    char c20 = (char) i26;
                    if (c20 == 1) {
                        iY33 = cc7.y(i26, parcel);
                    } else if (c20 == 2) {
                        iBinderX = cc7.x(i26, parcel);
                    } else if (c20 == 3) {
                        connectionResult2 = (ConnectionResult) cc7.j(parcel, i26, ConnectionResult.CREATOR);
                    } else if (c20 == 4) {
                        zU7 = cc7.u(i26, parcel);
                    } else if (c20 != 5) {
                        cc7.E(i26, parcel);
                    } else {
                        zU8 = cc7.u(i26, parcel);
                    }
                }
                cc7.p(iJ24, parcel);
                return new zay(iY33, iBinderX, connectionResult2, zU7, zU8);
            case 24:
                int iJ25 = cc7.J(parcel);
                boolean zU9 = false;
                boolean zU10 = false;
                boolean zU11 = false;
                boolean zU12 = false;
                ArrayList arrayListO9 = null;
                String strK22 = null;
                Account account3 = null;
                String strK23 = null;
                String strK24 = null;
                Bundle bundleG2 = null;
                while (parcel.dataPosition() < iJ25) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            arrayListO9 = cc7.o(parcel, i27, Scope.CREATOR);
                            break;
                        case 2:
                            strK22 = cc7.k(i27, parcel);
                            break;
                        case 3:
                            zU9 = cc7.u(i27, parcel);
                            break;
                        case 4:
                            zU10 = cc7.u(i27, parcel);
                            break;
                        case 5:
                            account3 = (Account) cc7.j(parcel, i27, Account.CREATOR);
                            break;
                        case 6:
                            strK23 = cc7.k(i27, parcel);
                            break;
                        case 7:
                            strK24 = cc7.k(i27, parcel);
                            break;
                        case '\b':
                            zU11 = cc7.u(i27, parcel);
                            break;
                        case '\t':
                            bundleG2 = cc7.g(i27, parcel);
                            break;
                        case '\n':
                            zU12 = cc7.u(i27, parcel);
                            break;
                        default:
                            cc7.E(i27, parcel);
                            break;
                    }
                }
                cc7.p(iJ25, parcel);
                return new AuthorizationRequest(arrayListO9, strK22, zU9, zU10, account3, strK23, strK24, zU11, bundleG2, zU12);
            case 25:
                int iJ26 = cc7.J(parcel);
                String strK25 = "";
                GoogleSignInAccount googleSignInAccount2 = null;
                String strK26 = "";
                while (parcel.dataPosition() < iJ26) {
                    int i28 = parcel.readInt();
                    char c21 = (char) i28;
                    if (c21 == 4) {
                        strK25 = cc7.k(i28, parcel);
                    } else if (c21 == 7) {
                        googleSignInAccount2 = (GoogleSignInAccount) cc7.j(parcel, i28, GoogleSignInAccount.CREATOR);
                    } else if (c21 != '\b') {
                        cc7.E(i28, parcel);
                    } else {
                        strK26 = cc7.k(i28, parcel);
                    }
                }
                cc7.p(iJ26, parcel);
                return new SignInAccount(strK25, googleSignInAccount2, strK26);
            case 26:
                int iJ27 = cc7.J(parcel);
                String strK27 = null;
                String strK28 = null;
                String strK29 = null;
                ArrayList arrayListM2 = null;
                GoogleSignInAccount googleSignInAccount3 = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iJ27) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            strK27 = cc7.k(i29, parcel);
                            break;
                        case 2:
                            strK28 = cc7.k(i29, parcel);
                            break;
                        case 3:
                            strK29 = cc7.k(i29, parcel);
                            break;
                        case 4:
                            arrayListM2 = cc7.m(i29, parcel);
                            break;
                        case 5:
                            googleSignInAccount3 = (GoogleSignInAccount) cc7.j(parcel, i29, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) cc7.j(parcel, i29, PendingIntent.CREATOR);
                            break;
                        default:
                            cc7.E(i29, parcel);
                            break;
                    }
                }
                cc7.p(iJ27, parcel);
                return new AuthorizationResult(strK27, strK28, strK29, arrayListM2, googleSignInAccount3, pendingIntent2);
            case 27:
                int iJ28 = cc7.J(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iJ28) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 1) {
                        cc7.E(i30, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) cc7.j(parcel, i30, PendingIntent.CREATOR);
                    }
                }
                cc7.p(iJ28, parcel);
                return new BeginSignInResult(pendingIntent3);
            case 28:
                int iJ29 = cc7.J(parcel);
                boolean zU13 = false;
                String strK30 = null;
                while (parcel.dataPosition() < iJ29) {
                    int i31 = parcel.readInt();
                    char c22 = (char) i31;
                    if (c22 == 1) {
                        strK30 = cc7.k(i31, parcel);
                    } else if (c22 != 2) {
                        cc7.E(i31, parcel);
                    } else {
                        zU13 = cc7.u(i31, parcel);
                    }
                }
                cc7.p(iJ29, parcel);
                return new Claim(strK30, zU13);
            default:
                int iJ30 = cc7.J(parcel);
                String strK31 = null;
                String strK32 = null;
                while (parcel.dataPosition() < iJ30) {
                    int i32 = parcel.readInt();
                    char c23 = (char) i32;
                    if (c23 == 1) {
                        strK31 = cc7.k(i32, parcel);
                    } else if (c23 != 2) {
                        cc7.E(i32, parcel);
                    } else {
                        strK32 = cc7.k(i32, parcel);
                    }
                }
                cc7.p(iJ30, parcel);
                return new ClearTokenRequest(strK31, strK32);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new TelemetryData[i];
            case 1:
                return new ModuleInstallIntentResponse[i];
            case 2:
                return new zaa[i];
            case 3:
                return new com.google.android.gms.signin.internal.zaa[i];
            case 4:
                return new GoogleSignInAccount[i];
            case 5:
                return new zab[i];
            case 6:
                return new ModuleInstallResponse[i];
            case 7:
                return new ApiFeatureRequest[i];
            case 8:
                return new DataHolder[i];
            case 9:
                return new ModuleInstallStatusUpdate[i];
            case 10:
                return new StringToIntConverter[i];
            case 11:
                return new GoogleSignInOptions[i];
            case 12:
                return new zac[i];
            case 13:
                return new WebImage[i];
            case 14:
                return new zag[i];
            case 15:
                return new zai[i];
            case 16:
                return new zam[i];
            case 17:
                return new zak[i];
            case 18:
                return new zan[i];
            case 19:
                return new zal[i];
            case 20:
                return new MethodInvocation[i];
            case 21:
                return new SafeParcelResponse[i];
            case 22:
                return new zaw[i];
            case 23:
                return new zay[i];
            case 24:
                return new AuthorizationRequest[i];
            case 25:
                return new SignInAccount[i];
            case 26:
                return new AuthorizationResult[i];
            case 27:
                return new BeginSignInResult[i];
            case 28:
                return new Claim[i];
            default:
                return new ClearTokenRequest[i];
        }
    }
}
