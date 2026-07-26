package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import defpackage.br9;
import defpackage.cc7;
import defpackage.rm7;
import defpackage.rq4;
import defpackage.rw3;
import defpackage.t61;
import defpackage.th9;
import defpackage.uy6;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new th9(21);
    public final int a;
    public final Parcel b;
    public final int c;
    public final zan d;
    public final String e;
    public int f;
    public int g;

    public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        this.a = i;
        rq4.n(parcel);
        this.b = parcel;
        this.c = 2;
        this.d = zanVar;
        this.e = zanVar == null ? null : zanVar.c;
        this.f = 2;
    }

    public static void i(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse$Field) entry.getValue()).g, entry);
        }
        sb.append('{');
        int iJ = cc7.J(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
                t61.y(sb, "\"", str, "\":");
                StringToIntConverter stringToIntConverter = fastJsonResponse$Field.k;
                String str2 = fastJsonResponse$Field.i;
                int i2 = fastJsonResponse$Field.d;
                if (stringToIntConverter != null) {
                    switch (i2) {
                        case 0:
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Integer.valueOf(cc7.y(i, parcel))));
                            break;
                        case 1:
                            int iC = cc7.C(i, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iC == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iC);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, bigInteger2));
                            break;
                        case 2:
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Long.valueOf(cc7.A(i, parcel))));
                            break;
                        case 3:
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Float.valueOf(cc7.w(i, parcel))));
                            break;
                        case 4:
                            cc7.L(parcel, i, 8);
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, cc7.f(i, parcel)));
                            break;
                        case 6:
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Boolean.valueOf(cc7.u(i, parcel))));
                            break;
                        case 7:
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, cc7.k(i, parcel)));
                            break;
                        case 8:
                        case 9:
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, cc7.h(i, parcel)));
                            break;
                        case 10:
                            Bundle bundleG = cc7.g(i, parcel);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleG.keySet()) {
                                String string = bundleG.getString(str3);
                                rq4.n(string);
                                map2.put(str3, string);
                            }
                            k(sb, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(rm7.o(i2, "Unknown field out type = ", new StringBuilder(String.valueOf(i2).length() + 25)));
                    }
                } else if (fastJsonResponse$Field.e) {
                    sb.append("[");
                    switch (i2) {
                        case 0:
                            int[] iArrI = cc7.i(i, parcel);
                            int length = iArrI.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 != 0) {
                                    sb.append(",");
                                }
                                sb.append(iArrI[i3]);
                            }
                            break;
                        case 1:
                            int iC2 = cc7.C(i, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iC2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i4 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i4];
                                for (int i5 = 0; i5 < i4; i5++) {
                                    bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iC2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i6 = 0; i6 < length2; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i6]);
                            }
                            break;
                        case 2:
                            int iC3 = cc7.C(i, parcel);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iC3 == 0) {
                                jArrCreateLongArray = null;
                            } else {
                                jArrCreateLongArray = parcel.createLongArray();
                                parcel.setDataPosition(iDataPosition3 + iC3);
                            }
                            int length3 = jArrCreateLongArray.length;
                            for (int i7 = 0; i7 < length3; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(jArrCreateLongArray[i7]);
                            }
                            break;
                        case 3:
                            int iC4 = cc7.C(i, parcel);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iC4 == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition4 + iC4);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i8 = 0; i8 < length4; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(fArrCreateFloatArray[i8]);
                            }
                            break;
                        case 4:
                            int iC5 = cc7.C(i, parcel);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iC5 == 0) {
                                dArrCreateDoubleArray = null;
                            } else {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition5 + iC5);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i9 = 0; i9 < length5; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(dArrCreateDoubleArray[i9]);
                            }
                            break;
                        case 5:
                            int iC6 = cc7.C(i, parcel);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iC6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i10 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i10];
                                for (int i11 = 0; i11 < i10; i11++) {
                                    bigDecimalArr[i11] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition6 + iC6);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i12 = 0; i12 < length6; i12++) {
                                if (i12 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i12]);
                            }
                            break;
                        case 6:
                            int iC7 = cc7.C(i, parcel);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iC7 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition7 + iC7);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i13 = 0; i13 < length7; i13++) {
                                if (i13 != 0) {
                                    sb.append(",");
                                }
                                sb.append(zArrCreateBooleanArray[i13]);
                            }
                            break;
                        case 7:
                            String[] strArrL = cc7.l(i, parcel);
                            int length8 = strArrL.length;
                            for (int i14 = 0; i14 < length8; i14++) {
                                if (i14 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(strArrL[i14]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int iC8 = cc7.C(i, parcel);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iC8 == 0) {
                                parcelArr = null;
                            } else {
                                int i15 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i15];
                                for (int i16 = 0; i16 < i15; i16++) {
                                    int i17 = parcel.readInt();
                                    if (i17 != 0) {
                                        int iDataPosition9 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition9, i17);
                                        parcelArr2[i16] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition9 + i17);
                                    } else {
                                        parcelArr2[i16] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition8 + iC8);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i18 = 0; i18 < length9; i18++) {
                                if (i18 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i18].setDataPosition(0);
                                rq4.n(str2);
                                rq4.n(fastJsonResponse$Field.j);
                                Map map3 = (Map) fastJsonResponse$Field.j.b.get(str2);
                                rq4.n(map3);
                                i(sb, map3, parcelArr[i18]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (i2) {
                        case 0:
                            sb.append(cc7.y(i, parcel));
                            break;
                        case 1:
                            int iC9 = cc7.C(i, parcel);
                            int iDataPosition10 = parcel.dataPosition();
                            if (iC9 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition10 + iC9);
                                bigInteger = new BigInteger(bArrCreateByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(cc7.A(i, parcel));
                            break;
                        case 3:
                            sb.append(cc7.w(i, parcel));
                            break;
                        case 4:
                            cc7.L(parcel, i, 8);
                            sb.append(parcel.readDouble());
                            break;
                        case 5:
                            sb.append(cc7.f(i, parcel));
                            break;
                        case 6:
                            sb.append(cc7.u(i, parcel));
                            break;
                        case 7:
                            String strK = cc7.k(i, parcel);
                            sb.append("\"");
                            sb.append(rw3.a(strK));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrH = cc7.h(i, parcel);
                            sb.append("\"");
                            sb.append(bArrH == null ? null : Base64.encodeToString(bArrH, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrH2 = cc7.h(i, parcel);
                            sb.append("\"");
                            sb.append(bArrH2 == null ? null : Base64.encodeToString(bArrH2, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleG2 = cc7.g(i, parcel);
                            Set<String> setKeySet = bundleG2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str4 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                t61.y(sb, "\"", str4, "\":\"");
                                sb.append(rw3.a(bundleG2.getString(str4)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int iC10 = cc7.C(i, parcel);
                            int iDataPosition11 = parcel.dataPosition();
                            if (iC10 == 0) {
                                parcelObtain = null;
                            } else {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition11, iC10);
                                parcel.setDataPosition(iDataPosition11 + iC10);
                            }
                            parcelObtain.setDataPosition(0);
                            rq4.n(str2);
                            rq4.n(fastJsonResponse$Field.j);
                            Map map4 = (Map) fastJsonResponse$Field.j.b.get(str2);
                            rq4.n(map4);
                            i(sb, map4, parcelObtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iJ) {
            throw new SafeParcelReader$ParseException(rm7.o(iJ, "Overread allowed size end=", new StringBuilder(String.valueOf(iJ).length() + 26)), parcel);
        }
        sb.append('}');
    }

    public static final void j(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                rq4.n(obj);
                sb.append(rw3.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                return;
            case 10:
                rq4.n(obj);
                br9.T(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(rm7.o(i, "Unknown type = ", new StringBuilder(String.valueOf(i).length() + 15)));
        }
    }

    public static final void k(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        boolean z = fastJsonResponse$Field.c;
        int i = fastJsonResponse$Field.b;
        if (!z) {
            j(sb, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            j(sb, i, arrayList.get(i2));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Map a() {
        zan zanVar = this.d;
        if (zanVar == null) {
            return null;
        }
        String str = this.e;
        rq4.n(str);
        return (Map) zanVar.b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel h() {
        int i = this.f;
        Parcel parcel = this.b;
        if (i != 0) {
            if (i != 1) {
                return parcel;
            }
            uy6.K(this.g, parcel);
            this.f = 2;
            return parcel;
        }
        int iJ = uy6.J(20293, parcel);
        this.g = iJ;
        uy6.K(iJ, parcel);
        this.f = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final String toString() {
        zan zanVar = this.d;
        rq4.o(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelH = h();
        parcelH.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.e;
        rq4.n(str);
        Map map = (Map) zanVar.b.get(str);
        rq4.n(map);
        i(sb, map, parcelH);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        Parcel parcelH = h();
        if (parcelH != null) {
            int iJ2 = uy6.J(2, parcel);
            parcel.appendFrom(parcelH, 0, parcelH.dataSize());
            uy6.K(iJ2, parcel);
        }
        uy6.C(parcel, 3, this.c != 0 ? this.d : null, i, false);
        uy6.K(iJ, parcel);
    }
}
